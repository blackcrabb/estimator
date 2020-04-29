package com.combined.approject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class cal extends AppCompatActivity {
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, cl;
    EditText result, doi, wit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
        b0 = (Button) findViewById(R.id.btn0);
        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);
        b5 = (Button) findViewById(R.id.btn5);
        b6 = (Button) findViewById(R.id.btn6);
        b7 = (Button) findViewById(R.id.btn7);
        b8 = (Button) findViewById(R.id.btn8);
        b9 = (Button) findViewById(R.id.btn9);
        cl = (Button) findViewById(R.id.clear);
        result = (EditText) findViewById(R.id.res);
        doi = (EditText) findViewById(R.id.doing);
        wit = (EditText) findViewById(R.id.with);
        cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cal.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inf = getMenuInflater();
        inf.inflate(R.menu.operator, menu);
        return true;
    }
    public void method0(View v)
    {
        doi.setText("0");
    }
    public void method1(View v)
    {
        doi.setText("1");
    }
    public void method2(View v)
    {
        doi.setText("2");
    }
    public void method3(View v)
    {
        doi.setText("3");
    }
    public void method4(View v)
    {
        doi.setText("4");
    }
    public void method5(View v)
    {
        wit.setText("5");
    }
    public void method6(View v)
    {
        wit.setText("6");
    }
    public void method7(View v)
    {
        wit.setText("7");
    }
    public void method8(View v)
    {
        wit.setText("8");
    }
    public void method9(View v)
    {
        wit.setText("9");
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        float num1 = Float.parseFloat(doi.getText().toString());
        float num2 = Float.parseFloat(wit.getText().toString());
        switch (item.getItemId()) {
            case R.id.plus:
                float sum = num1 + num2;
                result.setText(String.valueOf(sum));
                return true;
            case R.id.sub:
                float subtra = num1 - num2;
                result.setText(String.valueOf(subtra));
                return true;
            case R.id.mul:
                float mu = num1 * num2;
                result.setText(String.valueOf(mu));
                return true;
            case R.id.div:
                if (num2 != 0) {
                    float di = num1 / num2;
                    result.setText(String.valueOf(di));
                    return true;
                }
                else {
                    result.setText("undefined");
                    return true;
                }
            default:return super.onOptionsItemSelected(item);
        }
    }

}