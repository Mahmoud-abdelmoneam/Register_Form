package com.example.lenvo.register_form;

import android.util.Log;
import android.widget.EditText;

import java.util.regex.Pattern;

/**
 * Created by lenvo on 9/19/2018.
 */

public class Validate {

    public static final Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
    );
    public static final Pattern password_pattern= Pattern.compile("^" +"(?=.*[a-zA-Z])" + "(?=.*[0-9])"+".{4,}" +"$");


    public static boolean validate_email(EditText email){
        String email_input= email.getText().toString().trim() ;
        if(email_input.isEmpty()){
            email.setError("failed can't be empty");
            return false ;
        }
        else if (!EMAIL_ADDRESS_PATTERN.matcher(email_input).matches()){
            email.setError("please enter valid email");
            return false ;
        }
        else
            return true ;
    }

    public static boolean validate_password(EditText password){
         String password_input= password.getText().toString() ;
        if(password_input.isEmpty()){
            password.setError("failed can't be empty");
            return false ;
        }
        else if (!password_pattern.matcher(password_input).matches()){
            password.setError("password too weak");
            return false ;
        }
        else
            return true ;
    }

    public static boolean validate_username(EditText username){
        String username_input= username.getText().toString().trim() ;
        if(username_input.isEmpty()){
            username.setError("failed can't be empty");
            return false ;
        }
        else
            return true ;
    }

    public static boolean validate_mobile(EditText mobile) {
        boolean check=false;
        String phone = mobile.getText().toString().trim();
        if(!Pattern.matches("[a-zA-Z]+", phone)) {
            if(phone.length() < 11 || phone.length() > 11) {
                // if(phone.length() != 10) {
                check = false;
                mobile.setError("Not Valid Number");
            } else {
                check = true;
            }
        } else {
            check=false;
        }
        return check;
    }

    public static boolean check_cnfpass(EditText pass ,EditText cnf_pass){
        boolean temp=true ;
        String cnf_pass_input=cnf_pass.getText().toString() ;
        String pass_input=pass.getText().toString() ;
        if (!cnf_pass_input.equals(pass_input)) {
            Log.e("error", "check_cnfpass: ");
            cnf_pass.setError("password not matching");

            temp=false;
        }
        return temp ;
    }

}
