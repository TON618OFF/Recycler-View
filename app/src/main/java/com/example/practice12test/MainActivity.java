package com.example.practice12test;// MainActivity.java
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Country> countryList = new ArrayList<>();
        countryList.add(new Country("Россия", "Москва", "Россия — самая большая страна в мире, расположена в Восточной Европе и Северной Азии."));
        countryList.add(new Country("Китай", "Пекин", "Китай — страна в Восточной Азии, с самой большой численностью населения в мире."));
        countryList.add(new Country("КНДР", "Пхеньян", "Столица и крупнейший город КНДР. Является административным, культурным и историческим центром страны.\n"));
        countryList.add(new Country("Япония", "Токио", "Островное государство в Восточной Азии. Находится в Тихом океане к востоку от Японского моря, Китая, Северной и Южной Кореи, России. Занимает территорию от Охотского моря на севере до Восточно-Китайского моря и Тайваня на юге."));

        CountryAdapter adapter = new CountryAdapter(countryList, this);
        recyclerView.setAdapter(adapter);
    }
}
