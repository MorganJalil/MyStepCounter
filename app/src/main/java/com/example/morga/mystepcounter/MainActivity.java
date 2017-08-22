package com.example.morga.mystepcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.request.OnDataPointListener;

public class MainActivity extends AppCompatActivity implements OnDataPointListener,
    GoogleApiClient.ConnectionCallbacks,
    GoogleApiClient.OnConnectionFailedListener {

    private static final int REQUEST_OAUTH = 1;
    private static final String AUTH_PENDING = "auth_state_pending";
    private boolean authInProgress = false;
    private GoogleApiClient mApiClient;

        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        @Override
        public void onConnected (Bundle bundle){
    }

        @Override
        public void onConnectionSuspended ( int i){
    }

        @Override
        public void onConnectionFailed (ConnectionResult connectionResult){
    }

        @Override
        public void onDataPoint (DataPoint dataPoint){

        }
    }
