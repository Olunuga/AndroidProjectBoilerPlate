package com.finitebits.boilerPlate.Module.SampleModule.Domain;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.finitebits.boilerPlate.R;
import com.finitebits.boilerPlate.Repository.Model.SampleModelGroup;

import java.util.List;

import butterknife.BindView;

/**
 * Created by myorh on 06/09/2018.
 */

public class ReNameMeGroupedItemAdapter extends RecyclerView.Adapter<ReNameMeGroupedItemAdapter.ExploreGroupViewHolder> {
    private List<SampleModelGroup> sampleModelGroups;
    private Context context;


    @NonNull
    @Override
    public ExploreGroupViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grouped_event,parent,false);
        context = parent.getContext();
        return new ExploreGroupViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExploreGroupViewHolder holder, int position) {
        holder.fillItemAt(position);
    }

    public void setData(List<SampleModelGroup> sampleModelGroups){
        this.sampleModelGroups = sampleModelGroups;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return sampleModelGroups.size();
    }

    class ExploreGroupViewHolder extends RecyclerView.ViewHolder{
        //@BindView(R.id.tvGroupName)
        private TextView name;
        @BindView(R.id.tvGroupSeeMore)
        private TextView venue;
        //@BindView(R.id.rvEventItem)
        private RecyclerView recyclerView;
        private ReNameMeItemAdapter adapter;
        private LinearLayoutManager layoutManager;
        //private ImageLoader imageLoader;

        ExploreGroupViewHolder(View itemView) {
            super(itemView);
            //ButterKnife.bind(this,itemView);
            //imageLoader = MainApp.getInstance().getImageLoader();
            recyclerView = itemView.findViewById(R.id.rvEventItem);
            name = itemView.findViewById(R.id.tvGroupName);

            adapter = new ReNameMeItemAdapter();
            layoutManager = new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(adapter);
        }

        void fillItemAt(int position){
            adapter.setData(sampleModelGroups.get(position).getSampleModelList());
            name.setText(sampleModelGroups.get(position).getName());
        }
    }
}
