package com.example.aditi_pc.to_do_103;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

import static android.os.Build.VERSION_CODES.M;

public class PopWindow extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_window);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width * 0.8),(int)(height*0.4));

        Bundle extras = getIntent().getExtras();
        String exampleString = extras.getString("text");

        TextView myAwesomeTextView = (TextView)findViewById(R.id.PopupText);
        myAwesomeTextView.setText(exampleString);

    }

    public void setReminder(View view) {



    }

    public void markImportant(View view) {
    }
}
