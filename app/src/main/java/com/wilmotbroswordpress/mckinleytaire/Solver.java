package com.wilmotbroswordpress.mckinleytaire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

// create 10 stacks and 4 foundation stacks, as well as spots for 4 pulldowns. All of these have
// them be draggable onto. There will be one stack for the whole deck, which is where cards are
// dragged from. for the 10 stacks, cards will be able to be drag-inserted into the stack.
public class Solver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solver);
    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}
