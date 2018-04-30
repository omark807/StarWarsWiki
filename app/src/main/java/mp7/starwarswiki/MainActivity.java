package mp7.starwarswiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Class that displays the home page of the app. Contains buttons leading to various screens.
 */

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button4;
    private Button button5;
    private Button buttonPlanets;

    /**
     * Handles the clicking of buttons and creation of buttons for the home screen.
     *
     * @param savedInstanceState app's saved state when you close it.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        buttonPlanets = (Button) findViewById(R.id.buttonplanets);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });

        buttonPlanets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity7();
            }
        });


    }

        public void openActivity2() {
            Intent intent = new Intent(this, Activity2.class);
            startActivity(intent);
        }

        public void openActivity3() {
            Intent intent2 = new Intent(this, Activity3.class);
            startActivity(intent2);
        }

        public void openActivity5() {
        Intent intent4 = new Intent(this, Activity5.class);
        startActivity(intent4);
        }

        public void openActivity6() {
        Intent intent5 = new Intent(this, Activity6.class);
        startActivity(intent5);
    }

        public void openActivity7() {
        Intent intent6 = new Intent(this, Activity7.class);
        startActivity(intent6);
    }



    }
