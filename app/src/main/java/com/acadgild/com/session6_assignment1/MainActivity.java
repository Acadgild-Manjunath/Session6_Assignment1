package com.acadgild.com.session6_assignment1;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        MainFragment frag1 = new MainFragment();
        fragmentTransaction.replace(R.id.simpleAddition,frag1);
        fragmentTransaction.commit();
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onFragmentInteraction2(String str) {
        Toast.makeText(getApplicationContext(), "You entered: "+str, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onFragmentInteraction3(int num) {

    }


}

