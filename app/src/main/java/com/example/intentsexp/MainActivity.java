package com.example.intentsexp;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt= findViewById(R.id.txtnumero);

        new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                txt.setText(String.valueOf(millisUntilFinished/1000));

            }
            @Override
            public void onFinish() {
                Intent t=new Intent(MainActivity.this,Main2Activity.class);
                t.putExtra("nombre","Imogen Poots");
                startActivity(t);
                finish();
            }
        }.start();
    }
}
