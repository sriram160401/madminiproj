package com.example.madmini.project;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.LinearLayout;



public class About extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

//        book = findViewById(R.id.book);
//        about = findViewById(R.id.about);
//        contact = findViewById(R.id.contact);
//        city = findViewById(R.id.city);
//        more = findViewById(R.id.more);

//
//
//        book.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(About.this, MainActivity.class);
//                startActivity(i);
//                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
//                finish();
//            }
//        });
//        contact.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(About.this, Contact.class);
//                startActivity(i);
//                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
//                finish();
//            }
//        });
//        city.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(About.this, MainActivity.class);
//                startActivity(i);
//                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
//                finish();
//            }
//        });
//        more.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(About.this, MainActivity.class);
//                startActivity(i);
//                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
//                finish();
//            }
//        });
//                @Override
//                public void onBackpressed(){
//                    Intent i = new Intent(About.this,MainActivity.class);
//                    startActivity(i);
//                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
//
//                }
//            });
//            new AlertDialog.Builder(this)
//                    .setTitle("Exit")
//                    .setMessage("Are you sure you want to exit?")
//                    .setNegativeButton(android.R.string.no, null)
//                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
//
//                        public void onClick(DialogInterface arg0, int arg1) {
//                            Contact.super.onBackPressed();
//                        }
//                    }).create().show();
        }
    }
//}
