package com.example.reception.courtcounterremake;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increases score for team A by Three
     *
     * @param view
     */
    public void threePointsTeamA(View view){
        scoreTeamA = scoreTeamA + 3 ;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increases score for team A by Two
     * @param view
     */
    public void twoPointsTeamA(View view){
        scoreTeamA = scoreTeamA + 2 ;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increases score for team A by One
     * @param view
     */
    public void freeThrowTeamA(View view){
        scoreTeamA = scoreTeamA + 1 ;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increases score for team B by Three
     *
     * @param view
     */
    public void threePointsTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increases score for team B by Two
     *
     * @param view
     */
    public void twoPointsTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increases score for team A by One
     *
     * @param view
     */

    public void freeThrowTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Resets scores to zero
     *
     * @param view
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
