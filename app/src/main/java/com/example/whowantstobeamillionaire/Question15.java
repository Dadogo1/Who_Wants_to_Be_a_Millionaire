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

public class Question15 extends AppCompatActivity {
    private java.text.NumberFormat Q15_PRIZE_DISPLAY_FORMAT;
    private AlertDialog.Builder Q15_ALERT;
    private AlertDialog Q15_ALERT_CONTROL;
    private Button Q15_Answer_Button, Q15_Withdraw_Button;
    private TextView Q15_Prize_Money;
    private RadioGroup Q15_Answers;
    private RadioButton A15_A, A15_B, A15_C, A15_D, Q15_Pick;
    private int Q15_Answer_Setup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        Objects.requireNonNull(getSupportActionBar()).hide(); //hide the title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_question15);
        Q15_Prize_Money = findViewById(R.id.Q15_SCORE);
        Q15_Answers = findViewById(R.id.Q15_ANSWERS);
        A15_A = findViewById(R.id.A15_A);
        A15_B = findViewById(R.id.A15_B);
        A15_C = findViewById(R.id.A15_C);
        A15_D = findViewById(R.id.A15_D);
        Q15_Answer_Button = findViewById(R.id.Q15_answer_button);
        Q15_Withdraw_Button = findViewById(R.id.Q15_withdraw_button);
        //To indicate the current Activity
        LogIn.current_question = 15;
        LogIn.app_data(Question15.this).edit().putInt("current question", LogIn.current_question).apply();
        //To display the score as US dollars
        Q15_PRIZE_DISPLAY_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
        Q15_PRIZE_DISPLAY_FORMAT.setCurrency(Currency.getInstance("USD"));
        Q15_Prize_Money.setText(Q15_PRIZE_DISPLAY_FORMAT.format(LogIn.current_prize).replaceFirst(".00$", ""));
        //To randomized the location of the answers
        Q15_Answer_Setup = ThreadLocalRandom.current().nextInt(1,25);
        switch (Q15_Answer_Setup){
            case 1:
                A15_A.setText(R.string.A15_A);
                A15_B.setText(R.string.A15_B);
                A15_C.setText(R.string.A15_C);
                A15_D.setText(R.string.A15_D);
                break;
            case 2:
                A15_A.setText(R.string.A15_B);
                A15_B.setText(R.string.A15_A);
                A15_C.setText(R.string.A15_C);
                A15_D.setText(R.string.A15_D);
                break;
            case 3:
                A15_A.setText(R.string.A15_B);
                A15_B.setText(R.string.A15_C);
                A15_C.setText(R.string.A15_A);
                A15_D.setText(R.string.A15_D);
                break;
            case 4:
                A15_A.setText(R.string.A15_B);
                A15_B.setText(R.string.A15_C);
                A15_C.setText(R.string.A15_D);
                A15_D.setText(R.string.A15_A);
                break;
            case 5:
                A15_A.setText(R.string.A15_A);
                A15_B.setText(R.string.A15_C);
                A15_C.setText(R.string.A15_B);
                A15_D.setText(R.string.A15_D);
                break;
            case 6:
                A15_A.setText(R.string.A15_C);
                A15_B.setText(R.string.A15_A);
                A15_C.setText(R.string.A15_B);
                A15_D.setText(R.string.A15_D);
                break;
            case 7:
                A15_A.setText(R.string.A15_C);
                A15_B.setText(R.string.A15_B);
                A15_C.setText(R.string.A15_A);
                A15_D.setText(R.string.A15_D);
                break;
            case 8:
                A15_A.setText(R.string.A15_C);
                A15_B.setText(R.string.A15_B);
                A15_C.setText(R.string.A15_D);
                A15_D.setText(R.string.A15_A);
                break;
            case 9:
                A15_A.setText(R.string.A15_A);
                A15_B.setText(R.string.A15_C);
                A15_C.setText(R.string.A15_D);
                A15_D.setText(R.string.A15_B);
                break;
            case 10:
                A15_A.setText(R.string.A15_C);
                A15_B.setText(R.string.A15_A);
                A15_C.setText(R.string.A15_D);
                A15_D.setText(R.string.A15_B);
                break;
            case 11:
                A15_A.setText(R.string.A15_C);
                A15_B.setText(R.string.A15_D);
                A15_C.setText(R.string.A15_A);
                A15_D.setText(R.string.A15_B);
                break;
            case 12:
                A15_A.setText(R.string.A15_C);
                A15_B.setText(R.string.A15_D);
                A15_C.setText(R.string.A15_B);
                A15_D.setText(R.string.A15_A);
                break;
            case 13:
                A15_A.setText(R.string.A15_A);
                A15_B.setText(R.string.A15_D);
                A15_C.setText(R.string.A15_C);
                A15_D.setText(R.string.A15_B);
                break;
            case 14:
                A15_A.setText(R.string.A15_D);
                A15_B.setText(R.string.A15_A);
                A15_C.setText(R.string.A15_C);
                A15_D.setText(R.string.A15_B);
                break;
            case 15:
                A15_A.setText(R.string.A15_D);
                A15_B.setText(R.string.A15_C);
                A15_C.setText(R.string.A15_A);
                A15_D.setText(R.string.A15_B);
                break;
            case 16:
                A15_A.setText(R.string.A15_D);
                A15_B.setText(R.string.A15_C);
                A15_C.setText(R.string.A15_B);
                A15_D.setText(R.string.A15_A);
                break;
            case 17:
                A15_A.setText(R.string.A15_A);
                A15_B.setText(R.string.A15_B);
                A15_C.setText(R.string.A15_D);
                A15_D.setText(R.string.A15_C);
                break;
            case 18:
                A15_A.setText(R.string.A15_B);
                A15_B.setText(R.string.A15_A);
                A15_C.setText(R.string.A15_D);
                A15_D.setText(R.string.A15_C);
                break;
            case 19:
                A15_A.setText(R.string.A15_B);
                A15_B.setText(R.string.A15_D);
                A15_C.setText(R.string.A15_A);
                A15_D.setText(R.string.A15_C);
                break;
            case 20:
                A15_A.setText(R.string.A15_B);
                A15_B.setText(R.string.A15_D);
                A15_C.setText(R.string.A15_C);
                A15_D.setText(R.string.A15_A);
                break;
            case 21:
                A15_A.setText(R.string.A15_A);
                A15_B.setText(R.string.A15_D);
                A15_C.setText(R.string.A15_B);
                A15_D.setText(R.string.A15_C);
                break;
            case 22:
                A15_A.setText(R.string.A15_D);
                A15_B.setText(R.string.A15_A);
                A15_C.setText(R.string.A15_B);
                A15_D.setText(R.string.A15_C);
                break;
            case 23:
                A15_A.setText(R.string.A15_D);
                A15_B.setText(R.string.A15_B);
                A15_C.setText(R.string.A15_A);
                A15_D.setText(R.string.A15_C);
                break;
            case 24:
                A15_A.setText(R.string.A15_D);
                A15_B.setText(R.string.A15_B);
                A15_C.setText(R.string.A15_C);
                A15_D.setText(R.string.A15_A);
                break;
        }
        //To provide a positive or negative outcome once the user has chosen the answer
        Q15_Answer_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q15_Pick = findViewById(Q15_Answers.getCheckedRadioButtonId());
                if (Q15_Pick == null){
                    Toast.makeText(Question15.this, "You did not pick any answer!", Toast.LENGTH_SHORT).show();
                }
                else if (Q15_Pick.getText().toString().equals(getString(R.string.A15_A))){
                    LogIn.current_prize = 1000000;
                    LogIn.app_data(Question15.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question15.this, "That was correct!", Toast.LENGTH_SHORT).show();
                    Intent to_question3 = new Intent(Question15.this, Winner.class);
                    startActivity(to_question3);
                }
                else {
                    LogIn.current_prize = 32000;
                    LogIn.app_data(Question15.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question15.this, "That was incorrect!", Toast.LENGTH_SHORT).show();
                    Intent to_loser = new Intent(Question15.this, Loser.class);
                    startActivity(to_loser);
                }
            }
        });
        //To provide the player the option to safely quit the game
        Q15_Withdraw_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q15_ALERT = new AlertDialog.Builder(Question15.this);
                Q15_ALERT.setTitle("WITHDRAW");
                Q15_ALERT.setMessage("Are you sure you want to quit and keep your earned prize?");
                Q15_ALERT.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Q15_ALERT_CONTROL.cancel();
                    }
                });
                Q15_ALERT.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent to_winner = new Intent(Question15.this, Winner.class);
                        startActivity(to_winner);
                    }
                });
                Q15_ALERT_CONTROL = Q15_ALERT.create();
                Q15_ALERT_CONTROL.show();
            }
        });
    }
}