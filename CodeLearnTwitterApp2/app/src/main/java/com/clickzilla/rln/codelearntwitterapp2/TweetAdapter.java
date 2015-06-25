package com.clickzilla.rln.codelearntwitterapp2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by RLN on 6/21/2015.
 */
public class TweetAdapter extends ArrayAdapter {
    //to inflate our custom layout & create a view class out of it
    private LayoutInflater inflater;

    public TweetAdapter(Activity context, int resource, Object[] objects) {
        super(context, resource, objects);
        inflater = context.getWindow().getLayoutInflater();
    }

    //getView method is called every time when row is added
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return inflater.inflate(R.layout.row_tweet,parent,false);
    }
}
