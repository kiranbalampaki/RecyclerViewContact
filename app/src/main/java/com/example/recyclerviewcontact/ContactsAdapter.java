package com.example.recyclerviewcontact;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder> {

    Context mContext;
    List<Contacts> contactsList;
    public ContactsAdapter(Context mContext, List<Contacts> contactsList){
        this.mContext = mContext;
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_conacts, parent, false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
        Contacts contacts = contactsList.get(position);
        holder.imgProfile.setImageResource(contacts.getGender().equals("male") ? R.drawable.male : R.drawable.female);
        holder.tvName.setText(contacts.getName());
        holder.tvAge.setText(contacts.getAge());
        holder.tvAddress.setText(contacts.getAddress());
        holder.tvGender.setText(contacts.getGender());
    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder{
        ImageView imgProfile;
        TextView tvName, tvAge, tvAddress, tvGender;

        public ContactsViewHolder(View itemView){
            super(itemView);
            imgProfile = itemView.findViewById(R.id.imgProfile);
            tvName = itemView.findViewById(R.id.tvName);
            tvAge = itemView.findViewById(R.id.tvAge);
            tvAddress = itemView.findViewById(R.id.tvAddress);
            tvGender = itemView.findViewById(R.id.tvGender);
        }
    }
}
