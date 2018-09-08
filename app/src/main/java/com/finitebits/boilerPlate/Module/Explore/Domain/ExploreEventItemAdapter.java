package com.finitebits.boilerPlate.Module.Explore.Domain;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.finitebits.boilerPlate.R;
import com.finitebits.boilerPlate.Repository.Model.Event;

import java.util.List;

import butterknife.BindView;

/**
 * Created by myorh on 06/09/2018.
 */

public class ExploreEventItemAdapter  extends RecyclerView.Adapter<ExploreEventItemAdapter.ExploreEventItemViewHolder> {

    private List<Event> eventList;


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

    public void setData(List<Event> events){
        this.eventList = events;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }

    class ExploreEventItemViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.imgViewEventImage)
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
            name = itemView.findViewById(R.id.tvEventName);

        }

        void fillItemAt(int position){
           name.setText(eventList.get(position).getName());
        }
    }
}
