package com.example.myapplication.Adaptadores;
import com.example.myapplication.*;
import com.example.myapplication.Models.*;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AdapterRecycler extends RecyclerView.Adapter<AdapterRecycler.ViewHolder>{

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtTitle, txtDatos;
        ImageView Img;

        public ViewHolder( View itemView) {
            super(itemView);
            txtTitle=(TextView)itemView.findViewById(R.id.txtuno);
            txtDatos=(TextView)itemView.findViewById(R.id.txtdos);
            Img = (ImageView) itemView.findViewById(R.id.img_anuncio);
        }
    }
    public List<Datum> Data;

    public AdapterRecycler(List<Datum> data) {
        Log.i("TAG", "Error" + data.size());
        Data = data;
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_anuncio,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {
        holder.txtTitle.setText(Data.get(position).getTitle());
        holder.txtDatos.setText(Data.get(position).getItem()+"  " + Data.get(position).getDate() + "   " + Data.get(position).getHour());
        Glide.with(holder.Img.getContext())
                .load(Data.get(position).getImg())
                .into(holder.Img);
    }

    @Override
    public int getItemCount() {
        return Data.size();
    }
}
