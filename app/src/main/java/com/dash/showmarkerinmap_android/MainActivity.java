package com.dash.showmarkerinmap_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onTextClicked(View view) {
        Uri googleMapIntentUri = Uri.parse("geo:" + 12.9716 + "," + 77.5946 + "?q=" + 12.9716 + "," + 77.5946);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, googleMapIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}