package com.example.app;

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

    public void process(View view) {
        Intent intent = null, chooser = null;

        if (view.getId() == R.id.button3) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:36.1668, 86.8276"));
            chooser = Intent.createChooser(intent, "button3");
            startActivity(chooser);
        }
    }
}
