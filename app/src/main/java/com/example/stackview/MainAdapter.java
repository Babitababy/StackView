package com.example.stackview;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.nio.file.attribute.PosixFileAttributes;
import java.util.List;

public class MainAdapter extends ArrayAdapter {
    List<String> numberWord;
    List<Integer> numberImage;
    int itemLayout;
    Context c;


    public MainAdapter(List<String> word , List<Integer> image, int resource, Context context) {
        super(context, resource,word);
        numberWord = word;
        numberImage = image;
        itemLayout = resource;
        c = context;
    }

    @Override
    public int getCount() {
        return numberWord.size();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
        {
            convertView = LayoutInflater.from(parent.getContext()).inflate(itemLayout , parent, false);
        }

        String word = numberWord.get(position);
        Integer image = numberImage.get(position);

        TextView textView = convertView.findViewById(R.id.text_view);
        ImageView imageView = convertView.findViewById(R.id.image_view);
        textView.setText(word);
        imageView.setImageResource(image);
        return convertView;
    }
}
