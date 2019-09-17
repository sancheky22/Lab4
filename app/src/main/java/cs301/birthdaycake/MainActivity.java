package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView realCakeView = (CakeView) findViewById(R.id.cakeview);

        CakeController newCakeController = new CakeController(realCakeView);

        Button blowOut = (Button) findViewById(R.id.blowOut);

        Switch candleSwitch = (Switch) findViewById(R.id.candleSwitch);

        SeekBar mySb = (SeekBar) findViewById(R.id.seekBar);

        blowOut.setOnClickListener(newCakeController);

        candleSwitch.setOnCheckedChangeListener(newCakeController);

        mySb.setOnSeekBarChangeListener(newCakeController);


    }

    public void goodbye(View button) {
        Log.i("button", "Goodbye");
    }
}
