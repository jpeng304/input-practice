package com.example.jpeng.app4;

import android.view.View;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
/**
 * Created by jpeng on 12/1/2017.
 */

public class TaskLayout extends RelativeLayout implements View.OnClickListener {
    private RatingBar ratingBar;
    private TextView txName;
    private TextView txDate;


    private Task task;
    //private TaskListDB db;
    private Context context;

    public TaskLayout(Context context) {   // used by Android tools
        super(context);
    }

    @Override
    public void onClick(View view) {

    }
}
