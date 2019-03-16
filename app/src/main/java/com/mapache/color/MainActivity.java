package com.mapache.color;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList<Integer> rojo = new ArrayList<Integer>();
    ArrayList<Integer> verde = new ArrayList<Integer>();
    ArrayList<Integer> azul = new ArrayList<Integer>();

    Button btn_red, btn_green, btn_blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rojo.add(R.color.red1);
        rojo.add(R.color.red2);
        rojo.add(R.color.red3);
        rojo.add(R.color.red4);
        rojo.add(R.color.red5);
        rojo.add(R.color.red6);

        verde.add(R.color.green1);
        verde.add(R.color.green2);
        verde.add(R.color.green3);
        verde.add(R.color.green4);
        verde.add(R.color.green5);
        verde.add(R.color.green6);

        azul.add(R.color.blue1);
        azul.add(R.color.blue2);
        azul.add(R.color.blue3);
        azul.add(R.color.blue4);
        azul.add(R.color.blue5);
        azul.add(R.color.blue6);

        btn_red = findViewById(R.id.bred);
        btn_green = findViewById(R.id.bgreen);
        btn_blue = findViewById(R.id.bblue);

        btn_red.setOnClickListener(this);
        btn_green.setOnClickListener(this);
        btn_blue.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int num = (int) (Math.random()*6);
        switch (v.getId()){
            case R.id.bred:
                btn_red.setBackground(getResources().getDrawable(rojo.get(num)));
                break;
            case R.id.bgreen:
                btn_green.setBackground(getResources().getDrawable(verde.get(num)));
                break;
            case R.id.bblue:
                btn_blue.setBackground(getResources().getDrawable(azul.get(num)));
                break;
        }
    }
}
