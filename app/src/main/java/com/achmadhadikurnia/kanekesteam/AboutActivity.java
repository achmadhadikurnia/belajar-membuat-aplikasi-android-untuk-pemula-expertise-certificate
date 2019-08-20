package com.achmadhadikurnia.kanekesteam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class AboutActivity extends AppCompatActivity {
    public static final String AUTHOR_AVATAR = "author_avatar";
    public static final String AUTHOR_NAME = "author_name";
    public static final String AUTHOR_JOBTITLE = "author_jobtitle";
    public static final String AUTHOR_EMAIL = "author_email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ImageView imageView_author_avatar = findViewById(R.id.imageView_author_avatar);
        String author_avatar = getIntent().getStringExtra(AUTHOR_AVATAR);

        if (author_avatar != null) {
            Glide.with(imageView_author_avatar)
                    .load(author_avatar)
                    .apply(new RequestOptions())
                    .into(imageView_author_avatar);
        }

        TextView textView_author_jobtitle = findViewById(R.id.textView_author_jobtitle);
        String author_jobtitle = getIntent().getStringExtra(AUTHOR_JOBTITLE);

        if (author_jobtitle != null) {
            textView_author_jobtitle.setText(author_jobtitle);
        }

        TextView textView_author_name = findViewById(R.id.textView_author_name);
        String author_name = getIntent().getStringExtra(AUTHOR_NAME);

        if (author_name != null) {
            textView_author_name.setText(author_name);
        }

        TextView textView_author_email = findViewById(R.id.textView_author_email);
        String author_email = getIntent().getStringExtra(AUTHOR_EMAIL);

        if (author_email != null) {
            textView_author_email.setText(author_email);
        }
    }
}
