package ir.mohammad.mydivar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Horizontal> itm=new ArrayList<>();
    private HorizontalAdapter hAdapter;
    private RecyclerView r2;
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
                    Toast.makeText(MainActivity.this, "دیوار من", Toast.LENGTH_SHORT).show();
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
        r2=findViewById(R.id.r2);
        hAdapter=new HorizontalAdapter(itm);
        RecyclerView.LayoutManager lll=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        r2.setLayoutManager(lll);
        r2.setAdapter(hAdapter);


        itm.add(new Horizontal("فروش آپارتمان"));
        itm.add(new Horizontal("تعیین قیمت کل"));
        itm.add(new Horizontal("تعیین متراژ"));
        itm.add(new Horizontal("نمایش عکس دار"));
        itm.add(new Horizontal("تعیین سن بنا"));

    }

    private void openFragment(Fragment fragment) {
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentlayout,fragment);
        transaction.commit();
    }

}