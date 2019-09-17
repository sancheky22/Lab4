package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {

    private CakeView cakeView;
    private CakeModel cakeModel;

    public CakeController(CakeView cv) {
        cakeView = cv;
        cakeModel = cv.getCakeModel();

    }

    @Override
    public void onClick(View v) {
       Log.d("ButtonClick","You Clicked Me!");
      this.cakeModel.isCandleLit = !this.cakeModel.isCandleLit;

    }

    public void onCheckedChanged(CompoundButton button, boolean hasCandles) {
        this.cakeModel.hasCandles = !this.cakeModel.hasCandles;

    }
    @Override
    public void onProgressChanged(SeekBar seekBar, int seekNumCandles, boolean isCakeFrosted){
        this.cakeModel.numCandles = seekNumCandles;
        cakeView.invalidate();
    }

    public void onStartTrackingTouch(SeekBar seekBar){}

    public void onStopTrackingTouch(SeekBar seekBar){}


}
