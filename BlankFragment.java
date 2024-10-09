package com.example.fragmentmake;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BlankFragment extends Fragment {
    Button btnfrg;
    EditText passnamee;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_blank, container,false);

        btnfrg=(Button)view.findViewById(R.id.buttonfrag);
        passnamee=view.findViewById(R.id.passname);

        btnfrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inttent= new Intent(getActivity(), MainActivity.class);
                inttent.putExtra("Key",passnamee.getText().toString());
                startActivity(inttent);
                Toast.makeText(getActivity(),"Fragment is adden", Toast.LENGTH_LONG).show();
            }
        });
         return view;
    }
}