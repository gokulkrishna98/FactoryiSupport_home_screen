package com.example.gokulkrishnam.factoryissupport;

import android.content.Context;
import android.database.DataSetObserver;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

/**
 * Created by GOKULKRISHNA M on 24-05-2018.
 */

public class cardadapter implements ListAdapter {

    private final Context context;

    private Integer[] mThumbIds = {R.drawable.install_home_fragment,R.drawable.routine_home_fragment,
            R.drawable.breakd_home_fragment,R.drawable.ntech_home_fragment};

    private String[] mNames = {"Installaion","Routine Services","Break Down", "Non Technical"};


    public cardadapter(Context c)
    {
        context = c;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.card_home_fragment, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.cardviewtext);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.cardviewimage);
        textView.setText(mNames[position]);
        imageView.setImageResource(mThumbIds[position]);

        CardView cv = rowView.findViewById(R.id.cardview_home);
        Animation rtl = AnimationUtils.loadAnimation(context,R.anim.move_rtl);
        rtl.setDuration(500 + 200*position);
        cv.startAnimation(rtl);

        return rowView;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int position) {
        return false;
    }
}
