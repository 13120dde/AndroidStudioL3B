package a13solutions.androidstudiol3b;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends Activity {

    private ListFragment listFragment;
    private InfoFragment infoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instantiateController();
    }

    private void instantiateController() {
        FragmentManager fm = getFragmentManager();
        listFragment = (ListFragment) fm.findFragmentById(R.id.fragList);
        infoFragment = (InfoFragment) fm.findFragmentById(R.id.fragInfo);
        new Controller(listFragment,infoFragment);
    }
}
