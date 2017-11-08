package name.vanstaden.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import name.vanstaden.greetinglib.Greeter;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActvity",
            WHO = "User";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView greetingTextView = findViewById(R.id.txtGreeting);
        greetingTextView.setText(new Greeter().greet(WHO));
    }
}
