package com.example.trocadetelas3000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btTela1, btTela2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        carregarTela1();


    }

    public void carregarTela1(){
        setContentView(R.layout.activity_main);
        btTela2 = (Button) findViewById(R.id.btTela2);
        btTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carregarTela2();
            }
        });
    }

    public void carregarTela2(){
        setContentView(R.layout.tela2);
        btTela1 = (Button) findViewById(R.id.btTela1);
        btTela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                carregarTela1();
            }
        });
    }
}