package com.example.platzil.platzigram.login.presenter;

import android.app.Activity;

import com.example.platzil.platzigram.login.interactor.LoginInteractor;
import com.example.platzil.platzigram.login.interactor.LoginInteractorImpl;
import com.example.platzil.platzigram.login.view.LoginView;
import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by Payall on 24-06-2017.
 */

public class LoginPresenterImpl implements LoginPresenter {
    private LoginView loginView;
    private LoginInteractor interactor;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        interactor = new LoginInteractorImpl(this);
    }

    @Override
    public void singIn(String username, String password, Activity activity, FirebaseAuth firebaseAuth) {
        loginView.disabledInputs();
        loginView.showProgressBar();
        interactor.signIn(username, password, activity, firebaseAuth);
    }

    @Override
    public void loginSuccess() {
        loginView.hideProgressBar();
        loginView.goContainer();
    }

    @Override
    public void loginError(String error) {
        loginView.enableInputs();
        loginView.hideProgressBar();
        loginView.loginError(error);

    }
}
