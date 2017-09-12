package multamedio.de.fragmenttransactiontest;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * TODO: Enter a description.
 */

public class FirstFragment extends Fragment {

    //region MEMBER - DATA
    @NonNull
    public static final String FRAGMENT_TAG = "FirstFragment";
    //endregion

    public FirstFragment() {
        // Required empty public constructor
    }

    //region LIFE CYCLE
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Button tButton = getActivity().findViewById(R.id.show_button);

        tButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View aView) {
                MainActivity tMainActivity = (MainActivity) getActivity();
                tMainActivity.showSecondFragment();
            }
        });

    }


    @Override
    public void onStart() {
        super.onStart();

    }
    //endregion
}
