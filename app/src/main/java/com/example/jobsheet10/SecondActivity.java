package com.example.jobsheet10;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
    private TextView textViewName, textViewClass, textViewNIS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewName = findViewById(R.id.textViewName);
        textViewClass = findViewById(R.id.textViewClass);
        textViewNIS = findViewById(R.id.textViewNIS);

        // Retrieve data from intent
        String name = getIntent().getStringExtra("NAME");
        String className = getIntent().getStringExtra("CLASS");
        String nis = getIntent().getStringExtra("NIS");

        // Display the data
        textViewName.setText("Nama: " + name);
        textViewClass.setText("Kelas: " + className);
        textViewNIS.setText("NIS: " + nis);
    }
}