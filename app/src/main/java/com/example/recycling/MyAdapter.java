package com.example.recycling;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
    Context context;
    int res;
    ArrayList<Company> arrayList;

    public MyAdapter(Context context, int res, ArrayList<Company> arrayList) {
        this.context = context;
        this.res = res;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(res, parent, false);
        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        Company company = arrayList.get(position);
        holder.imageView.setImageResource(company.getImage());
        holder.textView1.setText(company.getName());
        holder.textView2.setText(company.getDomain());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView1, textView2;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.i1);
            textView1 = itemView.findViewById(R.id.t1);
            textView2 = itemView.findViewById(R.id.t2);
        }
    }
}
