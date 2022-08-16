package com.charles.tictactoeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class AddPlayers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_players)

        val playerOneTxt: EditText = findViewById(R.id.EditTxtPlayerOne)
        val playerTwoTxt: EditText = findViewById(R.id.editTxtPlayerTwo)
        val startGameBtn: Button = findViewById(R.id.stertGameBtn)

        startGameBtn.setOnClickListener {
            val playerOneName = playerOneTxt.text.toString().trim()
            val playerTwoName = playerTwoTxt.text.toString().trim()
            if(playerOneName.isEmpty()&&playerTwoName.isEmpty()){
                Toast.makeText(this,"Please enter all player names",Toast.LENGTH_SHORT).show();
            }else{
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}