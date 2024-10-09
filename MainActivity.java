 package com.example.fragmentmake;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

 public class MainActivity extends AppCompatActivity implements Dialogclass.myInterface {
    Button btn1;
    TextView show,categoyy,budgett;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button) findViewById(R.id.nextfr);
        show=(TextView) findViewById(R.id.showname);
        categoyy=(TextView) findViewById(R.id.cat);
        budgett=(TextView) findViewById(R.id.bug);

        Intent intent= getIntent();
        String s=intent.getStringExtra("key");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction frag=fm.beginTransaction();
                frag.replace(R.id.frameLayout,new BlankFragment());
                frag.commit();
            }
        });
    }

     public void opendialog(View view) {
        Dialogclass custdia=new Dialogclass();
        custdia.show(getSupportFragmentManager(),"Test cCustomDiag");
     }

     @Override
     public void applyTxtsmeth(String txt1, String txt2) {
         categoyy.setText(txt1);
         budgett.setText(txt2);
     }
 }