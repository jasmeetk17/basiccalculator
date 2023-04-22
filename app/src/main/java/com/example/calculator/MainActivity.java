package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText no1,no2;
    Button ad,sub,div,mul;
    TextView result;

    @SuppressLint({"MissingInflatedId", "WrongViewCast", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        no1=findViewById(R.id.no1);
        no2=findViewById(R.id.no2);
        ad=findViewById(R.id.ad);
        sub=findViewById(R.id.sub);
        div=findViewById(R.id.div);
        mul=findViewById(R.id.mul);
        result=findViewById(R.id.result);

        ad.setOnClickListener(view -> {
            int f,s;
            f=Integer.parseInt(no1.getText().toString());
            s=Integer.parseInt(no2.getText().toString());
            int a;
            a = f + s;
            result.setText("Result=" + a);
      });
        mul.setOnClickListener(view -> {
            int f,s;

            f=Integer.parseInt(no1.getText().toString());
            s=Integer.parseInt(no2.getText().toString());
            int a;
            a = f * s;
            result.setText("Result=" + a);
        });
        sub.setOnClickListener(view -> {
            int f,s;

            f=Integer.parseInt(no1.getText().toString());
            s=Integer.parseInt(no2.getText().toString());
            int a;
            a = f - s;
            result.setText("Result=" + a);
        });
        div.setOnClickListener(view -> {
            int f,s;

            f=Integer.parseInt(no1.getText().toString());
            s=Integer.parseInt(no2.getText().toString());
            int a;
            a = f % s;
            result.setText("Result=" + a);
        });





    }


}