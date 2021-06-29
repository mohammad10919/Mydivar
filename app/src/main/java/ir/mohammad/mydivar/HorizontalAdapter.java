package ir.mohammad.mydivar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.hviewHolder> {

    List<Horizontal> itm;

    public HorizontalAdapter(List<Horizontal> itm) {
        this.itm = itm;
    }

    @NonNull
    @Override
    public hviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal,parent,false);
        return new hviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull hviewHolder holder, int position) {
        holder.b.setText(itm.get(position).getButton());
    }

    @Override
    public int getItemCount() {
        return itm.size();
    }

    public class hviewHolder extends RecyclerView.ViewHolder {
        public Button b;

        public hviewHolder(@NonNull View itemView) {
            super(itemView);
            b=(Button) itemView.findViewById(R.id.b1);
        }
    }
}
