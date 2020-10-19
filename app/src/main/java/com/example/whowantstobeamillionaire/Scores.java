package com.example.whowantstobeamillionaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Comparator;
import java.util.Currency;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public class Scores extends AppCompatActivity {
    private java.text.NumberFormat SCORES_PRIZE_DISPLAY_FORMAT;
    private Button return_button;
    private TextView score_board;
    private String score_data = "";
    private LinkedHashMap<String,Integer> ordered_players = new LinkedHashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        Objects.requireNonNull(getSupportActionBar()).hide(); //hide the title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_scores);
        return_button = findViewById(R.id.return_button);
        score_board = findViewById(R.id.score_list);
        //To display the score as US dollars
        SCORES_PRIZE_DISPLAY_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
        SCORES_PRIZE_DISPLAY_FORMAT.setCurrency(Currency.getInstance("USD"));
        //To transfer content from the original HashMap to the LinkedHashMap to change the order based
        LogIn.players.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> ordered_players.put(x.getKey(), x.getValue()));
        for (Map.Entry<String,Integer> entry : ordered_players.entrySet()){
            score_data += entry.getKey() + ": " + SCORES_PRIZE_DISPLAY_FORMAT.format(entry.getValue()).replaceFirst(".00$", "") + "\n\n";
        }
        score_board.setText(score_data);
        return_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ordered_players.clear();
                Intent to_log_in = new Intent(Scores.this, LogIn.class);
                startActivity(to_log_in);
            }
        });
    }
}