package com.example.ashleytjon_hing_comp304lab2;

import android.content.Context;
import android.location.Criteria;
import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MapActivity extends AppCompatActivity {

    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        title = (TextView) findViewById(R.id.nametxt);
        LocationManager location =(LocationManager)getSystemService(Context.LOCATION_SERVICE);
        Criteria criteria= new Criteria();
        criteria.setAccuracy(Criteria.NO_REQUIREMENT);
        criteria.setPowerRequirement(Criteria.NO_REQUIREMENT);
        String bestProvider= location.getBestProvider(criteria, true);
    }



    public void back_button(View view){
        this.finish();
    }

}
