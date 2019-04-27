/*
 * Julie Asato
 * Final Project CST 338 Software Design
 * This app is supposed to have 3 tabs: Sign-up, Timer, and Location
 * The sign up tab has 3 drop down menus with 4-5 different options of Truck name, location and time
 * The Timer tab is supposed to display the truck name, location and time chosen with a timer counting down from 5 hours
 * The Location tab is supposed to show the location of the truck on a google map*/
package com.example.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private SectionsPagerAdapter mainSectionsPagerAdapter;
    private ViewPager mainViewPager;
    private Button mButton;

    public void sendMessage(View view) {
        // Do something in response to button click
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.enterButton:
                // Do something
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );

        mainSectionsPagerAdapter = new SectionsPagerAdapter( getSupportFragmentManager() );

        mainViewPager = (ViewPager) findViewById( R.id.pager );
        mainViewPager.setAdapter( mainSectionsPagerAdapter );

        TabLayout tabLayout = (TabLayout) findViewById( R.id.tabs );
        tabLayout.setupWithViewPager( mainViewPager );

        //This makes the button work
//        mButton = findViewById( R.id.enterButton );
//        mButton.setOnClickListener( this );

        Button enterButton = findViewById(R.id.enterButton);
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Use toast to display the courseDescription
            }
        });

        //import drop down menus/spinners
        Spinner truckNames = (Spinner) findViewById( R.id.truckSpinner );
//        Spinner locationNames=(Spinner) findViewById( R.id.locationSpinner );
//        Spinner timeNames=(Spinner) findViewById( R.id.timeSpinner );

        //array adapter container holds values and integrates with spinner
        ArrayAdapter<String> truckNameAdapter = new ArrayAdapter<String>( MainActivity.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray( R.array.truckNamesArray ) );
        truckNameAdapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
        truckNames.setAdapter( truckNameAdapter );

//        ArrayAdapter<String> locationNamesAdapter=new ArrayAdapter<String>(MainActivity.this,
//                android.R.layout.simple_list_item_1,
//                getResources().getStringArray(R.array.locationNamesArray));
//        locationNamesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        locationNames.setAdapter( truckNameAdapter );
//
//        ArrayAdapter<String> timeNameAdapter=new ArrayAdapter<String>(MainActivity.this,
//                android.R.layout.simple_list_item_1,
//                getResources().getStringArray(R.array.timeNamesArray));
//        timeNameAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        timeNames.setAdapter( truckNameAdapter );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu( menu );
    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu );
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        return super.onOptionsItemSelected( item );
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected( item );
    }

    //    @Override
    public static class PlaceholderFragment extends Fragment {
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt( ARG_SECTION_NUMBER, sectionNumber );
            fragment.setArguments( args );
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup pager, Bundle savedInstanceState) {
            View rootView = inflater.inflate( R.layout.fragment_main, pager, false );
            TextView textView = (TextView) rootView.findViewById( R.id.section_label );
            //textView.setText( "Hello World from section: {getArguments().getInt(ARG_SECTION_NUMBER)}" );
            textView.setText( "Hello World from section" );
            return rootView;
        }
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        //public SectionsPagerAdapter(FragmentManager fm) {
        SectionsPagerAdapter(FragmentManager fm) {
            super( fm );
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    TabOne tabOne = new TabOne();
                    return tabOne;
                case 1:
                    TabTwo tabTwo = new TabTwo();
                    return tabTwo;
                case 2:
                    TabThree tabThree = new TabThree();
                    return tabThree;
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Sign-Up";
                case 1:
                    return "Timer";
                case 2:
                    return "Location";
            }
            return null;
        }
    }
}
