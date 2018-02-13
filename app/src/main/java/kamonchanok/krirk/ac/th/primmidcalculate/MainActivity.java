package kamonchanok.krirk.ac.th.primmidcalculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kamonchanok.krirk.ac.th.primmidcalculate.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add Fragment
        if (savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMainFragment, new MainFragment())
                    .commit();
        }
    }
}
