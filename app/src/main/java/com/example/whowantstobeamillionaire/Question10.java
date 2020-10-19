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

public class Question10 extends AppCompatActivity {
    private java.text.NumberFormat Q10_PRIZE_DISPLAY_FORMAT;
    private AlertDialog.Builder Q10_ALERT;
    private AlertDialog Q10_ALERT_CONTROL;
    private Button Q10_Answer_Button, Q10_Withdraw_Button;
    private TextView Q10_Prize_Money;
    private RadioGroup Q10_Answers;
    private RadioButton A10_A, A10_B, A10_C, A10_D, Q10_Pick;
    private int Q10_Answer_Setup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        Objects.requireNonNull(getSupportActionBar()).hide(); //hide the title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_question10);
        Q10_Prize_Money = findViewById(R.id.Q10_SCORE);
        Q10_Answers = findViewById(R.id.Q10_ANSWERS);
        A10_A = findViewById(R.id.A10_A);
        A10_B = findViewById(R.id.A10_B);
        A10_C = findViewById(R.id.A10_C);
        A10_D = findViewById(R.id.A10_D);
        Q10_Answer_Button = findViewById(R.id.Q10_answer_button);
        Q10_Withdraw_Button = findViewById(R.id.Q10_withdraw_button);
        //To indicate the current Activity
        LogIn.current_question = 10;
        LogIn.app_data(Question10.this).edit().putInt("current question", LogIn.current_question).apply();
        //To display the score as US dollars
        Q10_PRIZE_DISPLAY_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
        Q10_PRIZE_DISPLAY_FORMAT.setCurrency(Currency.getInstance("USD"));
        Q10_Prize_Money.setText(Q10_PRIZE_DISPLAY_FORMAT.format(LogIn.current_prize).replaceFirst(".00$", ""));
        //To randomized the location of the answers
        Q10_Answer_Setup = ThreadLocalRandom.current().nextInt(1,25);
        switch (Q10_Answer_Setup){
            case 1:
                A10_A.setText(R.string.A10_A);
                A10_B.setText(R.string.A10_B);
                A10_C.setText(R.string.A10_C);
                A10_D.setText(R.string.A10_D);
                break;
            case 2:
                A10_A.setText(R.string.A10_B);
                A10_B.setText(R.string.A10_A);
                A10_C.setText(R.string.A10_C);
                A10_D.setText(R.string.A10_D);
                break;
            case 3:
                A10_A.setText(R.string.A10_B);
                A10_B.setText(R.string.A10_C);
                A10_C.setText(R.string.A10_A);
                A10_D.setText(R.string.A10_D);
                break;
            case 4:
                A10_A.setText(R.string.A10_B);
                A10_B.setText(R.string.A10_C);
                A10_C.setText(R.string.A10_D);
                A10_D.setText(R.string.A10_A);
                break;
            case 5:
                A10_A.setText(R.string.A10_A);
                A10_B.setText(R.string.A10_C);
                A10_C.setText(R.string.A10_B);
                A10_D.setText(R.string.A10_D);
                break;
            case 6:
                A10_A.setText(R.string.A10_C);
                A10_B.setText(R.string.A10_A);
                A10_C.setText(R.string.A10_B);
                A10_D.setText(R.string.A10_D);
                break;
            case 7:
                A10_A.setText(R.string.A10_C);
                A10_B.setText(R.string.A10_B);
                A10_C.setText(R.string.A10_A);
                A10_D.setText(R.string.A10_D);
                break;
            case 8:
                A10_A.setText(R.string.A10_C);
                A10_B.setText(R.string.A10_B);
                A10_C.setText(R.string.A10_D);
                A10_D.setText(R.string.A10_A);
                break;
            case 9:
                A10_A.setText(R.string.A10_A);
                A10_B.setText(R.string.A10_C);
                A10_C.setText(R.string.A10_D);
                A10_D.setText(R.string.A10_B);
                break;
            case 10:
                A10_A.setText(R.string.A10_C);
                A10_B.setText(R.string.A10_A);
                A10_C.setText(R.string.A10_D);
                A10_D.setText(R.string.A10_B);
                break;
            case 11:
                A10_A.setText(R.string.A10_C);
                A10_B.setText(R.string.A10_D);
                A10_C.setText(R.string.A10_A);
                A10_D.setText(R.string.A10_B);
                break;
            case 12:
                A10_A.setText(R.string.A10_C);
                A10_B.setText(R.string.A10_D);
                A10_C.setText(R.string.A10_B);
                A10_D.setText(R.string.A10_A);
                break;
            case 13:
                A10_A.setText(R.string.A10_A);
                A10_B.setText(R.string.A10_D);
                A10_C.setText(R.string.A10_C);
                A10_D.setText(R.string.A10_B);
                break;
            case 14:
                A10_A.setText(R.string.A10_D);
                A10_B.setText(R.string.A10_A);
                A10_C.setText(R.string.A10_C);
                A10_D.setText(R.string.A10_B);
                break;
            case 15:
                A10_A.setText(R.string.A10_D);
                A10_B.setText(R.string.A10_C);
                A10_C.setText(R.string.A10_A);
                A10_D.setText(R.string.A10_B);
                break;
            case 16:
                A10_A.setText(R.string.A10_D);
                A10_B.setText(R.string.A10_C);
                A10_C.setText(R.string.A10_B);
                A10_D.setText(R.string.A10_A);
                break;
            case 17:
                A10_A.setText(R.string.A10_A);
                A10_B.setText(R.string.A10_B);
                A10_C.setText(R.string.A10_D);
                A10_D.setText(R.string.A10_C);
                break;
            case 18:
                A10_A.setText(R.string.A10_B);
                A10_B.setText(R.string.A10_A);
                A10_C.setText(R.string.A10_D);
                A10_D.setText(R.string.A10_C);
                break;
            case 19:
                A10_A.setText(R.string.A10_B);
                A10_B.setText(R.string.A10_D);
                A10_C.setText(R.string.A10_A);
                A10_D.setText(R.string.A10_C);
                break;
            case 20:
                A10_A.setText(R.string.A10_B);
                A10_B.setText(R.string.A10_D);
                A10_C.setText(R.string.A10_C);
                A10_D.setText(R.string.A10_A);
                break;
            case 21:
                A10_A.setText(R.string.A10_A);
                A10_B.setText(R.string.A10_D);
                A10_C.setText(R.string.A10_B);
                A10_D.setText(R.string.A10_C);
                break;
            case 22:
                A10_A.setText(R.string.A10_D);
                A10_B.setText(R.string.A10_A);
                A10_C.setText(R.string.A10_B);
                A10_D.setText(R.string.A10_C);
                break;
            case 23:
                A10_A.setText(R.string.A10_D);
                A10_B.setText(R.string.A10_B);
                A10_C.setText(R.string.A10_A);
                A10_D.setText(R.string.A10_C);
                break;
            case 24:
                A10_A.setText(R.string.A10_D);
                A10_B.setText(R.string.A10_B);
                A10_C.setText(R.string.A10_C);
                A10_D.setText(R.string.A10_A);
                break;
        }
        //To provide a positive or negative outcome once the user has chosen the answer
        Q10_Answer_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q10_Pick = findViewById(Q10_Answers.getCheckedRadioButtonId());
                if (Q10_Pick == null){
                    Toast.makeText(Question10.this, "You did not pick any answer!", Toast.LENGTH_SHORT).show();
                }
                else if (Q10_Pick.getText().toString().equals(getString(R.string.A10_A))){
                    LogIn.current_prize = 32000;
                    LogIn.app_data(Question10.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question10.this, "That was correct!", Toast.LENGTH_SHORT).show();
                    Intent to_question3 = new Intent(Question10.this, Question11.class);
                    startActivity(to_question3);
                }
                else {
                    LogIn.current_prize = 1000;
                    LogIn.app_data(Question10.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question10.this, "That was incorrect!", Toast.LENGTH_SHORT).show();
                    Intent to_loser = new Intent(Question10.this, Loser.class);
                    startActivity(to_loser);
                }
            }
        });
        //To provide the player the option to safely quit the game
        Q10_Withdraw_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q10_ALERT = new AlertDialog.Builder(Question10.this);
                Q10_ALERT.setTitle("WITHDRAW");
                Q10_ALERT.setMessage("Are you sure you want to quit and keep your earned prize?");
                Q10_ALERT.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Q10_ALERT_CONTROL.cancel();
                    }
                });
                Q10_ALERT.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent to_winner = new Intent(Question10.this, Winner.class);
                        startActivity(to_winner);
                    }
                });
                Q10_ALERT_CONTROL = Q10_ALERT.create();
                Q10_ALERT_CONTROL.show();
            }
        });
    }
}