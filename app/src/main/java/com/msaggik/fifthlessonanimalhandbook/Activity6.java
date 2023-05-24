package com.msaggik.fifthlessonanimalhandbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Activity6 extends AppCompatActivity {

    // создание коллекции контейнера для данных класса
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iiiiii);

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
        animals.add(new Animal("Азиатские лилии", "Цветки обладают чашевидной формой и могут быть украшены белыми, желтыми, оранжевыми, розовыми или бордовыми лепестками.",
                R.drawable.obzor1, ""));
        animals.add(new Animal("Кандидум", "В целом это довольно капризные сорта, которые требуют к себе повышенного внимания.",
                R.drawable.obzor2, ""));
        animals.add(new Animal("Длинноцветковые лилии", "Длинноцветковые виды могут расти только в теплом климате.",
                R.drawable.obzor3, ""));
        animals.add(new Animal("Восточные лилии", "Могут похвастаться разнообразием цветов – они бывают красные, белые и розовые, могут включать обрамление или полосу посередине лепестка.",
                R.drawable.obzor4, ""));
        animals.add(new Animal("Мартагон", "Из положительных качеств этих сортов стоит отметить их морозоустойчивость и стойкость перед грибковыми болезнями.",
                R.drawable.obzor5, ""));
    }
}