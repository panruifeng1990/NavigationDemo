package view.pan.com.navigationdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.navigation.Navigation;

public class FristFragment extends Fragment implements View.OnClickListener {
    Button bt_first = null;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_first, container, false);
        bt_first = view.findViewById(R.id.bt_first);
        bt_first.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_first:
                Navigation.findNavController(view).navigate(R.id.action_fristFragment_to_firstActivity);
                break;
        }
    }
}
