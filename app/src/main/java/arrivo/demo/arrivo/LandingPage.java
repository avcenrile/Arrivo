package arrivo.demo.arrivo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LandingPage extends AppCompatActivity {

    private Button loginLandingBtn;
    private Button signUpLandingBtn;
    private ImageView landingImage;
    private ImageView welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);

        // Initialize UI components
        loginLandingBtn = findViewById(R.id.logInLandingBtn);
        signUpLandingBtn = findViewById(R.id.signUpLandingBtn);
        landingImage = findViewById(R.id.landingImage);
        welcome = findViewById(R.id.welcome);

        // Set click listeners
        loginLandingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LandingPage.this, LogIn.class);
                startActivity(intent);
            }
        });

        signUpLandingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LandingPage.this, SignUp.class);
                startActivity(intent);
            }
        });
    }
}