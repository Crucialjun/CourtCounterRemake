package com.example.reception.courtcounterremake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamA = 0;

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointsTeamA(View view){
        scoreTeamA = scoreTeamA + 3 ;
        displayForTeamA(scoreTeamA);
    }

    public void twoPointsTeamA(View view){
        scoreTeamA = scoreTeamA + 2 ;
        displayForTeamA(scoreTeamA);
    }

    public void freeThrowTeamA(View view){
        scoreTeamA = scoreTeamA + 1 ;
        displayForTeamA(scoreTeamA);
    }
}
