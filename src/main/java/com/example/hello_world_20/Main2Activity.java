package com.example.hello_world_20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /*
        Bundle i = getIntent().getExtras();
        String message = i.getString("message");

        final TextView mTextView = (TextView)findViewById(R.id.textView2);
        mTextView.setText(message);
        */
    }
}
