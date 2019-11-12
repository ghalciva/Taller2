package com.example.taller2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counterA=0;
    int counterB=0;
    int counterC=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void Evento1 (View v){
        counterA++;
        Log.d("Evento1",  counterA+"");
    }

    public void Evento2 (View v){
        counterB++;
        Log.d("Evento2",  counterB+"");
    }

    public void Evento3 (View v){
        counterC++;
        Log.d("Evento3",  counterC+"");
    }

    public void Evento4 (View v){
        Log.d("Evento4", "Boton Siguiente");
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("Evento1", counterA+"");
        intent.putExtra("Evento2", counterB+"");
        intent.putExtra("Evento3", counterC+"");
        startActivity(intent);
    }
}
