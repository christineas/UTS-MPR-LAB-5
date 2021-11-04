package com.example.utsmpr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";
    EditText nama, pass;
    Button next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = findViewById(R.id.username);
        pass = findViewById(R.id.password_id);
        next = findViewById(R.id.signin);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("nama", nama.getText().toString());
                startActivity(i);
            }
        });
    }

    public void SignIn(View view) {
        EditText nama = (EditText) findViewById(R.id.username);
        String text = nama.getText().toString();
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(Intent.EXTRA_TEXT, text);
        startActivity(intent);
    }
}