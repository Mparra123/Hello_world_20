package com.example.hello_world_20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"I'm onCreate");
        setupUI();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG,"I'm onResume");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG,"I'm onStart");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG,"I'm onPause");
    }

    @Override
    protected void onStop(){
        Log.i(TAG,"I'm onStop");
        super.onStop();

    }

    @Override
    protected void onDestroy(){
        Log.i(TAG,"I'm onDestroy");
        super.onDestroy();

    }

    private void setupUI(){

        final TextView mTextView = (TextView)findViewById(R.id.textView); //declaring the edit text variable with the name of the strings and ids

        final Button mButton =(Button)findViewById(R.id.btn_submit);

        final Button mNewButton = (Button)findViewById(R.id.btn_new);

        final Intent intent2= new Intent(this,Main2Activity.class);

        final String[] message = {""};//= String.format("Holi"); //test send message

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //button do something

                EditText mEdit_Text = (EditText)findViewById(R.id.editText);

                mTextView.setText(mEdit_Text.getText()); // we set the value that will get the text

                Toast.makeText(getApplicationContext(),"Changed",Toast.LENGTH_SHORT).show();

                message[0] = String.format(mTextView.getText().toString());
            }
        });

        mNewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //goSecondActivity(); //same method, other process
                intent2.putExtra("message", message[0]);
                startActivity(intent2);
            }
        });

    }

    private void goSecondActivity() {

        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
