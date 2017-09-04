package com.example.platzil.platzigram.login.interactor;

import android.app.Activity;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by Payall on 24-06-2017.
 */

public interface LoginInteractor {
    void signIn(String username, String password, Activity activity , FirebaseAuth firebaseAuth);
}
