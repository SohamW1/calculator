package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class calc extends AppCompatActivity {
//
//    TextView textView;
//    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate (savedInstanceState);
//        setContentView(R.layout.activity_calc);
//        Intent intent =getIntent();
//        Integer num_1= Integer.parseInt(intent.getStringExtra("num1"));
//        Integer num_2= Integer.parseInt(intent.getStringExtra("num2"));
//        String operation = intent.getStringExtra("operation");
//
//        if (operation.equals("add")) {
//            int add = num_1 + num_2;
//            String resultText = String.valueOf(add);
//            textView.setText(resultText);
//
//        } else if (operation.equals("mult")) {
//            int multiply = num_1 * num_2;
//            String resultText = String.valueOf(multiply);
//            textView.setText(resultText);
//        }
//        else if (operation.equals("sub")) {
//            int sub = num_1 - num_2;
//            String resultText = String.valueOf(sub);
//            textView.setText(resultText);
//        }
//        else if (operation.equals("divide")) {
//            int divide = num_1 / num_2;
//            String resultText = String.valueOf(divide);
//            textView.setText(resultText);
//        }
//    }
////
////    public void add(String num1, String num2){
////
////    }
////}
//package com.cs407.calculator;
//
//import androidx.appcompat.app.AppCompatActivity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.widget.TextView;
//
//public class calc extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        float num_1 = Float.parseFloat(intent.getStringExtra("num1"));
        float num_2 = Float.parseFloat(intent.getStringExtra("num2"));
        String operation = intent.getStringExtra("operation");

        if (operation.equals("add")) {
            float add = num_1 + num_2;
            String resultText = String.valueOf(add);
            textView.setText(resultText);
        } else if (operation.equals("mult")) {
            float multiply = num_1 * num_2;
            String resultText = String.valueOf(multiply);
            textView.setText(resultText);
        } else if (operation.equals("sub")) {
            float sub = num_1 - num_2;
            String resultText = String.valueOf(sub);
            textView.setText(resultText);
        } else if (operation.equals("divide")) {
            if (num_2 != 0) {
                float divide = num_1 / num_2;
                String resultText = String.valueOf(divide);
                textView.setText(resultText);
            } else {
                textView.setText("Cannot divide by zero");
            }
        }
    }
}
