package com.wilmotbroswordpress.mckinleytaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * this method goes to the settings screen when a button is clicked
     * @param view
     */
    public void mainToSettings(View view){
        Intent intent = new Intent(MainActivity.this, Settings.class);
        startActivity(intent);
    }
    /**
     * this method changes the activity when a button is clicked
     * @param view
     */
    public void changeScreen(View view){}
}
