package com.example.kbc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int qn_num=1;
    String[] opt_A = {"A) Antarctic Blue Whale","A) Dolphin","A) 4","A) Iron","a) 20 March","a) Thomas Alva Edison","A) 3","A) Andhra Pradesh","A) Vikram Ambalal","A) Junko Tabei"};
    String[] opt_B = {"B) Tiger","B) Normal Fish","B) 2","b) Nickel","b) 22 April","b) Neils Bohr","B) 4","B) Bihar","B) Ravish Malhotra","B) Reinhold Messner"};
    String[] opt_C = {"C) Elephant","C) Stone Fish","C) 6","c) Cadmium","c) 5 June","c) Alfred Nobel","C) 5","C) Madhya Pradesh","C) Rakesh Sharma","C) Peter Habeler"};
    String[] opt_D = {"D) Giraffe","D) Star Fish","D) 5","d) Silicon","d) 24 September","d) Marie Curie","D) 6","D) Uttar Pradesh","D) Nagapathi Bhat","D) Phu Dorji"};
    int[] answer = {0,1,3,3,4,2,3,3,4,3,4};
    int points = 0;
    int inc=100;
    public void play(View view){
        Button btn = (Button) view;
        TextView qn = (TextView) findViewById(R.id.qn);
        TextView score = (TextView) findViewById(R.id.score);
        Button btn1 = (Button) findViewById(R.id.b1);
        Button btn2 = (Button) findViewById(R.id.b2);
        Button btn3 = (Button) findViewById(R.id.b3);
        Button btn4 = (Button) findViewById(R.id.b4);
        Button play = (Button) findViewById(R.id.play);
        play.setVisibility(View.INVISIBLE);
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.VISIBLE);
        score.setText("");
        if(Integer.parseInt(String.valueOf(btn.getTag()))==answer[qn_num-1] && qn_num != 1){
            Log.i("das","asd");
            points+=inc*(qn_num-1);
        }
        Log.i("score", String.valueOf(points));
        if(qn_num==1){
            qn.setText("1. Which is the largest animal in the world ?");
        }else if(qn_num==2){
            qn.setText("2. Which Is The Most Poisonous Fish In The World ?");
        }else if(qn_num==3){
            qn.setText("3. How Many Legs Does A Mosquito Have ?");
        }else if(qn_num==4){
            qn.setText("4. ________ is the second most abundant element found on earth’s crust.");
        }else if(qn_num==5){
            qn.setText("5. When is earth day observed?");
        }else if(qn_num==6){
            qn.setText("6. ________ is the famous scientist from Sweden, known as the inventor of dynamite.");
        }else if(qn_num==7){
            qn.setText("7.Hurricanes are divided into how many categories?");
        }else if(qn_num==8){
            qn.setText("8. Which of the following Indian state touches the boundaries of the maximum number of other States?");
        }else if(qn_num==9){
            qn.setText("9. Who was the first Indian in space?");
        }else if(qn_num==10){
            qn.setText("10. Who was the first Man to Climb Mount Everest Without Oxygen?");
        }else if(qn_num>10){
            play.setVisibility(View.VISIBLE);
            play.setText("play again");
            qn.setText("");
            btn1.setVisibility(View.INVISIBLE);
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            qn_num=1;
            score.setText("POINTS SCORED :"+points+"\n"+"Solution :\n"+"1.A\n"+"2.C\n"+"3.C\n"+"4.D\n"+"5.B\n"+"6.C\n"+"7.C\n"+"8.D\n"+"9.C\n"+"10.D");
            points=0;
            return;
        }
        if (qn_num <= 10) {
            btn1.setText(opt_A[qn_num-1]);
            btn2.setText(opt_B[qn_num-1]);
            btn3.setText(opt_C[qn_num-1]);
            btn4.setText(opt_D[qn_num-1]);
            qn_num++;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}