package arrivo.demo.arrivo;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.landing_page)
public class LandingPage extends AppCompatActivity {

    @ViewById
    Button loginLandingBtn;

    @ViewById
    Button signUpLandingBtn;

    @ViewById
    ImageView landingImage;

    @ViewById
    ImageView welcome;

    @AfterViews
    void init() {
        // Any initialization code can go here
        // Layout is automatically set by @EActivity annotation
    }

    @Click(R.id.loginLandingBtn)
    void loginButtonClicked() {
        // Navigate to Login page
        LogIn_.intent(this).start();
    }

    @Click(R.id.signUpLandingBtn)
    void signUpButtonClicked() {
        // Navigate to SignUp page
        SignUp_.intent(this).start();
    }
}

