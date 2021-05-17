package sg.edu.rp.c346.id20022226.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.dp);
        tp = findViewById(R.id.tp);
        btnDisplayDate = findViewById(R.id.btnDisplayDate);
        btnDisplayTime = findViewById(R.id.btnDisplayTime);
        tvDisplay = findViewById(R.id.tvDisplay);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "Time is ";
                int hour = tp.getCurrentHour();
                int min = tp.getCurrentMinute();
                msg = msg + hour + ":" + min;
                tvDisplay.setText(msg);
            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "Date is ";
                int day = dp.getDayOfMonth();
                int month = dp.getMonth();
                int year = dp.getYear();
                msg = msg + day + ":" + month + ":" + year;
                tvDisplay.setText(msg);
            }
        });
    }
}