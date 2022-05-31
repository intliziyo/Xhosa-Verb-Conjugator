package com.inglesteacher.xhosaverbconjugatorjava;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class VerbAdapter extends RecyclerView.Adapter<VerbAdapter.ViewHolder> {

    private ArrayList<String> mDataSet;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView textView;


        public ViewHolder(@NonNull View view) {
            super(view);

            textView = (TextView) view.findViewById(R.id.textView);

        }

        public TextView getTextView() {
            return textView;
        }

    }

    public VerbAdapter(ArrayList<String> dataSet){
        mDataSet = dataSet;
    }
    @NonNull
    @Override
    public VerbAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.verb_details, viewGroup, false);

        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull VerbAdapter.ViewHolder viewHolder, int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.getTextView().setText(mDataSet.get(position));


    }

    // Return the size of your dataset (invoked by the layout manager)

    @Override
    public int getItemCount() {
        return mDataSet.size();

    }


}
