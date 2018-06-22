package com.example.arist.proyectosmartfashion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {



    ImageButton inicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inicio =(ImageButton)findViewById(R.id.btn1);

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"BIENVENIDO A SMART FASHION",Toast.LENGTH_SHORT).show();
                Intent inicio= new Intent(LoginActivity.this, inicioActivity.class);
                startActivity(inicio);


            }
        });
    }

}
