package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MailAdapter extends RecyclerView.Adapter<MailAdapter.EmailViewHolder> {

    List<Mail> emailList;
    Context mContext;

    public MailAdapter(List<Mail> emailList, Context mContext) {
        this.emailList = emailList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public EmailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mail_view, parent, false);

        return new EmailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmailViewHolder holder, int position) {
        Mail item = emailList.get(position);

        holder.name.setText(item.name);
        holder.title.setText(item.title);
        holder.detail.setText(item.detail);
        holder.date.setText(item.time);

    }

    @Override
    public int getItemCount() {
        return emailList.size();
    }

    public class EmailViewHolder extends RecyclerView.ViewHolder {
        TextView name, title, detail, date;

        public EmailViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            title = itemView.findViewById(R.id.title);
            detail = itemView.findViewById(R.id.detail);
            date = itemView.findViewById(R.id.date);

        }
    }
}
