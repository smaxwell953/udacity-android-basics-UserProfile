package com.example.udacity_android_basics_userprofile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = findViewById(R.id.profile_picture);
        image.setImageResource(R.drawable.profilepic);

        TextView nameTextView = findViewById(R.id.name);
        nameTextView.setText(R.string.text_name);

        TextView birthdayTextView = findViewById(R.id.birthday);
        birthdayTextView.setText(R.string.text_birthday);

        TextView countryTextView = findViewById(R.id.country);
        countryTextView.setText(R.string.text_country);
    }
}