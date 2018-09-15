package com.finitebits.boilerPlate.ThirdParty;

import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.File;

import javax.inject.Singleton;

/**
 * Created by myorh on 08/09/2018.
 */


@Singleton
public class ImageLoader {

   public void LoadImageFromString(String imageSource,ImageView view){
       Picasso.get().load(imageSource).into(view);
   }

    public void LoadImageFromFile(File file, ImageView imageView){
        Picasso.get().load(file).into(imageView);
    }

    public void LoadImageFromDrawable(int drawableResource, ImageView imageView){
        Picasso.get().load(drawableResource).into(imageView);
    }
}
