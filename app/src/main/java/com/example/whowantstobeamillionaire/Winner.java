package com.example.whowantstobeamillionaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Objects;

public class Winner extends AppCompatActivity {
    private java.text.NumberFormat WINNER_PRIZE_DISPLAY_FORMAT;
    private Button winner_finish_button;
    private TextView winner_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        Objects.requireNonNull(getSupportActionBar()).hide(); //hide the title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_winner);
        //To indicate the current Activity
        LogIn.current_question = 17;
        LogIn.app_data(Winner.this).edit().putInt("current question", LogIn.current_question).apply();
        winner_finish_button = findViewById(R.id.winner_finish_button);
        winner_score = findViewById(R.id.WINNER_SCORE);
        //To display the score as US dollars
        WINNER_PRIZE_DISPLAY_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
        WINNER_PRIZE_DISPLAY_FORMAT.setCurrency(Currency.getInstance("USD"));
        winner_score.setText(WINNER_PRIZE_DISPLAY_FORMAT.format(LogIn.current_prize).replaceFirst(".00$", ""));
        //Reset all variables and save the HashMap to SharedPreferences
        winner_finish_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogIn.players.put(LogIn.current_player, LogIn.current_prize);
                LogIn.app_data(Winner.this).edit().putString("players", LogIn.portable_data.toJson(LogIn.players)).apply();
                LogIn.app_data(Winner.this).edit().putString("current player", null).apply();
                LogIn.app_data(Winner.this).edit().putInt("current question", 0).apply();
                LogIn.app_data(Winner.this).edit().putInt("current prize", 0).apply();
                LogIn.current_prize = 0;
                LogIn.current_question = 0;
                LogIn.current_player = null;
                Intent to_log_in = new Intent(Winner.this, LogIn.class);
                startActivity(to_log_in);
            }
        });
    }
}