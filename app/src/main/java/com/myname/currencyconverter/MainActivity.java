package com.myname.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("WrongViewCast")
    public void functionClick(View view){
        Log.i("Info","Button Pressed");
        EditText editTextName;
        editTextName = (EditText) findViewById(R.id.editTextNumberDecimal);
        TextView editTextView =(TextView)  findViewById(R.id.editTextView);
        String amountInRupee = editTextName.getText().toString();
        double amountInDollar = Double.parseDouble(amountInRupee)/72.50;
//        String amountInDollarString = Double.toString(amountInDollar);
        String amountInDollarString = String.format("%.2f",amountInDollar);
        editTextView.setText(amountInDollarString+"$");
        Log.i("Info","your money "+amountInDollarString);
        Toast.makeText(this,"your Money has changed in $ " + amountInDollarString, Toast.LENGTH_SHORT).show();
        editTextName.setText(" ");

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}