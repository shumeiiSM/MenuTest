package com.example.a17010233.menutest;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

/**
 * Created by 17010233 on 4/1/2019.
 */

public class ContactFragment extends Fragment {

    ListView lvFriend;
    ArrayList<FriendItem> alFriendList;
    CustomAdapterFriend caFriend;
    Button addFriend;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_contact, container, false);

        lvFriend = rootView.findViewById(R.id.friendLv);
        addFriend = rootView.findViewById(R.id.buttonAdd);

        alFriendList = new ArrayList<>();

        FriendItem item1 = new FriendItem("Vanessa", "9111 1111", true);
        FriendItem item2 = new FriendItem("Meng Kiong", "9222 2222", false);
        FriendItem item3 = new FriendItem("Shao Jie", "9333 3333", false);
        FriendItem item4 = new FriendItem("Alvina", "9444 4444", true);
        FriendItem item5 = new FriendItem("Norman", "9555 5555", false);
        alFriendList.add(item1);
        alFriendList.add(item2);
        alFriendList.add(item3);
        alFriendList.add(item4);
        alFriendList.add(item5);

        caFriend = new CustomAdapterFriend(getContext(), R.layout.friendlist, alFriendList);

        lvFriend.setAdapter(caFriend);

        addFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = (LayoutInflater)getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View viewDialog = inflater.inflate(R.layout.add_friend, null);

                final EditText etName = viewDialog.findViewById(R.id.editTextN);
                final EditText etNum = viewDialog.findViewById(R.id.editTextNum);
                final RadioButton etMale = viewDialog.findViewById(R.id.radioButtonM);
                final RadioButton etFemale = viewDialog.findViewById(R.id.radioButtonF);

                AlertDialog.Builder myBuilder = new AlertDialog.Builder(view.getContext());
                myBuilder.setView(viewDialog);
                myBuilder.setTitle("Add New Friend");
                myBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // Extract the text entered by the user
                        String theName = etName.getText().toString();
                        String theNum = etNum.getText().toString();

//                        String theMale = etMale.getText().toString();
//                        String theFemale = etFemale.getText().toString();


                        if (etMale.isChecked()) {
                            Boolean gender = false;
                            FriendItem newItem = new FriendItem(theName, theNum, gender);
                            alFriendList.add(newItem);
                        } else {
                            Boolean gender = true;
                            FriendItem newItem = new FriendItem(theName, theNum, gender);
                            alFriendList.add(newItem);
                        }

                        // Set the text to the ListView
                    }
                });
                myBuilder.setNegativeButton("CANCEL", null);
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();


            }
        });

        return rootView;


    }
}
