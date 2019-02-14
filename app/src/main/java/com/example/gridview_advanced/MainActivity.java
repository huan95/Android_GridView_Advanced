package com.example.gridview_advanced;

import android.graphics.Picture;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gvPictures;
    ArrayList<PicturesActivity> arrayImages;
    PictureAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pictures();

        adapter = new PictureAdapter(this, R.layout.activity_pictures, arrayImages);
        gvPictures.setAdapter(adapter);

        gvPictures.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, arrayImages.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Pictures() {
        gvPictures = (GridView) findViewById(R.id.gridViewPictures);
        arrayImages = new ArrayList<>();
        arrayImages.add(new PicturesActivity("Hinh 1", R.drawable.img1));
        arrayImages.add(new PicturesActivity("Hinh 2", R.drawable.img2));
        arrayImages.add(new PicturesActivity("Hinh 3", R.drawable.img3));
        arrayImages.add(new PicturesActivity("Hinh 4", R.drawable.img4));
        arrayImages.add(new PicturesActivity("Hinh 5", R.drawable.img5));
        arrayImages.add(new PicturesActivity("Hinh 6", R.drawable.img6));
        arrayImages.add(new PicturesActivity("Hinh 7", R.drawable.img7));
        arrayImages.add(new PicturesActivity("Hinh 8", R.drawable.img8));
        arrayImages.add(new PicturesActivity("Hinh 9", R.drawable.img9));
    }
}
