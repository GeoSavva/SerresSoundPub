package com.example.android.serressoundpub;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by George on 20/1/2017.
 */

public class ServiceActivity extends Fragment {

    public ServiceActivity() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_service, container, false);

        final ArrayList<Serve> service = new ArrayList<>();

        service.add(new Serve(R.string.sound, R.drawable.sound));
        service.add(new Serve(R.string.lighting, R.drawable.lighting));
        service.add(new Serve(R.string.staging, R.drawable.staging));
        service.add(new Serve(R.string.rigging, R.drawable.rigging));

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.service_recycler_view);
        recyclerView.setHasFixedSize(true);
        ServeAdapter adapter = new ServeAdapter(service);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        return rootView;
    }
}
