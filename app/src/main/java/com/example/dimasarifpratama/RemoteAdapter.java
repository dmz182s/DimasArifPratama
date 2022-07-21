package com.example.dimasarifpratama;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RemoteAdapter extends RecyclerView.Adapter<RemoteAdapter.RemoteViewHolder> {

    List<Remote> mRemotes;
    Remote remote;
    Context mcontext;

    public RemoteAdapter(Context context, List<Remote> remotes)
    {
        mcontext = context;
        mRemotes = remotes;
    }

    public RemoteAdapter.RemoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mcontext);
        return new RemoteViewHolder (layoutInflater.inflate(R.layout.item_list,parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull RemoteViewHolder holder, int position){
        remote = mRemotes.get(position);
        if (remote.getmPower()==1){
            holder.mLamp
        }
    }
}
