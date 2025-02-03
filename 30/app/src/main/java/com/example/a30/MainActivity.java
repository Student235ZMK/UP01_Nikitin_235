package com.example.a30;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import static java.lang.Math.*;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.test.runner.permission.RequestPermissionCallable;

public class MainActivity extends AppCompatActivity {
    static String VvodA, VvodB;
    TextView Result;
    Button button;
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        button =findViewById(R.id.buttonCalc);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Result =findViewById(R.id.Result);
        VvodA = String.valueOf(findViewById((R.id.editTextA)));
        VvodB = String.valueOf(findViewById(R.id.editTextTextB));

        /*button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                double sum;
                int a = Integer.parseInt(VvodA);
                int b = Integer.parseInt(VvodB);
                sum = sqrt(a * b);
                Result.setText("" + sum);
            }
        });*/

    }
    public void Scene2(View v){
        Intent intent = new Intent(this, MainActivity2.class );
        startActivity(intent);
    }
    public void Scene3(View v){
        Intent intent = new Intent(this, MainActivity3.class );
        startActivity(intent);
}
}