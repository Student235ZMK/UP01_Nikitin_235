package com.example.a30;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {
    static String VvodA;
    TextView Result;
    Button button;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Result = findViewById(R.id.Result);
        VvodA = String.valueOf(findViewById(R.id.editTextTextA));


    }

    public void Scene1(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void Scene2(View v) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void onClick(View view) {
        int a = Integer.parseInt(VvodA);
        if (0 <= a) {
            if (a < 2 * Math.PI) {
                Result.setText("a = " + a * (180 / 3.14f));
            } else {
                Result.setText("Данные не коректны");

            }
        }
    }
}