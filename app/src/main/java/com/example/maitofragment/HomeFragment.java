package com.example.maitofragment;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.material.button.MaterialButton;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        super(R.layout.fragment_home);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        TextView welcomeLabel = view.findViewById(R.id.label_welcome);
        MaterialButton actionBtn = view.findViewById(R.id.btn_action_welcome);

        actionBtn.setOnClickListener(v ->
                welcomeLabel.setText("Session activée avec succès !"));
    }
}