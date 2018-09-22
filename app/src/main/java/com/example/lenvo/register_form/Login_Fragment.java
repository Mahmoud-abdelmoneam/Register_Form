package com.example.lenvo.register_form;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by lenvo on 9/17/2018.
 */


public class Login_Fragment extends Fragment {

    EditText password;
    EditText username ;
    Button login;


    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_login,container,false);
        updateUI(v);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Validate.validate_password(password);
                Validate.validate_username(username);

            }
        });

        return v;

    }

    public void updateUI(View v) {
        password = (EditText) v.findViewById(R.id.password);
        username = (EditText) v.findViewById(R.id.username);
        login = (Button) v.findViewById(R.id.login_button);
    }
}
