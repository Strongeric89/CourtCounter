package com.example.eric.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //team a
    private Button points3A = null;
    private Button points2A = null;
    private Button freeThrowA = null;
    private TextView pointsA = null;
    public int totalA = 0;

    //team b
    private Button points3B = null;
    private Button points2B = null;
    private Button freeThrowB = null;
    private TextView pointsB = null;
    public int totalB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //team a
        points3A = (Button) findViewById(R.id.increment3);
        points2A = (Button) findViewById(R.id.increment2);
        freeThrowA = (Button) findViewById(R.id.freeThrow);
        pointsA = (TextView) findViewById(R.id.scoreCounter);

        //team b
        points3B = (Button) findViewById(R.id.increment3B);
        points2B = (Button) findViewById(R.id.increment2B);
        freeThrowB = (Button) findViewById(R.id.freeThrowB);
        pointsB = (TextView) findViewById(R.id.scoreCounterB);

    }

    //team a methods
    public void increment3(View view) {

        totalA = totalA + 3;
        pointsA.setText("" + totalA);

    }

    public void increment2(View view) {

        totalA = totalA + 2;
        pointsA.setText("" + totalA);

    }

    public void freeThrow(View view) {
        totalA = totalA + 1;
        pointsA.setText("" + totalA);

    }


    //team b methods
    public void increment3B(View view) {

        totalB = totalB + 3;
        pointsB.setText("" + totalB);

    }

    public void increment2B(View view) {

        totalB = totalB + 2;
        pointsB.setText("" + totalB);

    }

    public void freeThrowB(View view) {
        totalB = totalB + 1;
        pointsB.setText("" + totalB);

    }



}
