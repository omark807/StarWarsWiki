package mp7.starwarswiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity7 extends AppCompatActivity {

    private Button buttonMercury;
    private Button buttonVenus;
    private Button buttonEarth;
    private Button buttonMars;
    private Button buttonJupiter;
    private Button buttonSaturn;
    private Button buttonUranus;
    //private Button buttonMustafar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        buttonMercury = findViewById(R.id.buttonmercury);
        buttonVenus = findViewById(R.id.buttonvenus);
        buttonEarth = findViewById(R.id.buttonearth);
        buttonMars = findViewById(R.id.buttonmars);
        buttonJupiter = findViewById(R.id.buttonjupiter);
        buttonSaturn = findViewById(R.id.buttonsaturn);
        buttonUranus = findViewById(R.id.buttonuranus);
        //buttonMustafar = findViewById(R.id.buttonmustafar);



        buttonMercury.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity8();
            }
        });

        buttonVenus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity9();
            }
        });

        buttonEarth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity10();
            }
        });

        buttonMars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity11();
            }
        });

        buttonJupiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityJakku();
            }
        });

        buttonSaturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityJedha();
            }
        });

        buttonUranus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityEadu();
            }
        });

//        buttonMustafar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openActivityMustafar();
//            }
//        });
    }

    public void openActivity8() {
        Intent tatIntent = new Intent(this, Activity8.class);
        startActivity(tatIntent);
    }

    public void openActivity9() {
        Intent nabooIntent = new Intent(this, Activity9.class);
        startActivity(nabooIntent);
    }

    public void openActivity10() {
        Intent coruIntent = new Intent(this, Activity10.class);
        startActivity(coruIntent);
    }

    public void openActivity11() {
        Intent hothIntent = new Intent(this, Activity11.class);
        startActivity(hothIntent);
    }

    public void openActivityJakku() {
        Intent jakkuIntent = new Intent(this, ActivityJakku.class);
        startActivity(jakkuIntent);
    }

    public void openActivityJedha() {
        Intent jedhaIntent = new Intent(this, ActivityJedha.class);
        startActivity(jedhaIntent);
    }

    public void openActivityEadu() {
        Intent eaduIntent = new Intent(this, ActivityEadu.class);
        startActivity(eaduIntent);
    }

    public void openActivityMustafar() {
        Intent musIntent = new Intent(this, ActivityMustafar.class);
        startActivity(musIntent);
    }
}
