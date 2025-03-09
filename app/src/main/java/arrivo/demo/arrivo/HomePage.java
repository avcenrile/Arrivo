package arrivo.demo.arrivo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {

    private ImageView arriveHPLogo;
    private ImageButton ejeepLineA;
    private Button navigateButton; // Button to navigate to the next page you plan to add

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        // Initialize UI components
        arriveHPLogo = findViewById(R.id.arriveHPLogo);
        ejeepLineA = findViewById(R.id.ejeepLineA);

        // Set up click listeners
        ejeepLineA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle E-Jeep Line A selection
                Toast.makeText(HomePage.this, "E-Jeep Line A selected", Toast.LENGTH_SHORT).show();
                // Additional functionality can be added here
            }
        });
    }
}