package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.textView);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //Inflamos el menu
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        String s;
        switch ((item.getItemId())){
            case R.id.uno:
                s= "uno";
                break;
            case R.id.dos:
                s= "dos";
                break;
            case R.id.tres:
                s= "tres";
                break;

            default:
                s="????";
                break;
        }
        tv.setText(s);
    return true;
    }
}