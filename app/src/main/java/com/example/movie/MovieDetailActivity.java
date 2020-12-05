package com.example.movie;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class MovieDetailActivity extends AppCompatActivity {

    String   genres, runtime, language, overview;
    int path;

    public static final String EXTRA_MOVIE = "test_extra_movie";

    TextView
            textViewRuntime, tViewLanguage, tViewOverview;

    ImageView imagePoster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        textViewRuntime = findViewById(R.id.txt_runtime);
        tViewLanguage = findViewById(R.id.txt_language);
        tViewOverview = findViewById(R.id.txt_overview);
        imagePoster = findViewById(R.id.img_poster);

        ArrayList<Movies> movie = this.getIntent().getParcelableArrayListExtra(EXTRA_MOVIE);



        runtime = movie.get(0).getRuntime();
        textViewRuntime.setText(runtime);

        language = movie.get(0).getOriginal_language();
        tViewLanguage.setText(language);

        overview = movie.get(0).getOverview();
        tViewOverview.setText(overview);

        path = movie.get(0).getPoster();
        imagePoster.setImageResource(path);

    }
}
