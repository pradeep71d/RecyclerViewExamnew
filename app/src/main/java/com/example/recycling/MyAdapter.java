package com.example.recycling;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.monet.mylibrary.activity.LandingPage;
import com.monet.mylibrary.listner.CheckSuccessResponse;

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
    private CheckSuccessResponse checkSuccessResponse = new CheckSuccessResponse() {
        @Override
        public void onSDKResponse(boolean value, String message) {
            if (!value) {
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
            }
        }
    };
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(res, parent, false);
        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, final int position) {
        final Company company = arrayList.get(position);
        holder.imageView.setImageResource(company.getImage());
        holder.textView1.setText(company.getName());
        holder.textView2.setText(company.getDomain());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "I am clickable at position="+position, Toast.LENGTH_SHORT).show();

                LandingPage landingPage =new LandingPage();
                landingPage.getSuccessResponse(checkSuccessResponse, (Activity) context,"323035344d6f6e6574","12","","male","12");
            }
        });
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
