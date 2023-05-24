package com.msaggik.fifthlessonanimalhandbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Activity4 extends AppCompatActivity {

    // создание коллекции контейнера для данных класса
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iiii);

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
        animals.add( new Animal("Сирень обыкновенная", "Эта сирень встречается повсеместно. В высоту кустарник вырастает до 5 м, а в ширину – до 2 м. Цветение наблюдается в мае.",
                R.drawable.images1, ""));
        animals.add( new Animal("Сирень амурская", "Если не обрезать куст, он может вырасти в высоту до 10 м и в ширину до 5 м. Сирень амурская зацветает позже других видов (в июне-июле).",
                R.drawable.images2, ""));
        animals.add( new Animal("Сирень венгерская", "Этот густоветвистый кустарник (высотой и шириной 3-4 м) отличается крупными листьями и лилово-розовыми рыхлыми соцветиями-метелками с приятным ароматом.",
                R.drawable.images3, ""));
        animals.add( new Animal("Сирень персидская", "Эта сирень очень похожа на обыкновенную и венгерскую. Она тоже неприхотлива, выдерживает засуху, но в суровые зимы может подмерзать.",
                R.drawable.images4, ""));
        animals.add( new Animal("Сирень гиацинтоцветная", "Это гибрид сирени обыкновенной и широколистной. Растение цветет рано – в начале мая. Листья кустарников некоторых сортов (например, Declaration) осенью приобретают пурпурную окраску.",
                R.drawable.images5, ""));
    }
}