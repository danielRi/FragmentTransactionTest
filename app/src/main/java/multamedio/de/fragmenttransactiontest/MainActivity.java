package multamedio.de.fragmenttransactiontest;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FirstFragment iFirstFragment;
    SecondFragment iSecondFragment;

    FragmentTransaction iFragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iFirstFragment = new FirstFragment();
        iSecondFragment = new SecondFragment();


        // Adding the iSecondFragment and instantly hide it, so that the view is already inflated.
        iFragmentTransaction= getSupportFragmentManager().beginTransaction();
        iFragmentTransaction.add(R.id.fragment_container, iFirstFragment, FirstFragment.FRAGMENT_TAG);
        iFragmentTransaction.add(R.id.fragment_container, iSecondFragment, SecondFragment.FRAGMENT_TAG);
        iFragmentTransaction.hide(iSecondFragment);
        iFragmentTransaction.commit();

    }


    @Override
    protected void onStart() {
        super.onStart();



    }

    public void showSecondFragment() {
        iFragmentTransaction= getSupportFragmentManager().beginTransaction();

        iFragmentTransaction.hide(iFirstFragment);
        iFragmentTransaction.show(iSecondFragment);


        iFragmentTransaction.addToBackStack(null);
        iFragmentTransaction.commit();
    }
}
