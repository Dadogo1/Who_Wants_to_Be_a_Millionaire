package com.example.whowantstobeamillionaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.SortedMap;
import java.util.TreeMap;

public class SplashScreen extends AppCompatActivity {
    private Intent to_current_question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        Objects.requireNonNull(getSupportActionBar()).hide(); //hide the title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_splash_screen);
        //To initiate the splash screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //This will bring any data that was saved back into the app and if the user was present in the quiz, the app bring them back where they left off
                LogIn.players = LogIn.portable_data.fromJson(LogIn.app_data(SplashScreen.this).getString("players", String.valueOf(LogIn.portable_data.toJson(LogIn.players))), new TypeToken<HashMap<String,Integer>>(){}.getType());
                if (LogIn.app_data(SplashScreen.this).getString("current player", null) == null){
                    Intent to_login = new Intent(SplashScreen.this, LogIn.class);
                    startActivity(to_login);
                }
                else {
                    LogIn.current_prize = LogIn.app_data(SplashScreen.this).getInt("current prize", 0);
                    LogIn.current_question = LogIn.app_data(SplashScreen.this).getInt("current question", 0);
                    LogIn.current_player = LogIn.app_data(SplashScreen.this).getString("current player", null);
                    switch (LogIn.current_question){
                        case 1:
                            to_current_question = new Intent(SplashScreen.this, Question1.class);
                            startActivity(to_current_question);
                            break;
                        case 2:
                            to_current_question = new Intent(SplashScreen.this, Question2.class);
                            startActivity(to_current_question);
                            break;
                        case 3:
                            to_current_question = new Intent(SplashScreen.this, Question3.class);
                            startActivity(to_current_question);
                            break;
                        case 4:
                            to_current_question = new Intent(SplashScreen.this, Question4.class);
                            startActivity(to_current_question);
                            break;
                        case 5:
                            to_current_question = new Intent(SplashScreen.this, Question5.class);
                            startActivity(to_current_question);
                            break;
                        case 6:
                            to_current_question = new Intent(SplashScreen.this, Question6.class);
                            startActivity(to_current_question);
                            break;
                        case 7:
                            to_current_question = new Intent(SplashScreen.this, Question7.class);
                            startActivity(to_current_question);
                            break;
                        case 8:
                            to_current_question = new Intent(SplashScreen.this, Question8.class);
                            startActivity(to_current_question);
                            break;
                        case 9:
                            to_current_question = new Intent(SplashScreen.this, Question9.class);
                            startActivity(to_current_question);
                            break;
                        case 10:
                            to_current_question = new Intent(SplashScreen.this, Question10.class);
                            startActivity(to_current_question);
                            break;
                        case 11:
                            to_current_question = new Intent(SplashScreen.this, Question11.class);
                            startActivity(to_current_question);
                            break;
                        case 12:
                            to_current_question = new Intent(SplashScreen.this, Question12.class);
                            startActivity(to_current_question);
                            break;
                        case 13:
                            to_current_question = new Intent(SplashScreen.this, Question13.class);
                            startActivity(to_current_question);
                            break;
                        case 14:
                            to_current_question = new Intent(SplashScreen.this, Question14.class);
                            startActivity(to_current_question);
                            break;
                        case 15:
                            to_current_question = new Intent(SplashScreen.this, Question15.class);
                            startActivity(to_current_question);
                            break;
                        case 16:
                            to_current_question = new Intent(SplashScreen.this, Loser.class);
                            startActivity(to_current_question);
                            break;
                        case 17:
                            to_current_question = new Intent(SplashScreen.this, Winner.class);
                            startActivity(to_current_question);
                            break;
                    }
                }
                finish();
            }
        }, 3000);
    }
}