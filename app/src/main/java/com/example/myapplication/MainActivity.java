package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        TextView textView;

        int numone=0;
        int numtwo=0;
        int sumAll;
        String opr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.textView);
    }

    public void viewNum(View view){
        Button button =(Button) view;

        textView.append(button.getText().toString());

        if (numone==0) {
            numone = Integer.parseInt(button.getText().toString());
        }
        else {
            numtwo = Integer.parseInt(button.getText().toString());
        }
    }
    public void operator(View view){
        Button button =(Button) view;

        textView.append(button.getText().toString());

        opr= button.getText().toString();
    }
    public void sum(View view){
        Button button =(Button) view;


        if (opr.equals("-")){
             sumAll = numone - numtwo;

        }
        else if (opr.equals("+")){
             sumAll = numone + numtwo;

        }
        else if (opr.equals("X")){
             sumAll = numone * numtwo;

        }
        else if (opr.equals("/")){
             sumAll = numone / numtwo;

        }
        else{
//            sumAll =Integer.parseInt(opr);
        }

        String s=String.valueOf(sumAll);


        textView.setText(s);
    }

    public void clear(View view){
        Button button =(Button) view;

        numone = 0;
        numtwo=0;

        textView.setText("");
    }
}