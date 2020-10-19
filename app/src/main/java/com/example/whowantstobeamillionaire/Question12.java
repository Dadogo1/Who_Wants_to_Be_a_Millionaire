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

public class Question12 extends AppCompatActivity {
    private java.text.NumberFormat Q12_PRIZE_DISPLAY_FORMAT;
    private AlertDialog.Builder Q12_ALERT;
    private AlertDialog Q12_ALERT_CONTROL;
    private Button Q12_Answer_Button, Q12_Withdraw_Button;
    private TextView Q12_Prize_Money;
    private RadioGroup Q12_Answers;
    private RadioButton A12_A, A12_B, A12_C, A12_D, Q12_Pick;
    private int Q12_Answer_Setup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        Objects.requireNonNull(getSupportActionBar()).hide(); //hide the title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_question12);
        Q12_Prize_Money = findViewById(R.id.Q12_SCORE);
        Q12_Answers = findViewById(R.id.Q12_ANSWERS);
        A12_A = findViewById(R.id.A12_A);
        A12_B = findViewById(R.id.A12_B);
        A12_C = findViewById(R.id.A12_C);
        A12_D = findViewById(R.id.A12_D);
        Q12_Answer_Button = findViewById(R.id.Q12_answer_button);
        Q12_Withdraw_Button = findViewById(R.id.Q12_withdraw_button);
        //To indicate the current Activity
        LogIn.current_question = 12;
        LogIn.app_data(Question12.this).edit().putInt("current question", LogIn.current_question).apply();
        //To display the score as US dollars
        Q12_PRIZE_DISPLAY_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
        Q12_PRIZE_DISPLAY_FORMAT.setCurrency(Currency.getInstance("USD"));
        Q12_Prize_Money.setText(Q12_PRIZE_DISPLAY_FORMAT.format(LogIn.current_prize).replaceFirst(".00$", ""));
        //To randomized the location of the answers
        Q12_Answer_Setup = ThreadLocalRandom.current().nextInt(1,25);
        switch (Q12_Answer_Setup){
            case 1:
                A12_A.setText(R.string.A12_A);
                A12_B.setText(R.string.A12_B);
                A12_C.setText(R.string.A12_C);
                A12_D.setText(R.string.A12_D);
                break;
            case 2:
                A12_A.setText(R.string.A12_B);
                A12_B.setText(R.string.A12_A);
                A12_C.setText(R.string.A12_C);
                A12_D.setText(R.string.A12_D);
                break;
            case 3:
                A12_A.setText(R.string.A12_B);
                A12_B.setText(R.string.A12_C);
                A12_C.setText(R.string.A12_A);
                A12_D.setText(R.string.A12_D);
                break;
            case 4:
                A12_A.setText(R.string.A12_B);
                A12_B.setText(R.string.A12_C);
                A12_C.setText(R.string.A12_D);
                A12_D.setText(R.string.A12_A);
                break;
            case 5:
                A12_A.setText(R.string.A12_A);
                A12_B.setText(R.string.A12_C);
                A12_C.setText(R.string.A12_B);
                A12_D.setText(R.string.A12_D);
                break;
            case 6:
                A12_A.setText(R.string.A12_C);
                A12_B.setText(R.string.A12_A);
                A12_C.setText(R.string.A12_B);
                A12_D.setText(R.string.A12_D);
                break;
            case 7:
                A12_A.setText(R.string.A12_C);
                A12_B.setText(R.string.A12_B);
                A12_C.setText(R.string.A12_A);
                A12_D.setText(R.string.A12_D);
                break;
            case 8:
                A12_A.setText(R.string.A12_C);
                A12_B.setText(R.string.A12_B);
                A12_C.setText(R.string.A12_D);
                A12_D.setText(R.string.A12_A);
                break;
            case 9:
                A12_A.setText(R.string.A12_A);
                A12_B.setText(R.string.A12_C);
                A12_C.setText(R.string.A12_D);
                A12_D.setText(R.string.A12_B);
                break;
            case 10:
                A12_A.setText(R.string.A12_C);
                A12_B.setText(R.string.A12_A);
                A12_C.setText(R.string.A12_D);
                A12_D.setText(R.string.A12_B);
                break;
            case 11:
                A12_A.setText(R.string.A12_C);
                A12_B.setText(R.string.A12_D);
                A12_C.setText(R.string.A12_A);
                A12_D.setText(R.string.A12_B);
                break;
            case 12:
                A12_A.setText(R.string.A12_C);
                A12_B.setText(R.string.A12_D);
                A12_C.setText(R.string.A12_B);
                A12_D.setText(R.string.A12_A);
                break;
            case 13:
                A12_A.setText(R.string.A12_A);
                A12_B.setText(R.string.A12_D);
                A12_C.setText(R.string.A12_C);
                A12_D.setText(R.string.A12_B);
                break;
            case 14:
                A12_A.setText(R.string.A12_D);
                A12_B.setText(R.string.A12_A);
                A12_C.setText(R.string.A12_C);
                A12_D.setText(R.string.A12_B);
                break;
            case 15:
                A12_A.setText(R.string.A12_D);
                A12_B.setText(R.string.A12_C);
                A12_C.setText(R.string.A12_A);
                A12_D.setText(R.string.A12_B);
                break;
            case 16:
                A12_A.setText(R.string.A12_D);
                A12_B.setText(R.string.A12_C);
                A12_C.setText(R.string.A12_B);
                A12_D.setText(R.string.A12_A);
                break;
            case 17:
                A12_A.setText(R.string.A12_A);
                A12_B.setText(R.string.A12_B);
                A12_C.setText(R.string.A12_D);
                A12_D.setText(R.string.A12_C);
                break;
            case 18:
                A12_A.setText(R.string.A12_B);
                A12_B.setText(R.string.A12_A);
                A12_C.setText(R.string.A12_D);
                A12_D.setText(R.string.A12_C);
                break;
            case 19:
                A12_A.setText(R.string.A12_B);
                A12_B.setText(R.string.A12_D);
                A12_C.setText(R.string.A12_A);
                A12_D.setText(R.string.A12_C);
                break;
            case 20:
                A12_A.setText(R.string.A12_B);
                A12_B.setText(R.string.A12_D);
                A12_C.setText(R.string.A12_C);
                A12_D.setText(R.string.A12_A);
                break;
            case 21:
                A12_A.setText(R.string.A12_A);
                A12_B.setText(R.string.A12_D);
                A12_C.setText(R.string.A12_B);
                A12_D.setText(R.string.A12_C);
                break;
            case 22:
                A12_A.setText(R.string.A12_D);
                A12_B.setText(R.string.A12_A);
                A12_C.setText(R.string.A12_B);
                A12_D.setText(R.string.A12_C);
                break;
            case 23:
                A12_A.setText(R.string.A12_D);
                A12_B.setText(R.string.A12_B);
                A12_C.setText(R.string.A12_A);
                A12_D.setText(R.string.A12_C);
                break;
            case 24:
                A12_A.setText(R.string.A12_D);
                A12_B.setText(R.string.A12_B);
                A12_C.setText(R.string.A12_C);
                A12_D.setText(R.string.A12_A);
                break;
        }
        //To provide a positive or negative outcome once the user has chosen the answer
        Q12_Answer_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q12_Pick = findViewById(Q12_Answers.getCheckedRadioButtonId());
                if (Q12_Pick == null){
                    Toast.makeText(Question12.this, "You did not pick any answer!", Toast.LENGTH_SHORT).show();
                }
                else if (Q12_Pick.getText().toString().equals(getString(R.string.A12_A))){
                    LogIn.current_prize = 125000;
                    LogIn.app_data(Question12.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question12.this, "That was correct!", Toast.LENGTH_SHORT).show();
                    Intent to_question3 = new Intent(Question12.this, Question13.class);
                    startActivity(to_question3);
                }
                else {
                    LogIn.current_prize = 32000;
                    LogIn.app_data(Question12.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question12.this, "That was incorrect!", Toast.LENGTH_SHORT).show();
                    Intent to_loser = new Intent(Question12.this, Loser.class);
                    startActivity(to_loser);
                }
            }
        });
        //To provide the player the option to safely quit the game
        Q12_Withdraw_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q12_ALERT = new AlertDialog.Builder(Question12.this);
                Q12_ALERT.setTitle("WITHDRAW");
                Q12_ALERT.setMessage("Are you sure you want to quit and keep your earned prize?");
                Q12_ALERT.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Q12_ALERT_CONTROL.cancel();
                    }
                });
                Q12_ALERT.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent to_winner = new Intent(Question12.this, Winner.class);
                        startActivity(to_winner);
                    }
                });
                Q12_ALERT_CONTROL = Q12_ALERT.create();
                Q12_ALERT_CONTROL.show();
            }
        });
    }
}