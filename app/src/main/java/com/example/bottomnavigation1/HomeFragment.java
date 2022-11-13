package com.example.bottomnavigation1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class HomeFragment extends Fragment {
    TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View vieew = inflater.inflate(R.layout.fragment_home, container, false);

        textView = vieew.findViewById(R.id.hometext);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Welcome to Home page", Toast.LENGTH_SHORT).show();
            }
        });
        return vieew;
    }
}