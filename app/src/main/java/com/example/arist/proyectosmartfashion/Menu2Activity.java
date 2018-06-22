package com.example.arist.proyectosmartfashion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Menu2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        final Button btnBase =(Button)findViewById(R.id.btn1);
        Button btnEsmalte =(Button)findViewById(R.id.btn2);
        Button btnDeli =(Button)findViewById(R.id.btn3);
        Button btnLips =(Button)findViewById(R.id.btn4);
        Button btnRimel =(Button)findViewById(R.id.btn5);
        Button btnSombra =(Button)findViewById(R.id.btn6);
        Button btnRubor=(Button)findViewById(R.id.btn7);


        btnBase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"HAZ SELECCIONADO BASE",Toast.LENGTH_SHORT).show();

                Intent base= new Intent(Menu2Activity.this, BaseAvtivity.class);
                startActivity(base);

            }
        });

    }
            public void ClickEsmalte(View vi) {
                Toast.makeText(getBaseContext(),"HAZ SELECCIONADO ESMALTE",Toast.LENGTH_SHORT).show();

                Intent esmalte= new Intent(Menu2Activity.this, EsmalteActivity.class);
                startActivity(esmalte);

            }
        }




