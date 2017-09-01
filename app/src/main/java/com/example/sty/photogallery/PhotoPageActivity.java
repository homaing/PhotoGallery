package com.example.sty.photogallery;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;

public class PhotoPageActivity extends SingleFragmentActivity {

    public static Intent newIntent(Context context, Uri photoUri) {
        Intent i = new Intent(context, PhotoPageActivity.class);
        i.setData(photoUri);

        return i;
    }

    @Override
    public Fragment createFragment() {
        return PhotoPageFragment.newInstance(getIntent().getData());
    }
}
