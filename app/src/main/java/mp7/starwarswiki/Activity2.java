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
    private Button buttonAquila;
    private Button buttonAries;
    private Button buttonCancer;
    private Button buttonCapricorn;
    private Button buttonGemini;
    private Button buttonLeo;
    private Button buttonOrion;
    private Button buttonUrsaMajor;
    private Button buttonUrsaMinor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        buttonAquarius = (Button) findViewById(R.id.button_aquarius);
        buttonAquila = (Button) findViewById(R.id.button_aquila);
        buttonAries = (Button) findViewById(R.id.button_aries);
        buttonCancer = (Button) findViewById(R.id.button_cancer);
        buttonCapricorn = (Button) findViewById(R.id.button_capricorn);
        buttonGemini = (Button) findViewById(R.id.button_gemini);
        buttonLeo = (Button) findViewById(R.id.button_Leo);
        buttonOrion = (Button) findViewById(R.id.button_orion);
        buttonUrsaMajor = (Button) findViewById(R.id.button_ursamajor);
        buttonUrsaMinor = (Button) findViewById(R.id.button_ursaminor);

        buttonAquarius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityAquarius();
            }
        });

        buttonAquila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityAquila();
            }
        });

        buttonAries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityAries();
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

        buttonGemini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityGemini();
            }
        });

        buttonLeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityLeo();
            }
        });

        buttonOrion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityOrion();
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

        public void openActivityAquila() {
        Intent aquilaIntent = new Intent(this, ActivityAquila.class);
        startActivity(aquilaIntent);

        }

        public void openActivityAries() {
        Intent ariesIntent = new Intent(this, ActivityAries.class);
        startActivity(ariesIntent);

        }

        public void openActivityCancer() {
        Intent cancerIntent = new Intent(this, ActivityCancer.class);
        startActivity(cancerIntent);

        }

        public void openActivityCapricorn() {
        Intent capricornIntent = new Intent(this, ActivityCapricorn.class);
        startActivity(capricornIntent);

        }

        public void openActivityGemini() {
        Intent geminiIntent = new Intent(this, ActivityGemini.class);
        startActivity(geminiIntent);

        }

        public void openActivityLeo() {
        Intent leoIntent = new Intent(this, ActivityLeo.class);
        startActivity(leoIntent);

        }

        public void openActivityOrion() {
        Intent orionIntent = new Intent(this, ActivityOrion.class);
        startActivity(orionIntent);

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



