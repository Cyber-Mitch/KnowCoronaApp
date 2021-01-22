package android.exmaple.knowcorona;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Treatments extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new TreatmentsFragment())
                .commit();

    }

}
