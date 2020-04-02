package com.example.myapplication3;



import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class test002 extends Activity {
    private String TAG="MAIN_ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test002);
    }




    private BlankFragment1 mFragmentOne;
    private BlankFragment2 mFragmentTwo;
    public void onButtonclick(View v) {
        FragmentManager manager = getFragmentManager();
        FragmentTransaction trans = manager.beginTransaction();

        switch (v.getId()) {
            case R.id.button: {
                if (mFragmentOne == null) {
                    mFragmentOne = new BlankFragment1();
                }
                trans.replace(R.id.frame_layout, mFragmentOne);
                break;
            }
            case R.id.button2: {
                if (mFragmentTwo == null) {
                    mFragmentTwo = new BlankFragment2();
                }
                trans.replace(R.id.frame_layout, mFragmentTwo);
                break;
            }
            default:break;
        }
        trans.commit();

    }








    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_test002);
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_test002);
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_test002);
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_test002);
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_test002);
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_test002);
        Log.d(TAG, "onPause");


    }





}
