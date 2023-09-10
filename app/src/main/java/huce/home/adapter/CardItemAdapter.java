package huce.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import huce.foodapp.R;
import huce.home.model.CardItem;
import huce.home.viewholder.CardItemHolder;

public class CardItemAdapter extends RecyclerView.Adapter<CardItemHolder> {
    private List<CardItem> listItem;
    private  Context ctx;
    public CardItemAdapter(List<CardItem> items, Context ctx) {
        this.listItem = items;
        this.ctx = ctx;
    }
    @NonNull
    @Override
    public CardItemHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                int viewType) {
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_row, null);
        return new CardItemHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CardItemHolder holder, int position) {
        if (position < this.getItemCount()) {
            CardItem inPosition = this.listItem.get(position);
            holder.setData(inPosition);
        }

    }

    @Override
    public int getItemCount() {
        return this.listItem.size();
    }
}
