package com.example.sha.agro;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static android.content.ContentValues.TAG;


/**
 * A simple {@link Fragment} subclass.
 */
public class FertilizersFragment extends Fragment {

    private DatabaseReference mDatabase;

    private TextView Title1,Title2;
    private View fertilizers;
    public FertilizersFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Inflate the layout for this fragment
      fertilizers = inflater.inflate(R.layout.fragment_fertilizers, container, false);
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Shops/Fertilizers");
        Title1 =(TextView) fertilizers.findViewById(R.id.name);
        Title2 =(TextView) fertilizers.findViewById(R.id.name2);


        mDatabase.addValueEventListener(new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {

            String name = dataSnapshot.getValue().toString();

            Title1.setText(name);

        }

    @Override
    public void onCancelled(DatabaseError databaseError) {

    }
});
        return fertilizers;
    }

}
