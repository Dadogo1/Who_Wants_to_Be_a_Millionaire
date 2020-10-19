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

public class Question5 extends AppCompatActivity {
    private java.text.NumberFormat Q5_PRIZE_DISPLAY_FORMAT;
    private AlertDialog.Builder Q5_ALERT;
    private AlertDialog Q5_ALERT_CONTROL;
    private Button Q5_Answer_Button, Q5_Withdraw_Button;
    private TextView Q5_Prize_Money;
    private RadioGroup Q5_Answers;
    private RadioButton A5_A, A5_B, A5_C, A5_D, Q5_Pick;
    private int Q5_Answer_Setup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        Objects.requireNonNull(getSupportActionBar()).hide(); //hide the title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_question5);
        Q5_Prize_Money = findViewById(R.id.Q5_SCORE);
        Q5_Answers = findViewById(R.id.Q5_ANSWERS);
        A5_A = findViewById(R.id.A5_A);
        A5_B = findViewById(R.id.A5_B);
        A5_C = findViewById(R.id.A5_C);
        A5_D = findViewById(R.id.A5_D);
        Q5_Answer_Button = findViewById(R.id.Q5_answer_button);
        Q5_Withdraw_Button = findViewById(R.id.Q5_withdraw_button);
        //To indicate the current Activity
        LogIn.current_question = 5;
        LogIn.app_data(Question5.this).edit().putInt("current question", LogIn.current_question).apply();
        //To display the score as US dollars
        Q5_PRIZE_DISPLAY_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
        Q5_PRIZE_DISPLAY_FORMAT.setCurrency(Currency.getInstance("USD"));
        Q5_Prize_Money.setText(Q5_PRIZE_DISPLAY_FORMAT.format(LogIn.current_prize).replaceFirst(".00$", ""));
        //To randomized the location of the answers
        Q5_Answer_Setup = ThreadLocalRandom.current().nextInt(1,25);
        switch (Q5_Answer_Setup){
            case 1:
                A5_A.setText(R.string.A5_A);
                A5_B.setText(R.string.A5_B);
                A5_C.setText(R.string.A5_C);
                A5_D.setText(R.string.A5_D);
                break;
            case 2:
                A5_A.setText(R.string.A5_B);
                A5_B.setText(R.string.A5_A);
                A5_C.setText(R.string.A5_C);
                A5_D.setText(R.string.A5_D);
                break;
            case 3:
                A5_A.setText(R.string.A5_B);
                A5_B.setText(R.string.A5_C);
                A5_C.setText(R.string.A5_A);
                A5_D.setText(R.string.A5_D);
                break;
            case 4:
                A5_A.setText(R.string.A5_B);
                A5_B.setText(R.string.A5_C);
                A5_C.setText(R.string.A5_D);
                A5_D.setText(R.string.A5_A);
                break;
            case 5:
                A5_A.setText(R.string.A5_A);
                A5_B.setText(R.string.A5_C);
                A5_C.setText(R.string.A5_B);
                A5_D.setText(R.string.A5_D);
                break;
            case 6:
                A5_A.setText(R.string.A5_C);
                A5_B.setText(R.string.A5_A);
                A5_C.setText(R.string.A5_B);
                A5_D.setText(R.string.A5_D);
                break;
            case 7:
                A5_A.setText(R.string.A5_C);
                A5_B.setText(R.string.A5_B);
                A5_C.setText(R.string.A5_A);
                A5_D.setText(R.string.A5_D);
                break;
            case 8:
                A5_A.setText(R.string.A5_C);
                A5_B.setText(R.string.A5_B);
                A5_C.setText(R.string.A5_D);
                A5_D.setText(R.string.A5_A);
                break;
            case 9:
                A5_A.setText(R.string.A5_A);
                A5_B.setText(R.string.A5_C);
                A5_C.setText(R.string.A5_D);
                A5_D.setText(R.string.A5_B);
                break;
            case 10:
                A5_A.setText(R.string.A5_C);
                A5_B.setText(R.string.A5_A);
                A5_C.setText(R.string.A5_D);
                A5_D.setText(R.string.A5_B);
                break;
            case 11:
                A5_A.setText(R.string.A5_C);
                A5_B.setText(R.string.A5_D);
                A5_C.setText(R.string.A5_A);
                A5_D.setText(R.string.A5_B);
                break;
            case 12:
                A5_A.setText(R.string.A5_C);
                A5_B.setText(R.string.A5_D);
                A5_C.setText(R.string.A5_B);
                A5_D.setText(R.string.A5_A);
                break;
            case 13:
                A5_A.setText(R.string.A5_A);
                A5_B.setText(R.string.A5_D);
                A5_C.setText(R.string.A5_C);
                A5_D.setText(R.string.A5_B);
                break;
            case 14:
                A5_A.setText(R.string.A5_D);
                A5_B.setText(R.string.A5_A);
                A5_C.setText(R.string.A5_C);
                A5_D.setText(R.string.A5_B);
                break;
            case 15:
                A5_A.setText(R.string.A5_D);
                A5_B.setText(R.string.A5_C);
                A5_C.setText(R.string.A5_A);
                A5_D.setText(R.string.A5_B);
                break;
            case 16:
                A5_A.setText(R.string.A5_D);
                A5_B.setText(R.string.A5_C);
                A5_C.setText(R.string.A5_B);
                A5_D.setText(R.string.A5_A);
                break;
            case 17:
                A5_A.setText(R.string.A5_A);
                A5_B.setText(R.string.A5_B);
                A5_C.setText(R.string.A5_D);
                A5_D.setText(R.string.A5_C);
                break;
            case 18:
                A5_A.setText(R.string.A5_B);
                A5_B.setText(R.string.A5_A);
                A5_C.setText(R.string.A5_D);
                A5_D.setText(R.string.A5_C);
                break;
            case 19:
                A5_A.setText(R.string.A5_B);
                A5_B.setText(R.string.A5_D);
                A5_C.setText(R.string.A5_A);
                A5_D.setText(R.string.A5_C);
                break;
            case 20:
                A5_A.setText(R.string.A5_B);
                A5_B.setText(R.string.A5_D);
                A5_C.setText(R.string.A5_C);
                A5_D.setText(R.string.A5_A);
                break;
            case 21:
                A5_A.setText(R.string.A5_A);
                A5_B.setText(R.string.A5_D);
                A5_C.setText(R.string.A5_B);
                A5_D.setText(R.string.A5_C);
                break;
            case 22:
                A5_A.setText(R.string.A5_D);
                A5_B.setText(R.string.A5_A);
                A5_C.setText(R.string.A5_B);
                A5_D.setText(R.string.A5_C);
                break;
            case 23:
                A5_A.setText(R.string.A5_D);
                A5_B.setText(R.string.A5_B);
                A5_C.setText(R.string.A5_A);
                A5_D.setText(R.string.A5_C);
                break;
            case 24:
                A5_A.setText(R.string.A5_D);
                A5_B.setText(R.string.A5_B);
                A5_C.setText(R.string.A5_C);
                A5_D.setText(R.string.A5_A);
                break;
        }
        //To provide a positive or negative outcome once the user has chosen the answer
        Q5_Answer_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q5_Pick = findViewById(Q5_Answers.getCheckedRadioButtonId());
                if (Q5_Pick == null){
                    Toast.makeText(Question5.this, "You did not pick any answer!", Toast.LENGTH_SHORT).show();
                }
                else if (Q5_Pick.getText().toString().equals(getString(R.string.A5_A))){
                    LogIn.current_prize = 1000;
                    LogIn.app_data(Question5.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question5.this, "That was correct!", Toast.LENGTH_SHORT).show();
                    Intent to_question3 = new Intent(Question5.this, Question6.class);
                    startActivity(to_question3);
                }
                else {
                    LogIn.current_prize = 0;
                    LogIn.app_data(Question5.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question5.this, "That was incorrect!", Toast.LENGTH_SHORT).show();
                    Intent to_loser = new Intent(Question5.this, Loser.class);
                    startActivity(to_loser);
                }
            }
        });
        //To provide the player the option to safely quit the game
        Q5_Withdraw_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q5_ALERT = new AlertDialog.Builder(Question5.this);
                Q5_ALERT.setTitle("WITHDRAW");
                Q5_ALERT.setMessage("Are you sure you want to quit and keep your earned prize?");
                Q5_ALERT.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Q5_ALERT_CONTROL.cancel();
                    }
                });
                Q5_ALERT.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent to_winner = new Intent(Question5.this, Winner.class);
                        startActivity(to_winner);
                    }
                });
                Q5_ALERT_CONTROL = Q5_ALERT.create();
                Q5_ALERT_CONTROL.show();
            }
        });
    }
}