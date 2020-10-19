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

public class Question14 extends AppCompatActivity {
    private java.text.NumberFormat Q14_PRIZE_DISPLAY_FORMAT;
    private AlertDialog.Builder Q14_ALERT;
    private AlertDialog Q14_ALERT_CONTROL;
    private Button Q14_Answer_Button, Q14_Withdraw_Button;
    private TextView Q14_Prize_Money;
    private RadioGroup Q14_Answers;
    private RadioButton A14_A, A14_B, A14_C, A14_D, Q14_Pick;
    private int Q14_Answer_Setup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        Objects.requireNonNull(getSupportActionBar()).hide(); //hide the title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_question14);
        Q14_Prize_Money = findViewById(R.id.Q14_SCORE);
        Q14_Answers = findViewById(R.id.Q14_ANSWERS);
        A14_A = findViewById(R.id.A14_A);
        A14_B = findViewById(R.id.A14_B);
        A14_C = findViewById(R.id.A14_C);
        A14_D = findViewById(R.id.A14_D);
        Q14_Answer_Button = findViewById(R.id.Q14_answer_button);
        Q14_Withdraw_Button = findViewById(R.id.Q14_withdraw_button);
        //To indicate the current Activity
        LogIn.current_question = 14;
        LogIn.app_data(Question14.this).edit().putInt("current question", LogIn.current_question).apply();
        //To display the score as US dollars
        Q14_PRIZE_DISPLAY_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
        Q14_PRIZE_DISPLAY_FORMAT.setCurrency(Currency.getInstance("USD"));
        Q14_Prize_Money.setText(Q14_PRIZE_DISPLAY_FORMAT.format(LogIn.current_prize).replaceFirst(".00$", ""));
        //To randomized the location of the answers
        Q14_Answer_Setup = ThreadLocalRandom.current().nextInt(1,25);
        switch (Q14_Answer_Setup){
            case 1:
                A14_A.setText(R.string.A14_A);
                A14_B.setText(R.string.A14_B);
                A14_C.setText(R.string.A14_C);
                A14_D.setText(R.string.A14_D);
                break;
            case 2:
                A14_A.setText(R.string.A14_B);
                A14_B.setText(R.string.A14_A);
                A14_C.setText(R.string.A14_C);
                A14_D.setText(R.string.A14_D);
                break;
            case 3:
                A14_A.setText(R.string.A14_B);
                A14_B.setText(R.string.A14_C);
                A14_C.setText(R.string.A14_A);
                A14_D.setText(R.string.A14_D);
                break;
            case 4:
                A14_A.setText(R.string.A14_B);
                A14_B.setText(R.string.A14_C);
                A14_C.setText(R.string.A14_D);
                A14_D.setText(R.string.A14_A);
                break;
            case 5:
                A14_A.setText(R.string.A14_A);
                A14_B.setText(R.string.A14_C);
                A14_C.setText(R.string.A14_B);
                A14_D.setText(R.string.A14_D);
                break;
            case 6:
                A14_A.setText(R.string.A14_C);
                A14_B.setText(R.string.A14_A);
                A14_C.setText(R.string.A14_B);
                A14_D.setText(R.string.A14_D);
                break;
            case 7:
                A14_A.setText(R.string.A14_C);
                A14_B.setText(R.string.A14_B);
                A14_C.setText(R.string.A14_A);
                A14_D.setText(R.string.A14_D);
                break;
            case 8:
                A14_A.setText(R.string.A14_C);
                A14_B.setText(R.string.A14_B);
                A14_C.setText(R.string.A14_D);
                A14_D.setText(R.string.A14_A);
                break;
            case 9:
                A14_A.setText(R.string.A14_A);
                A14_B.setText(R.string.A14_C);
                A14_C.setText(R.string.A14_D);
                A14_D.setText(R.string.A14_B);
                break;
            case 10:
                A14_A.setText(R.string.A14_C);
                A14_B.setText(R.string.A14_A);
                A14_C.setText(R.string.A14_D);
                A14_D.setText(R.string.A14_B);
                break;
            case 11:
                A14_A.setText(R.string.A14_C);
                A14_B.setText(R.string.A14_D);
                A14_C.setText(R.string.A14_A);
                A14_D.setText(R.string.A14_B);
                break;
            case 12:
                A14_A.setText(R.string.A14_C);
                A14_B.setText(R.string.A14_D);
                A14_C.setText(R.string.A14_B);
                A14_D.setText(R.string.A14_A);
                break;
            case 13:
                A14_A.setText(R.string.A14_A);
                A14_B.setText(R.string.A14_D);
                A14_C.setText(R.string.A14_C);
                A14_D.setText(R.string.A14_B);
                break;
            case 14:
                A14_A.setText(R.string.A14_D);
                A14_B.setText(R.string.A14_A);
                A14_C.setText(R.string.A14_C);
                A14_D.setText(R.string.A14_B);
                break;
            case 15:
                A14_A.setText(R.string.A14_D);
                A14_B.setText(R.string.A14_C);
                A14_C.setText(R.string.A14_A);
                A14_D.setText(R.string.A14_B);
                break;
            case 16:
                A14_A.setText(R.string.A14_D);
                A14_B.setText(R.string.A14_C);
                A14_C.setText(R.string.A14_B);
                A14_D.setText(R.string.A14_A);
                break;
            case 17:
                A14_A.setText(R.string.A14_A);
                A14_B.setText(R.string.A14_B);
                A14_C.setText(R.string.A14_D);
                A14_D.setText(R.string.A14_C);
                break;
            case 18:
                A14_A.setText(R.string.A14_B);
                A14_B.setText(R.string.A14_A);
                A14_C.setText(R.string.A14_D);
                A14_D.setText(R.string.A14_C);
                break;
            case 19:
                A14_A.setText(R.string.A14_B);
                A14_B.setText(R.string.A14_D);
                A14_C.setText(R.string.A14_A);
                A14_D.setText(R.string.A14_C);
                break;
            case 20:
                A14_A.setText(R.string.A14_B);
                A14_B.setText(R.string.A14_D);
                A14_C.setText(R.string.A14_C);
                A14_D.setText(R.string.A14_A);
                break;
            case 21:
                A14_A.setText(R.string.A14_A);
                A14_B.setText(R.string.A14_D);
                A14_C.setText(R.string.A14_B);
                A14_D.setText(R.string.A14_C);
                break;
            case 22:
                A14_A.setText(R.string.A14_D);
                A14_B.setText(R.string.A14_A);
                A14_C.setText(R.string.A14_B);
                A14_D.setText(R.string.A14_C);
                break;
            case 23:
                A14_A.setText(R.string.A14_D);
                A14_B.setText(R.string.A14_B);
                A14_C.setText(R.string.A14_A);
                A14_D.setText(R.string.A14_C);
                break;
            case 24:
                A14_A.setText(R.string.A14_D);
                A14_B.setText(R.string.A14_B);
                A14_C.setText(R.string.A14_C);
                A14_D.setText(R.string.A14_A);
                break;
        }
        //To provide a positive or negative outcome once the user has chosen the answer
        Q14_Answer_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q14_Pick = findViewById(Q14_Answers.getCheckedRadioButtonId());
                if (Q14_Pick == null){
                    Toast.makeText(Question14.this, "You did not pick any answer!", Toast.LENGTH_SHORT).show();
                }
                else if (Q14_Pick.getText().toString().equals(getString(R.string.A14_A))){
                    LogIn.current_prize = 500000;
                    LogIn.app_data(Question14.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question14.this, "That was correct!", Toast.LENGTH_SHORT).show();
                    Intent to_question3 = new Intent(Question14.this, Question15.class);
                    startActivity(to_question3);
                }
                else {
                    LogIn.current_prize = 32000;
                    LogIn.app_data(Question14.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question14.this, "That was incorrect!", Toast.LENGTH_SHORT).show();
                    Intent to_loser = new Intent(Question14.this, Loser.class);
                    startActivity(to_loser);
                }
            }
        });
        //To provide the player the option to safely quit the game
        Q14_Withdraw_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q14_ALERT = new AlertDialog.Builder(Question14.this);
                Q14_ALERT.setTitle("WITHDRAW");
                Q14_ALERT.setMessage("Are you sure you want to quit and keep your earned prize?");
                Q14_ALERT.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Q14_ALERT_CONTROL.cancel();
                    }
                });
                Q14_ALERT.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent to_winner = new Intent(Question14.this, Winner.class);
                        startActivity(to_winner);
                    }
                });
                Q14_ALERT_CONTROL = Q14_ALERT.create();
                Q14_ALERT_CONTROL.show();
            }
        });
    }
}