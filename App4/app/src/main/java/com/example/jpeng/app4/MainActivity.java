package com.example.jpeng.app4;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

import com.google.tabmanager.TabManager;

public class MainActivity extends FragmentActivity {

    TabHost tabHost;
    TabManager tabManager;
    private String recent = "Most Recent";
    private String highest = "Highest Rated";
    //TaskListDB db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get tab manager
        tabHost = (TabHost) findViewById(android.R.id.tabhost);
        tabHost.setup();
        tabManager = new TabManager(this, tabHost, R.id.realtabcontent);
        TabHost.TabSpec tabSpec = tabHost.newTabSpec(recent);
        tabSpec.setIndicator(recent);
        tabManager.addTab(tabSpec,TaskListFragment.class,null);
        tabSpec = tabHost.newTabSpec(highest);
        tabSpec.setIndicator(highest);
        tabManager.addTab(tabSpec,TaskListFragment.class,null);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_add:
                Log.d("FROM menu", "menu ok");
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
