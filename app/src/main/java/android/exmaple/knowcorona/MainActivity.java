package android.exmaple.knowcorona;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager =  findViewById(R.id.viewpager);

        CategoryAdapter adapter = new CategoryAdapter(this,getSupportFragmentManager());



        viewPager.setAdapter(adapter);

        TabLayout tabLayout =  findViewById(R.id.tabs);



        tabLayout.setupWithViewPager(viewPager);
    }
    }
