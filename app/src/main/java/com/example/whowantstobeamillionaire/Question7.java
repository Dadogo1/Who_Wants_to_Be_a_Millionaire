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

public class Question7 extends AppCompatActivity {
    private java.text.NumberFormat Q7_PRIZE_DISPLAY_FORMAT;
    private AlertDialog.Builder Q7_ALERT;
    private AlertDialog Q7_ALERT_CONTROL;
    private Button Q7_Answer_Button, Q7_Withdraw_Button;
    private TextView Q7_Prize_Money;
    private RadioGroup Q7_Answers;
    private RadioButton A7_A, A7_B, A7_C, A7_D, Q7_Pick;
    private int Q7_Answer_Setup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        Objects.requireNonNull(getSupportActionBar()).hide(); //hide the title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_question7);
        Q7_Prize_Money = findViewById(R.id.Q7_SCORE);
        Q7_Answers = findViewById(R.id.Q7_ANSWERS);
        A7_A = findViewById(R.id.A7_A);
        A7_B = findViewById(R.id.A7_B);
        A7_C = findViewById(R.id.A7_C);
        A7_D = findViewById(R.id.A7_D);
        Q7_Answer_Button = findViewById(R.id.Q7_answer_button);
        Q7_Withdraw_Button = findViewById(R.id.Q7_withdraw_button);
        //To indicate the current Activity
        LogIn.current_question = 7;
        LogIn.app_data(Question7.this).edit().putInt("current question", LogIn.current_question).apply();
        //To display the score as US dollars
        Q7_PRIZE_DISPLAY_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
        Q7_PRIZE_DISPLAY_FORMAT.setCurrency(Currency.getInstance("USD"));
        Q7_Prize_Money.setText(Q7_PRIZE_DISPLAY_FORMAT.format(LogIn.current_prize).replaceFirst(".00$", ""));
        //To randomized the location of the answers
        Q7_Answer_Setup = ThreadLocalRandom.current().nextInt(1,25);
        switch (Q7_Answer_Setup){
            case 1:
                A7_A.setText(R.string.A7_A);
                A7_B.setText(R.string.A7_B);
                A7_C.setText(R.string.A7_C);
                A7_D.setText(R.string.A7_D);
                break;
            case 2:
                A7_A.setText(R.string.A7_B);
                A7_B.setText(R.string.A7_A);
                A7_C.setText(R.string.A7_C);
                A7_D.setText(R.string.A7_D);
                break;
            case 3:
                A7_A.setText(R.string.A7_B);
                A7_B.setText(R.string.A7_C);
                A7_C.setText(R.string.A7_A);
                A7_D.setText(R.string.A7_D);
                break;
            case 4:
                A7_A.setText(R.string.A7_B);
                A7_B.setText(R.string.A7_C);
                A7_C.setText(R.string.A7_D);
                A7_D.setText(R.string.A7_A);
                break;
            case 5:
                A7_A.setText(R.string.A7_A);
                A7_B.setText(R.string.A7_C);
                A7_C.setText(R.string.A7_B);
                A7_D.setText(R.string.A7_D);
                break;
            case 6:
                A7_A.setText(R.string.A7_C);
                A7_B.setText(R.string.A7_A);
                A7_C.setText(R.string.A7_B);
                A7_D.setText(R.string.A7_D);
                break;
            case 7:
                A7_A.setText(R.string.A7_C);
                A7_B.setText(R.string.A7_B);
                A7_C.setText(R.string.A7_A);
                A7_D.setText(R.string.A7_D);
                break;
            case 8:
                A7_A.setText(R.string.A7_C);
                A7_B.setText(R.string.A7_B);
                A7_C.setText(R.string.A7_D);
                A7_D.setText(R.string.A7_A);
                break;
            case 9:
                A7_A.setText(R.string.A7_A);
                A7_B.setText(R.string.A7_C);
                A7_C.setText(R.string.A7_D);
                A7_D.setText(R.string.A7_B);
                break;
            case 10:
                A7_A.setText(R.string.A7_C);
                A7_B.setText(R.string.A7_A);
                A7_C.setText(R.string.A7_D);
                A7_D.setText(R.string.A7_B);
                break;
            case 11:
                A7_A.setText(R.string.A7_C);
                A7_B.setText(R.string.A7_D);
                A7_C.setText(R.string.A7_A);
                A7_D.setText(R.string.A7_B);
                break;
            case 12:
                A7_A.setText(R.string.A7_C);
                A7_B.setText(R.string.A7_D);
                A7_C.setText(R.string.A7_B);
                A7_D.setText(R.string.A7_A);
                break;
            case 13:
                A7_A.setText(R.string.A7_A);
                A7_B.setText(R.string.A7_D);
                A7_C.setText(R.string.A7_C);
                A7_D.setText(R.string.A7_B);
                break;
            case 14:
                A7_A.setText(R.string.A7_D);
                A7_B.setText(R.string.A7_A);
                A7_C.setText(R.string.A7_C);
                A7_D.setText(R.string.A7_B);
                break;
            case 15:
                A7_A.setText(R.string.A7_D);
                A7_B.setText(R.string.A7_C);
                A7_C.setText(R.string.A7_A);
                A7_D.setText(R.string.A7_B);
                break;
            case 16:
                A7_A.setText(R.string.A7_D);
                A7_B.setText(R.string.A7_C);
                A7_C.setText(R.string.A7_B);
                A7_D.setText(R.string.A7_A);
                break;
            case 17:
                A7_A.setText(R.string.A7_A);
                A7_B.setText(R.string.A7_B);
                A7_C.setText(R.string.A7_D);
                A7_D.setText(R.string.A7_C);
                break;
            case 18:
                A7_A.setText(R.string.A7_B);
                A7_B.setText(R.string.A7_A);
                A7_C.setText(R.string.A7_D);
                A7_D.setText(R.string.A7_C);
                break;
            case 19:
                A7_A.setText(R.string.A7_B);
                A7_B.setText(R.string.A7_D);
                A7_C.setText(R.string.A7_A);
                A7_D.setText(R.string.A7_C);
                break;
            case 20:
                A7_A.setText(R.string.A7_B);
                A7_B.setText(R.string.A7_D);
                A7_C.setText(R.string.A7_C);
                A7_D.setText(R.string.A7_A);
                break;
            case 21:
                A7_A.setText(R.string.A7_A);
                A7_B.setText(R.string.A7_D);
                A7_C.setText(R.string.A7_B);
                A7_D.setText(R.string.A7_C);
                break;
            case 22:
                A7_A.setText(R.string.A7_D);
                A7_B.setText(R.string.A7_A);
                A7_C.setText(R.string.A7_B);
                A7_D.setText(R.string.A7_C);
                break;
            case 23:
                A7_A.setText(R.string.A7_D);
                A7_B.setText(R.string.A7_B);
                A7_C.setText(R.string.A7_A);
                A7_D.setText(R.string.A7_C);
                break;
            case 24:
                A7_A.setText(R.string.A7_D);
                A7_B.setText(R.string.A7_B);
                A7_C.setText(R.string.A7_C);
                A7_D.setText(R.string.A7_A);
                break;
        }
        //To provide a positive or negative outcome once the user has chosen the answer
        Q7_Answer_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q7_Pick = findViewById(Q7_Answers.getCheckedRadioButtonId());
                if (Q7_Pick == null){
                    Toast.makeText(Question7.this, "You did not pick any answer!", Toast.LENGTH_SHORT).show();
                }
                else if (Q7_Pick.getText().toString().equals(getString(R.string.A7_A))){
                    LogIn.current_prize = 4000;
                    LogIn.app_data(Question7.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question7.this, "That was correct!", Toast.LENGTH_SHORT).show();
                    Intent to_question3 = new Intent(Question7.this, Question8.class);
                    startActivity(to_question3);
                }
                else {
                    LogIn.current_prize = 1000;
                    LogIn.app_data(Question7.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question7.this, "That was incorrect!", Toast.LENGTH_SHORT).show();
                    Intent to_loser = new Intent(Question7.this, Loser.class);
                    startActivity(to_loser);
                }
            }
        });
        //To provide the player the option to safely quit the game
        Q7_Withdraw_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q7_ALERT = new AlertDialog.Builder(Question7.this);
                Q7_ALERT.setTitle("WITHDRAW");
                Q7_ALERT.setMessage("Are you sure you want to quit and keep your earned prize?");
                Q7_ALERT.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Q7_ALERT_CONTROL.cancel();
                    }
                });
                Q7_ALERT.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent to_winner = new Intent(Question7.this, Winner.class);
                        startActivity(to_winner);
                    }
                });
                Q7_ALERT_CONTROL = Q7_ALERT.create();
                Q7_ALERT_CONTROL.show();
            }
        });
    }
}