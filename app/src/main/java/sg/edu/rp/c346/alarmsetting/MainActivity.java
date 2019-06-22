package sg.edu.rp.c346.alarmsetting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    TimePicker tp;
    ToggleButton tg;
    Button set;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tp = findViewById(R.id.tpAlarm);
        tg = findViewById(R.id.tbtnMode);
        set = findViewById(R.id.btnSet);

        tg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tg.isChecked()){
                    tp.setIs24HourView(true);
                }
                else{
                    tp.setIs24HourView(false);
                }
            }
        });
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hr = tp.getCurrentHour();
                int mins = tp.getCurrentMinute();

                Toast.makeText(MainActivity.this, "I will wake you up at "+hr+":"+mins, Toast.LENGTH_LONG).show();
            }
        });
    }
}
