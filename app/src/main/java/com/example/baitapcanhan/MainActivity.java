package com.example.baitapcanhan;


import static com.example.baitapcanhan.R.id.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.baitapcanhan.R;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView= findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ItemAdapter());

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.home) {

                    return true;
                } else if (id == R.id.bookmark) {

                    return true;
                } else if (id == R.id.search) {
                    Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
                    startActivity(intent);
                    return true;
                }
                return false;
            }
        });


    }
}