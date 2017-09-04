package com.example.platzil.platzigram.view;

import android.app.FragmentTransaction;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.platzil.platzigram.R;
import com.example.platzil.platzigram.post.view.HomeFragment;
import com.example.platzil.platzigram.view.fragment.ProfileFragment;
import com.example.platzil.platzigram.view.fragment.SearchFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class ContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        BottomBar bottombar = (BottomBar) findViewById(R.id.bottombbar);
        bottombar.setDefaultTab(R.id.home);

        bottombar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if (tabId == R.id.home) {
                    HomeFragment homeFragment = new HomeFragment();
                    selectFragment(homeFragment);

                } else if (tabId == R.id.search) {
                    SearchFragment searchFragment = new SearchFragment();
                    selectFragment(searchFragment);

                } else if (tabId == R.id.profile) {
                    ProfileFragment profileFragment = new ProfileFragment();
                    selectFragment(profileFragment);
                }

            }
        });
    }

    public void selectFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .addToBackStack(null).commit();

    }
}
