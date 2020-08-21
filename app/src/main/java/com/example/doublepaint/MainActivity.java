package com.example.doublepaint;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends FragmentActivity implements Fragment1.OneFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  View view1=new Canvas1(this);
      //  getSupportFragmentManager().beginTransaction().replace(R.id.frame1,new Fragment1()).addToBackStack(null).commit();
    }

    @Override
    public void onButtonClick(View view, float x, float y) {
        Fragment2 copyFragment = (Fragment2) getSupportFragmentManager()
                .findFragmentById(R.id.frame2);
        copyFragment.changeStart(x,y);
    }

    @Override
    public void onButtonMove(View view, float x, float y) {
        Fragment2 copyFragment = (Fragment2) getSupportFragmentManager()
                .findFragmentById(R.id.frame2);
        copyFragment.changeMove(x,y);
    }
}