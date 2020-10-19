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

public class Question9 extends AppCompatActivity {
    private java.text.NumberFormat Q9_PRIZE_DISPLAY_FORMAT;
    private AlertDialog.Builder Q9_ALERT;
    private AlertDialog Q9_ALERT_CONTROL;
    private Button Q9_Answer_Button, Q9_Withdraw_Button;
    private TextView Q9_Prize_Money;
    private RadioGroup Q9_Answers;
    private RadioButton A9_A, A9_B, A9_C, A9_D, Q9_Pick;
    private int Q9_Answer_Setup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        Objects.requireNonNull(getSupportActionBar()).hide(); //hide the title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_question9);
        Q9_Prize_Money = findViewById(R.id.Q9_SCORE);
        Q9_Answers = findViewById(R.id.Q9_ANSWERS);
        A9_A = findViewById(R.id.A9_A);
        A9_B = findViewById(R.id.A9_B);
        A9_C = findViewById(R.id.A9_C);
        A9_D = findViewById(R.id.A9_D);
        Q9_Answer_Button = findViewById(R.id.Q9_answer_button);
        Q9_Withdraw_Button = findViewById(R.id.Q9_withdraw_button);
        //To indicate the current Activity
        LogIn.current_question = 9;
        LogIn.app_data(Question9.this).edit().putInt("current question", LogIn.current_question).apply();
        //To display the score as US dollars
        Q9_PRIZE_DISPLAY_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
        Q9_PRIZE_DISPLAY_FORMAT.setCurrency(Currency.getInstance("USD"));
        Q9_Prize_Money.setText(Q9_PRIZE_DISPLAY_FORMAT.format(LogIn.current_prize).replaceFirst(".00$", ""));
        //To randomized the location of the answers
        Q9_Answer_Setup = ThreadLocalRandom.current().nextInt(1,25);
        switch (Q9_Answer_Setup){
            case 1:
                A9_A.setText(R.string.A9_A);
                A9_B.setText(R.string.A9_B);
                A9_C.setText(R.string.A9_C);
                A9_D.setText(R.string.A9_D);
                break;
            case 2:
                A9_A.setText(R.string.A9_B);
                A9_B.setText(R.string.A9_A);
                A9_C.setText(R.string.A9_C);
                A9_D.setText(R.string.A9_D);
                break;
            case 3:
                A9_A.setText(R.string.A9_B);
                A9_B.setText(R.string.A9_C);
                A9_C.setText(R.string.A9_A);
                A9_D.setText(R.string.A9_D);
                break;
            case 4:
                A9_A.setText(R.string.A9_B);
                A9_B.setText(R.string.A9_C);
                A9_C.setText(R.string.A9_D);
                A9_D.setText(R.string.A9_A);
                break;
            case 5:
                A9_A.setText(R.string.A9_A);
                A9_B.setText(R.string.A9_C);
                A9_C.setText(R.string.A9_B);
                A9_D.setText(R.string.A9_D);
                break;
            case 6:
                A9_A.setText(R.string.A9_C);
                A9_B.setText(R.string.A9_A);
                A9_C.setText(R.string.A9_B);
                A9_D.setText(R.string.A9_D);
                break;
            case 7:
                A9_A.setText(R.string.A9_C);
                A9_B.setText(R.string.A9_B);
                A9_C.setText(R.string.A9_A);
                A9_D.setText(R.string.A9_D);
                break;
            case 8:
                A9_A.setText(R.string.A9_C);
                A9_B.setText(R.string.A9_B);
                A9_C.setText(R.string.A9_D);
                A9_D.setText(R.string.A9_A);
                break;
            case 9:
                A9_A.setText(R.string.A9_A);
                A9_B.setText(R.string.A9_C);
                A9_C.setText(R.string.A9_D);
                A9_D.setText(R.string.A9_B);
                break;
            case 10:
                A9_A.setText(R.string.A9_C);
                A9_B.setText(R.string.A9_A);
                A9_C.setText(R.string.A9_D);
                A9_D.setText(R.string.A9_B);
                break;
            case 11:
                A9_A.setText(R.string.A9_C);
                A9_B.setText(R.string.A9_D);
                A9_C.setText(R.string.A9_A);
                A9_D.setText(R.string.A9_B);
                break;
            case 12:
                A9_A.setText(R.string.A9_C);
                A9_B.setText(R.string.A9_D);
                A9_C.setText(R.string.A9_B);
                A9_D.setText(R.string.A9_A);
                break;
            case 13:
                A9_A.setText(R.string.A9_A);
                A9_B.setText(R.string.A9_D);
                A9_C.setText(R.string.A9_C);
                A9_D.setText(R.string.A9_B);
                break;
            case 14:
                A9_A.setText(R.string.A9_D);
                A9_B.setText(R.string.A9_A);
                A9_C.setText(R.string.A9_C);
                A9_D.setText(R.string.A9_B);
                break;
            case 15:
                A9_A.setText(R.string.A9_D);
                A9_B.setText(R.string.A9_C);
                A9_C.setText(R.string.A9_A);
                A9_D.setText(R.string.A9_B);
                break;
            case 16:
                A9_A.setText(R.string.A9_D);
                A9_B.setText(R.string.A9_C);
                A9_C.setText(R.string.A9_B);
                A9_D.setText(R.string.A9_A);
                break;
            case 17:
                A9_A.setText(R.string.A9_A);
                A9_B.setText(R.string.A9_B);
                A9_C.setText(R.string.A9_D);
                A9_D.setText(R.string.A9_C);
                break;
            case 18:
                A9_A.setText(R.string.A9_B);
                A9_B.setText(R.string.A9_A);
                A9_C.setText(R.string.A9_D);
                A9_D.setText(R.string.A9_C);
                break;
            case 19:
                A9_A.setText(R.string.A9_B);
                A9_B.setText(R.string.A9_D);
                A9_C.setText(R.string.A9_A);
                A9_D.setText(R.string.A9_C);
                break;
            case 20:
                A9_A.setText(R.string.A9_B);
                A9_B.setText(R.string.A9_D);
                A9_C.setText(R.string.A9_C);
                A9_D.setText(R.string.A9_A);
                break;
            case 21:
                A9_A.setText(R.string.A9_A);
                A9_B.setText(R.string.A9_D);
                A9_C.setText(R.string.A9_B);
                A9_D.setText(R.string.A9_C);
                break;
            case 22:
                A9_A.setText(R.string.A9_D);
                A9_B.setText(R.string.A9_A);
                A9_C.setText(R.string.A9_B);
                A9_D.setText(R.string.A9_C);
                break;
            case 23:
                A9_A.setText(R.string.A9_D);
                A9_B.setText(R.string.A9_B);
                A9_C.setText(R.string.A9_A);
                A9_D.setText(R.string.A9_C);
                break;
            case 24:
                A9_A.setText(R.string.A9_D);
                A9_B.setText(R.string.A9_B);
                A9_C.setText(R.string.A9_C);
                A9_D.setText(R.string.A9_A);
                break;
        }
        //To provide a positive or negative outcome once the user has chosen the answer
        Q9_Answer_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q9_Pick = findViewById(Q9_Answers.getCheckedRadioButtonId());
                if (Q9_Pick == null){
                    Toast.makeText(Question9.this, "You did not pick any answer!", Toast.LENGTH_SHORT).show();
                }
                else if (Q9_Pick.getText().toString().equals(getString(R.string.A9_A))){
                    LogIn.current_prize = 16000;
                    LogIn.app_data(Question9.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question9.this, "That was correct!", Toast.LENGTH_SHORT).show();
                    Intent to_question3 = new Intent(Question9.this, Question10.class);
                    startActivity(to_question3);
                }
                else {
                    LogIn.current_prize = 1000;
                    LogIn.app_data(Question9.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question9.this, "That was incorrect!", Toast.LENGTH_SHORT).show();
                    Intent to_loser = new Intent(Question9.this, Loser.class);
                    startActivity(to_loser);
                }
            }
        });
        //To provide the player the option to safely quit the game
        Q9_Withdraw_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q9_ALERT = new AlertDialog.Builder(Question9.this);
                Q9_ALERT.setTitle("WITHDRAW");
                Q9_ALERT.setMessage("Are you sure you want to quit and keep your earned prize?");
                Q9_ALERT.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Q9_ALERT_CONTROL.cancel();
                    }
                });
                Q9_ALERT.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent to_winner = new Intent(Question9.this, Winner.class);
                        startActivity(to_winner);
                    }
                });
                Q9_ALERT_CONTROL = Q9_ALERT.create();
                Q9_ALERT_CONTROL.show();
            }
        });
    }
}