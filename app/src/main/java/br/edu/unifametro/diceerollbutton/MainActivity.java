package br.edu.unifametro.diceerollbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button roolButton =  findViewById(R.id.rollButton);

        final ImageView leftDice = findViewById(R.id.image_leftDice);
        final ImageView rightDice = findViewById(R.id.image_rightDice);

        /*o evento ira sortea uma imagem para cada dado*/
        final  int [] diceeArray = { //final torna o array constante
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        roolButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random numberRandom = new Random();
                int number = numberRandom.nextInt(6); //aleatório [0,5];
                leftDice.setImageResource(diceeArray[number]);
                number = numberRandom.nextInt(6);
                rightDice.setImageResource(diceeArray[number]);
            }

        });

        Toast.makeText(MainActivity.this, "Bem Vindo e Boa Sorte", Toast.LENGTH_SHORT). show();


    }
}