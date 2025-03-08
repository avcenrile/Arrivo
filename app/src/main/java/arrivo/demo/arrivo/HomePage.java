package arrivo.demo.arrivo;

import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.homepage)
public class HomePage extends AppCompatActivity {

    @ViewById
    ImageView arriveHPLogo;

    @ViewById
    ImageButton ejeepLineA;

    @ViewById
    Button nextPageButton; // This button will lead to the 5th page to be added later

    @AfterViews
    void init() {
        // Any initialization code can go here
    }

    @Click(R.id.ejeepLineA)
    void nextPageButtonClicked() {
        // This will navigate to the 5th page that will be added later
        // NextPage_.intent(this).start();

        // For now, just show a toast message since the 5th page is not created yet
        Toast.makeText(this, "5th page will be added later", Toast.LENGTH_SHORT).show();
    }

//    @Override
//    public void onBackPressed() {
//        // Instead of going back, show a dialog to confirm logout
//        // For simplicity, we'll just go to the landing page
//        Intent intent = LandingPage_.intent(this).get();
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//        startActivity(intent);
//    }
}
