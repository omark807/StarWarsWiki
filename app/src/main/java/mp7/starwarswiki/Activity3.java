package mp7.starwarswiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {

    private Button buttonSegue;
    private Button buttonSDS;
    private Button buttonHercules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        buttonSegue = (Button) findViewById(R.id.buttonsegue);
        buttonSDS = (Button) findViewById(R.id.buttonSDS);
        buttonHercules = (Button) findViewById(R.id.buttonhercules);

        buttonSegue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySegue();
            }
        });

        buttonSDS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySDS();
            }
        });

        buttonHercules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityHercules();
            }
        });

    }

    public void openActivitySegue() {
        Intent segueIntent = new Intent(this, ActivitySegue.class);
        startActivity(segueIntent);
    }

    public void openActivityHercules() {
        Intent herculesIntent = new Intent(this, ActivityHercules.class);
        startActivity(herculesIntent);
    }

    public void openActivitySDS() {
        Intent sdsIntent = new Intent(this, ActivityHercules.class);
        startActivity(sdsIntent);
    }
}
