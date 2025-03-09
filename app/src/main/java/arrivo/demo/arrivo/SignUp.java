package arrivo.demo.arrivo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {

    private TextView signUpTitle;
    private EditText emailSignUp;
    private EditText passwordSignUp;
    private EditText confirmPassword;
    private Button signUpButton;
    private ImageView logoSU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        // Initialize UI components
        signUpTitle = findViewById(R.id.signUpTitle);
        emailSignUp = findViewById(R.id.emailSignUp);
        passwordSignUp = findViewById(R.id.passwordSignUp);
        confirmPassword = findViewById(R.id.confirmPassword);
        signUpButton = findViewById(R.id.signUpButton);
        logoSU = findViewById(R.id.logoSU);

        // Set click listeners
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateInputs()) {
                    // Here you would typically register the user in your database
                    // For now, we'll just display a success message and redirect to login
                    Toast.makeText(SignUp.this, "Sign up successful! Please log in.", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(SignUp.this, LogIn.class);
                    startActivity(intent);
                    finish(); // Close the sign-up activity
                }
            }
        });
    }

    private boolean validateInputs() {
        String email = emailSignUp.getText().toString().trim();
        String password = passwordSignUp.getText().toString().trim();
        String confirm = confirmPassword.getText().toString().trim();

        // Validate email
        if (email.isEmpty()) {
            emailSignUp.setError("Email is required");
            return false;
        }

        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            emailSignUp.setError("Please enter a valid email");
            return false;
        }

        // Validate password
        if (password.isEmpty()) {
            passwordSignUp.setError("Password is required");
            return false;
        }

        if (password.length() < 6) {
            passwordSignUp.setError("Password must be at least 6 characters");
            return false;
        }

        // Validate confirm password
        if (!password.equals(confirm)) {
            confirmPassword.setError("Passwords do not match");
            return false;
        }

        return true;
    }
}
