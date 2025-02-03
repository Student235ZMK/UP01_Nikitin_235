package com.example.a3001;

import static java.lang.Math.sqrt;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView textViewResult;
    Button btn;
    EditText VvodA, VvodB;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        textViewResult=findViewById(R.id.textViewResult);
        VvodA = findViewById(R.id.editTextTextA);
        VvodB = findViewById(R.id.editTextTextB);
        btn = findViewById(R.id.button4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a =Integer.parseInt(VvodA.getText().toString());
                int b =Integer.parseInt(VvodB.getText().toString());
                textViewResult.setText("" + sqrt(a * b));
            }
        });
    }
    public void startNewActivity(View v){
    Intent intent = new Intent(this, SecondActivity.class);
    startActivity(intent);
    }
}