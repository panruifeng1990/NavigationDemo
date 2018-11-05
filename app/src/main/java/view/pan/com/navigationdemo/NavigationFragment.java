package view.pan.com.navigationdemo;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;

import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

public class NavigationFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_fragment);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.frag_nav_bottom_navigation);
        NavController navController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(navigation,navController);
    }
    @Override
    public boolean onSupportNavigateUp() {
        android.support.v4.app.Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.frag_nav_bottom_navigation);
        return NavHostFragment.findNavController(fragment).navigateUp();
    }
}
