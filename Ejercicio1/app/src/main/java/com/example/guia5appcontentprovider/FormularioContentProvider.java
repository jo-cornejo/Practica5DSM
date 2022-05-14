package com.example.guia5appcontentprovider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormularioContentProvider extends AppCompatActivity {

    Button btn_Agregar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_content_provider);
        btn_Agregar = (Button) findViewById(R.id.btn_agregar);

        btn_Agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormularioContentProvider.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }



}