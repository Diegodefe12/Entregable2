package com.example.defel.entregable_android;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home_Fragment extends Fragment {

    private View vistaDelFragment;


    public Home_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vistaDelFragment = inflater.inflate(R.layout.fragment_home_, container, false);


        // Inflate the layout for this fragment
        return vistaDelFragment;
    }

}
