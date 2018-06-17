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

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    private ArrayList<Contact> mContacts;

    public static class ContactViewHolder extends RecyclerView.ViewHolder {

        CardView mCard1;
        TextView mText1;
        TextView mText2;
        ImageView mImage1;

        ContactViewHolder(View view) {
            super(view);

            mCard1 = (CardView) view.findViewById(R.id.card1);
            mText1 = (TextView) view.findViewById(R.id.card1_title);
            mText2 = (TextView) view.findViewById(R.id.card1_title1);
            mImage1 = (ImageView) view.findViewById(R.id.card1_thumbnail);
        }
    }

    ContactAdapter(ArrayList<Contact> arrayList) {
        mContacts = arrayList;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_contact, parent, false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        Contact contact = mContacts.get(position);

        holder.mText1.setText(contact.getText1());
        holder.mText2.setText(contact.getText2());
        holder.mImage1.setImageResource(contact.getImage1());
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
