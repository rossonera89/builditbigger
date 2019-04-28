package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
//import com.udacity.gradle.builditbigger.backend.myApi.MyApi;
import com.udacity.jokedisplaylibrary.JokeDisplayActivity;
import com.udacity.joketellinglibrary.JokeTellingClass;

import java.io.IOException;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        new EndpointsAsyncTask().execute(new Pair<Context, String>(this, "Manfred"));

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {

        JokeTellingClass jokeTellingClass = new JokeTellingClass();
        String joke = jokeTellingClass.getJoke();

        new EndpointsAsyncTask().execute(new Pair<>(this, joke));


//        Toast.makeText(this, joke, Toast.LENGTH_SHORT).show();

//        Intent intent = new Intent(this, JokeDisplayActivity.class);
//        intent.putExtra("joke", joke);
//        startActivity(intent);

//        new EndpointsAsyncTask().execute(this).execute();
    }



//    public void launchJokeDisplayLibraryActivity(View view) {
//
//    }
}