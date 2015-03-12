package com.example.shikhar.spinners;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {



    @Override
    protected void onCreate(
            Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AdapterView.OnItemSelectedListener onSpinner =
                new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(
                            AdapterView<?> parent,
                            View view,
                            int position,
                            long id) {
                        TextView myTextView =
                                (TextView)findViewById(R.id.textView);
                        myTextView.setText(Integer.toString(position));
                    }

                    @Override
                    public void onNothingSelected(
                            AdapterView<?> parent) {
                    }
                };

        setContentView(R.layout.activity_main);
        String[] country = {"Canada", "Mexico", "USA"};
        ArrayAdapter<String> stringArrayAdapter=
                new ArrayAdapter<String>(
                        this,
                        android.R.layout.simple_spinner_dropdown_item,country);
        Spinner spinner =
                (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(stringArrayAdapter);
        spinner.setOnItemSelectedListener(onSpinner);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
