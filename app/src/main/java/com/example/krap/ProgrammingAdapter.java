package com.example.krap;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.AccessController;

import static com.example.krap.R.id.imgIcon;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {

    private String[] data;
    public ProgrammingAdapter(String[] data)
    {
        this.data=data;
    }

    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //AccessController parent;
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View view=inflater.inflate(R.layout.list_item_layout,viewGroup,false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder programmingViewHolder, int position) {
        String name=data[position];
        programmingViewHolder.txtName.setText(name);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{
        ImageView imgIcon;
        TextView txtName;
        public ProgrammingViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon=(ImageView) itemView.findViewById(R.id.imgIcon);
            txtName=(TextView) itemView.findViewById(R.id.txtName);

        }
    }
}
