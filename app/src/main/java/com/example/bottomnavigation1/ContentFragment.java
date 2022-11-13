package com.example.bottomnavigation1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ContentFragment extends Fragment {

    TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View  vieew =  inflater.inflate(R.layout.fragment_content, container, false);

       textView = vieew.findViewById(R.id.contecttext);
       textView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(getContext(), "Welcome to ContentFragment", Toast.LENGTH_SHORT).show();
           }
       });

        return vieew;
    }
}