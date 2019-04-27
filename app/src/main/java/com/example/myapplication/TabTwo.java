package com.example.myapplication;

import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TabTwo extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.tab_two, container, false );
        return view;
    }
}

class AppModel {
    private final Timer timer = null;

    public AppModel(Timer timer) {

        LayoutInflater inflater = null;
        ViewGroup pager=null;
        View timeView=inflater.inflate(R.layout.tab_two,pager,false);
        final TextView timeText=(TextView) timeView.findViewById( R.id.timeText );
        //timeView.setText

        new CountDownTimer( (long) 1.8e+7, 1000 ) {
            public void onTick(long millisUntilFinished) {
                timeText.setText( "Hours remaining: " + millisUntilFinished / 1000 );
            }

            public void onFinish() {
                timeText.setText( "done!" );
            }
        }.start();
    }
}

class AppView extends AppCompatActivity {
    private AppController controller;

    public AppView() {
        super();
    }

    public int getTime() {
        final TextView txtTimerTime = findViewById( R.id.timeText );
        String editTextValue = txtTimerTime.getText().toString();//returns the number as a String
        String timeString = txtTimerTime.getText().toString();//assign courseNumber to EditText field
        int timeNum = Integer.parseInt( timeString );//makes courseNumber an int
        return timeNum;
    }

//    public boolean changeTimerDisplay(int time) {
//
//        getTime().setText( Integer.toString( time ) );
//        getTime().repaint();
//        return true;
//    }
}

class AppController {
    private final AppModel model;
    private final AppView view;
    private final Timer timer;

    public AppController(AppModel model, AppView view) {
        this.model = model;
        this.view = view;
        this.timer = new Timer( this );
    }

//    public boolean changeTimerDisplay(int time) {
////        return view.changeTimerDisplay( time );
//        return view.changeTimerDisplay( time );
//    }

//    public void startTimer() {
//        timer.start();
//    }

//    public WifiP2pManager.ActionListener getTimerListener() {
//        return new WifiP2pManager.ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (e.getActionCommand().equals( "start" )) {
//                    timer.setRunning( true );
//                } else {
//                    timer.setRunning( false );
//                }
//            }
//        };
}
