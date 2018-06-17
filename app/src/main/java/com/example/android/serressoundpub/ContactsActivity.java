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

public class ContactsActivity extends Fragment {

    public ContactsActivity() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View rootView1 = inflater.inflate(R.layout.activity_contacts,container,false);

        final ArrayList<Contact> contact = new ArrayList<>();

        contact.add(new Contact(R.string.phone, R.string.phone1, R.drawable.phone));
        contact.add(new Contact(R.string.weekdays, R.string.weekdays1, R.drawable.watch));
        contact.add(new Contact(R.string.page, R.string.email, R.drawable.globe));
//        contact.add(new Contact(R.string.facebook, R.string.facebook1, R.drawable.facebook));

        RecyclerView recyclerView = (RecyclerView) rootView1.findViewById(R.id.contact_recycler_view);
        recyclerView.setHasFixedSize(true);
        ContactAdapter contactAdapter = new ContactAdapter(contact);
        recyclerView.setAdapter(contactAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        return rootView1;
    }
}
