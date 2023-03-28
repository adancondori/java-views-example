package org.ub.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import org.ub.controller.adapters.SeriesAdapter;
import org.ub.controller.models.Series;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        /*
        List<Series> seriesList = new ArrayList<>();
        seriesList.add(new Series("Breaking Bad", 5, "https://images-na.ssl-images-amazon.com/images/I/91WkR5jKtUL._AC_SL1500_.jpg"));
        seriesList.add(new Series("Game of Thrones", 8, "https://images-na.ssl-images-amazon.com/images/I/71H0TjMvEYL._AC_SY741_.jpg"));
        seriesList.add(new Series("Stranger Things", 4, "https://images-na.ssl-images-amazon.com/images/I/91jyKmywPzL._AC_SL1500_.jpg"));

        SeriesAdapter adapter = new SeriesAdapter(this, R.layout.series_item, seriesList);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
        */
    }
}