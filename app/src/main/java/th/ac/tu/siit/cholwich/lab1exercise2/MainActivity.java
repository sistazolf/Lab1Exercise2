package th.ac.tu.siit.cholwich.lab1exercise2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void convert(View v) {
        EditText etInput = (EditText) findViewById(R.id.etInput);
        String s = etInput.getText().toString();
        double val = Double.parseDouble(s);


    RadioGroup rgFrom = (RadioGroup) findViewById(R.id.rgFrom);
    int selFrom = rgFrom.getCheckedRadioButtonId();

      if(selFrom==R.id.rbFrmC){ //The user wants to convert from Celsius.
        RadioGroup rgTo = (RadioGroup) findViewById(R.id.rgTo);
        int selTo = rgTo.getCheckedRadioButtonId();

        TextView tv = (TextView) findViewById(R.id.tvOutput);

        if (selTo == R.id.rbToF) {
            double CtoF = ((val * (9.0/5.0)) + 32);
            tv.setText(Double.toString(CtoF));
        }else if (selTo == R.id.rbToK) {
            double CtoK = val + 273.15;
            tv.setText(Double.toString(CtoK));
        }else{
            tv.setText(Double.toString(val));
        }
      }

        if(selFrom==R.id.rbFrmF){ //The user wants to convert from Celsius.
            RadioGroup rgTo = (RadioGroup) findViewById(R.id.rgTo);
            int selTo = rgTo.getCheckedRadioButtonId();

            TextView tv = (TextView) findViewById(R.id.tvOutput);

            if (selTo == R.id.rbToC) {
                double FtoC = ((val-32) * 5/9);
                tv.setText(Double.toString(FtoC));
            }else if (selTo == R.id.rbToK) {
                double FtoK = (val + 459.67) * 5/9;
                tv.setText(Double.toString(FtoK));
            }else{
                tv.setText(Double.toString(val));
            }
        }

        if(selFrom==R.id.rbFrmK){ //The user wants to convert from Celsius.
            RadioGroup rgTo = (RadioGroup) findViewById(R.id.rgTo);
            int selTo = rgTo.getCheckedRadioButtonId();

            TextView tv = (TextView) findViewById(R.id.tvOutput);

            if (selTo == R.id.rbToC) {
                double KtoC = (val-273.15);
                tv.setText(Double.toString(KtoC));
            }else if (selTo == R.id.rbToF) {
                double KtoF = (val*9/5) - 459.67;
                tv.setText(Double.toString(KtoF));
            }else{
                tv.setText(Double.toString(val));
            }
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
