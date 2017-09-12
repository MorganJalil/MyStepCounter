package com.example.morga.mystepcounter;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Morga on 2017-09-10.
 */


public class TabFragment2 extends Fragment {

    private IFragmentToActivity mCallback;

    private TextView mTextView1;

    private Button btnFtoA;



    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab_fragment_2, container, false);

        mTextView1 = (TextView) view.findViewById(R.id.textView1);


        return view;

    }



    @Override

    public void onAttach(Context context) {

        super.onAttach(context);

        try {

            mCallback = (IFragmentToActivity) context;

        } catch (ClassCastException e) {

            throw new ClassCastException(context.toString()

                    + " must implement IFragmentToActivity");

        }

    }



    @Override

    public void onDetach() {

        mCallback = null;

        super.onDetach();

    }



    public void onRefresh() {

        Toast.makeText(getActivity(), "Fragment 2: Refresh called.",

                Toast.LENGTH_SHORT).show();

    }



    public void fragmentCommunication() {

        //mTextView1.setText("Hello from Tab Fragment 1");

    }


}