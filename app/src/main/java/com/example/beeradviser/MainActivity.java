package com.example.beeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View buttonFindBeer) {

        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner name = (Spinner) findViewById(R.id.spinner);
        BeerExpert beerExpert = new BeerExpert();
        List<String> list = beerExpert.getBrands(String.valueOf(name.getSelectedItem()));

        StringBuilder stringBuilder = new StringBuilder();

        for(String brand: list){
           stringBuilder.append(brand).append('\n');
        }

//        sdasd

        brands.setText(stringBuilder);

    }
}