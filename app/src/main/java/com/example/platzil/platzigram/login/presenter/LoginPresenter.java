package com.example.platzil.platzigram.login.presenter;

import android.app.Activity;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by Payall on 24-06-2017.
 */

public interface LoginPresenter {

    void singIn(String username, String password, Activity activity, FirebaseAuth firebaseAuth); //Interactor
    void loginSuccess();
    void loginError(String error);
}
