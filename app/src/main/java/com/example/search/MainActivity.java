package com.example.search;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import com.example.search.RecyclerAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mDatas = new ArrayList<>();

    private void generateDatas() {
        for (int i = 1; i <= 100; i++) {
            mDatas.add("第 " + i + " 个item");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateDatas();
        RecyclerView mRv = findViewById(R.id.RecyclerView);

        //线性布局
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRv.setLayoutManager(linearLayoutManager);

        RecyclerAdapter adapter = new RecyclerAdapter(this, mDatas);
        mRv.setAdapter(adapter);
    }
}

