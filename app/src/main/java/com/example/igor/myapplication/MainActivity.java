package com.example.igor.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mHelloTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHelloTextView = (TextView)findViewById(R.id.textView);
    }

    public void onClick(View view) {
        if(mHelloTextView.getText() == "Salut Shmon!"){
            mHelloTextView.setText("Salut Igor!");
        }
        else{
            mHelloTextView.setText("Salut Shmon!");
        }

    }
}
