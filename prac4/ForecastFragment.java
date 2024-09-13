package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ForecastFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_forecast,container, false);
        LinearLayout linearLayout = view.findViewById(R.id.linear_layout);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        view.setBackgroundColor((0x20FF0000));
        TextView textView = view.findViewById(R.id.tv1);
        ImageView imageView = view.findViewById(R.id.img1);
        textView.setText("Thursday");
        imageView.setImageResource(R.drawable.sun);

        return view;
    }
}