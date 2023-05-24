package com.msaggik.fifthlessonanimalhandbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Activity3 extends AppCompatActivity {

    // создание коллекции контейнера для данных класса
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iii);

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
        animals.add( new Animal("Роза дамасская", "Многолетний кустарник; вид секции Gallicanae рода Шиповник семейства Розовые.",
                R.drawable._650395523_10_vsegda_pomnim_com_p_damasskaya_roza_foto_10, "Ближний Восток"));
        animals.add( new Animal("Роза китайская", "В диком виде не встречается. Очевидно, длительное время находилась в культуре. Ввезена из Китая и несколько позднее из Бенгалии.",
                R.drawable._q, "Китай"));
        animals.add( new Animal("Полиантовая роза", "Является гибридным растением, полученным путем скрещивания чайной китайской розы и миниатюрной японской.",
                R.drawable.__2, "Китай, Япония"));
        animals.add( new Animal("Роза Бэнкс", "Вид рода Шиповник семейства Розовые. Видовое название дано в честь Доротеи Бэнкс",
                R.drawable._234, "Китай, Индия, Ирак, Великобритания"));
        animals.add( new Animal("Роза дабл делайт", "гибридный сорт, выведенный в Америке. Сорт относится к быстрорастущим, прямостоячим видам садовых роз.",
                R.drawable.dabl_delayt, "США"));
    }
}