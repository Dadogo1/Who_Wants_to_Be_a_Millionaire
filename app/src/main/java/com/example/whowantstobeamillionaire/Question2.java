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

public class Question2 extends AppCompatActivity {
    private java.text.NumberFormat Q2_PRIZE_DISPLAY_FORMAT;
    private AlertDialog.Builder Q2_ALERT;
    private AlertDialog Q2_ALERT_CONTROL;
    private Button Q2_Answer_Button, Q2_Withdraw_Button;
    private TextView Q2_Prize_Money;
    private RadioGroup Q2_Answers;
    private RadioButton A2_A, A2_B, A2_C, A2_D, Q2_Pick;
    private int Q2_Answer_Setup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        Objects.requireNonNull(getSupportActionBar()).hide(); //hide the title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_question2);
        Q2_Prize_Money = findViewById(R.id.Q2_SCORE);
        Q2_Answers = findViewById(R.id.Q2_ANSWERS);
        A2_A = findViewById(R.id.A2_A);
        A2_B = findViewById(R.id.A2_B);
        A2_C = findViewById(R.id.A2_C);
        A2_D = findViewById(R.id.A2_D);
        Q2_Answer_Button = findViewById(R.id.Q2_answer_button);
        Q2_Withdraw_Button = findViewById(R.id.Q2_withdraw_button);
        //To indicate the current Activity
        LogIn.current_question = 2;
        LogIn.app_data(Question2.this).edit().putInt("current question", LogIn.current_question).apply();
        //To display the score as US dollars
        Q2_PRIZE_DISPLAY_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
        Q2_PRIZE_DISPLAY_FORMAT.setCurrency(Currency.getInstance("USD"));
        Q2_Prize_Money.setText(Q2_PRIZE_DISPLAY_FORMAT.format(LogIn.current_prize).replaceFirst(".00$", ""));
        //To randomized the location of the answers
        Q2_Answer_Setup = ThreadLocalRandom.current().nextInt(1,25);
        switch (Q2_Answer_Setup){
            case 1:
                A2_A.setText(R.string.A2_A);
                A2_B.setText(R.string.A2_B);
                A2_C.setText(R.string.A2_C);
                A2_D.setText(R.string.A2_D);
                break;
            case 2:
                A2_A.setText(R.string.A2_B);
                A2_B.setText(R.string.A2_A);
                A2_C.setText(R.string.A2_C);
                A2_D.setText(R.string.A2_D);
                break;
            case 3:
                A2_A.setText(R.string.A2_B);
                A2_B.setText(R.string.A2_C);
                A2_C.setText(R.string.A2_A);
                A2_D.setText(R.string.A2_D);
                break;
            case 4:
                A2_A.setText(R.string.A2_B);
                A2_B.setText(R.string.A2_C);
                A2_C.setText(R.string.A2_D);
                A2_D.setText(R.string.A2_A);
                break;
            case 5:
                A2_A.setText(R.string.A2_A);
                A2_B.setText(R.string.A2_C);
                A2_C.setText(R.string.A2_B);
                A2_D.setText(R.string.A2_D);
                break;
            case 6:
                A2_A.setText(R.string.A2_C);
                A2_B.setText(R.string.A2_A);
                A2_C.setText(R.string.A2_B);
                A2_D.setText(R.string.A2_D);
                break;
            case 7:
                A2_A.setText(R.string.A2_C);
                A2_B.setText(R.string.A2_B);
                A2_C.setText(R.string.A2_A);
                A2_D.setText(R.string.A2_D);
                break;
            case 8:
                A2_A.setText(R.string.A2_C);
                A2_B.setText(R.string.A2_B);
                A2_C.setText(R.string.A2_D);
                A2_D.setText(R.string.A2_A);
                break;
            case 9:
                A2_A.setText(R.string.A2_A);
                A2_B.setText(R.string.A2_C);
                A2_C.setText(R.string.A2_D);
                A2_D.setText(R.string.A2_B);
                break;
            case 10:
                A2_A.setText(R.string.A2_C);
                A2_B.setText(R.string.A2_A);
                A2_C.setText(R.string.A2_D);
                A2_D.setText(R.string.A2_B);
                break;
            case 11:
                A2_A.setText(R.string.A2_C);
                A2_B.setText(R.string.A2_D);
                A2_C.setText(R.string.A2_A);
                A2_D.setText(R.string.A2_B);
                break;
            case 12:
                A2_A.setText(R.string.A2_C);
                A2_B.setText(R.string.A2_D);
                A2_C.setText(R.string.A2_B);
                A2_D.setText(R.string.A2_A);
                break;
            case 13:
                A2_A.setText(R.string.A2_A);
                A2_B.setText(R.string.A2_D);
                A2_C.setText(R.string.A2_C);
                A2_D.setText(R.string.A2_B);
                break;
            case 14:
                A2_A.setText(R.string.A2_D);
                A2_B.setText(R.string.A2_A);
                A2_C.setText(R.string.A2_C);
                A2_D.setText(R.string.A2_B);
                break;
            case 15:
                A2_A.setText(R.string.A2_D);
                A2_B.setText(R.string.A2_C);
                A2_C.setText(R.string.A2_A);
                A2_D.setText(R.string.A2_B);
                break;
            case 16:
                A2_A.setText(R.string.A2_D);
                A2_B.setText(R.string.A2_C);
                A2_C.setText(R.string.A2_B);
                A2_D.setText(R.string.A2_A);
                break;
            case 17:
                A2_A.setText(R.string.A2_A);
                A2_B.setText(R.string.A2_B);
                A2_C.setText(R.string.A2_D);
                A2_D.setText(R.string.A2_C);
                break;
            case 18:
                A2_A.setText(R.string.A2_B);
                A2_B.setText(R.string.A2_A);
                A2_C.setText(R.string.A2_D);
                A2_D.setText(R.string.A2_C);
                break;
            case 19:
                A2_A.setText(R.string.A2_B);
                A2_B.setText(R.string.A2_D);
                A2_C.setText(R.string.A2_A);
                A2_D.setText(R.string.A2_C);
                break;
            case 20:
                A2_A.setText(R.string.A2_B);
                A2_B.setText(R.string.A2_D);
                A2_C.setText(R.string.A2_C);
                A2_D.setText(R.string.A2_A);
                break;
            case 21:
                A2_A.setText(R.string.A2_A);
                A2_B.setText(R.string.A2_D);
                A2_C.setText(R.string.A2_B);
                A2_D.setText(R.string.A2_C);
                break;
            case 22:
                A2_A.setText(R.string.A2_D);
                A2_B.setText(R.string.A2_A);
                A2_C.setText(R.string.A2_B);
                A2_D.setText(R.string.A2_C);
                break;
            case 23:
                A2_A.setText(R.string.A2_D);
                A2_B.setText(R.string.A2_B);
                A2_C.setText(R.string.A2_A);
                A2_D.setText(R.string.A2_C);
                break;
            case 24:
                A2_A.setText(R.string.A2_D);
                A2_B.setText(R.string.A2_B);
                A2_C.setText(R.string.A2_C);
                A2_D.setText(R.string.A2_A);
                break;
        }
        //To provide a positive or negative outcome once the user has chosen the answer
        Q2_Answer_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q2_Pick = findViewById(Q2_Answers.getCheckedRadioButtonId());
                if (Q2_Pick == null){
                    Toast.makeText(Question2.this, "You did not pick any answer!", Toast.LENGTH_SHORT).show();
                }
                else if (Q2_Pick.getText().toString().equals(getString(R.string.A2_A))){
                    LogIn.current_prize = 200;
                    LogIn.app_data(Question2.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question2.this, "That was correct!", Toast.LENGTH_SHORT).show();
                    Intent to_question3 = new Intent(Question2.this, Question3.class);
                    startActivity(to_question3);
                }
                else {
                    LogIn.current_prize = 0;
                    LogIn.app_data(Question2.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question2.this, "That was incorrect!", Toast.LENGTH_SHORT).show();
                    Intent to_loser = new Intent(Question2.this, Loser.class);
                    startActivity(to_loser);
                }
            }
        });
        //To provide the player the option to safely quit the game
        Q2_Withdraw_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q2_ALERT = new AlertDialog.Builder(Question2.this);
                Q2_ALERT.setTitle("WITHDRAW");
                Q2_ALERT.setMessage("Are you sure you want to quit and keep your earned prize?");
                Q2_ALERT.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Q2_ALERT_CONTROL.cancel();
                    }
                });
                Q2_ALERT.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent to_winner = new Intent(Question2.this, Winner.class);
                        startActivity(to_winner);
                    }
                });
                Q2_ALERT_CONTROL = Q2_ALERT.create();
                Q2_ALERT_CONTROL.show();
            }
        });
    }
}