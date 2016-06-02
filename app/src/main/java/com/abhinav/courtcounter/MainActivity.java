package com.abhinav.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView teamA_label_TextView;
    TextView teamB_label_TextView;
    TextView teamA_score_TextView;
    TextView teamB_score_TextView;
    Button teamA_3_pointer_Button;
    Button teamA_2_pointer_Button;
    Button teamB_3_pointer_Button;
    Button teamB_2_pointer_Button;
    Button teamA_FreeThrow_Button;
    Button teamB_FreeThrow_Button;
    Button reset_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamA_label_TextView= (TextView) findViewById(R.id.teamA_label_TextView);
        teamB_label_TextView= (TextView) findViewById(R.id.teamB_label_TextView);
        teamA_score_TextView= (TextView) findViewById(R.id.teamA_score_TextView);
        teamB_score_TextView= (TextView) findViewById(R.id.teamB_score_TextView);
        teamA_3_pointer_Button= (Button) findViewById(R.id.teamA_3_pointer_Button);
        teamA_2_pointer_Button= (Button) findViewById(R.id.teamA_2_pointer_Button);
        teamA_FreeThrow_Button= (Button) findViewById(R.id.teamA_FreeThrow_Button);
        teamB_3_pointer_Button= (Button) findViewById(R.id.teamB_3_pointer_Button);
        teamB_2_pointer_Button= (Button) findViewById(R.id.teamB_2_pointer_Button);
        teamB_FreeThrow_Button= (Button) findViewById(R.id.teamB_FreeThrow_Button);
        reset_Button= (Button) findViewById(R.id.reset_Button);



        teamA_3_pointer_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(teamA_score_TextView.getText().toString());
                a=a+3;
                teamA_score_TextView.setText(""+a);
            }

        });
        teamA_2_pointer_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(teamA_score_TextView.getText().toString());
                a=a+2;
                teamA_score_TextView.setText(""+a);
            }

        });
        teamA_FreeThrow_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(teamA_score_TextView.getText().toString());
                a=a+1;
                teamA_score_TextView.setText(""+a);
            }

        });
        teamB_3_pointer_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(teamB_score_TextView.getText().toString());
                a=a+3;
                teamB_score_TextView.setText(""+a);
            }

        });
        teamB_2_pointer_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(teamB_score_TextView.getText().toString());
                a=a+2;
                teamB_score_TextView.setText(""+a);
            }

        });
        teamB_FreeThrow_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(teamB_score_TextView.getText().toString());
                a=a+1;
                teamB_score_TextView.setText(""+a);
            }

        });
        reset_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamA_score_TextView.setText(""+0);
                teamB_score_TextView.setText(""+0);
            }
        });


    }
}
