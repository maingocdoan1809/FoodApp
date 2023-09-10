package huce.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import java.util.List;

import huce.foodapp.R;
import huce.home.model.CardItem;
import huce.home.viewholder.CardHorizontalItemHolder;
import huce.home.viewholder.CardItemHolder;

public class CardHorizontalItemAdapter extends CardItemAdapter {
    public CardHorizontalItemAdapter(List<CardItem> items, Context ctx) {
        super(items, ctx);
    }

    @NonNull
    @Override
    public CardItemHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                             int viewType) {
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_row, null);
        return new CardHorizontalItemHolder(view);
    }
}
