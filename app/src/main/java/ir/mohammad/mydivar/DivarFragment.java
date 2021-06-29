package ir.mohammad.mydivar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class DivarFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<model> item=new ArrayList<>();
    private MyAdapter adapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_divar, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycle_divar);

        adapter=new MyAdapter(item);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        item.add(new model("یک واحد آپارتمان ۸۵ باز سازی کامل","فروش آپارتمان","۳ ساعت پیش در قزوین","https://s100.divarcdn.com/static/pictures/1624295476/AYQT4e83.webp"));
        item.add(new model("۱۶۰ متر نوساز کلید نخورده سرتک","فروش آپارتمان","5 ساعت پیش در قزوین","https://s100.divarcdn.com/static/pictures/1624297944/AYQDpI3W.1.webp"));
        item.add(new model(" فروش اپارتمان 147متر ملاصدرا غربی ","فروش آپارتمان","یک هفته پیش در قزوین","https://s100.divarcdn.com/static/pictures/1623505403/AYEjHU4h.webp"));
        item.add(new model("آپارتمان 150 متری بلوار نخبگان","فروش آپارتمان","10 ساعت پیش در قزوین","https://s100.divarcdn.com/static/pictures/1624302586/AYQP6xjb.webp"));
        item.add(new model("آپارتمان 93 متر نوروزیان حکمت زوج","فروش آپارتمان","دوهفته پیش در قزوین","https://s100.divarcdn.com/static/pictures/1624305968/AYQH7LH6.webp"));
        item.add(new model("آپارتمان 130 متری ویلایی تک کلید","فروش آپارتمان","فوری","https://s100.divarcdn.com/static/pictures/1624305091/AYDnZOlc.webp"));

        //repo ro sakhti
        // valkardi


        return view;
    }

}