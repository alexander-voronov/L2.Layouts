package ru.gb.course1.l2layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    private boolean mShrink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TableLayout table = (TableLayout) findViewById(R.id.tablelayout);
        Button button = (Button) findViewById(R.id.button_equals);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                mShrink = !mShrink;
                table.setColumnShrinkable(0, mShrink);
            }
        });
        mShrink = table.isColumnShrinkable(0);
    }
}