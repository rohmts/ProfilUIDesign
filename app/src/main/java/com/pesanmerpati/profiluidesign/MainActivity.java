package com.pesanmerpati.profiluidesign;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView mImageViewAddFoto, mImageViewEditProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CollapsingToolbarLayout mCollapsingToolbarLayout = findViewById(R.id.collapsingToolBarLayout_toolbar);
        mCollapsingToolbarLayout.setTitle("Lorem Ipsum");

        mImageViewAddFoto = findViewById(R.id.imageView_add_photo);
        mImageViewEditProfile = findViewById(R.id.imageView_edit_profile);

        mImageViewAddFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pick foto", Toast.LENGTH_SHORT).show();
            }
        });

        mImageViewEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Edit profile", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
