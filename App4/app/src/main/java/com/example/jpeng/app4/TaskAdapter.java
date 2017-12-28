package com.example.jpeng.app4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by jpeng on 12/1/2017.
 */

public class TaskAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<String> tasks;
    public TaskAdapter(Context context, ArrayList<String> tasks){
        this.context=context;
        this.tasks=tasks;
    }
    @Override
    public int getCount() {
        return tasks.size();
    }

    @Override
    public Object getItem(int i) {
        return tasks.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        return null;
    }
}
