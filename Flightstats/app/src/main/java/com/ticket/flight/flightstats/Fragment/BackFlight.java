package com.ticket.flight.flightstats.Fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ticket.flight.flightstats.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BackFlight extends Fragment {


    public BackFlight() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_back_flight, container, false);
    }


}
