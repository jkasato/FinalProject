package com.example.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class TabOne extends Fragment //implements View.OnClickListener
        {
    private Button mButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup
            container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate( R.layout.tab_one, container, false );
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        //setContentView( R.layout.tab_one );

        //mButton = findViewById( R.id.enterButton );
        //mButton.setOnClickListener( this );

    }

    public void sendMessage(View view) {
        // Do something in response to button click
    }

//    public void sendMessage(View view) {
//        // Do something in response to button click
//    }
//    implements View.OnClickListener{
//        private Button mButton;
//        @Override
//        protected void onCreate (Bundle savedInstanceState){
//            super.onCreate( savedInstanceState );
//            setContentView( R.layout.activity_main );
//
//            mButton = findViewById( R.id.enterButton );
//            mButton.setOnClickListener( this );
//        }
//        @Override
//        public void onClick (View view){
//            switch (view.getId()) {
//                case R.id.enterButton:
//                    // Do something
//            }
//        }
//    }
}
