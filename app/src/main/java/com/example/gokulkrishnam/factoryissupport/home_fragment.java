package com.example.gokulkrishnam.factoryissupport;


import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.design.internal.NavigationMenu;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class home_fragment extends Fragment {

    NavigationMenu mdrawer;
    ListView cardviewlist;
    View fragview;

    public home_fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragview = inflater.inflate(R.layout.fragment_home_fragment, container, false);

        return fragview;
    }

    @Override
    public void onStart() {
        super.onStart();
        cardadapter adapter = new cardadapter(getActivity());
        cardviewlist = fragview.findViewById(R.id.home_fragment_listview);
        cardviewlist.setAdapter(adapter);
    }
}
