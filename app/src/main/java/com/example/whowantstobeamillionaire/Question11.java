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

public class Question11 extends AppCompatActivity {
    private java.text.NumberFormat Q11_PRIZE_DISPLAY_FORMAT;
    private AlertDialog.Builder Q11_ALERT;
    private AlertDialog Q11_ALERT_CONTROL;
    private Button Q11_Answer_Button, Q11_Withdraw_Button;
    private TextView Q11_Prize_Money;
    private RadioGroup Q11_Answers;
    private RadioButton A11_A, A11_B, A11_C, A11_D, Q11_Pick;
    private int Q11_Answer_Setup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        Objects.requireNonNull(getSupportActionBar()).hide(); //hide the title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_question11);
        Q11_Prize_Money = findViewById(R.id.Q11_SCORE);
        Q11_Answers = findViewById(R.id.Q11_ANSWERS);
        A11_A = findViewById(R.id.A11_A);
        A11_B = findViewById(R.id.A11_B);
        A11_C = findViewById(R.id.A11_C);
        A11_D = findViewById(R.id.A11_D);
        Q11_Answer_Button = findViewById(R.id.Q11_answer_button);
        Q11_Withdraw_Button = findViewById(R.id.Q11_withdraw_button);
        //To indicate the current Activity
        LogIn.current_question = 11;
        LogIn.app_data(Question11.this).edit().putInt("current question", LogIn.current_question).apply();
        //To display the score as US dollars
        Q11_PRIZE_DISPLAY_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
        Q11_PRIZE_DISPLAY_FORMAT.setCurrency(Currency.getInstance("USD"));
        Q11_Prize_Money.setText(Q11_PRIZE_DISPLAY_FORMAT.format(LogIn.current_prize).replaceFirst(".00$", ""));
        //To randomized the location of the answers
        Q11_Answer_Setup = ThreadLocalRandom.current().nextInt(1,25);
        switch (Q11_Answer_Setup){
            case 1:
                A11_A.setText(R.string.A11_A);
                A11_B.setText(R.string.A11_B);
                A11_C.setText(R.string.A11_C);
                A11_D.setText(R.string.A11_D);
                break;
            case 2:
                A11_A.setText(R.string.A11_B);
                A11_B.setText(R.string.A11_A);
                A11_C.setText(R.string.A11_C);
                A11_D.setText(R.string.A11_D);
                break;
            case 3:
                A11_A.setText(R.string.A11_B);
                A11_B.setText(R.string.A11_C);
                A11_C.setText(R.string.A11_A);
                A11_D.setText(R.string.A11_D);
                break;
            case 4:
                A11_A.setText(R.string.A11_B);
                A11_B.setText(R.string.A11_C);
                A11_C.setText(R.string.A11_D);
                A11_D.setText(R.string.A11_A);
                break;
            case 5:
                A11_A.setText(R.string.A11_A);
                A11_B.setText(R.string.A11_C);
                A11_C.setText(R.string.A11_B);
                A11_D.setText(R.string.A11_D);
                break;
            case 6:
                A11_A.setText(R.string.A11_C);
                A11_B.setText(R.string.A11_A);
                A11_C.setText(R.string.A11_B);
                A11_D.setText(R.string.A11_D);
                break;
            case 7:
                A11_A.setText(R.string.A11_C);
                A11_B.setText(R.string.A11_B);
                A11_C.setText(R.string.A11_A);
                A11_D.setText(R.string.A11_D);
                break;
            case 8:
                A11_A.setText(R.string.A11_C);
                A11_B.setText(R.string.A11_B);
                A11_C.setText(R.string.A11_D);
                A11_D.setText(R.string.A11_A);
                break;
            case 9:
                A11_A.setText(R.string.A11_A);
                A11_B.setText(R.string.A11_C);
                A11_C.setText(R.string.A11_D);
                A11_D.setText(R.string.A11_B);
                break;
            case 10:
                A11_A.setText(R.string.A11_C);
                A11_B.setText(R.string.A11_A);
                A11_C.setText(R.string.A11_D);
                A11_D.setText(R.string.A11_B);
                break;
            case 11:
                A11_A.setText(R.string.A11_C);
                A11_B.setText(R.string.A11_D);
                A11_C.setText(R.string.A11_A);
                A11_D.setText(R.string.A11_B);
                break;
            case 12:
                A11_A.setText(R.string.A11_C);
                A11_B.setText(R.string.A11_D);
                A11_C.setText(R.string.A11_B);
                A11_D.setText(R.string.A11_A);
                break;
            case 13:
                A11_A.setText(R.string.A11_A);
                A11_B.setText(R.string.A11_D);
                A11_C.setText(R.string.A11_C);
                A11_D.setText(R.string.A11_B);
                break;
            case 14:
                A11_A.setText(R.string.A11_D);
                A11_B.setText(R.string.A11_A);
                A11_C.setText(R.string.A11_C);
                A11_D.setText(R.string.A11_B);
                break;
            case 15:
                A11_A.setText(R.string.A11_D);
                A11_B.setText(R.string.A11_C);
                A11_C.setText(R.string.A11_A);
                A11_D.setText(R.string.A11_B);
                break;
            case 16:
                A11_A.setText(R.string.A11_D);
                A11_B.setText(R.string.A11_C);
                A11_C.setText(R.string.A11_B);
                A11_D.setText(R.string.A11_A);
                break;
            case 17:
                A11_A.setText(R.string.A11_A);
                A11_B.setText(R.string.A11_B);
                A11_C.setText(R.string.A11_D);
                A11_D.setText(R.string.A11_C);
                break;
            case 18:
                A11_A.setText(R.string.A11_B);
                A11_B.setText(R.string.A11_A);
                A11_C.setText(R.string.A11_D);
                A11_D.setText(R.string.A11_C);
                break;
            case 19:
                A11_A.setText(R.string.A11_B);
                A11_B.setText(R.string.A11_D);
                A11_C.setText(R.string.A11_A);
                A11_D.setText(R.string.A11_C);
                break;
            case 20:
                A11_A.setText(R.string.A11_B);
                A11_B.setText(R.string.A11_D);
                A11_C.setText(R.string.A11_C);
                A11_D.setText(R.string.A11_A);
                break;
            case 21:
                A11_A.setText(R.string.A11_A);
                A11_B.setText(R.string.A11_D);
                A11_C.setText(R.string.A11_B);
                A11_D.setText(R.string.A11_C);
                break;
            case 22:
                A11_A.setText(R.string.A11_D);
                A11_B.setText(R.string.A11_A);
                A11_C.setText(R.string.A11_B);
                A11_D.setText(R.string.A11_C);
                break;
            case 23:
                A11_A.setText(R.string.A11_D);
                A11_B.setText(R.string.A11_B);
                A11_C.setText(R.string.A11_A);
                A11_D.setText(R.string.A11_C);
                break;
            case 24:
                A11_A.setText(R.string.A11_D);
                A11_B.setText(R.string.A11_B);
                A11_C.setText(R.string.A11_C);
                A11_D.setText(R.string.A11_A);
                break;
        }
        //To provide a positive or negative outcome once the user has chosen the answer
        Q11_Answer_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q11_Pick = findViewById(Q11_Answers.getCheckedRadioButtonId());
                if (Q11_Pick == null){
                    Toast.makeText(Question11.this, "You did not pick any answer!", Toast.LENGTH_SHORT).show();
                }
                else if (Q11_Pick.getText().toString().equals(getString(R.string.A11_A))){
                    LogIn.current_prize = 64000;
                    LogIn.app_data(Question11.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question11.this, "That was correct!", Toast.LENGTH_SHORT).show();
                    Intent to_question3 = new Intent(Question11.this, Question12.class);
                    startActivity(to_question3);
                }
                else {
                    LogIn.current_prize = 32000;
                    LogIn.app_data(Question11.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question11.this, "That was incorrect!", Toast.LENGTH_SHORT).show();
                    Intent to_loser = new Intent(Question11.this, Loser.class);
                    startActivity(to_loser);
                }
            }
        });
        //To provide the player the option to safely quit the game
        Q11_Withdraw_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q11_ALERT = new AlertDialog.Builder(Question11.this);
                Q11_ALERT.setTitle("WITHDRAW");
                Q11_ALERT.setMessage("Are you sure you want to quit and keep your earned prize?");
                Q11_ALERT.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Q11_ALERT_CONTROL.cancel();
                    }
                });
                Q11_ALERT.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent to_winner = new Intent(Question11.this, Winner.class);
                        startActivity(to_winner);
                    }
                });
                Q11_ALERT_CONTROL = Q11_ALERT.create();
                Q11_ALERT_CONTROL.show();
            }
        });
    }
}