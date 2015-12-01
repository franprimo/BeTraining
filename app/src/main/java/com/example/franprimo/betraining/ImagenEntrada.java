package com.example.franprimo.betraining;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Timer;
import java.util.TimerTask;

public class ImagenEntrada extends Activity {

    private long TIEMPO_RETRASO = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen_entrada);

        TimerTask task = new TimerTask(){
            public void run(){
                Intent mainIntent = new Intent(getApplicationContext(), LoginActivity.class);
                //Cambio del activity imagenPrincipal al activity MainActivity.
                startActivity(mainIntent);
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, TIEMPO_RETRASO);
    }


}
