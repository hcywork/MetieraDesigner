package com.example.bottomview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.recents:
                Toast.makeText(this, "recents", Toast.LENGTH_SHORT).show();
                break;
            case R.id.favourites:
                Toast.makeText(this, "favourites", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nearby:
                Toast.makeText(this, "nearby", Toast.LENGTH_SHORT).show();
                break;
            default:
                return false;
        }
        return true;
    }
}
