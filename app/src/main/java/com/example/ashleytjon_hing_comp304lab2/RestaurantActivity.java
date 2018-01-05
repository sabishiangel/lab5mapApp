package com.example.ashleytjon_hing_comp304lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class RestaurantActivity extends AppCompatActivity {
    public static String cType;
    public static String restaurant;
    private TextView title;
    String message = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        cType = getIntent().getStringExtra(Cuisine.cuisine_type);
        title = (TextView) findViewById(R.id.restTitle);
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        switch (cType) {
            case "Chinese":
                //show the menu
                getMenuInflater().inflate(R.menu.china_restaurants, menu);
                break;
            case "Indian":
                //show the menu
                getMenuInflater().inflate(R.menu.indian_restaurants, menu);
                break;
            case "Japanese":
                //show the menu
                getMenuInflater().inflate(R.menu.japan_restaurants, menu);
                break;
        }
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        restaurant = item.getTitle().toString();
        return true;
    }

    public void selectOrder(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, MapActivity.class);
        intent.putExtra(restaurant, message);
        startActivity(intent);
    }

    public void back_button(View view){
        this.finish();
    }
}
