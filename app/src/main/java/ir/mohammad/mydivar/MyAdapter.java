package ir.mohammad.mydivar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

        List<model>item;
    public MyAdapter(List<model> item) {
        this.item = item;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(item.get(position).getName());
        holder.cash.setText(item.get(position).getCash());
        holder.time.setText(item.get(position).getTime());
        Picasso.get().load(item.get(position).getImg()).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView name;
            public TextView cash;
            public TextView time;
            public ImageView image;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name=(TextView) itemView.findViewById(R.id.t1);
            cash=(TextView) itemView.findViewById(R.id.t2);
            time=(TextView) itemView.findViewById(R.id.t3);
            image=(ImageView) itemView.findViewById(R.id.image1);
        }
    }
}
