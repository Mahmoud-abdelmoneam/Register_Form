package com.example.lenvo.register_form.Data_Storage;

/**
 * Created by lenvo on 9/20/2018.
 */

public class Data_store {
    private static String s_email ;
    private static String s_user_name ;
    private static String s_phone ;
    private static String s_password ;

        public static void store_email (String email){
            s_email=email ;
        }

        public static void store_username (String user_name){
            s_user_name=user_name;
        }
        public static void store_phone (String phone){
            s_phone=phone;
        }
        public static void store_pass (String pass){
            s_password=pass ;
        }
}
