package com.example.a17010233.menutest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ToggleButton;

/**
 * Created by 17010233 on 4/1/2019.
 */

public class HomeFragment extends Fragment {

    private HomeFragment homeFragment;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        ListView lv = rootView.findViewById(R.id.oweList);
        ToggleButton tb = rootView.findViewById(R.id.toggleButtonOwe);

        FloatingActionButton mFab = rootView.findViewById(R.id.floatingActionButton);

        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(view.getContext(), AddBill.class);

                // Intent intent = new Intent(getActivity().getApplication(), AddBill.class);
                startActivity(intent);
            }
        });







        return rootView;
    }


}
