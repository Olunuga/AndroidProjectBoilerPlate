package com.finitebits.boilerPlate.Module.SampleModule;


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
import android.widget.Toast;

import com.finitebits.boilerPlate.EventBusEvents.SampleEventAction;
import com.finitebits.boilerPlate.MainApp;
import com.finitebits.boilerPlate.Module.SampleModule.Domain.ReNameMeGroupedItemAdapter;
import com.finitebits.boilerPlate.R;
import com.finitebits.boilerPlate.Repository.Model.SampleModel;
import com.finitebits.boilerPlate.Repository.Model.SampleModelGroup;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReNameMeFragment extends Fragment {
    //@BindView(R.id.rvExplore)
    RecyclerView recyclerView;

    private LinearLayoutManager linearLayoutManager;
    private ReNameMeGroupedItemAdapter adapter;
    private RenameMeViewModel viewModel;

    public ReNameMeFragment() {
        linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        adapter = new ReNameMeGroupedItemAdapter();
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
        viewModel = ViewModelProviders.of(this).get(RenameMeViewModel.class);

        //Injecting into Component.
        MainApp.getComponent().injectSampleViewModel(viewModel);
        viewModel.getEvents().observe(this, new Observer<List<SampleModelGroup>>() {
            @Override
            public void onChanged(@Nullable List<SampleModelGroup> sampleModelGrouped) {

                // TODO: use data.
                adapter.setData(sampleModelGrouped);

            }
        });
    }

    private void setUpRecyclerView(View view) {
        recyclerView = view.findViewById(R.id.rvExplore);
        adapter.setData(new ArrayList<SampleModelGroup>());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }


    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(SampleEventAction event) {
        Toast.makeText(getContext(), "Event passed with param "+ event.getParameter(), Toast.LENGTH_SHORT).show();
    };

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }
}
