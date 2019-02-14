package com.example.gridview_advanced;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

public class PictureAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<PicturesActivity> picturesList;

    public PictureAdapter(Context context, int layout, List<PicturesActivity> picturesList) {
        this.context = context;
        this.layout = layout;
        this.picturesList = picturesList;
    }

    @Override
    public int getCount() {
        return picturesList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder {
        ImageView imgPictures;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if (convertView == null){
            holder = new ViewHolder();

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
            holder.imgPictures = (ImageView) convertView.findViewById(R.id.pictures);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        PicturesActivity picturesActivity = picturesList.get(position);
        holder.imgPictures.setImageResource(picturesActivity.getPictures());

        return convertView;
    }
}
