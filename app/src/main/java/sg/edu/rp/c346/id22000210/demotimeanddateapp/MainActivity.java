package sg.edu.rp.c346.id22000210.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Declaring the Field Variables
    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking the Variables to Their Respective UI Elements
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnReset = findViewById(R.id.reset);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            //It ties a listener object when the button is clicked, and it will then activate the method (action)
            @Override
            public void onClick(View v) {
                //Code for the action of Display Time button
                tvDisplay.setText("Time is " + tp.getHour() + ":" + tp.getMinute());


            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code for action to handle Display Date button click event
                tvDisplay.setText("Date is " + dp.getDayOfMonth() + "/" + (dp.getMonth() + 1) + "/" + dp.getYear());

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Action to handle Reset button click event
                tvDisplay.setText("");
                dp.updateDate(2020, 0, 1);
                tp.setHour(0);
                tp.setMinute(0);
            }
        });



    }
}