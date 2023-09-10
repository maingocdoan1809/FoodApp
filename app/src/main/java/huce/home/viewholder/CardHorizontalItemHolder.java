package huce.home.viewholder;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;

import androidx.annotation.NonNull;

import huce.home.model.CardItem;

public class CardHorizontalItemHolder extends CardItemHolder{
    public CardHorizontalItemHolder(@NonNull View itemView) {
        super(itemView);
    }
    public void setData(CardItem item) {
        super.setData(item);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) itemView.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;
        binding.imgFood.getLayoutParams().width = width;

    }
}
