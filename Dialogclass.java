package com.example.fragmentmake;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class Dialogclass extends AppCompatDialogFragment {
    EditText txt1,txt2;
    myInterface mynewInterface;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder =new AlertDialog.Builder(getActivity());
        LayoutInflater inflater =getActivity().getLayoutInflater();
        View view=inflater.inflate(R.layout.diagform,null);

        builder.setView(view)
                .setTitle("Test custom Dialog")
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();

                    }
                })
                .setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String txtset= txt1.getText().toString();
                        String txt2set= txt2.getText().toString();
                        mynewInterface.applyTxtsmeth(txtset,txt2set);

                    }
                });
        txt1=view.findViewById(R.id.addcat);
        txt2=view.findViewById(R.id.addbug);
        return builder.create();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mynewInterface=(myInterface) context;

    }
    public interface myInterface{
        void applyTxtsmeth(String txt1,String txt2);
    }
}
