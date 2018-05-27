package com.example.fentazi007.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        /*List<CheckBox> items = new ArrayList<CheckBox>();
        String text = "gfgfg";
        for(CheckBox item: items) {
            if (item.isChecked()) {
                text = item.getText().toString();
            }
        }
        Toast.makeText(getApplicationContext(),text,Toast.LENGTH_LONG).show();*/
        CheckBox ihf = (CheckBox) findViewById(R.id.checkBox);
        CheckBox tef = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox fiot = (CheckBox) findViewById(R.id.checkBox3);
        String selectedItems = "";
        if(ihf.isChecked())
            selectedItems+=ihf.getText()+" ";
        if(tef.isChecked())
            selectedItems+=tef.getText()+" ";
        if(fiot.isChecked())
            selectedItems+=fiot.getText()+" ";
        Toast.makeText(getApplicationContext(),selectedItems,Toast.LENGTH_LONG).show();
        /*CheckBox[] nameString = new CheckBox[]{Array, Array2, }
        Toast toast = Toast.makeText(getApplicationContext(),text,Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();*/
    }
}
