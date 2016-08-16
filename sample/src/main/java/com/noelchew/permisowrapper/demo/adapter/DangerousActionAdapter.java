package com.noelchew.permisowrapper.demo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.noelchew.permisowrapper.demo.actions.DangerousAction;
import com.noelchew.permisowrapper.demo.R;
import com.noelchew.permisowrapper.demo.listener.OnClickListener;

import java.util.ArrayList;

/**
 * Created by aio-synergy on 05/08/2016.
 */
public class DangerousActionAdapter extends RecyclerView.Adapter<DangerousActionAdapter.ViewHolder> {

    ArrayList<DangerousAction> dangerousActionArrayList;
    private Context context;
    private OnClickListener listener;

    public DangerousActionAdapter(Context context, ArrayList<DangerousAction> dangerousActionArrayList, OnClickListener listener) {
        this.context = context;
        this.dangerousActionArrayList = dangerousActionArrayList;
        this.listener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem_button, parent, false);
        ViewHolder viewHolder = new ViewHolder(v, listener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (holder != null) {
            holder.update(dangerousActionArrayList.get(position), position);
        }
    }

    @Override
    public int getItemCount() {
        if (dangerousActionArrayList == null) {
            return 0;
        } else {
            return dangerousActionArrayList.size();
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private Button btn;
        private OnClickListener listener;

        public ViewHolder(View v, OnClickListener listener) {
            super(v);
            btn = (Button) v.findViewById(R.id.button);
            this.listener = listener;
        }

        public void update(DangerousAction dangerousAction, final int position) {
            btn.setText(dangerousAction.getActionName());
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onClick(position);
                }
            });
        }
    }
}
