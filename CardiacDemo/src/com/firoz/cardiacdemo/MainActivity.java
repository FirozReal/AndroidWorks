package com.firoz.cardiacdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
	
	TextView tvOutput;
	Spinner droplist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        droplist = (Spinner)findViewById(R.id.spinnerDiseaseList);
        
        String[] items = new String[]{"Select Your Disease", "Disease1", "Disease2", "Disease3"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_layout, items);
        
        adapter.setDropDownViewResource(R.layout.spinner_layout);
        
        droplist.setAdapter(adapter);
        
        tvOutput = (TextView)findViewById(R.id.textViewOutput);
    }
    
    
    public void clickEvent(View v){
    	
    	String dropListValue = droplist.getSelectedItem().toString();
    	
    	if(dropListValue.equals("Disease1")){
    		
    		tvOutput.setText("Description of Disease 1 will be provided throughout the whole page from here.");
    	}
    	
    	else if(dropListValue.equals("Disease2")){
    		
    		tvOutput.setText("Description of Disease 2 will be provided throughout the whole page from here.");
    	}
    	
    	else if(dropListValue.equals("Disease3")){
    		
    		tvOutput.setText("Description of Disease 3 will be provided throughout the whole page from here.");
    	}
    	
    	else if(dropListValue.equals("Select Your Disease")){
    		
    		tvOutput.setText(null);
    		Toast t = Toast.makeText(getApplicationContext(), "Select disease name first", Toast.LENGTH_LONG);
    		t.show();
    	}
    	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
