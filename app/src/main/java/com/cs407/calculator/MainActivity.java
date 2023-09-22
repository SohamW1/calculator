package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void clickFunction_add (View view) {
        EditText number_1 = (EditText) findViewById(R.id.first_number);
        EditText number_2 = (EditText) findViewById(R.id.second_number);
        goToActivity("add", number_1.getText().toString(),number_2.getText().toString());
    }

    public void clickFunction_sub (View view) {
        EditText number_1 = (EditText) findViewById(R.id.first_number);
        EditText number_2 = (EditText) findViewById(R.id.second_number);
        goToActivity("sub", number_1.getText ().toString(),number_2.getText ().toString());
    }
    public void clickFunction_mult (View view) {
        EditText number_1 = (EditText) findViewById(R.id.first_number);
        EditText number_2 = (EditText) findViewById(R.id.second_number);
        goToActivity("mult", number_1.getText ().toString(),number_2.getText ().toString());
    }
    public void clickFunction_div (View view) {
        EditText number_1 = (EditText) findViewById(R.id.first_number);
        EditText number_2 = (EditText) findViewById(R.id.second_number);
        goToActivity("divide",number_1.getText ().toString(),number_2.getText ().toString());
    }

    private void goToActivity(String op, String s1, String s2) {
        Intent intent= new Intent(this, calc.class);
        intent.putExtra("num1", s1);
        intent.putExtra("num2", s2);
        intent.putExtra("operation", op);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}