package com.example.estudolayout.item;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.estudolayout.R;

import java.io.File;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

public class itemAdapter extends RecyclerView.Adapter<itemAdapter.Holder> {

    ArrayList<Item> mList = new ArrayList<Item>();

    public itemAdapter(ArrayList<Item> list){
        this.mList = list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.lista_items,parent,false);
        return new Holder(view, parent.getContext());
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        holder.find(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class Holder extends RecyclerView.ViewHolder {
        TextView cidade;
        TextView dias;
        TextView value;
        ImageView imageView;
        Resources resources;
        Context context;
        public Holder(@NonNull View itemView, Context context) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_id);
            cidade = itemView.findViewById(R.id.title_id);
            dias = itemView.findViewById(R.id.textViewDias);
            value = itemView.findViewById(R.id.textViewValue);
            resources = context.getResources();
            this.context = context;
        }

        public void find(Item item) {
            dias.setText(item.getDias());
            cidade.setText(item.getTitle());
            value.setText(item.getValue());
            Resources resources = context.getResources();
            int idDoDrawable = resources.getIdentifier(item.getImg()
                    ,"drawable", context.getPackageName());
            Drawable drawableImagePact = resources.getDrawable(idDoDrawable);
            imageView.setImageDrawable(drawableImagePact);

            // check to see if the file exists


            // set the image and text


        }
    }


}



