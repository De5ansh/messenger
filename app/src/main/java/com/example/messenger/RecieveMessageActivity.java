package com.example.messenger;

import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;
import android.os.Bundle;

public class RecieveMessageActivity extends Activity {
    public static final String msg="message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_message);
        Intent intent=getIntent();
        String msgText=intent.getStringExtra(msg);
        TextView msgView=(TextView)findViewById(R.id.message);
        msgView.setText(msgText);
    }
}