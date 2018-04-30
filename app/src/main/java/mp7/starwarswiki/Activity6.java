package mp7.starwarswiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity6 extends AppCompatActivity {

    private Button buttonComet;
    private Button buttonNebula;
    private Button buttonQuasar;
    private Button buttonSupernova;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        buttonComet = (Button) findViewById(R.id.buttoncomet);
        buttonNebula = (Button) findViewById(R.id.button_nebula);
        buttonQuasar = (Button) findViewById(R.id.button_quasar);
        buttonSupernova = (Button) findViewById(R.id.button_supernova);

        buttonComet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityComet();
            }
        });

        buttonNebula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityNebula();
            }
        });

        buttonQuasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityQuasar();
            }
        });

        buttonSupernova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySupernova();
            }
        });
    }

    public void openActivityComet() {
        Intent cometIntent = new Intent(this, ActivityComet.class);
        startActivity(cometIntent);
    }

    public void openActivityNebula() {
        Intent nebulaIntent = new Intent(this, ActivityNebula.class);
        startActivity(nebulaIntent);
    }

    public void openActivityQuasar() {
        Intent quasarIntent = new Intent(this, ActivityQuasar.class);
        startActivity(quasarIntent);
    }

    public void openActivitySupernova() {
        Intent supernovaIntent = new Intent(this, ActivitySupernova.class);
        startActivity(supernovaIntent);
    }
}
