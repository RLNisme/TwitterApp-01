package com.clickzilla.rln.codelearntwitterapp2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class TweetListActivity extends ActionBarActivity {

    private String[] stringArray;
    //private ArrayAdapter arrayAdapter;
    private TweetAdapter tweetItemArrayAdapter;
    private ListView stringListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweet_list);

        //create a string array
        stringArray = new String[10];
        for(int i =0;i<stringArray.length;i++){
            stringArray[i] = "String "+i;

        }
        //{
            //-create a String adapter
            //arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,stringArray); //the second parameter is android build in layout

            //-now the array adapter is ready,we need to pass it to the listView (default)
            //stringListView =(ListView)findViewById(R.id.listView);
            //stringListView.setAdapter(arrayAdapter);
        //}
        //{
            //-now we need to use custom make array adapter
            tweetItemArrayAdapter = new TweetAdapter(this,android.R.layout.simple_list_item_1,new String[10]);

            //-now the array adapter is ready,we need to pass it to the listView (default)
            stringListView =(ListView)findViewById(R.id.listView);
            stringListView.setAdapter(tweetItemArrayAdapter);
        //}

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tweet_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
