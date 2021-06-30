package ir.mohammad.mydivar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId()==R.id.profile){
                    Toast.makeText(MainActivity.this, "دیوار تو", Toast.LENGTH_SHORT).show();
                    openFragment(new profile_fragment());
                    return true;
                }else if(item.getItemId() == R.id.chat){
                    Toast.makeText(MainActivity.this, " چت", Toast.LENGTH_SHORT).show();
                    openFragment(new ChatFragment());
                    return true;
                }else if(item.getItemId() == R.id.daste) {
                    Toast.makeText(MainActivity.this, " دسته بندی", Toast.LENGTH_SHORT).show();
                    openFragment(new DasteFragment());
                    return true;
                }else if(item.getItemId() == R.id.sabt_agahi) {
                    Toast.makeText(MainActivity.this, " اضافه کردن آگهی", Toast.LENGTH_SHORT).show();
                    openFragment(new SabtagahiFragment());
                    return true;
                }

                else if (item.getItemId()==R.id.divar){
                    Toast.makeText(MainActivity.this, "دیوار", Toast.LENGTH_SHORT).show();
                    openFragment(new DivarFragment());
                    return true;
                }

                return false;
            }
        });

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentlayout,new DivarFragment()).commit();

    }


    private void openFragment(Fragment fragment) {
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentlayout,fragment);
        transaction.commit();

    }
}