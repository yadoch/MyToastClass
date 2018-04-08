package tw.com.abc.mytoastclass;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

// 取自 https://magiclen.org/android-toast/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnToast(View view) {
        Toast.setContext(this);
        Toast.setPosition(Toast.Position.RIGHT_BOTTOM);

        ToastView tv = new ToastView(this);
        tv.setRadius(50);
        tv.setTextSize(50);
        tv.setBackgroundColor(Color.argb(0xAA, 0x00, 0xAA, 0x00));

        Toast.setToastView(tv);

        Toast.showToast("氣泡訊息！");
    }
}
