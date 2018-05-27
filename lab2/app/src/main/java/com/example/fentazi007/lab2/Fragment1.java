package com.example.fentazi007.lab2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;


public class Fragment1 extends Fragment {
    private String fac;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment1, container, false);
        Button buttonOk = rootView.findViewById(R.id.button);
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox ihf = (CheckBox) rootView.findViewById(R.id.checkBoxIHF);
                CheckBox tef = (CheckBox) rootView.findViewById(R.id.checkBoxTEF);
                CheckBox fiot = (CheckBox) rootView.findViewById(R.id.checkBoxFIOT);
                String selectedItems = "";
                if(ihf.isChecked())
                    selectedItems+=ihf.getText()+" ";
                if(tef.isChecked())
                    selectedItems+=tef.getText()+" ";
                if(fiot.isChecked())
                    selectedItems+=fiot.getText()+" ";
                AlertDialog.Builder builder = new AlertDialog.Builder(rootView.getContext());
                builder.setTitle("Dishes")
                        .setMessage(selectedItems)
                        .setCancelable(false)
                        .setNegativeButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();

                /*Fragment2 fragment2 = getFragmentManager().findFragmentById(R.layout.fragment2);
                fragment2.fill(selectedItems);*/
            }
        });
        return rootView;
    }
}
