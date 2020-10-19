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

public class Question4 extends AppCompatActivity {
    private java.text.NumberFormat Q4_PRIZE_DISPLAY_FORMAT;
    private AlertDialog.Builder Q4_ALERT;
    private AlertDialog Q4_ALERT_CONTROL;
    private Button Q4_Answer_Button, Q4_Withdraw_Button;
    private TextView Q4_Prize_Money;
    private RadioGroup Q4_Answers;
    private RadioButton A4_A, A4_B, A4_C, A4_D, Q4_Pick;
    private int Q4_Answer_Setup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        Objects.requireNonNull(getSupportActionBar()).hide(); //hide the title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_question4);
        Q4_Prize_Money = findViewById(R.id.Q4_SCORE);
        Q4_Answers = findViewById(R.id.Q4_ANSWERS);
        A4_A = findViewById(R.id.A4_A);
        A4_B = findViewById(R.id.A4_B);
        A4_C = findViewById(R.id.A4_C);
        A4_D = findViewById(R.id.A4_D);
        Q4_Answer_Button = findViewById(R.id.Q4_answer_button);
        Q4_Withdraw_Button = findViewById(R.id.Q4_withdraw_button);
        //To indicate the current Activity
        LogIn.current_question = 4;
        LogIn.app_data(Question4.this).edit().putInt("current question", LogIn.current_question).apply();
        //To display the score as US dollars
        Q4_PRIZE_DISPLAY_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
        Q4_PRIZE_DISPLAY_FORMAT.setCurrency(Currency.getInstance("USD"));
        Q4_Prize_Money.setText(Q4_PRIZE_DISPLAY_FORMAT.format(LogIn.current_prize).replaceFirst(".00$", ""));
        //To randomized the location of the answers
        Q4_Answer_Setup = ThreadLocalRandom.current().nextInt(1,25);
        switch (Q4_Answer_Setup){
            case 1:
                A4_A.setText(R.string.A4_A);
                A4_B.setText(R.string.A4_B);
                A4_C.setText(R.string.A4_C);
                A4_D.setText(R.string.A4_D);
                break;
            case 2:
                A4_A.setText(R.string.A4_B);
                A4_B.setText(R.string.A4_A);
                A4_C.setText(R.string.A4_C);
                A4_D.setText(R.string.A4_D);
                break;
            case 3:
                A4_A.setText(R.string.A4_B);
                A4_B.setText(R.string.A4_C);
                A4_C.setText(R.string.A4_A);
                A4_D.setText(R.string.A4_D);
                break;
            case 4:
                A4_A.setText(R.string.A4_B);
                A4_B.setText(R.string.A4_C);
                A4_C.setText(R.string.A4_D);
                A4_D.setText(R.string.A4_A);
                break;
            case 5:
                A4_A.setText(R.string.A4_A);
                A4_B.setText(R.string.A4_C);
                A4_C.setText(R.string.A4_B);
                A4_D.setText(R.string.A4_D);
                break;
            case 6:
                A4_A.setText(R.string.A4_C);
                A4_B.setText(R.string.A4_A);
                A4_C.setText(R.string.A4_B);
                A4_D.setText(R.string.A4_D);
                break;
            case 7:
                A4_A.setText(R.string.A4_C);
                A4_B.setText(R.string.A4_B);
                A4_C.setText(R.string.A4_A);
                A4_D.setText(R.string.A4_D);
                break;
            case 8:
                A4_A.setText(R.string.A4_C);
                A4_B.setText(R.string.A4_B);
                A4_C.setText(R.string.A4_D);
                A4_D.setText(R.string.A4_A);
                break;
            case 9:
                A4_A.setText(R.string.A4_A);
                A4_B.setText(R.string.A4_C);
                A4_C.setText(R.string.A4_D);
                A4_D.setText(R.string.A4_B);
                break;
            case 10:
                A4_A.setText(R.string.A4_C);
                A4_B.setText(R.string.A4_A);
                A4_C.setText(R.string.A4_D);
                A4_D.setText(R.string.A4_B);
                break;
            case 11:
                A4_A.setText(R.string.A4_C);
                A4_B.setText(R.string.A4_D);
                A4_C.setText(R.string.A4_A);
                A4_D.setText(R.string.A4_B);
                break;
            case 12:
                A4_A.setText(R.string.A4_C);
                A4_B.setText(R.string.A4_D);
                A4_C.setText(R.string.A4_B);
                A4_D.setText(R.string.A4_A);
                break;
            case 13:
                A4_A.setText(R.string.A4_A);
                A4_B.setText(R.string.A4_D);
                A4_C.setText(R.string.A4_C);
                A4_D.setText(R.string.A4_B);
                break;
            case 14:
                A4_A.setText(R.string.A4_D);
                A4_B.setText(R.string.A4_A);
                A4_C.setText(R.string.A4_C);
                A4_D.setText(R.string.A4_B);
                break;
            case 15:
                A4_A.setText(R.string.A4_D);
                A4_B.setText(R.string.A4_C);
                A4_C.setText(R.string.A4_A);
                A4_D.setText(R.string.A4_B);
                break;
            case 16:
                A4_A.setText(R.string.A4_D);
                A4_B.setText(R.string.A4_C);
                A4_C.setText(R.string.A4_B);
                A4_D.setText(R.string.A4_A);
                break;
            case 17:
                A4_A.setText(R.string.A4_A);
                A4_B.setText(R.string.A4_B);
                A4_C.setText(R.string.A4_D);
                A4_D.setText(R.string.A4_C);
                break;
            case 18:
                A4_A.setText(R.string.A4_B);
                A4_B.setText(R.string.A4_A);
                A4_C.setText(R.string.A4_D);
                A4_D.setText(R.string.A4_C);
                break;
            case 19:
                A4_A.setText(R.string.A4_B);
                A4_B.setText(R.string.A4_D);
                A4_C.setText(R.string.A4_A);
                A4_D.setText(R.string.A4_C);
                break;
            case 20:
                A4_A.setText(R.string.A4_B);
                A4_B.setText(R.string.A4_D);
                A4_C.setText(R.string.A4_C);
                A4_D.setText(R.string.A4_A);
                break;
            case 21:
                A4_A.setText(R.string.A4_A);
                A4_B.setText(R.string.A4_D);
                A4_C.setText(R.string.A4_B);
                A4_D.setText(R.string.A4_C);
                break;
            case 22:
                A4_A.setText(R.string.A4_D);
                A4_B.setText(R.string.A4_A);
                A4_C.setText(R.string.A4_B);
                A4_D.setText(R.string.A4_C);
                break;
            case 23:
                A4_A.setText(R.string.A4_D);
                A4_B.setText(R.string.A4_B);
                A4_C.setText(R.string.A4_A);
                A4_D.setText(R.string.A4_C);
                break;
            case 24:
                A4_A.setText(R.string.A4_D);
                A4_B.setText(R.string.A4_B);
                A4_C.setText(R.string.A4_C);
                A4_D.setText(R.string.A4_A);
                break;
        }
        //To provide a positive or negative outcome once the user has chosen the answer
        Q4_Answer_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q4_Pick = findViewById(Q4_Answers.getCheckedRadioButtonId());
                if (Q4_Pick == null){
                    Toast.makeText(Question4.this, "You did not pick any answer!", Toast.LENGTH_SHORT).show();
                }
                else if (Q4_Pick.getText().toString().equals(getString(R.string.A4_A))){
                    LogIn.current_prize = 500;
                    LogIn.app_data(Question4.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question4.this, "That was correct!", Toast.LENGTH_SHORT).show();
                    Intent to_question3 = new Intent(Question4.this, Question5.class);
                    startActivity(to_question3);
                }
                else {
                    LogIn.current_prize = 0;
                    LogIn.app_data(Question4.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question4.this, "That was incorrect!", Toast.LENGTH_SHORT).show();
                    Intent to_loser = new Intent(Question4.this, Loser.class);
                    startActivity(to_loser);
                }
            }
        });
        //To provide the player the option to safely quit the game
        Q4_Withdraw_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q4_ALERT = new AlertDialog.Builder(Question4.this);
                Q4_ALERT.setTitle("WITHDRAW");
                Q4_ALERT.setMessage("Are you sure you want to quit and keep your earned prize?");
                Q4_ALERT.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Q4_ALERT_CONTROL.cancel();
                    }
                });
                Q4_ALERT.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent to_winner = new Intent(Question4.this, Winner.class);
                        startActivity(to_winner);
                    }
                });
                Q4_ALERT_CONTROL = Q4_ALERT.create();
                Q4_ALERT_CONTROL.show();
            }
        });
    }
}