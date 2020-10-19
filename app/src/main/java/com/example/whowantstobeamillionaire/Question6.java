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

public class Question6 extends AppCompatActivity {
    private java.text.NumberFormat Q6_PRIZE_DISPLAY_FORMAT;
    private AlertDialog.Builder Q6_ALERT;
    private AlertDialog Q6_ALERT_CONTROL;
    private Button Q6_Answer_Button, Q6_Withdraw_Button;
    private TextView Q6_Prize_Money;
    private RadioGroup Q6_Answers;
    private RadioButton A6_A, A6_B, A6_C, A6_D, Q6_Pick;
    private int Q6_Answer_Setup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        Objects.requireNonNull(getSupportActionBar()).hide(); //hide the title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_question6);
        Q6_Prize_Money = findViewById(R.id.Q6_SCORE);
        Q6_Answers = findViewById(R.id.Q6_ANSWERS);
        A6_A = findViewById(R.id.A6_A);
        A6_B = findViewById(R.id.A6_B);
        A6_C = findViewById(R.id.A6_C);
        A6_D = findViewById(R.id.A6_D);
        Q6_Answer_Button = findViewById(R.id.Q6_answer_button);
        Q6_Withdraw_Button = findViewById(R.id.Q6_withdraw_button);
        //To indicate the current Activity
        LogIn.current_question = 6;
        LogIn.app_data(Question6.this).edit().putInt("current question", LogIn.current_question).apply();
        //To display the score as US dollars
        Q6_PRIZE_DISPLAY_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
        Q6_PRIZE_DISPLAY_FORMAT.setCurrency(Currency.getInstance("USD"));
        Q6_Prize_Money.setText(Q6_PRIZE_DISPLAY_FORMAT.format(LogIn.current_prize).replaceFirst(".00$", ""));
        //To randomized the location of the answers
        Q6_Answer_Setup = ThreadLocalRandom.current().nextInt(1,25);
        switch (Q6_Answer_Setup){
            case 1:
                A6_A.setText(R.string.A6_A);
                A6_B.setText(R.string.A6_B);
                A6_C.setText(R.string.A6_C);
                A6_D.setText(R.string.A6_D);
                break;
            case 2:
                A6_A.setText(R.string.A6_B);
                A6_B.setText(R.string.A6_A);
                A6_C.setText(R.string.A6_C);
                A6_D.setText(R.string.A6_D);
                break;
            case 3:
                A6_A.setText(R.string.A6_B);
                A6_B.setText(R.string.A6_C);
                A6_C.setText(R.string.A6_A);
                A6_D.setText(R.string.A6_D);
                break;
            case 4:
                A6_A.setText(R.string.A6_B);
                A6_B.setText(R.string.A6_C);
                A6_C.setText(R.string.A6_D);
                A6_D.setText(R.string.A6_A);
                break;
            case 5:
                A6_A.setText(R.string.A6_A);
                A6_B.setText(R.string.A6_C);
                A6_C.setText(R.string.A6_B);
                A6_D.setText(R.string.A6_D);
                break;
            case 6:
                A6_A.setText(R.string.A6_C);
                A6_B.setText(R.string.A6_A);
                A6_C.setText(R.string.A6_B);
                A6_D.setText(R.string.A6_D);
                break;
            case 7:
                A6_A.setText(R.string.A6_C);
                A6_B.setText(R.string.A6_B);
                A6_C.setText(R.string.A6_A);
                A6_D.setText(R.string.A6_D);
                break;
            case 8:
                A6_A.setText(R.string.A6_C);
                A6_B.setText(R.string.A6_B);
                A6_C.setText(R.string.A6_D);
                A6_D.setText(R.string.A6_A);
                break;
            case 9:
                A6_A.setText(R.string.A6_A);
                A6_B.setText(R.string.A6_C);
                A6_C.setText(R.string.A6_D);
                A6_D.setText(R.string.A6_B);
                break;
            case 10:
                A6_A.setText(R.string.A6_C);
                A6_B.setText(R.string.A6_A);
                A6_C.setText(R.string.A6_D);
                A6_D.setText(R.string.A6_B);
                break;
            case 11:
                A6_A.setText(R.string.A6_C);
                A6_B.setText(R.string.A6_D);
                A6_C.setText(R.string.A6_A);
                A6_D.setText(R.string.A6_B);
                break;
            case 12:
                A6_A.setText(R.string.A6_C);
                A6_B.setText(R.string.A6_D);
                A6_C.setText(R.string.A6_B);
                A6_D.setText(R.string.A6_A);
                break;
            case 13:
                A6_A.setText(R.string.A6_A);
                A6_B.setText(R.string.A6_D);
                A6_C.setText(R.string.A6_C);
                A6_D.setText(R.string.A6_B);
                break;
            case 14:
                A6_A.setText(R.string.A6_D);
                A6_B.setText(R.string.A6_A);
                A6_C.setText(R.string.A6_C);
                A6_D.setText(R.string.A6_B);
                break;
            case 15:
                A6_A.setText(R.string.A6_D);
                A6_B.setText(R.string.A6_C);
                A6_C.setText(R.string.A6_A);
                A6_D.setText(R.string.A6_B);
                break;
            case 16:
                A6_A.setText(R.string.A6_D);
                A6_B.setText(R.string.A6_C);
                A6_C.setText(R.string.A6_B);
                A6_D.setText(R.string.A6_A);
                break;
            case 17:
                A6_A.setText(R.string.A6_A);
                A6_B.setText(R.string.A6_B);
                A6_C.setText(R.string.A6_D);
                A6_D.setText(R.string.A6_C);
                break;
            case 18:
                A6_A.setText(R.string.A6_B);
                A6_B.setText(R.string.A6_A);
                A6_C.setText(R.string.A6_D);
                A6_D.setText(R.string.A6_C);
                break;
            case 19:
                A6_A.setText(R.string.A6_B);
                A6_B.setText(R.string.A6_D);
                A6_C.setText(R.string.A6_A);
                A6_D.setText(R.string.A6_C);
                break;
            case 20:
                A6_A.setText(R.string.A6_B);
                A6_B.setText(R.string.A6_D);
                A6_C.setText(R.string.A6_C);
                A6_D.setText(R.string.A6_A);
                break;
            case 21:
                A6_A.setText(R.string.A6_A);
                A6_B.setText(R.string.A6_D);
                A6_C.setText(R.string.A6_B);
                A6_D.setText(R.string.A6_C);
                break;
            case 22:
                A6_A.setText(R.string.A6_D);
                A6_B.setText(R.string.A6_A);
                A6_C.setText(R.string.A6_B);
                A6_D.setText(R.string.A6_C);
                break;
            case 23:
                A6_A.setText(R.string.A6_D);
                A6_B.setText(R.string.A6_B);
                A6_C.setText(R.string.A6_A);
                A6_D.setText(R.string.A6_C);
                break;
            case 24:
                A6_A.setText(R.string.A6_D);
                A6_B.setText(R.string.A6_B);
                A6_C.setText(R.string.A6_C);
                A6_D.setText(R.string.A6_A);
                break;
        }
        //To provide a positive or negative outcome once the user has chosen the answer
        Q6_Answer_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q6_Pick = findViewById(Q6_Answers.getCheckedRadioButtonId());
                if (Q6_Pick == null){
                    Toast.makeText(Question6.this, "You did not pick any answer!", Toast.LENGTH_SHORT).show();
                }
                else if (Q6_Pick.getText().toString().equals(getString(R.string.A6_A))){
                    LogIn.current_prize = 2000;
                    LogIn.app_data(Question6.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question6.this, "That was correct!", Toast.LENGTH_SHORT).show();
                    Intent to_question3 = new Intent(Question6.this, Question7.class);
                    startActivity(to_question3);
                }
                else {
                    LogIn.current_prize = 1000;
                    LogIn.app_data(Question6.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question6.this, "That was incorrect!", Toast.LENGTH_SHORT).show();
                    Intent to_loser = new Intent(Question6.this, Loser.class);
                    startActivity(to_loser);
                }
            }
        });
        //To provide the player the option to safely quit the game
        Q6_Withdraw_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q6_ALERT = new AlertDialog.Builder(Question6.this);
                Q6_ALERT.setTitle("WITHDRAW");
                Q6_ALERT.setMessage("Are you sure you want to quit and keep your earned prize?");
                Q6_ALERT.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Q6_ALERT_CONTROL.cancel();
                    }
                });
                Q6_ALERT.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent to_winner = new Intent(Question6.this, Winner.class);
                        startActivity(to_winner);
                    }
                });
                Q6_ALERT_CONTROL = Q6_ALERT.create();
                Q6_ALERT_CONTROL.show();
            }
        });
    }
}