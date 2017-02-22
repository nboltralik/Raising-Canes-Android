package com.example.nick.raisingcanesua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout touch = (LinearLayout) findViewById(R.id.touch);
        final TextView outputText = (TextView) findViewById(R.id.text);
        //final TextView timeText = (TextView) findViewById(R.id.day);
        final TextView hoursText = (TextView) findViewById(R.id.hours);
        final ImageView img= (ImageView) findViewById(R.id.image);

        touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                CanesRunner actual = new CanesRunner(calendar.get(Calendar.DAY_OF_WEEK), calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
                outputText.setText(actual.getOutput());
        //        timeText.setText("Day: "+actual.getDay()+" Time: "+actual.getTime());
                hoursText.setText("Today's Hours:\n"+actual.getSchedule());
                if (actual.isOpen())
                    img.setImageResource(R.drawable.open);
                else
                    img.setImageResource(R.drawable.closed);
                /*int c=1;
                while (c<=30) {
                    CanesRunner n = new CanesRunner(calendar.get(Calendar.DAY_OF_WEEK), calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE)+c);
                    if (!(n.isOpen())) {
                        outputText.setText("Better hurry, Cane's closes in "+c+" minutes");
                        break;
                    }
                    c++;
                }*/
            }
        });

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
