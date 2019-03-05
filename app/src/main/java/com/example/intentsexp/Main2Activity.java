package com.example.intentsexp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        txt2=findViewById(R.id.txtnombre);

        Bundle n=getIntent().getExtras();

        String rt = n.getString("nombre");
        txt2.setText(rt);
    }
}
