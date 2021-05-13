package cat.itb.clubnauticbadalona.fragments;

import android.os.Bundle;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.navigation.NavigationView;

import cat.itb.clubnauticbadalona.R;


public class HomeFragment extends Fragment {

    CoordinatorLayout coordinatorLayout;
    NavigationView navigationView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        coordinatorLayout = v.findViewById(R.id.coordinator_layout);
        showCoordinator();
        return v;
    }
    public void showCoordinator(){
        coordinatorLayout.setVisibility(View.VISIBLE);
    }
}