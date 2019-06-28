package com.example.sha.agro;


import android.content.Context;
import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static android.content.ContentValues.TAG;


/**
 * A simple {@link Fragment} subclass.
 */


public class FertilizersFragment extends Fragment
{

    private RecyclerView Recycler;
    private DatabaseReference mDatabase;

    private TextView Title1,Title2;
    private View fertilizers;
    public FertilizersFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // Inflate the layout for this fragment
      fertilizers = inflater.inflate(R.layout.fragment_fertilizers, container, false);
      Recycler = (RecyclerView) fertilizers.findViewById(R.id.recycler);
      Recycler.setHasFixedSize(true);

      Recycler.setLayoutManager(new LinearLayoutManager(getContext()));
      mDatabase=FirebaseDatabase.getInstance().getReference().child("Shops/Fertilizers");

        return fertilizers;
    }

    @Override
    public void onStart() {
        super.onStart();
}
        FirebaseRecyclerOptions options = new FirebaseRecyclerOptions.Builder<Fertilizers>()
                .setQuery(mDatabase,Fertilizers.class)
                .build();


    }

    class FertilizerViewHolder extends RecyclerView.ViewHolder{
        public FertilizerViewHolder(View itemView, TextView tname) {
            super(itemView);
            Tname = tname;
        }

        TextView Tname,Tdiscription;
        ImageView Timage;

    public FertilizerViewHolder( View itemView) {

        super(itemView);

        Tname=itemView.findViewById(R.id.name);
        Tdiscription=itemView.findViewById(R.id.name2);
        Timage=itemView.findViewById(R.id.image1);
    }







}






