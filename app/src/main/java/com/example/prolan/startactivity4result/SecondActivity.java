package com.example.prolan.startactivity4result;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Prolan on 22/01/2016.
 */
public class SecondActivity extends Activity{
    EditText editTextMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        editTextMessage = (EditText)findViewById(R.id.editTextMessage);
    }
    public void submitMessage(View V){
        String message = editTextMessage.getText().toString();
        Intent intentMessage = new Intent();
        intentMessage.putExtra("MESSAGE",message);
        setResult(2,intentMessage);
        finish();
    }
}
