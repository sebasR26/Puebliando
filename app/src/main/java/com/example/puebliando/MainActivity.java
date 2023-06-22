package com.example.puebliando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    // atributos = elementos de la actividad

    MediaPlayer cancion;

    //metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cancion = MediaPlayer.create(this,R.raw.miguel );
        cancion.start();

        //temporizamos el splash

        TimerTask inicioAPP = new TimerTask() {
            @Override
            public void run() {
                //lanzo el home

                Intent lanzamiento  = new Intent(MainActivity.this, Home.class);
                startActivity(lanzamiento);


            }
        };
        Timer tiempo = new Timer();
        tiempo.schedule(inicioAPP, 10000);




    }
}