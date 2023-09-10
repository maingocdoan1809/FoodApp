package huce.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import huce.foodapp.R;
import huce.foodapp.databinding.ActivityListAllFoodBinding;
import huce.home.adapter.CardHorizontalItemAdapter;
import huce.home.adapter.CardItemAdapter;
import huce.home.model.CardItem;
import huce.home.viewholder.CardHorizontalItemHolder;
import huce.home.viewholder.CardItemHolder;

public class ListAllFoodActivity extends AppCompatActivity {

    private ActivityListAllFoodBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view =
                getLayoutInflater().inflate(R.layout.activity_list_all_food, null);
        setContentView(view);
        binding = ActivityListAllFoodBinding.bind(view);

        List<CardItem> items = new ArrayList<>();
        items.add(CardItem.fake());
        items.add(CardItem.fake());
        items.add(CardItem.fake());

        binding.listFoodView.setAdapter(new CardHorizontalItemAdapter(items,
                view.getContext()));

    }
}