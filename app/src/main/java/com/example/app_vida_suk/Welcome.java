package com.example.app_vida_suk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }
    public void goToLogin(View view) {
        startActivity(new Intent( this, LoginActivity.class));
    }

    public void goToRegister(View view) {
        startActivity(new Intent( this, Register_user.class));
    }
}