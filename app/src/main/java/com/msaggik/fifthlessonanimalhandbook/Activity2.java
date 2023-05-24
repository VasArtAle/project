package com.msaggik.fifthlessonanimalhandbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    // создание полей
    private ImageButton imageButton;
    private ImageButton imageButton2;
    private ImageButton imageButton3;
    private ImageButton imageButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ii);

        // присваивание id полям
        imageButton = findViewById(R.id.imageButton);
        imageButton2 = findViewById(R.id.imageButton2);
        imageButton3 = findViewById(R.id.imageButton3);
        imageButton4 = findViewById(R.id.imageButton4);

        // обработка нажатия кнопки
        imageButton.setOnClickListener(listener);
        imageButton2.setOnClickListener(listener2);
        imageButton3.setOnClickListener(listener3);
        imageButton4.setOnClickListener(listener4);
    }

    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // переключение на новую активность
            Intent intent = new Intent(getApplicationContext(), Activity3.class);
            startActivity(intent);

        }
    };

    // создание слушателя
    private View.OnClickListener listener2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // переключение на новую активность
            Intent intent = new Intent(getApplicationContext(), Activity4.class);
            startActivity(intent);
        }
    };

    // создание слушателя
    private View.OnClickListener listener3 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // переключение на новую активность
            Intent intent = new Intent(getApplicationContext(), Activity5.class);
            startActivity(intent);
        }
    };

    // создание слушателя
    private View.OnClickListener listener4 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // переключение на новую активность
            Intent intent = new Intent(getApplicationContext(), Activity6.class);
            startActivity(intent);
        }
    };
}