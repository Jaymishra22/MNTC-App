package com.example.oem.mntc_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;



public class Test_activity extends AppCompatActivity {
    private TextView countdownText;
    private Button countdownButton;
private CountDownTimer CountDownTimer;
private boolean timerRunning;
private long timeLeftInMilliseconds=600000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_activity);
        countdownText=(TextView)findViewById(R.id.countdown_text);
        countdownButton=(Button)findViewById(R.id.countdown_button);
        countdownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        }.OnClickListener());
        {
            @Override
            public void OnClick (View view){
            Start();
        }
        });
updateTimer();
    }
    public void start()
    {StartTimer();
        }
        public void StartTimer() {
            CountDownTimer = new CountDownTimer(timeLeftInMilliseconds, 1000) {
                @Override
                public void onTick(long l) {

                }

                @Override
                public void onFinish() {

                }
            };
            @Override
            public void OnTick( long l){
                timeLeftInMilliseconds=l;
            }
            @Override
            public void onFinish()
            {
            }
        }.start();
    timerRunning=true;
}
public void updateTimer() {
    int minutes = (int) timeLeftInMilliseconds / 60000;
    int seconds = (int) timeLeftInMilliseconds % 60000 / 1000;
    String timeLeftText;
    timeLeftText = "" + minutes;
    timeLeftText += ":";
    if (seconds < 10) timeLeftText += "0";
    timeLeftText += seconds;
    countdownText.setText(timeLeftText);
}
}

    }
}
