package com.example.dweaver.concerttickets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double converting;
    double totalCost;
    double mm;
    double cm;
    double m;
    double converter;
    int groupChoice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText txtConverting = (EditText) findViewById(R.id.txtConverting);
        final Spinner group= (Spinner) findViewById(R.id.txtGroup);
        Button cost = (Button)findViewById(R.id.btn);
        cost.setOnClickListener(new View.OnClickListener(){
            final TextView result = ((TextView)findViewById(R.id.txtResult));
            @Override
            public void onClick(View V) {
                converting = Integer.parseInt(txtConverting.getText().toString());
                groupChoice = group.getSelectedItemPosition();

                switch(groupChoice){
                    case 0: converter= 25.4;
                        break;
                    case 1: converter= 304.8;
                        break;
                    case 2: converter= 914.4;
                        break;
                }





                    mm = converting * converter;
                    cm = mm / 10;
                    m = cm / 100;


                    result.setText("Converstion for mm is " + mm + "mm\n" +
                            "Converstion for cm is " + cm + "cm\n" +
                            "Converstion for  m is " + m + "m");


            }
        });

    }
}
