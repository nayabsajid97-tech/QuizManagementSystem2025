package com.example.quizsystem;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText editTextId, editTextPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextId = findViewById(R.id.editTextId);
        editTextPassword = findViewById(R.id.editTextPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {
            // temporary logic just to move ahead
            String id = editTextId.getText().toString();
            String pass = editTextPassword.getText().toString();

            if (!id.isEmpty() && !pass.isEmpty()) {
                Intent intent = new Intent(LoginActivity.this, RoleSelectionActivity.class);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(LoginActivity.this, "Please enter ID and Password", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
