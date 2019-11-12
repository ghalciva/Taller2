package com.example.taller2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView numA, numB, numC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        numA = (TextView) findViewById(R.id.txtA);
        numB = (TextView) findViewById(R.id.txtB);
        numC = (TextView) findViewById(R.id.txtC);

        Bundle bundle = getIntent().getExtras();
        String dato1 = bundle.getString("Evento1").toString();
        numA.setText(dato1);
        String dato2 = bundle.getString("Evento2").toString();
        numB.setText(dato2);
        String dato3 = bundle.getString("Evento3").toString();
        numC.setText(dato3);
    }
}
