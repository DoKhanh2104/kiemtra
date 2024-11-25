package com.example.baitapcanhan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    // Dummy data
    private List<String> items = List.of("Item 1", "Item 2", "Item 3");

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String item = items.get(position);
        holder.titleTextView.setText(item);
        // Set click listeners if needed
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        Button buyNowButton;
        ImageView deleteIcon;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            buyNowButton = itemView.findViewById(R.id.buyNowButton);
            deleteIcon = itemView.findViewById(R.id.deleteIcon);
        }
    }
}
