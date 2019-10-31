package com.example.krap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Test1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        RecyclerView programmingList=(RecyclerView)findViewById(R.id.programmingList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));  //ye
        String[] food={"Chicken Tikka","Rasmalai","Paneer","Kofta","Gumab Jamun","Roll","Noddles","Chocolates","Gumab Jamun","Roll","Noddles","Chocolates"};
        programmingList.setAdapter(new ProgrammingAdapter(food));
    }
}
