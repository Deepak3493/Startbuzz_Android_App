package com.example.startbuzz;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static java.nio.file.Paths.get;

public class DrinkDetails extends AppCompatActivity {

    private ImageView image;
    private TextView name;
    private TextView description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_details);
        int drinkId=(Integer)getIntent().getExtras().get("index");;
        Drink drink=Drink.drinks[drinkId];
        image=findViewById(R.id.photo);
        name=findViewById(R.id.name);
        description=findViewById(R.id.description);
        image.setImageResource(drink.getImageResourceId());
        name.setText(drink.getName());
        description.setText(drink.getDescription());
    }
}