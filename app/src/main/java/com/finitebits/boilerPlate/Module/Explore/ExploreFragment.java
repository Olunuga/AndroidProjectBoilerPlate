package com.finitebits.boilerPlate.Module.Explore;


import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.finitebits.boilerPlate.Module.Explore.Domain.ExploreGroupAdapter;
import com.finitebits.boilerPlate.R;
import com.finitebits.boilerPlate.Repository.Model.Event;
import com.finitebits.boilerPlate.Repository.Model.EventGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExploreFragment extends Fragment {
    //@BindView(R.id.rvExplore)
    RecyclerView recyclerView;

    private LinearLayoutManager linearLayoutManager;
    private ExploreGroupAdapter adapter;
    private EventViewModel viewModel;

    public ExploreFragment() {
        // Required empty public constructor
        linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        adapter = new ExploreGroupAdapter();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_explore, container, false);
       // ButterKnife.bind(this,view);
        setUpRecyclerView(view);
        setUpViewModel();
        return view;
    }

    private void setUpViewModel() {
        viewModel = ViewModelProviders.of(this).get(EventViewModel.class);
        viewModel.getEvents().observe(this, new Observer<List<Event>>() {
            @Override
            public void onChanged(@Nullable List<Event> events) {
                // adapter.setData(events);
                Log.d("Name",events.toString());
                // TODO: update adapter here.
            }
        });
    }

    private void setUpRecyclerView(View view) {
        recyclerView = view.findViewById(R.id.rvExplore);
        adapter.setData(new ArrayList<EventGroup>());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}
