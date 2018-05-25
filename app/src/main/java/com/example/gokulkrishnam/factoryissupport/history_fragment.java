package com.example.gokulkrishnam.factoryissupport;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class history_fragment extends Fragment {


    public history_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View fragview = inflater.inflate(R.layout.fragment_history_fragment, container, false);



        Button btn = fragview.findViewById(R.id.ratingsbutton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(getActivity(),Ratingsreview.class);
                startActivity(i);
            }
        });


        return fragview;
    }

}
