package com.example.quizsystem;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    Button btnAIQuiz, btnManualQuiz, btnViewResult;
    ImageButton btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnAIQuiz = findViewById(R.id.btnAIQuiz);
        btnManualQuiz = findViewById(R.id.btnManualQuiz);
        btnViewResult = findViewById(R.id.btnViewResult);
        btnHome = findViewById(R.id.btnHome);

        btnAIQuiz.setOnClickListener(v ->
                Toast.makeText(this, "Redirecting to AI Quiz...", Toast.LENGTH_SHORT).show());

        btnManualQuiz.setOnClickListener(v ->
                Toast.makeText(this, "Redirecting to Manual Quiz...", Toast.LENGTH_SHORT).show());

        btnViewResult.setOnClickListener(v ->
                Toast.makeText(this, "Redirecting to Result Screen...", Toast.LENGTH_SHORT).show());

        btnHome.setOnClickListener(v -> {
            Intent i = new Intent(this, LoginActivity.class);
            startActivity(i);
            finish();
        });
    }
}
