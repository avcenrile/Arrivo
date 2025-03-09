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

public class LogIn extends AppCompatActivity {

    private TextView signUpTitle;
    private EditText emailLI;
    private EditText passwordLI;
    private Button logInBtn;
    private ImageView logoLI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);

        // Initialize UI components
        signUpTitle = findViewById(R.id.logInTitle);
        emailLI = findViewById(R.id.emailLI);
        passwordLI = findViewById(R.id.passwordLI);
        logInBtn = findViewById(R.id.logInBtn);
        logoLI = findViewById(R.id.logoLI);

        // Set click listeners
        logInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //temporarily removing validation cause no connection to db and no will to live to code it rn
//                if (validateInputs()) {
//                    // Here you would typically authenticate the user
//                    // For now, we'll just redirect to the homepage
//                    Intent intent = new Intent(LogIn.this, HomePage.class);
//                    startActivity(intent);
//                    finish(); // Close the login activity
//                }
                Intent intent = new Intent(LogIn.this, HomePage.class);
                startActivity(intent);
                finish(); // Close the login activity
            }
        });
    }


//    private boolean validateInputs() {
//        String email = emailLI.getText().toString().trim();
//        String password = passwordLI.getText().toString().trim();
//
//        // Validate email
//        if (email.isEmpty()) {
//            emailLI.setError("Email is required");
//            return false;
//        }
//
//        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
//            emailLI.setError("Please enter a valid email");
//            return false;
//        }
//
//        // Validate password
//        if (password.isEmpty()) {
//            passwordLI.setError("Password is required");
//            return false;
//        }
//
//        // For demo purposes, let's use a simple authentication
//        // In a real app, you would check against your backend/database
//        if (email.equals("demo@arrivo.ph") && password.equals("password")) {
//            return true;
//        } else {
//            Toast.makeText(this, "Invalid email or password", Toast.LENGTH_SHORT).show();
//            return false;
//        }
//    }
}