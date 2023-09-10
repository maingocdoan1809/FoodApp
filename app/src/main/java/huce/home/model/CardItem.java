package huce.home.model;

import android.content.Intent;

import java.io.Serializable;

import huce.foodapp.R;
import huce.foodapp.databinding.CardItemRowBinding;

public class CardItem implements Serializable {
    private CardItemRowBinding binding;
    private String foodName;
    private String deliveryPromote;
    private String deliveryTime;
    private  int srcImg;

    public static CardItem fake() {
        CardItem item = new CardItem();
        item.foodName = "Pho Bo";
        item.deliveryPromote = "Free ship.";
        item.deliveryTime = "20-30 mins";
        item.srcImg = R.drawable.phobo;

        return  item;
    }

    public CardItemRowBinding getBinding() {
        return binding;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getDeliveryPromote() {
        return deliveryPromote;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public int getSrcImg() {
        return srcImg;
    }
}
