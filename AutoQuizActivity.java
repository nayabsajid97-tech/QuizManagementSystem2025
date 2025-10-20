package com.example.quizsystem;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AutoQuizActivity extends AppCompatActivity {
    EditText numQuestions, subject, difficulty;
    Button btnGenerate, btnManualQuiz;
    ImageButton btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_quiz);

        numQuestions = findViewById(R.id.numQuestions);
        subject = findViewById(R.id.subject);
        difficulty = findViewById(R.id.difficulty);
        btnGenerate = findViewById(R.id.btnGenerate);
        btnManualQuiz = findViewById(R.id.btnManualQuiz);
        btnHome = findViewById(R.id.btnHome);

        btnGenerate.setOnClickListener(v ->
                Toast.makeText(this, "Generating...", Toast.LENGTH_SHORT).show());

        btnManualQuiz.setOnClickListener(v -> {
            Intent i = new Intent(this, ManualQuizActivity.class);
            startActivity(i);
        });

        btnHome.setOnClickListener(v -> {
            Intent i = new Intent(this, LoginActivity.class);
            startActivity(i);
            finish();
        });
    }
}
