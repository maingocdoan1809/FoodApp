package huce.home.viewholder;

import android.app.Activity;
import android.app.FragmentContainer;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import huce.foodapp.R;
import huce.foodapp.databinding.CardItemRowBinding;
import huce.home.ItemDetailActivity;
import huce.home.model.CardItem;

public class CardItemHolder extends RecyclerView.ViewHolder {
    protected CardItemRowBinding binding = null;
    public CardItemHolder(@NonNull View itemView) {
        super(itemView);
        binding = CardItemRowBinding.bind(itemView);
        binding.cardView.setOnClickListener((view) -> {
            Intent t = new Intent(itemView.getContext(),
                    ItemDetailActivity.class);
            itemView.getContext().startActivity(t);
        });
    }

    public void setData(CardItem item) {
        binding.foodName.setText(item.getFoodName());
        binding.deliveryTime.setText(item.getDeliveryTime());
        binding.deliveryPromote.setText(item.getDeliveryPromote());
        binding.imgFood.setImageResource(item.getSrcImg());
        binding.imgFood.getLayoutParams().width = 1000;
    }
}
