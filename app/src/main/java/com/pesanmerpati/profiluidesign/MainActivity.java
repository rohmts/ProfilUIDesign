package com.pesanmerpati.profiluidesign;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CollapsingToolbarLayout mCollapsingToolbarLayout = findViewById(R.id.collapsingToolBarLayout_toolbar);
        mCollapsingToolbarLayout.setTitle("Rohmat Demejo");
    }
}
