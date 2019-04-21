package com.alexdo.projects.debtninja.sharedpref.session;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import com.alexdo.projects.debtninja.ui.login.LoginActivity;

import java.util.HashMap;

public class SessionManager {

    SharedPreferences pref;

    SharedPreferences.Editor editor;

    Context _context;

    private static final String PREF_NAME = "SessionPref";

    private static final String IS_LOGGED_IN = "IsLoggedIn";

    public static final String KEY_USERNAME = "name";

    public SessionManager(Context context){
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = pref.edit();
    }

    public void createLoginSession(String uname){
        editor.putBoolean(IS_LOGGED_IN, true);
        editor.putString(KEY_USERNAME, uname);
        editor.commit();
    }

    public HashMap<String, String> getUserLoginDetails(){
        HashMap<String, String> user = new HashMap<String, String>();
        user.put(KEY_USERNAME, pref.getString(KEY_USERNAME, null));
        return user;
    }

    public void checkLogin(){
        if(!this.isLoggedIn()){
            Intent i = new Intent(_context, LoginActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            _context.startActivity(i);
        }

    }

    private boolean isLoggedIn() {
        return pref.getBoolean(IS_LOGGED_IN, false);
    }

    private void logoutUser(){
        editor.clear();
        editor.commit();
    }

}
