package com.mobi.goldstar.toosapp;

import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;

import com.mobi.goldstar.toosapp.Fragments.ChatFragment;
import com.mobi.goldstar.toosapp.Fragments.HomeFragment;
import com.mobi.goldstar.toosapp.Fragments.NotificationFragment;
import com.mobi.goldstar.toosapp.Fragments.SearchFragment;
import com.mobi.goldstar.toosapp.Fragments.UserFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class MainActivity extends FragmentActivity {

    private BottomBar bottomBar;
    FragmentTransaction transaction;

    HomeFragment homeFragment;
    SearchFragment searchFragment;
    ChatFragment chatFragment;
    NotificationFragment notificationFragment;
    UserFragment userFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomBar = (BottomBar) findViewById(R.id.bottomBar);



        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                transaction = getSupportFragmentManager().beginTransaction();
                switch (tabId) {
                    case R.id.tab_home:
                        homeFragment = new HomeFragment();
                        transaction.replace(R.id.contentContainer, homeFragment);
                        break;
                    case R.id.tab_search:
                        searchFragment = new SearchFragment();
                        transaction.replace(R.id.contentContainer, searchFragment);
                        break;
                    case R.id.tab_chat:
                        chatFragment = new ChatFragment();
                        transaction.replace(R.id.contentContainer, chatFragment);
                        break;
                    case R.id.tab_notification:
                        notificationFragment = new NotificationFragment();
                        transaction.replace(R.id.contentContainer, notificationFragment);
                        break;
                    case R.id.tab_profile:
                        userFragment = new UserFragment();
                        transaction.replace(R.id.contentContainer, userFragment);
                        break;
                    default:
                        break;
                }
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

    }
}
