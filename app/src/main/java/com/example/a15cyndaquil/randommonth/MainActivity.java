package com.example.a15cyndaquil.randommonth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button monthBT = (Button) (findViewById(R.id.monthBT));

        final TextView outputTV = (TextView) (findViewById(R.id.outputTV));

        monthBT.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int out = (int) (Math.random()*12);
                switch(out) {
                    case 0:
                        outputTV.setText("January");
                        break;
                    case 1:
                        outputTV.setText("February");
                        break;
                    case 2:
                        outputTV.setText("March");
                        break;
                    case 3:
                        outputTV.setText("April");
                        break;
                    case 4:
                        outputTV.setText("May");
                        break;
                    case 5:
                        outputTV.setText("June");
                        break;
                    case 6:
                        outputTV.setText("July");
                        break;
                    case 7:
                        outputTV.setText("August");
                        break;
                    case 8:
                        outputTV.setText("September");
                        break;
                    case 9:
                        outputTV.setText("October");
                        break;
                    case 10:
                        outputTV.setText("November");
                        break;
                    case 11:
                        outputTV.setText("December");
                        break;
                    default:
                        outputTV.setText("Error");
                        break;
                }
            }
        });

    }
}
