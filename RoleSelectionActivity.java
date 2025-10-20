package com.example.quizsystem;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class RoleSelectionActivity extends AppCompatActivity {

    Button btnTeacher, btnStudent;
    ImageButton btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_selection);

        btnTeacher = findViewById(R.id.btnTeacher);
        btnStudent = findViewById(R.id.btnStudent);
        btnHome = findViewById(R.id.btnHome);

        btnTeacher.setOnClickListener(v -> {
            Intent intent = new Intent(RoleSelectionActivity.this, AutoQuizActivity.class);
            startActivity(intent);
        });

        btnStudent.setOnClickListener(v -> {
            // Student goes to Dashboard screen (NOT manual quiz directly)
            Intent i = new Intent(this, DashboardActivity.class);
            startActivity(i);
        });


        btnHome.setOnClickListener(v -> {
            Intent intent = new Intent(RoleSelectionActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
