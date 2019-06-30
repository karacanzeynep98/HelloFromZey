package com.example.hellofromzey;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorPrimary));
                Log.i("Zeynep", "Button clicked");
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorOrange));
                Log.i("Zeynep", "Background color clicked");
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userTyped = ((EditText) findViewById(R.id.editText)).getText().toString();

                //if the text is empty, would like to show a default text
                if (TextUtils.isEmpty(userTyped)){
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Zey");
                } else{
                    ((TextView) findViewById(R.id.textView)).setText(userTyped);
                }
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reset the text color of the background
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.black));
                //reset the background color
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorAccent));
                //reset the text
                ((TextView) findViewById(R.id.textView)).setText("Hello from Zey");
            }
        });
    }


}
