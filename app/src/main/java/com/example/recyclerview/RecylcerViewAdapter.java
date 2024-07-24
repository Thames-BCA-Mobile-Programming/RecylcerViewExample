package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecylcerViewAdapter extends RecyclerView.Adapter<RecylcerViewAdapter.ViewHolder> {
    final ArrayList<DataModel> dataModelArrayList;

    public RecylcerViewAdapter(ArrayList<DataModel> dataModelArrayList) {
        this.dataModelArrayList = dataModelArrayList;
    }

    @NonNull
    @Override
    public RecylcerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyle_items,parent,false);
        return  new ViewHolder(view);
    }
    //last step
    @Override
    public void onBindViewHolder(@NonNull RecylcerViewAdapter.ViewHolder holder, int position) {
        DataModel dataModel = dataModelArrayList.get(position);
        holder.tv1.setText(dataModel.name);
        holder.tv2.setText(dataModel.description);
    }

    @Override
    public int getItemCount() {
        return dataModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
            TextView tv1;
            TextView tv2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.tv_name);
            tv2 = itemView.findViewById(R.id.tv_desc);
        }
    }
}
