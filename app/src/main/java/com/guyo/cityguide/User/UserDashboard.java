package com.guyo.cityguide.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import com.guyo.cityguide.HelperClasses.HomeAdapter.FeaturedAdapter;
import com.guyo.cityguide.HelperClasses.HomeAdapter.FeaturedHelperClass;
import com.guyo.cityguide.R;

import java.util.ArrayList;

public class UserDashboard extends AppCompatActivity {

    RecyclerView featuredRecycler;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_dashboard);

        //hooks
        featuredRecycler = findViewById(R.id.featured_recycler);
        
        featuredRecycler();
    }

    private void featuredRecycler() {

        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<FeaturedHelperClass> featuredHelperClass = new ArrayList<>();

        featuredHelperClass.add(new FeaturedHelperClass(R.drawable.artcafe, "ArtCafe", "askd aksdkdkasd aksjdif jdsa"));
        featuredHelperClass.add(new FeaturedHelperClass(R.drawable.artcafe, "ArtCafe", "askd aksdkdkasd aksjdif jdsa"));
        featuredHelperClass.add(new FeaturedHelperClass(R.drawable.artcafe, "ArtCafe", "askd aksdkdkasd aksjdif jdsa"));
        
        adapter = new FeaturedAdapter(featuredHelperClass);
        featuredRecycler.setAdapter(adapter);
    }


}