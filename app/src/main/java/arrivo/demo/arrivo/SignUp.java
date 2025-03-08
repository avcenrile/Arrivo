package arrivo.demo.arrivo;

import androidx.appcompat.app.AppCompatActivity;

import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.sign_up)
public class SignUp extends AppCompatActivity {

    @ViewById
    TextView signUpTitle;

    @ViewById
    EditText emailLogin;

    @ViewById
    EditText passwordSignUp;

    @ViewById
    EditText confirmPassword;

    @ViewById
    Button signUpButton;

    @ViewById
    ImageView imageView;

    @AfterViews
    void init() {
        // Any initialization code can go here
    }

    @Click(R.id.logInButton)
    void signUpButtonClicked() {
        // Get user input
        String email = emailLogin.getText().toString().trim();
        String password = passwordSignUp.getText().toString().trim();
        String confirm = confirmPassword.getText().toString().trim();

        // Validate input
        if (email.isEmpty() || password.isEmpty() || confirm.isEmpty()) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!password.equals(confirm)) {
            Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show();
            return;
        }

        // In a real app, you would register the user in a database here
        // For this example, we'll just simulate a successful registration

        Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show();

        // Navigate to Login page after successful registration
        LogIn_.intent(this).start();
        finish(); // Close the SignUp activity
    }
}