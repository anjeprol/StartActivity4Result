package com.example.prolan.startactivity4result;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tVMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tVMessage = (TextView)findViewById(R.id.tVMessages);
    }

    public void getMessage(View v){
        Intent intentGetMessage = new Intent(this,SecondActivity.class);
        startActivityForResult(intentGetMessage, 2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==2){
            if(null!=data){
                String message = data.getStringExtra("MESSAGE");
                tVMessage.setText("Message from second Activity: "+message);
            }
        }
    }

}
