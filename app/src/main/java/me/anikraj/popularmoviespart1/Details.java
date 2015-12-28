package me.anikraj.popularmoviespart1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent i = getIntent();
        String title=i.getStringExtra("title");
        String image=i.getStringExtra("image");
        String synopsis= i.getStringExtra("synopsis");
        String backdrop=i.getStringExtra("backdrop");
        double vote_avg=i.getDoubleExtra("vote_avg",-1);
        int vote_count=i.getIntExtra("vote_count",-1);
        String date=i.getStringExtra("date");

        getSupportActionBar().setTitle(title.replace("\"",""));

        Picasso.with(this).load("http://image.tmdb.org/t/p/w342"+backdrop.substring(1)).into((ImageView)findViewById(R.id.backdrop));
        Picasso.with(this).load("http://image.tmdb.org/t/p/w342"+image.substring(1)).placeholder(R.drawable.load).into((ImageView)findViewById(R.id.image));
        ((TextView)findViewById(R.id.title)).setText(title.replace("\"",""));
        ((TextView)findViewById(R.id.date)).setText(date.substring(1,5));
        ((TextView)findViewById(R.id.synopsis)).setText(synopsis);
        ((TextView)findViewById(R.id.rating)).setText(vote_avg+"");
        ((TextView)findViewById(R.id.votecount)).setText(vote_count+"");
    }
}
