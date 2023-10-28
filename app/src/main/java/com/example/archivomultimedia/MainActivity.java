package com.example.archivomultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView MiVideito = findViewById(R.id.videoView);

        String videito = "android.resource://"+getPackageName()+"/"+R.raw.momo;
        Uri uri= Uri.parse(videito);
        MiVideito.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        MiVideito.setMediaController(mediaController);
        mediaController.setAnchorView(MiVideito);
    }
}