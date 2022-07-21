package com.example.dimasarifpratama;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class ListDataFragment extends Fragment implements NavigationView.OnNavigationItemSelectedListener {

    List<Remote> mRemotes = new ArrayList<>();
    RecyclerView mRecyclerView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view v = inflater.inflate(R.layout.lihat_data, container, false);
        mRecyclerView = (RecyclerView) v.findViewById(R.id.data);
        new LoadListdata().execute();
        return v;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
    return true;

    }