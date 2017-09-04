package com.example.platzil.platzigram.login.view;

/**
 * Created by Payall on 24-06-2017.
 */

public interface LoginView {

    void enableInputs();
    void disabledInputs();

    void showProgressBar();
    void hideProgressBar();

    void  loginError(String error);

    void goCreateAccount();
    void goContainer();
}
