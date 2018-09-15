package com.finitebits.boilerPlate.Module.SampleModule.Domain;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.finitebits.boilerPlate.MainApp;
import com.finitebits.boilerPlate.R;
import com.finitebits.boilerPlate.Repository.Model.SampleModel;
import com.finitebits.boilerPlate.ThirdParty.ImageLoader;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;

/**
 * Created by myorh on 06/09/2018.
 */

public class ReNameMeItemAdapter extends RecyclerView.Adapter<ReNameMeItemAdapter.ExploreEventItemViewHolder> {

    private List<SampleModel> sampleModelList;
    private ImageLoader loader;


    @NonNull
    @Override
    public ExploreEventItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_event,parent,false);
        return new ExploreEventItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExploreEventItemViewHolder holder, int position) {
      holder.fillItemAt(position);
    }

    public void setData(List<SampleModel> sampleModels){
        this.sampleModelList = sampleModels;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return sampleModelList.size();
    }

    class ExploreEventItemViewHolder extends RecyclerView.ViewHolder{
        //@BindView(R.id.imgViewEventImage)
        private ImageView image;
        @BindView(R.id.tvEventName)
        private TextView name;
        @BindView(R.id.tvEventVenue)
        private TextView venue;
        @BindView(R.id.tvEventDate)
        private TextView date;

        ExploreEventItemViewHolder(View itemView) {
            super(itemView);
            //ButterKnife.bind(itemView);
            loader = MainApp.getComponent().getImageLoader();
            image = itemView.findViewById(R.id.imgViewEventImage);
            name = itemView.findViewById(R.id.tvEventName);

        }

        void fillItemAt(int position){
            String imageUrl = sampleModelList.get(position).getImageUrl();
            name.setText(sampleModelList.get(position).getName());
            loader.LoadImageFromString(imageUrl,image);
        }
    }
}
