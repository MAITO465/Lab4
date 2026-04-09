package com.example.maitofragment;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SettingsFragment extends Fragment {

    private int currentLevel = 50;
    private static final String STATE_LEVEL = "current_level";

    public SettingsFragment() {
        super(R.layout.fragment_settings);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        TextView statusText = view.findViewById(R.id.text_status);
        SeekBar levelBar = view.findViewById(R.id.slider_control);

        if (savedInstanceState != null) {
            currentLevel = savedInstanceState.getInt(STATE_LEVEL);
        }

        levelBar.setProgress(currentLevel);
        statusText.setText("Niveau actuel : " + currentLevel + "%");

        levelBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                currentLevel = i;
                statusText.setText("Niveau actuel : " + i + "%");
            }
            @Override public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override public void onStopTrackingTouch(SeekBar seekBar) {}
        });
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putInt(STATE_LEVEL, currentLevel);
        super.onSaveInstanceState(outState);
    }
}