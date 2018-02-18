package com.example.android.annisaayuwahdini_1202150288_modul2;

/**
 * Created by Annisa Ayu Wahdini on 2/18/2018.
 */
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MenuList extends AppCompatActivity{
    private List<Model> menuList = new ArrayList<>();
    private RecyclerView recyclerView;
    private WordListAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wordlist_item);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        mAdapter = new WordListAdapter(this, menuList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());       //menginisiasi adapter untuk recycleView
        recyclerView.setLayoutManager(mLayoutManager);      //menghubungkan adapter dan layout
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareMenuData();

    }
    private void prepareMenuData(){
        Model model = new Model(R.drawable.vegetarian, "Vegetarian Pizza", "Rp. 45.000,00", R.string.vegpizza);
        menuList.add(model);
        model = new Model(R.drawable.meat, "Meat Lovers Pizza", "Rp. 50.000,00", R.string.meatpizza);
        menuList.add(model);
        model = new Model(R.drawable.mushroom, "Mushroom Pizza", "Rp. 40.000,00", R.string.mushroom_pizza);
        menuList.add(model);
    }
}
