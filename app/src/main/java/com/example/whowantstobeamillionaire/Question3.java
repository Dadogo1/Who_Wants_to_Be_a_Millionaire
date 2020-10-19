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

public class Question3 extends AppCompatActivity {
    private java.text.NumberFormat Q3_PRIZE_DISPLAY_FORMAT;
    private AlertDialog.Builder Q3_ALERT;
    private AlertDialog Q3_ALERT_CONTROL;
    private Button Q3_Answer_Button, Q3_Withdraw_Button;
    private TextView Q3_Prize_Money;
    private RadioGroup Q3_Answers;
    private RadioButton A3_A, A3_B, A3_C, A3_D, Q3_Pick;
    private int Q3_Answer_Setup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        Objects.requireNonNull(getSupportActionBar()).hide(); //hide the title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_question3);
        Q3_Prize_Money = findViewById(R.id.Q3_SCORE);
        Q3_Answers = findViewById(R.id.Q3_ANSWERS);
        A3_A = findViewById(R.id.A3_A);
        A3_B = findViewById(R.id.A3_B);
        A3_C = findViewById(R.id.A3_C);
        A3_D = findViewById(R.id.A3_D);
        Q3_Answer_Button = findViewById(R.id.Q3_answer_button);
        Q3_Withdraw_Button = findViewById(R.id.Q3_withdraw_button);
        //To indicate the current Activity
        LogIn.current_question = 3;
        LogIn.app_data(Question3.this).edit().putInt("current question", LogIn.current_question).apply();
        //To display the score as US dollars
        Q3_PRIZE_DISPLAY_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
        Q3_PRIZE_DISPLAY_FORMAT.setCurrency(Currency.getInstance("USD"));
        Q3_Prize_Money.setText(Q3_PRIZE_DISPLAY_FORMAT.format(LogIn.current_prize).replaceFirst(".00$", ""));
        //To randomized the location of the answers
        Q3_Answer_Setup = ThreadLocalRandom.current().nextInt(1,25);
        switch (Q3_Answer_Setup){
            case 1:
                A3_A.setText(R.string.A3_A);
                A3_B.setText(R.string.A3_B);
                A3_C.setText(R.string.A3_C);
                A3_D.setText(R.string.A3_D);
                break;
            case 2:
                A3_A.setText(R.string.A3_B);
                A3_B.setText(R.string.A3_A);
                A3_C.setText(R.string.A3_C);
                A3_D.setText(R.string.A3_D);
                break;
            case 3:
                A3_A.setText(R.string.A3_B);
                A3_B.setText(R.string.A3_C);
                A3_C.setText(R.string.A3_A);
                A3_D.setText(R.string.A3_D);
                break;
            case 4:
                A3_A.setText(R.string.A3_B);
                A3_B.setText(R.string.A3_C);
                A3_C.setText(R.string.A3_D);
                A3_D.setText(R.string.A3_A);
                break;
            case 5:
                A3_A.setText(R.string.A3_A);
                A3_B.setText(R.string.A3_C);
                A3_C.setText(R.string.A3_B);
                A3_D.setText(R.string.A3_D);
                break;
            case 6:
                A3_A.setText(R.string.A3_C);
                A3_B.setText(R.string.A3_A);
                A3_C.setText(R.string.A3_B);
                A3_D.setText(R.string.A3_D);
                break;
            case 7:
                A3_A.setText(R.string.A3_C);
                A3_B.setText(R.string.A3_B);
                A3_C.setText(R.string.A3_A);
                A3_D.setText(R.string.A3_D);
                break;
            case 8:
                A3_A.setText(R.string.A3_C);
                A3_B.setText(R.string.A3_B);
                A3_C.setText(R.string.A3_D);
                A3_D.setText(R.string.A3_A);
                break;
            case 9:
                A3_A.setText(R.string.A3_A);
                A3_B.setText(R.string.A3_C);
                A3_C.setText(R.string.A3_D);
                A3_D.setText(R.string.A3_B);
                break;
            case 10:
                A3_A.setText(R.string.A3_C);
                A3_B.setText(R.string.A3_A);
                A3_C.setText(R.string.A3_D);
                A3_D.setText(R.string.A3_B);
                break;
            case 11:
                A3_A.setText(R.string.A3_C);
                A3_B.setText(R.string.A3_D);
                A3_C.setText(R.string.A3_A);
                A3_D.setText(R.string.A3_B);
                break;
            case 12:
                A3_A.setText(R.string.A3_C);
                A3_B.setText(R.string.A3_D);
                A3_C.setText(R.string.A3_B);
                A3_D.setText(R.string.A3_A);
                break;
            case 13:
                A3_A.setText(R.string.A3_A);
                A3_B.setText(R.string.A3_D);
                A3_C.setText(R.string.A3_C);
                A3_D.setText(R.string.A3_B);
                break;
            case 14:
                A3_A.setText(R.string.A3_D);
                A3_B.setText(R.string.A3_A);
                A3_C.setText(R.string.A3_C);
                A3_D.setText(R.string.A3_B);
                break;
            case 15:
                A3_A.setText(R.string.A3_D);
                A3_B.setText(R.string.A3_C);
                A3_C.setText(R.string.A3_A);
                A3_D.setText(R.string.A3_B);
                break;
            case 16:
                A3_A.setText(R.string.A3_D);
                A3_B.setText(R.string.A3_C);
                A3_C.setText(R.string.A3_B);
                A3_D.setText(R.string.A3_A);
                break;
            case 17:
                A3_A.setText(R.string.A3_A);
                A3_B.setText(R.string.A3_B);
                A3_C.setText(R.string.A3_D);
                A3_D.setText(R.string.A3_C);
                break;
            case 18:
                A3_A.setText(R.string.A3_B);
                A3_B.setText(R.string.A3_A);
                A3_C.setText(R.string.A3_D);
                A3_D.setText(R.string.A3_C);
                break;
            case 19:
                A3_A.setText(R.string.A3_B);
                A3_B.setText(R.string.A3_D);
                A3_C.setText(R.string.A3_A);
                A3_D.setText(R.string.A3_C);
                break;
            case 20:
                A3_A.setText(R.string.A3_B);
                A3_B.setText(R.string.A3_D);
                A3_C.setText(R.string.A3_C);
                A3_D.setText(R.string.A3_A);
                break;
            case 21:
                A3_A.setText(R.string.A3_A);
                A3_B.setText(R.string.A3_D);
                A3_C.setText(R.string.A3_B);
                A3_D.setText(R.string.A3_C);
                break;
            case 22:
                A3_A.setText(R.string.A3_D);
                A3_B.setText(R.string.A3_A);
                A3_C.setText(R.string.A3_B);
                A3_D.setText(R.string.A3_C);
                break;
            case 23:
                A3_A.setText(R.string.A3_D);
                A3_B.setText(R.string.A3_B);
                A3_C.setText(R.string.A3_A);
                A3_D.setText(R.string.A3_C);
                break;
            case 24:
                A3_A.setText(R.string.A3_D);
                A3_B.setText(R.string.A3_B);
                A3_C.setText(R.string.A3_C);
                A3_D.setText(R.string.A3_A);
                break;
        }
        //To provide a positive or negative outcome once the user has chosen the answer
        Q3_Answer_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q3_Pick = findViewById(Q3_Answers.getCheckedRadioButtonId());
                if (Q3_Pick == null){
                    Toast.makeText(Question3.this, "You did not pick any answer!", Toast.LENGTH_SHORT).show();
                }
                else if (Q3_Pick.getText().toString().equals(getString(R.string.A3_A))){
                    LogIn.current_prize = 300;
                    LogIn.app_data(Question3.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question3.this, "That was correct!", Toast.LENGTH_SHORT).show();
                    Intent to_question3 = new Intent(Question3.this, Question4.class);
                    startActivity(to_question3);
                }
                else {
                    LogIn.current_prize = 0;
                    LogIn.app_data(Question3.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question3.this, "That was incorrect!", Toast.LENGTH_SHORT).show();
                    Intent to_loser = new Intent(Question3.this, Loser.class);
                    startActivity(to_loser);
                }
            }
        });
        //To provide the player the option to safely quit the game
        Q3_Withdraw_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q3_ALERT = new AlertDialog.Builder(Question3.this);
                Q3_ALERT.setTitle("WITHDRAW");
                Q3_ALERT.setMessage("Are you sure you want to quit and keep your earned prize?");
                Q3_ALERT.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Q3_ALERT_CONTROL.cancel();
                    }
                });
                Q3_ALERT.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent to_winner = new Intent(Question3.this, Winner.class);
                        startActivity(to_winner);
                    }
                });
                Q3_ALERT_CONTROL = Q3_ALERT.create();
                Q3_ALERT_CONTROL.show();
            }
        });
    }
}