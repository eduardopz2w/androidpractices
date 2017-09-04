package com.example.platzil.platzigram.login.interactor;

import android.app.Activity;

import com.example.platzil.platzigram.login.presenter.LoginPresenter;
import com.example.platzil.platzigram.login.repository.LoginRepository;
import com.example.platzil.platzigram.login.repository.LoginRepositoryImpl;
import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by Payall on 24-06-2017.
 */

public class LoginInteractorImpl implements LoginInteractor {
    private LoginPresenter presenter;
    private LoginRepository repository;

    public LoginInteractorImpl(LoginPresenter presenter) {
        this.presenter = presenter;
        repository = new LoginRepositoryImpl(presenter);
    }

    @Override
    public void signIn(String username, String password, Activity activity , FirebaseAuth firebaseAuth) {
        repository.signIn(username, password, activity, firebaseAuth);

    }
}
