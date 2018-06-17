package com.example.android.serressoundpub;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by George on 22/1/2017.
 */

public class ServeAdapter extends RecyclerView.Adapter<ServeAdapter.ServeViewHolder> {
    private ArrayList<Serve> mServices;

    public static class ServeViewHolder extends RecyclerView.ViewHolder {

        CardView mCard;
        TextView mText;
        ImageView mImage;

        ServeViewHolder(View view) {
            super(view);

            mCard = (CardView) view.findViewById(R.id.card);
            mText = (TextView) view.findViewById(R.id.card_title);
            mImage = (ImageView) view.findViewById(R.id.card_thumbnail);
        }
    }

    ServeAdapter(ArrayList<Serve> arrayList) {
        mServices = arrayList;
    }

    @Override
    public ServeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_service, parent, false);
        return new ServeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ServeViewHolder holder, int position) {
        Serve service = mServices.get(position);

        holder.mText.setText(service.getTitle());
        holder.mImage.setImageResource(service.getImage());
    }

    @Override
    public int getItemCount() {
        return mServices.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
