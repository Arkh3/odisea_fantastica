package com.example.odiseafantastica;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Partida extends Activity{

    private int turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        turn = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.partida);
        nextTurn();
    }

    public void buttonNext(View vista){
        nextTurn();
    }

    public void nextTurn(){

        Random generator = new Random();

        int dist_s_abascal = generator.nextInt(6) + 1;
        int dist_griffith = generator.nextInt(6) + 1;
        int dist_patrick = generator.nextInt(6) + 1;
        int dist_elon = generator.nextInt(6) + 1;
        int dist_vader = generator.nextInt(6) + 1;

        int dir_s_abascal = generator.nextInt(2);
        int dir_griffith = generator.nextInt(2);
        int dir_patrick = generator.nextInt(2);
        int dir_elon = generator.nextInt(2);
        int dir_vader = generator.nextInt(2);

        ++turn;

        TextView textTurn = (TextView)findViewById(R.id.turn);
        textTurn.setText("Turno: " + turn);

        String distBase = "Distancia: ";
        String dirBase = "Dirección: ";
        String[] directions = new String[] {"Clockwise", "Counter clockwise"};

        //abascal
        TextView textAbascalDir = (TextView)findViewById(R.id.s_abascal_dir);
        textAbascalDir.setText(distBase + directions[dir_s_abascal]);
        TextView textAbascalDist = (TextView)findViewById(R.id.s_abascal_dist);
        textAbascalDist.setText(distBase + dist_s_abascal);

        //griffith
        TextView textGriffithDir = (TextView)findViewById(R.id.griffith_dir);
        textGriffithDir.setText(distBase + directions[dir_griffith]);
        TextView textGriffithDist = (TextView)findViewById(R.id.griffith_dist);
        textGriffithDist.setText(distBase + dist_griffith);

        //patrick
        TextView textPatrickDir = (TextView)findViewById(R.id.patrick_dir);
        textPatrickDir.setText(distBase + directions[dir_patrick]);
        TextView textPatrickDist = (TextView)findViewById(R.id.patrick_dist);
        textPatrickDist.setText(distBase + dist_patrick);

        //elon
        TextView textElonDir = (TextView)findViewById(R.id.elon_dir);
        textElonDir.setText(distBase + directions[dir_elon]);
        TextView textElonDist = (TextView)findViewById(R.id.elon_dist);
        textElonDist.setText(distBase + dist_elon);

        //vader
        TextView textVaderDir = (TextView)findViewById(R.id.vader_dir);
        textVaderDir.setText(distBase + directions[dir_vader]);
        TextView textVaderDist = (TextView)findViewById(R.id.vader_dist);
        textVaderDist.setText(distBase + dist_vader);
    }

    public void finish(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
