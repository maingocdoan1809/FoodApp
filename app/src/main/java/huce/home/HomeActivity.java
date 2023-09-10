package huce.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import huce.foodapp.R;
import huce.foodapp.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view =
                LayoutInflater.from(this).inflate(R.layout.activity_home, null);
        setContentView(view);
        binding = ActivityHomeBinding.bind(view);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FoodSectionFragment foodFragment = (FoodSectionFragment)
        fragmentManager.findFragmentById(R.id.fFoodList);
        foodFragment.setListViewDirection(LinearLayoutManager.HORIZONTAL);
        System.out.println(foodFragment);
        foodFragment.binding.viewAllItem.setClickable(true);
        foodFragment.binding.viewAllItem.setOnClickListener((clickView) -> {
            Intent i = new Intent(this, ListAllFoodActivity.class);
            startActivity(i);
        });

    }



}