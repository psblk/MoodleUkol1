package com.psblk.moodleukol1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pokoje extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokoje);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btnstandart:
                Intent IntSt = new Intent(this,PokSt.class);
                startActivity(IntSt);
                break;
            case R.id.btndeluxe:
                Intent IntDL = new Intent(this, PokDL.class);
                startActivity(IntDL);
                break;
        }
    }
}
