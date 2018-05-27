package com.example.fentazi007.lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fentazi007.lab3.R;

import org.w3c.dom.Text;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private final static String FILE_NAME = "content.txt";

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
        CheckBox ihf = (CheckBox) findViewById(R.id.checkBoxIHF);
        CheckBox tef = (CheckBox) findViewById(R.id.checkBoxTEF);
        CheckBox fiot = (CheckBox) findViewById(R.id.checkBoxFIOT);
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
    public void saveText(View view){

        CheckBox ihf = (CheckBox) findViewById(R.id.checkBoxIHF);
        CheckBox tef = (CheckBox) findViewById(R.id.checkBoxTEF);
        CheckBox fiot = (CheckBox) findViewById(R.id.checkBoxFIOT);
        FileOutputStream fos = null;
        try {
            String selectedItems = "";
            if (ihf.isChecked())
                selectedItems += ihf.getText() + " ";
            if (tef.isChecked())
                selectedItems += tef.getText() + " ";
            if (fiot.isChecked())
                selectedItems += fiot.getText() + " ";
            fos = openFileOutput(FILE_NAME, MODE_APPEND);
            fos.write(selectedItems.getBytes());
        }
        catch(IOException ex){
            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show();
        }
        try{
            if(fos!=null)
                fos.close();
        }
        catch(IOException ex){
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void openText(View view){

        FileInputStream fin = null;
        TextView textView = (TextView) findViewById(R.id.textViewOpen);
        try {
            fin = openFileInput(FILE_NAME);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String (bytes);
            textView.setText(text);
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
        finally{

            try{
                if(fin!=null)
                    fin.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }
}


