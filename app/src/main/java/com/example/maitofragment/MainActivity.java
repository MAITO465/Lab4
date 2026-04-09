package com.example.maitofragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnHome, btnSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        if (savedInstanceState == null) {
            displayModule(new HomeFragment(), false);
        }

        btnHome.setOnClickListener(view -> displayModule(new HomeFragment(), true));
        btnSettings.setOnClickListener(view -> displayModule(new SettingsFragment(), true));
    }

    private void initViews() {
        btnHome = findViewById(R.id.nav_home);
        btnSettings = findViewById(R.id.nav_settings);
    }

    private void displayModule(Fragment target, boolean saveInStack) {
        var transaction = getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
                .replace(R.id.main_content_area, target);

        if (saveInStack) transaction.addToBackStack(null);
        transaction.commit();
    }
}