package com.example.parouimpar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        int opcaousuario;
        public void opcaozero(View view) {opcaousuario=0;}
        public void opcaoum(View view) {opcaousuario=1;}
        public void opcaodois(View view) {opcaousuario=2;}
        public void opcaotres(View view) {opcaousuario=3;}
        public void opcaoquatro(View view) {opcaousuario=4;}
        public void opcaocinco(View view) {opcaousuario=5;}

        public void opcaopar(View view){
            int num = new Random().nextInt(6 );
            ImageView imagem = findViewById(R.id.imageView);
            switch (num){
                case 0:
                    imagem.setImageResource(R.drawable.zero);
                    break;
                case 1:
                    imagem.setImageResource(R.drawable.um);
                    break;
                case 2:
                    imagem.setImageResource(R.drawable.dois);
                    break;
                case 3:
                    imagem.setImageResource(R.drawable.tres);
                    break;
                case 4:
                    imagem.setImageResource(R.drawable.quatro);
                    break;
                case 5:
                    imagem.setImageResource(R.drawable.cinco);
                    break;
            }

            int n = opcaousuario+num;
                int resultado = n%2;
                TextView tx = findViewById(R.id.textView3);

                    if(resultado==0){
                    tx.setText("GANHOU");
                    }
                    else{
                    tx.setText("PERDEU");
                    }

    }

        public void opcaoimpar(View view){
            int num = new Random().nextInt(6 );
            ImageView imagem = findViewById(R.id.imageView);
            switch (num) {
                case 0:
                    imagem.setImageResource(R.drawable.zero);
                    break;
                case 1:
                    imagem.setImageResource(R.drawable.um);
                    break;
                case 2:
                    imagem.setImageResource(R.drawable.dois);
                    break;
                case 3:
                    imagem.setImageResource(R.drawable.tres);
                    break;
                case 4:
                    imagem.setImageResource(R.drawable.quatro);
                    break;
                case 5:
                    imagem.setImageResource(R.drawable.cinco);
                    break;
            }

            int n = opcaousuario+num;
            int resultado = n%2;
            TextView tx = findViewById(R.id.textView3);

            if(resultado>0){
                tx.setText("GANHOU");
            }
            else{
                tx.setText("PERDEU");
            }
        }
}

//Nome: Flavio Alison Simas Lopes