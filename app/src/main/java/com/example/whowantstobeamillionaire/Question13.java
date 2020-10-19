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

public class Question13 extends AppCompatActivity {
    private java.text.NumberFormat Q13_PRIZE_DISPLAY_FORMAT;
    private AlertDialog.Builder Q13_ALERT;
    private AlertDialog Q13_ALERT_CONTROL;
    private Button Q13_Answer_Button, Q13_Withdraw_Button;
    private TextView Q13_Prize_Money;
    private RadioGroup Q13_Answers;
    private RadioButton A13_A, A13_B, A13_C, A13_D, Q13_Pick;
    private int Q13_Answer_Setup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        Objects.requireNonNull(getSupportActionBar()).hide(); //hide the title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_question13);
        Q13_Prize_Money = findViewById(R.id.Q13_SCORE);
        Q13_Answers = findViewById(R.id.Q13_ANSWERS);
        A13_A = findViewById(R.id.A13_A);
        A13_B = findViewById(R.id.A13_B);
        A13_C = findViewById(R.id.A13_C);
        A13_D = findViewById(R.id.A13_D);
        Q13_Answer_Button = findViewById(R.id.Q13_answer_button);
        Q13_Withdraw_Button = findViewById(R.id.Q13_withdraw_button);
        //To indicate the current Activity
        LogIn.current_question = 13;
        LogIn.app_data(Question13.this).edit().putInt("current question", LogIn.current_question).apply();
        //To display the score as US dollars
        Q13_PRIZE_DISPLAY_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
        Q13_PRIZE_DISPLAY_FORMAT.setCurrency(Currency.getInstance("USD"));
        Q13_Prize_Money.setText(Q13_PRIZE_DISPLAY_FORMAT.format(LogIn.current_prize).replaceFirst(".00$", ""));
        //To randomized the location of the answers
        Q13_Answer_Setup = ThreadLocalRandom.current().nextInt(1,25);
        switch (Q13_Answer_Setup){
            case 1:
                A13_A.setText(R.string.A13_A);
                A13_B.setText(R.string.A13_B);
                A13_C.setText(R.string.A13_C);
                A13_D.setText(R.string.A13_D);
                break;
            case 2:
                A13_A.setText(R.string.A13_B);
                A13_B.setText(R.string.A13_A);
                A13_C.setText(R.string.A13_C);
                A13_D.setText(R.string.A13_D);
                break;
            case 3:
                A13_A.setText(R.string.A13_B);
                A13_B.setText(R.string.A13_C);
                A13_C.setText(R.string.A13_A);
                A13_D.setText(R.string.A13_D);
                break;
            case 4:
                A13_A.setText(R.string.A13_B);
                A13_B.setText(R.string.A13_C);
                A13_C.setText(R.string.A13_D);
                A13_D.setText(R.string.A13_A);
                break;
            case 5:
                A13_A.setText(R.string.A13_A);
                A13_B.setText(R.string.A13_C);
                A13_C.setText(R.string.A13_B);
                A13_D.setText(R.string.A13_D);
                break;
            case 6:
                A13_A.setText(R.string.A13_C);
                A13_B.setText(R.string.A13_A);
                A13_C.setText(R.string.A13_B);
                A13_D.setText(R.string.A13_D);
                break;
            case 7:
                A13_A.setText(R.string.A13_C);
                A13_B.setText(R.string.A13_B);
                A13_C.setText(R.string.A13_A);
                A13_D.setText(R.string.A13_D);
                break;
            case 8:
                A13_A.setText(R.string.A13_C);
                A13_B.setText(R.string.A13_B);
                A13_C.setText(R.string.A13_D);
                A13_D.setText(R.string.A13_A);
                break;
            case 9:
                A13_A.setText(R.string.A13_A);
                A13_B.setText(R.string.A13_C);
                A13_C.setText(R.string.A13_D);
                A13_D.setText(R.string.A13_B);
                break;
            case 10:
                A13_A.setText(R.string.A13_C);
                A13_B.setText(R.string.A13_A);
                A13_C.setText(R.string.A13_D);
                A13_D.setText(R.string.A13_B);
                break;
            case 11:
                A13_A.setText(R.string.A13_C);
                A13_B.setText(R.string.A13_D);
                A13_C.setText(R.string.A13_A);
                A13_D.setText(R.string.A13_B);
                break;
            case 12:
                A13_A.setText(R.string.A13_C);
                A13_B.setText(R.string.A13_D);
                A13_C.setText(R.string.A13_B);
                A13_D.setText(R.string.A13_A);
                break;
            case 13:
                A13_A.setText(R.string.A13_A);
                A13_B.setText(R.string.A13_D);
                A13_C.setText(R.string.A13_C);
                A13_D.setText(R.string.A13_B);
                break;
            case 14:
                A13_A.setText(R.string.A13_D);
                A13_B.setText(R.string.A13_A);
                A13_C.setText(R.string.A13_C);
                A13_D.setText(R.string.A13_B);
                break;
            case 15:
                A13_A.setText(R.string.A13_D);
                A13_B.setText(R.string.A13_C);
                A13_C.setText(R.string.A13_A);
                A13_D.setText(R.string.A13_B);
                break;
            case 16:
                A13_A.setText(R.string.A13_D);
                A13_B.setText(R.string.A13_C);
                A13_C.setText(R.string.A13_B);
                A13_D.setText(R.string.A13_A);
                break;
            case 17:
                A13_A.setText(R.string.A13_A);
                A13_B.setText(R.string.A13_B);
                A13_C.setText(R.string.A13_D);
                A13_D.setText(R.string.A13_C);
                break;
            case 18:
                A13_A.setText(R.string.A13_B);
                A13_B.setText(R.string.A13_A);
                A13_C.setText(R.string.A13_D);
                A13_D.setText(R.string.A13_C);
                break;
            case 19:
                A13_A.setText(R.string.A13_B);
                A13_B.setText(R.string.A13_D);
                A13_C.setText(R.string.A13_A);
                A13_D.setText(R.string.A13_C);
                break;
            case 20:
                A13_A.setText(R.string.A13_B);
                A13_B.setText(R.string.A13_D);
                A13_C.setText(R.string.A13_C);
                A13_D.setText(R.string.A13_A);
                break;
            case 21:
                A13_A.setText(R.string.A13_A);
                A13_B.setText(R.string.A13_D);
                A13_C.setText(R.string.A13_B);
                A13_D.setText(R.string.A13_C);
                break;
            case 22:
                A13_A.setText(R.string.A13_D);
                A13_B.setText(R.string.A13_A);
                A13_C.setText(R.string.A13_B);
                A13_D.setText(R.string.A13_C);
                break;
            case 23:
                A13_A.setText(R.string.A13_D);
                A13_B.setText(R.string.A13_B);
                A13_C.setText(R.string.A13_A);
                A13_D.setText(R.string.A13_C);
                break;
            case 24:
                A13_A.setText(R.string.A13_D);
                A13_B.setText(R.string.A13_B);
                A13_C.setText(R.string.A13_C);
                A13_D.setText(R.string.A13_A);
                break;
        }
        //To provide a positive or negative outcome once the user has chosen the answer
        Q13_Answer_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q13_Pick = findViewById(Q13_Answers.getCheckedRadioButtonId());
                if (Q13_Pick == null){
                    Toast.makeText(Question13.this, "You did not pick any answer!", Toast.LENGTH_SHORT).show();
                }
                else if (Q13_Pick.getText().toString().equals(getString(R.string.A13_A))){
                    LogIn.current_prize = 250000;
                    LogIn.app_data(Question13.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question13.this, "That was correct!", Toast.LENGTH_SHORT).show();
                    Intent to_question3 = new Intent(Question13.this, Question14.class);
                    startActivity(to_question3);
                }
                else {
                    LogIn.current_prize = 32000;
                    LogIn.app_data(Question13.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question13.this, "That was incorrect!", Toast.LENGTH_SHORT).show();
                    Intent to_loser = new Intent(Question13.this, Loser.class);
                    startActivity(to_loser);
                }
            }
        });
        //To provide the player the option to safely quit the game
        Q13_Withdraw_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q13_ALERT = new AlertDialog.Builder(Question13.this);
                Q13_ALERT.setTitle("WITHDRAW");
                Q13_ALERT.setMessage("Are you sure you want to quit and keep your earned prize?");
                Q13_ALERT.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Q13_ALERT_CONTROL.cancel();
                    }
                });
                Q13_ALERT.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent to_winner = new Intent(Question13.this, Winner.class);
                        startActivity(to_winner);
                    }
                });
                Q13_ALERT_CONTROL = Q13_ALERT.create();
                Q13_ALERT_CONTROL.show();
            }
        });
    }
}