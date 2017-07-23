package com.firststep.beautytips;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by DELL on 7/1/2017.
 */

public class TitleAdapter extends RecyclerView.Adapter<TitleAdapter.ViewHolder>{

    private  Context context;
    private List<TitleModel> list;
    private OnItemClickListener itemClickListener;

    public  TitleAdapter(Context context,List<TitleModel> list){
        this.context=context;
        this.list=list;
    }

    @Override
    public TitleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TitleAdapter.ViewHolder holder, int position) {
        TitleModel titleModel=list.get(position);
        Picasso.with(context).load(titleModel.getImage()).into(holder.imageView);
        holder.textView.setText(titleModel.getTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public interface OnItemClickListener{
        void OnItemCLick(View view,int position);
    }

    public void setOnItemClickListener(final OnItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private ImageView imageView;
        private TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView= (ImageView) itemView.findViewById(R.id.image);
            textView= (TextView) itemView.findViewById(R.id.title1);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            itemClickListener.OnItemCLick(v,getAdapterPosition());
        }
    }
}
