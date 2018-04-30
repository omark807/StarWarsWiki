package mp7.starwarswiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Activity2 extends AppCompatActivity {

    private Button buttonAquarius;
    private Button buttonCancer;
    private Button buttonCapricorn;
    private Button buttonLeo;
    private Button buttonUrsaMajor;
    private Button buttonUrsaMinor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        buttonAquarius = (Button) findViewById(R.id.button_aquarius);
        buttonCancer = (Button) findViewById(R.id.button_cancer);
        buttonCapricorn = (Button) findViewById(R.id.button_capricorn);
        buttonLeo = (Button) findViewById(R.id.button_Leo);
        buttonUrsaMajor = (Button) findViewById(R.id.button_ursamajor);
        buttonUrsaMinor = (Button) findViewById(R.id.button_ursaminor);

        buttonAquarius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityAquarius();
            }
        });

        buttonCancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityCancer();
            }
        });

        buttonCapricorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityCapricorn();
            }
        });

        buttonLeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityLeo();
            }
        });

        buttonUrsaMajor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityUrsaMajor();
            }
        });

        buttonUrsaMinor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityUrsaMinor();
            }
        });
        }

        public void openActivityAquarius() {
            Intent aquariusIntent = new Intent(this, ActivityAquarius.class);
            startActivity(aquariusIntent);
        }

        public void openActivityCancer() {
        Intent cancerIntent = new Intent(this, ActivityCancer.class);
        startActivity(cancerIntent);

        }

        public void openActivityCapricorn() {
        Intent capricornIntent = new Intent(this, ActivityCapricorn.class);
        startActivity(capricornIntent);

        }

        public void openActivityLeo() {
        Intent leoIntent = new Intent(this, ActivityLeo.class);
        startActivity(leoIntent);

        }

        public void openActivityUrsaMajor() {
        Intent ursaMajorIntent = new Intent(this, ActivityUrsaMajor.class);
        startActivity(ursaMajorIntent);

        }

        public void openActivityUrsaMinor() {
        Intent ursaMinorIntent = new Intent(this, ActivityUrsaMinor.class);
        startActivity(ursaMinorIntent)
        ;
        }

    }



