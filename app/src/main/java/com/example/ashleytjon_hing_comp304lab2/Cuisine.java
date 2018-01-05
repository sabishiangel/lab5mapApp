package com.example.ashleytjon_hing_comp304lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Cuisine extends AppCompatActivity {

    public static final String cuisine_type = "Chinese";
    private RadioGroup group;
    String message = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuisine);
        group = (RadioGroup) findViewById(R.id.cuisine_group);
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(
                    RadioGroup group, int checkedId) {
                if (checkedId != -1) {
                    RadioButton rb = (RadioButton)
                            findViewById(checkedId);
                    if (rb != null) {
                        message = rb.getText().toString();
                    }
                } else {
                    message = "Chinese";
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //show the menu
        getMenuInflater().inflate(R.menu.short_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void selectCuisine(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, RestaurantActivity.class);
        intent.putExtra(cuisine_type, message);
        startActivity(intent);
    }
}
