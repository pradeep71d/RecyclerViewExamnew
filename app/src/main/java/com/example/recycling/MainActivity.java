package com.example.recycling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv);
        ArrayList<Company>arrayList=new ArrayList<>();
        arrayList.add(new Company("monet","Software",R.mipmap.ic_launcher));
        arrayList.add(new Company("Ashmar","IT",R.mipmap.ic_launcher));
        arrayList.add(new Company("Concentrix","Bpo",R.mipmap.ic_launcher));
        arrayList.add(new Company("monet","Software",R.mipmap.ic_launcher));
        arrayList.add(new Company("Ashmar","IT",R.mipmap.ic_launcher));
        arrayList.add(new Company("Concentrix","Bpo",R.mipmap.ic_launcher));
        arrayList.add(new Company("monet","Software",R.mipmap.ic_launcher));
        arrayList.add(new Company("Ashmar","IT",R.mipmap.ic_launcher));
        arrayList.add(new Company("Concentrix","Bpo",R.mipmap.ic_launcher));
        arrayList.add(new Company("monet","Software",R.mipmap.ic_launcher));
        arrayList.add(new Company("Ashmar","IT",R.mipmap.ic_launcher));
        arrayList.add(new Company("Concentrix","Bpo",R.mipmap.ic_launcher));
        arrayList.add(new Company("monet","Software",R.mipmap.ic_launcher));
        arrayList.add(new Company("Ashmar","IT",R.mipmap.ic_launcher));
        arrayList.add(new Company("Concentrix","Bpo",R.mipmap.ic_launcher));
        arrayList.add(new Company("monet","Software",R.mipmap.ic_launcher));
        arrayList.add(new Company("Ashmar","IT",R.mipmap.ic_launcher));
        arrayList.add(new Company("Concentrix","Bpo",R.mipmap.ic_launcher));
        arrayList.add(new Company("monet","Software",R.mipmap.ic_launcher));
        arrayList.add(new Company("Ashmar","IT",R.mipmap.ic_launcher));
        arrayList.add(new Company("Concentrix","Bpo",R.mipmap.ic_launcher));
        arrayList.add(new Company("monet","Software",R.mipmap.ic_launcher));
        arrayList.add(new Company("Ashmar","IT",R.mipmap.ic_launcher));
        arrayList.add(new Company("Concentrix","Bpo",R.mipmap.ic_launcher));
        arrayList.add(new Company("monet","Software",R.mipmap.ic_launcher));
        arrayList.add(new Company("Ashmar","IT",R.mipmap.ic_launcher));
        arrayList.add(new Company("Concentrix","Bpo",R.mipmap.ic_launcher));
        MyAdapter myAdapter=new MyAdapter(this,R.layout.items,arrayList);
        recyclerView.setAdapter(myAdapter);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}
