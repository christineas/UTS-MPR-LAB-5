package com.example.utsmpr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button galery;

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String nama = getIntent().getExtras().getString("nama");

        result = findViewById(R.id.hello);
        result.setText(" "+nama);
    }

    public void galery(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}