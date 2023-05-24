package com.msaggik.fifthlessonanimalhandbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Activity5 extends AppCompatActivity {

    // создание коллекции контейнера для данных класса
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iiiii);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        AnimalAdapter adapter = new AnimalAdapter(this, animals);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности
        animals.add( new Animal("Пионы европейские", "Растения с махровыми цветками и плотными крупными листьями. Бутоны могут быть самых разных оттенков: от бледно-розового до пурпурного.",
                R.drawable.images_1, ""));
        animals.add( new Animal("Пионы японские", "Махровые и полумахровые пионы со средними бутонами. Они морозоустойчивы, поэтому хорошо растут даже в сложных климатических условиях.",
                R.drawable.images_2, ""));
        animals.add( new Animal("Пион уклоняющийся", "Растения с толстыми стеблями и крупными одиночными цветками. Бутоны чаще всего ярко-розовые, могут достигать 13 см в диаметре.",
                R.drawable.images_3, ""));
        animals.add( new Animal("Пион лекарственный", "Изначально это растение выращивали в лечебных целях. Однако благодаря своим декоративным качествам цветок перекочевал с лекарственной грядки в цветники и клумбы.",
                R.drawable.images_4, ""));
        animals.add( new Animal("Пион узколистный", "Это растение будет хорошо смотреться в одиночных посадках и на открытых склонах. Цветки у пиона не слишком крупные – до 6-8 см в диаметре.",
                R.drawable.images_5, ""));
    }
}