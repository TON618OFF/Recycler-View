package com.example.practice12test;// DetailsActivity.java
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    private static final String EXTRA_NAME = "extra_name";
    private static final String EXTRA_CAPITAL = "extra_capital";
    private static final String EXTRA_INFO = "extra_info";

    public static void start(Context context, String name, String capital, String info) {
        Intent intent = new Intent(context, DetailsActivity.class);
        intent.putExtra(EXTRA_NAME, name);
        intent.putExtra(EXTRA_CAPITAL, capital);
        intent.putExtra(EXTRA_INFO, info);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        TextView nameTextView = findViewById(R.id.detailsTextView);
        ImageView countryImageView = findViewById(R.id.countryImageView);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String capital = getIntent().getStringExtra(EXTRA_CAPITAL);
        String info = getIntent().getStringExtra(EXTRA_INFO);

        nameTextView.setText("Страна: " + name + "\nСтолица: " + capital + "\n\nДополнительная Информация:\n" + info);

        switch (name) {
            case "Россия":
                countryImageView.setImageResource(R.drawable.russianflag);
                break;
            case "Китай":
                countryImageView.setImageResource(R.drawable.chinaflag);
                break;
            case "КНДР":
                countryImageView.setImageResource(R.drawable.coreanflag);
                break;
            case "Япония":
                countryImageView.setImageResource(R.drawable.japaneseflag);
                break;
            default:
                countryImageView.setImageResource(android.R.color.transparent);
                break;
        }
    }
}
