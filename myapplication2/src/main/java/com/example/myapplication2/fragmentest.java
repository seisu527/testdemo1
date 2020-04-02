package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class fragmentest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmentest);
    }
    private Fragment mFragmentOne;
    private Fragment mFragmentTwo;
    public void onButtonclick(View v){
        FragmentManager manager = getFragmentManager();
        FragmentTransaction trans = manager.beginTransaction();

         switch (v.getId()){
             case R.id.button:{
                 if(mFragmentOne == null){
                     mFragmentOne =new BlankFragment2();
                 }
                 trans.replace(R.id.frame_layout, mFragmentOne);
                 break;
             }
             case R.id.button2:{
                 if(mFragmentTwo == null){
                     mFragmentTwo =new BlankFragment2();
                 }
                 trans.replace(R.id.frame_layout,mFragmentTwo);
                 break;
            }
            trans.commit();
         }

    }
}
