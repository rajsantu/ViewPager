package com.mainpackage.viewpager;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        gridView = findViewById(R.id.gridView);

        // Data to be displayed into gridview
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<>();
        courseModelArrayList.add(new CourseModel("Java Course:", R.drawable.course1));
        courseModelArrayList.add(new CourseModel("Kotlin Course", R.drawable.course2));
        courseModelArrayList.add(new CourseModel("Data Structure and Algorithms Course", R.drawable.course3));


        // Attach the Adapter
        MyAdapter myAdapter = new MyAdapter(this,courseModelArrayList );
        gridView.setAdapter(myAdapter);


    }
}