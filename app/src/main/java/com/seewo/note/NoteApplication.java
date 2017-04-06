package com.seewo.note;

import android.app.Application;

import com.seewo.note.util.Constants;

import java.io.File;


public class NoteApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        createPath();

    }
    private void createPath() {
        File destDir = new File(Constants.LOCALDIR);
        if (!destDir.exists()) {
            destDir.mkdirs();
        }
        File xmlDir = new File(Constants.XMLDIR);
        if (!xmlDir.exists()) {
            xmlDir.mkdirs();
        }
        File pngDir = new File(Constants.PNGDIR);

        if (!pngDir.exists()) {
            boolean png=pngDir.mkdirs();
        }
    }


}
