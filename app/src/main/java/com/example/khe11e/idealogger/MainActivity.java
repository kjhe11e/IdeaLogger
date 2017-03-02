package com.example.khe11e.idealogger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ideaText;
    Button logIdeaBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ideaText = (EditText) findViewById(R.id.ideaText);
        logIdeaBtn = (Button) findViewById(R.id.logIdeaBtn);
        
    }
}
