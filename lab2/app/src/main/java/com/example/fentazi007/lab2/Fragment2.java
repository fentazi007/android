package com.example.fentazi007.lab2;

import android.content.Context;
import android.net.Uri;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment2 extends Fragment {
    private TextView textView;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment2, container, false);
        textView = rootView.findViewById(R.id.textView);
        return rootView;
    }

    public void fill(String text){
        textView.setText(text);
    }
}
