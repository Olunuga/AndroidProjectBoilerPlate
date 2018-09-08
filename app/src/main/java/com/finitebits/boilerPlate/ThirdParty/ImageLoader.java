package com.finitebits.boilerPlate.ThirdParty;

import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.File;

/**
 * Created by myorh on 08/09/2018.
 */

public class ImageLoader {
    private static ImageLoader INSTANCE;

    public static ImageLoader getINSTANCE(){
        if(INSTANCE == null){
            INSTANCE = new ImageLoader();
        }
        return INSTANCE;
    }

   public void LoadImageFromString(String imageSource,ImageView view){
       Picasso.get().load("file:///android_asset/DvpvklR.png").into(view);
   }

    public void LoadImageFromFile(File file, ImageView imageView){
        Picasso.get().load(file).into(imageView);
    }

    public void LoadImageFromDrawable(int drawableResource, ImageView imageView){
        Picasso.get().load(drawableResource).into(imageView);
    }
}
