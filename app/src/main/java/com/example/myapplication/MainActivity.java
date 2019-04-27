package com.example.myapplication;

import android.os.Bundle;

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
import android.widget.TextView;

import com.example.myapplication.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {
    private SectionsPagerAdapter mainSectionsPagerAdapter;
    private ViewPager mainViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );

        mainSectionsPagerAdapter = new SectionsPagerAdapter( getSupportFragmentManager() );

        mainViewPager = (ViewPager) findViewById( R.id.container );
        mainViewPager.setAdapter( mainSectionsPagerAdapter );

        TabLayout tabLayout = (TabLayout) findViewById( R.id.tabs );
        tabLayout.setupWithViewPager( mainViewPager );
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
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View rootView = inflater.inflate( R.layout.fragment_main, container, false );
            TextView textView = (TextView) rootView.findViewById( R.id.section_label );
            textView.setText( "Hello World from section: {getArguments().getInt(ARG_SECTION_NUMBER)}" );
//            textView.setText( "Hello World from section" );
            return rootView;
        }
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        public SectionsPagerAdapter(FragmentManager fm) {
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
                    return "Section1";
                case 1:
                    return "Section2";
                case 2:
                    return "Section3";
            }
            return null;
        }
    }
}
