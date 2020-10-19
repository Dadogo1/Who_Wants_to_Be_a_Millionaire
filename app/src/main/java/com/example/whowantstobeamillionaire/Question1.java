package com.example.whowantstobeamillionaire;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Question1 extends AppCompatActivity {
    private java.text.NumberFormat Q1_PRIZE_DISPLAY_FORMAT;
    private AlertDialog.Builder Q1_ALERT;
    private AlertDialog Q1_ALERT_CONTROL;
    private Button Q1_Answer_Button, Q1_Withdraw_Button;
    private TextView Q1_Prize_Money;
    private RadioGroup Q1_Answers;
    private RadioButton A1_A, A1_B, A1_C, A1_D, Q1_Pick;
    private int Q1_Answer_Setup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        Objects.requireNonNull(getSupportActionBar()).hide(); //hide the title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_question1);
        Q1_Prize_Money = findViewById(R.id.Q1_SCORE);
        Q1_Answers = findViewById(R.id.Q1_ANSWERS);
        A1_A = findViewById(R.id.A1_A);
        A1_B = findViewById(R.id.A1_B);
        A1_C = findViewById(R.id.A1_C);
        A1_D = findViewById(R.id.A1_D);
        Q1_Answer_Button = findViewById(R.id.Q1_answer_button);
        Q1_Withdraw_Button = findViewById(R.id.Q1_withdraw_button);
        //To indicate the current Activity
        LogIn.current_question = 1;
        LogIn.app_data(Question1.this).edit().putInt("current question", LogIn.current_question).apply();
        //To display the score as US dollars
        Q1_PRIZE_DISPLAY_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
        Q1_PRIZE_DISPLAY_FORMAT.setCurrency(Currency.getInstance("USD"));
        Q1_Prize_Money.setText(Q1_PRIZE_DISPLAY_FORMAT.format(LogIn.current_prize).replaceFirst(".00$", ""));
        //To randomized the location of the answers
        Q1_Answer_Setup = ThreadLocalRandom.current().nextInt(1,25);
        switch (Q1_Answer_Setup){
            case 1:
                A1_A.setText(R.string.A1_A);
                A1_B.setText(R.string.A1_B);
                A1_C.setText(R.string.A1_C);
                A1_D.setText(R.string.A1_D);
                break;
            case 2:
                A1_A.setText(R.string.A1_B);
                A1_B.setText(R.string.A1_A);
                A1_C.setText(R.string.A1_C);
                A1_D.setText(R.string.A1_D);
                break;
            case 3:
                A1_A.setText(R.string.A1_B);
                A1_B.setText(R.string.A1_C);
                A1_C.setText(R.string.A1_A);
                A1_D.setText(R.string.A1_D);
                break;
            case 4:
                A1_A.setText(R.string.A1_B);
                A1_B.setText(R.string.A1_C);
                A1_C.setText(R.string.A1_D);
                A1_D.setText(R.string.A1_A);
                break;
            case 5:
                A1_A.setText(R.string.A1_A);
                A1_B.setText(R.string.A1_C);
                A1_C.setText(R.string.A1_B);
                A1_D.setText(R.string.A1_D);
                break;
            case 6:
                A1_A.setText(R.string.A1_C);
                A1_B.setText(R.string.A1_A);
                A1_C.setText(R.string.A1_B);
                A1_D.setText(R.string.A1_D);
                break;
            case 7:
                A1_A.setText(R.string.A1_C);
                A1_B.setText(R.string.A1_B);
                A1_C.setText(R.string.A1_A);
                A1_D.setText(R.string.A1_D);
                break;
            case 8:
                A1_A.setText(R.string.A1_C);
                A1_B.setText(R.string.A1_B);
                A1_C.setText(R.string.A1_D);
                A1_D.setText(R.string.A1_A);
                break;
            case 9:
                A1_A.setText(R.string.A1_A);
                A1_B.setText(R.string.A1_C);
                A1_C.setText(R.string.A1_D);
                A1_D.setText(R.string.A1_B);
                break;
            case 10:
                A1_A.setText(R.string.A1_C);
                A1_B.setText(R.string.A1_A);
                A1_C.setText(R.string.A1_D);
                A1_D.setText(R.string.A1_B);
                break;
            case 11:
                A1_A.setText(R.string.A1_C);
                A1_B.setText(R.string.A1_D);
                A1_C.setText(R.string.A1_A);
                A1_D.setText(R.string.A1_B);
                break;
            case 12:
                A1_A.setText(R.string.A1_C);
                A1_B.setText(R.string.A1_D);
                A1_C.setText(R.string.A1_B);
                A1_D.setText(R.string.A1_A);
                break;
            case 13:
                A1_A.setText(R.string.A1_A);
                A1_B.setText(R.string.A1_D);
                A1_C.setText(R.string.A1_C);
                A1_D.setText(R.string.A1_B);
                break;
            case 14:
                A1_A.setText(R.string.A1_D);
                A1_B.setText(R.string.A1_A);
                A1_C.setText(R.string.A1_C);
                A1_D.setText(R.string.A1_B);
                break;
            case 15:
                A1_A.setText(R.string.A1_D);
                A1_B.setText(R.string.A1_C);
                A1_C.setText(R.string.A1_A);
                A1_D.setText(R.string.A1_B);
                break;
            case 16:
                A1_A.setText(R.string.A1_D);
                A1_B.setText(R.string.A1_C);
                A1_C.setText(R.string.A1_B);
                A1_D.setText(R.string.A1_A);
                break;
            case 17:
                A1_A.setText(R.string.A1_A);
                A1_B.setText(R.string.A1_B);
                A1_C.setText(R.string.A1_D);
                A1_D.setText(R.string.A1_C);
                break;
            case 18:
                A1_A.setText(R.string.A1_B);
                A1_B.setText(R.string.A1_A);
                A1_C.setText(R.string.A1_D);
                A1_D.setText(R.string.A1_C);
                break;
            case 19:
                A1_A.setText(R.string.A1_B);
                A1_B.setText(R.string.A1_D);
                A1_C.setText(R.string.A1_A);
                A1_D.setText(R.string.A1_C);
                break;
            case 20:
                A1_A.setText(R.string.A1_B);
                A1_B.setText(R.string.A1_D);
                A1_C.setText(R.string.A1_C);
                A1_D.setText(R.string.A1_A);
                break;
            case 21:
                A1_A.setText(R.string.A1_A);
                A1_B.setText(R.string.A1_D);
                A1_C.setText(R.string.A1_B);
                A1_D.setText(R.string.A1_C);
                break;
            case 22:
                A1_A.setText(R.string.A1_D);
                A1_B.setText(R.string.A1_A);
                A1_C.setText(R.string.A1_B);
                A1_D.setText(R.string.A1_C);
                break;
            case 23:
                A1_A.setText(R.string.A1_D);
                A1_B.setText(R.string.A1_B);
                A1_C.setText(R.string.A1_A);
                A1_D.setText(R.string.A1_C);
                break;
            case 24:
                A1_A.setText(R.string.A1_D);
                A1_B.setText(R.string.A1_B);
                A1_C.setText(R.string.A1_C);
                A1_D.setText(R.string.A1_A);
                break;
        }
        //To provide a positive or negative outcome once the user has chosen the answer
        Q1_Answer_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q1_Pick = findViewById(Q1_Answers.getCheckedRadioButtonId());
                if (Q1_Pick == null){
                    Toast.makeText(Question1.this, "You did not pick any answer!", Toast.LENGTH_SHORT).show();
                }
                else if (Q1_Pick.getText().toString().equals(getString(R.string.A1_A))){
                    LogIn.current_prize = 100;
                    LogIn.app_data(Question1.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question1.this, "That was correct!", Toast.LENGTH_SHORT).show();
                    Intent to_question2 = new Intent(Question1.this, Question2.class);
                    startActivity(to_question2);
                }
                else {
                    LogIn.current_prize = 0;
                    LogIn.app_data(Question1.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question1.this, "That was incorrect!", Toast.LENGTH_SHORT).show();
                    Intent to_loser = new Intent(Question1.this, Loser.class);
                    startActivity(to_loser);
                }
            }
        });
        //To provide the player the option to safely quit the game
        Q1_Withdraw_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q1_ALERT = new AlertDialog.Builder(Question1.this);
                Q1_ALERT.setTitle("WITHDRAW");
                Q1_ALERT.setMessage("Are you sure you want to quit and keep your earned prize?");
                Q1_ALERT.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Q1_ALERT_CONTROL.cancel();
                    }
                });
                Q1_ALERT.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent to_winner = new Intent(Question1.this, Winner.class);
                        startActivity(to_winner);
                    }
                });
                Q1_ALERT_CONTROL = Q1_ALERT.create();
                Q1_ALERT_CONTROL.show();
            }
        });
    }
}