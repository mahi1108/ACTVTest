package cubex.mahesh.actvtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView actv =
                    findViewById(R.id.actv1);
      String[ ] values =
               getResources().getStringArray(R.array.countries);
    /*    ArrayList<String> values = new ArrayList<>();
        values.add("Brazil");
        values.add("South Africa");
        values.add("China");
        values.add("Saudi Arebia");  */
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this,
       android.R.layout.simple_list_item_single_choice, values);
        actv.setAdapter(adapter);
        actv.setThreshold(1);
    }
}
