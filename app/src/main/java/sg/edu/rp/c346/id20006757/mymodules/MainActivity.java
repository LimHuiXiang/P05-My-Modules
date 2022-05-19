package sg.edu.rp.c346.id20006757.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Module1;
    TextView Module2;
    TextView Module3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Step 1 Define the handles


        //Step 2 Linking the handles to UI
        Module1 = findViewById(R.id.Mod1);
        Module2 = findViewById(R.id.Mod2);
        Module3 = findViewById(R.id.Mod3);

        //Event handling Step 3
        Module1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "C346");
                /*
                intent.putExtra("ModuleName:", "Mobile App Development");
                intent.putExtra("AcademicYear:", "2022");
                intent.putExtra("Semester:", "1");
                intent.putExtra("ModuleCredit:", "4");
                intent.putExtra("Venue:", "E62E");
                */
                startActivity(intent);

            }
        });

        Module2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "C382");
               /* intent.putExtra("ModuleName:", "IT Service Delivery");
                intent.putExtra("AcademicYear:", "2022");
                intent.putExtra("Semester:", "1");
                intent.putExtra("ModuleCredit:", "4");
                intent.putExtra("Venue:", "E62B");

                */
                startActivity(intent);

            }
        });

        Module3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "C322");
                /*
                intent.putExtra("ModuleName:", "Data Centre & Cloud Computing");
                intent.putExtra("AcademicYear:", "2022");
                intent.putExtra("Semester:", "1");
                intent.putExtra("ModuleCredit:", "4");
                intent.putExtra("Venue:", "E61C");
                */
                startActivity(intent);

            }
        });

    }
}