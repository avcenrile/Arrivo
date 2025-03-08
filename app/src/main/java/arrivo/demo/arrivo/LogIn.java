package arrivo.demo.arrivo;

import androidx.appcompat.app.AppCompatActivity;

import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.log_in)
public class LogIn extends AppCompatActivity {

    @ViewById
    TextView signUpTitle; // Using the same ID as in SignUp but with "Log In" text

    @ViewById
    EditText emailLogin;

    @ViewById
    EditText confirmPassword; // Using this for the password field

    @ViewById
    Button signUpButton; // Using the same ID as in SignUp but with "Log In" text

    @ViewById
    ImageView imageView;

    @AfterViews
    void init() {
        // Any initialization code can go here
    }

    @Click(R.id.logInButton)
    void loginButtonClicked() {
        // Get user input
        String email = emailLogin.getText().toString().trim();
        String password = confirmPassword.getText().toString().trim();

        // Validate input
        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        // In a real app, you would authenticate the user here
        // For this example, we'll just simulate a successful login

        // Navigate to HomePage after successful login
        HomePage_.intent(this).start();
        finish(); // Close the LogIn activity
    }
}