package com.praful.gsondemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by CBT on 18-07-2017.
 */

public class PlayerAdapter extends RecyclerView.Adapter {

    Context ctx;
    public PlayerAdapter(Context context) {
        this.ctx = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //Converting row.xml to java object
        View v1 = LayoutInflater.from(ctx).inflate(R.layout.row,null,false);
        PlayerViewHolder viewHolder = new PlayerViewHolder(v1);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class PlayerViewHolder extends RecyclerView.ViewHolder {

        ImageView playerPic;
        TextView playerName,playerRuns;
        public PlayerViewHolder(View itemView) {
            super(itemView);
            playerPic = (ImageView)itemView.findViewById(R.id.row_playerImg_iv);
            playerName = (TextView)itemView.findViewById(R.id.row_playerName_tv);
            playerRuns = (TextView)itemView.findViewById(R.id.row_playerRuns_tv);
        }
    }
}
