package cat.itb.clubnauticbadalona.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

import cat.itb.clubnauticbadalona.R;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    static NavigationView view;
    NavController navController;
    MenuItem menu_icon;
    MaterialToolbar materialToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        navController = navHostFragment.getNavController();
       view = findViewById(R.id.navigation_view);
       view.setNavigationItemSelectedListener(this);
       hideNavDrawer();
       materialToolbar = findViewById(R.id.top_appbar);
       materialToolbar.setOnClickListener(this::onClick);
    }
    public static void showNavDrawer(){
        view.setVisibility(View.VISIBLE);
    }
    public static void hideNavDrawer(){
        view.setVisibility(View.INVISIBLE);
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.top_appbar:
                showNavDrawer();
        }
    }
}