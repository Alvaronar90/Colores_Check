package com.example.david.check_colores;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

ImageView Resultado, ImgAmarillo, ImgAzul, ImgRojo;
CheckBox ChkAmarillo, ChkAzul, ChkRojo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

ImgAmarillo = (ImageView) findViewById(R.id.ImgAmarillo);
ImgAzul = (ImageView) findViewById(R.id.ImgAzul);
ImgRojo = (ImageView) findViewById(R.id.ImgRojo);
ChkAmarillo = (CheckBox) findViewById(R.id.ChkAmarillo);
ChkAzul = (CheckBox) findViewById(R.id.ChkAzul);
ChkRojo = (CheckBox) findViewById(R.id.ChkRojo);
Resultado = (ImageView) findViewById(R.id.Resultado);

ChkAmarillo.setOnClickListener(this);
ChkAzul.setOnClickListener(this);
ChkRojo.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        if(ChkAmarillo.isChecked() == false && ChkRojo.isChecked()== false && ChkAzul.isChecked()==false) {
            ImgRojo.setBackgroundColor(Color.WHITE);
            ImgAzul.setBackgroundColor(Color.WHITE);
            ImgAmarillo.setBackgroundColor(Color.WHITE);
            Resultado.setBackgroundColor(Color.WHITE);
        }

        if(ChkAmarillo.isChecked() == true && ChkRojo.isChecked()== false && ChkAzul.isChecked()==false){
            ImgRojo.setBackgroundColor(Color.WHITE);
            ImgAzul.setBackgroundColor(Color.WHITE);
            ImgAmarillo.setBackgroundColor(Color.YELLOW);
            Resultado.setBackgroundColor(Color.YELLOW);

        }

        if(ChkAmarillo.isChecked() == false && ChkRojo.isChecked()== true && ChkAzul.isChecked()==false){
            ImgRojo.setBackgroundColor(Color.RED);
            ImgAzul.setBackgroundColor(Color.WHITE);
            ImgAmarillo.setBackgroundColor(Color.WHITE);
            Resultado.setBackgroundColor(Color.RED);
        }

        if(ChkAmarillo.isChecked() == false && ChkRojo.isChecked()== false && ChkAzul.isChecked()== true){
            ImgRojo.setBackgroundColor(Color.WHITE);
            ImgAzul.setBackgroundColor(Color.BLUE);
            ImgAmarillo.setBackgroundColor(Color.WHITE);
            Resultado.setBackgroundColor(Color.BLUE);
        }

        if(ChkAmarillo.isChecked() == true && ChkRojo.isChecked()== true && ChkAzul.isChecked()==true){
            ImgRojo.setBackgroundColor(Color.RED);
            ImgAzul.setBackgroundColor(Color.BLUE);
            ImgAmarillo.setBackgroundColor(Color.YELLOW);
            Resultado.setBackgroundColor(Color.BLACK);
        }

        if(ChkAmarillo.isChecked() == true && ChkRojo.isChecked()== false && ChkAzul.isChecked()==true){
            ImgRojo.setBackgroundColor(Color.WHITE);
            ImgAzul.setBackgroundColor(Color.BLUE);
            ImgAmarillo.setBackgroundColor(Color.YELLOW);
            Resultado.setBackgroundColor(Color.GREEN);
        }

        if(ChkAmarillo.isChecked() == true && ChkRojo.isChecked()== true && ChkAzul.isChecked()==false){
            ImgRojo.setBackgroundColor(Color.RED);
            ImgAzul.setBackgroundColor(Color.WHITE);
            ImgAmarillo.setBackgroundColor(Color.YELLOW);
            Resultado.setBackgroundResource(R.color.Naranja);

        }

        if(ChkAmarillo.isChecked() == false && ChkRojo.isChecked()== true && ChkAzul.isChecked()==true){
            ImgRojo.setBackgroundColor(Color.RED);
            ImgAzul.setBackgroundColor(Color.BLUE);
            ImgAmarillo.setBackgroundColor(Color.WHITE);
            Resultado.setBackgroundResource(R.color.Purpura);

        }




    }
}
