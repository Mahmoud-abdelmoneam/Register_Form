package com.example.lenvo.register_form;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.lenvo.register_form.Data_Storage.Data_store;


/**
 * Created by lenvo on 9/17/2018.
 */


public class Register_Fragment extends Fragment {
    EditText email ;
    EditText password;
    EditText username ;
    EditText mobile ;
    EditText re_password;
    Button submit;


    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

         View v = inflater.inflate(R.layout.fragment_register,container,false);
         updateUI(v);
         submit.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Validate.validate_email(email);
                 Validate.validate_mobile(mobile);
                 Validate.validate_password(password);
                 Validate.validate_username(username);
                 Validate.check_cnfpass(password,re_password) ;

                 };


         });
        Data_store.store_email(email.getText().toString());
        Data_store.store_username(username.getText().toString());
        Data_store.store_phone(mobile.getText().toString());
        Data_store.store_pass(password.getText().toString());


        return v;

    }

    public void updateUI(View v) {
        password = (EditText) v.findViewById(R.id.passwordedittext_register);
        email =    (EditText) v.findViewById(R.id.emailedittext);
        username =  (EditText) v.findViewById(R.id.username_register_edittext);
        mobile = (EditText) v.findViewById(R.id.Mobile_edittext);
        re_password = (EditText) v.findViewById(R.id.passwordedittext_register);
        submit = (Button) v.findViewById(R.id.submit);
    }


}
