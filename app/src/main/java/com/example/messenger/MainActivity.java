package com.example.messenger;

import android.graphics.Color;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.app.Activity;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        EditText msgView=(EditText)findViewById(R.id.message);
        String msgText=msgView.getText().toString();
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,msgText);
        String chsTitle=getString(R.string.chooser);
        Intent chsIntent=Intent.createChooser(intent,chsTitle);
        startActivity(chsIntent);
    }
    public void onToggleButtonClicked(View view) {
        boolean on=((ToggleButton) view).isChecked();
        FrameLayout frameLayout=(FrameLayout) findViewById(R.id.mainLayout);
        ToggleButton toggleButton=(ToggleButton) findViewById(R.id.toggleButton);
        TextView textView=(TextView) findViewById(R.id.textView);
        EditText editText=(EditText) findViewById(R.id.message);
        if (on) {
            frameLayout.setBackgroundColor(Color.WHITE);
            toggleButton.setBackgroundColor(Color.WHITE);
            toggleButton.setTextColor(Color.BLACK);
            textView.setTextColor(Color.BLACK);
            editText.setTextColor(Color.BLACK);
        } else {
            frameLayout.setBackgroundColor(Color.BLACK);
            toggleButton.setBackgroundColor(Color.BLACK);
            toggleButton.setTextColor(Color.WHITE);
            textView.setTextColor(Color.WHITE);
            editText.setTextColor(Color.WHITE);
        }
    }
}
