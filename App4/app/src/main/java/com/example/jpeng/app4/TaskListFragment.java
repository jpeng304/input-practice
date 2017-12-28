package com.example.jpeng.app4;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jpeng on 12/1/2017.
 */

public class TaskListFragment extends Fragment {
    private String currentTabTag;
    private ListView taskListView;
    Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_task_list,
                container, false);

        // get references to widgets
        taskListView = (ListView) view.findViewById (R.id.taskListView);

        // get the current tab
        TabHost tabHost = (TabHost) container.getParent().getParent();
        currentTabTag = tabHost.getCurrentTabTag();

        // refresh the task list view
        refreshTaskList();

        // return the view
        return view;
    }

    public void refreshTaskList() {
        // get task list for current tab from database

        Context context = getActivity().getApplicationContext();
        //TaskListDB db = new TaskListDB(context);
        //ArrayList<Task> tasks = db.getTasks(currentTabTag);


        // create adapter and set it in the ListView widget
        //TaskAdapter adapter = new TaskAdapter(context,tasks);
        //taskListView.setAdapter(adapter);



    }


}
