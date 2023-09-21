package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickAdd(View view) {
        EditText myTextField1=(EditText) findViewById(R.id.myTextField1);
        EditText myTextField2=(EditText) findViewById(R.id.myTextField2);
        if(myTextField1.getText().toString().isEmpty() || myTextField2.getText().toString().isEmpty()) {
            goToError("ERROR: missing input(s)");
        } else {
            double num1 = Double.parseDouble(myTextField1.getText().toString());
            double num2 = Double.parseDouble(myTextField2.getText().toString());
            goToSolution(num1+num2);
        }
    }

    public void clickSubtract(View view) {
        EditText myTextField1=(EditText) findViewById(R.id.myTextField1);
        EditText myTextField2=(EditText) findViewById(R.id.myTextField2);
        if(myTextField1.getText().toString().isEmpty() || myTextField2.getText().toString().isEmpty()) {
            goToError("ERROR: missing input(s)");
        } else {
            double num1 = Double.parseDouble(myTextField1.getText().toString());
            double num2 = Double.parseDouble(myTextField2.getText().toString());
            goToSolution(num1-num2);
        }
    }

    public void clickMultiply(View view) {
        EditText myTextField1=(EditText) findViewById(R.id.myTextField1);
        EditText myTextField2=(EditText) findViewById(R.id.myTextField2);
        if(myTextField1.getText().toString().isEmpty() || myTextField2.getText().toString().isEmpty()) {
            goToError("ERROR: missing input(s)");
        } else {
            double num1 = Double.parseDouble(myTextField1.getText().toString());
            double num2 = Double.parseDouble(myTextField2.getText().toString());
            goToSolution(num1*num2);
        }
    }

    public void clickDivide(View view) {
        EditText myTextField1=(EditText) findViewById(R.id.myTextField1);
        EditText myTextField2=(EditText) findViewById(R.id.myTextField2);
        if(myTextField1.getText().toString().isEmpty() || myTextField2.getText().toString().isEmpty()) {
            goToError("ERROR: missing input(s)");
        } else {
            double num1 = Double.parseDouble(myTextField1.getText().toString());
            double num2 = Double.parseDouble(myTextField2.getText().toString());
            if(num2==0) goToError("ERROR: divide by zero");
            else goToSolution(num1/num2);
        }
    }

    public void goToSolution(double d) {
        Intent intent=new Intent(this, SolutionActivity.class);
        intent.putExtra("message", Double.toString(d));
        startActivity(intent);
    }

    public void goToError(String s) {
        Intent intent=new Intent(this, SolutionActivity.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
}