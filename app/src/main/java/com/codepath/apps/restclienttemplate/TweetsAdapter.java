package com.codepath.apps.restclienttemplate;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TweetsAdapter {

    //pass in context and list of tweets

    //for each row, inflate layout

    //bind values based on position of the element

    //define viewholder
    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivProfileImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
