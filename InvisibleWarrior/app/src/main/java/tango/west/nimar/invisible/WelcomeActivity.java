package tango.west.nimar.invisible;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Tarun on 05-02-2015.
 */
public class WelcomeActivity extends Activity {
    TextView textView = null;
    ImageView imageView1, imageView2 = null;
    Intent intent = null;
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);

        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        textView = (TextView) findViewById(R.id.textView);

        new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {

				/*startActivity(new Intent(getApplicationContext(),WarriorActivity.class));
				finish();*/
                intent = new Intent(WelcomeActivity.this, MapsActivity.class);
                startActivity(intent);
                finish();
            }

        }, SPLASH_TIME_OUT);

    }
}
