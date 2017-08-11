package com.wilmotbroswordpress.mckinleytaire;

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
     * this method changes the activity when a button is clicked
     * @param view
     */
    public void changeScreen(View view){}
}
