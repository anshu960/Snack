package com.example.snack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun loginLoginBtnClicked(view: View){

    }

    fun logincreateBtnClicked(view: View){

        val intent = Intent(this, CreateUserActivity::class.java)
        startActivity(intent)
    }
}