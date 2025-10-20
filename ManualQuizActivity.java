package com.example.quizsystem;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ManualQuizActivity extends AppCompatActivity {
    EditText etQuestion, etAnswer, etMarks;
    Button btnAdd, btnAutoQuiz;
    ImageButton btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_quiz);

        etQuestion = findViewById(R.id.etQuestion);
        etAnswer = findViewById(R.id.etAnswer);
        etMarks = findViewById(R.id.etMarks);
        btnAdd = findViewById(R.id.btnAdd);
        btnAutoQuiz = findViewById(R.id.btnAutoQuiz);
        btnHome = findViewById(R.id.btnHome);

        btnAdd.setOnClickListener(v ->
                Toast.makeText(this, "Added", Toast.LENGTH_SHORT).show());

        btnAutoQuiz.setOnClickListener(v -> {
            Intent i = new Intent(this, AutoQuizActivity.class);
            startActivity(i);
        });

        btnHome.setOnClickListener(v -> {
            Intent i = new Intent(this, LoginActivity.class);
            startActivity(i);
            finish();
        });
    }
}
