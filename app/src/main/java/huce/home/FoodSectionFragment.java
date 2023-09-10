package huce.home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.LayoutDirection;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import huce.foodapp.R;
import huce.foodapp.databinding.FragmentFoodSectionBinding;
import huce.home.adapter.CardItemAdapter;
import huce.home.model.CardItem;
import huce.home.viewholder.CardHorizontalItemHolder;
import huce.home.viewholder.CardItemHolder;

public class FoodSectionFragment extends Fragment {
    public FragmentFoodSectionBinding binding;
    public  int direction = LinearLayoutManager.HORIZONTAL;
    View currentView = null;
    public FoodSectionFragment() {

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Inflate the layout for this fragment
        View view =
                getLayoutInflater().inflate(R.layout.fragment_food_section, null);
        currentView = view;
        binding = FragmentFoodSectionBinding.bind(view);

    }

    public void setListViewDirection(int manager) {

        this.direction =  manager;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        List<CardItem> items = new ArrayList<>();

        items.add(CardItem.fake());
        items.add(CardItem.fake());
        items.add(CardItem.fake());
        RecyclerView.Adapter adapter =
                new CardItemAdapter(items,
                        binding.getRoot().getContext());

        RecyclerView recyclerView = binding.listFoodView;
        LinearLayoutManager layout =
                new LinearLayoutManager(this.getContext(),
                        this.direction == 0 ?
                                LinearLayoutManager.HORIZONTAL :
                                LinearLayoutManager.VERTICAL,
                        false);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layout);
        return currentView;
    }
}