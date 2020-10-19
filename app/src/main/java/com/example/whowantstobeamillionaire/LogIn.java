package com.example.whowantstobeamillionaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class LogIn extends AppCompatActivity {
    private EditText input_first_name, input_last_name;
    private Button start, score;
    public static SharedPreferences app_data (Context ct){
        return ct.getSharedPreferences("quiz app", Context.MODE_PRIVATE);
    };
    public static Gson portable_data = new Gson();
    public static HashMap<String,Integer> players = new HashMap<>();
    public static String current_player;
    public static int current_prize, current_question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        Objects.requireNonNull(getSupportActionBar()).hide(); //hide the title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_log_in);
        input_first_name = findViewById(R.id.first_name_field);
        input_last_name = findViewById(R.id.last_name_field);
        start = findViewById(R.id.start_button);
        score = findViewById(R.id.score_button);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //To check if the formatting of the first name is incorrect
                if (input_first_name.getText().toString().isEmpty()){
                    input_first_name.setError("First name field should not be empty!");
                }
                else if (!Pattern.compile("^[A-Z][a-z]{2,9}$").matcher(input_first_name.getText().toString()).matches()){
                    input_first_name.setError("First name requires 3 or more characters and must start with a capital letter follow by a series of lower case letters! MAX CHARACTERS: 10");
                }
                //To check if the formatting of the last name is incorrect
                if (input_last_name.getText().toString().isEmpty()){
                    input_last_name.setError("Last name field should not be empty!");
                }
                else if (!Pattern.compile("^[A-Z][a-z]{2,9}$").matcher(input_last_name.getText().toString()).matches()){
                    input_last_name.setError("Last name requires 3 or more characters and must start with a capital letter follow by a series of lower case letters! MAX CHARACTERS: 10");
                }
                if (Pattern.compile("^[A-Z][a-z]{2,9}$").matcher(input_first_name.getText().toString()).matches() && Pattern.compile("^[A-Z][a-z]{2,9}$").matcher(input_last_name.getText().toString()).matches()){
                    current_player = input_first_name.getText().toString() + " " + input_last_name.getText().toString();
                    app_data(LogIn.this).edit().putString("current player", current_player).apply();
                    Toast.makeText(LogIn.this, "Welcome " + current_player, Toast.LENGTH_SHORT).show();
                    Intent to_q1 = new Intent(LogIn.this, Question1.class);
                    startActivity(to_q1);
                }
            }
        });
        score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent to_scores = new Intent(LogIn.this, Scores.class);
                startActivity(to_scores);
            }
        });
    }
}