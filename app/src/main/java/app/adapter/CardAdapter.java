package app.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.githubdemo.app.R;

import java.util.ArrayList;
import java.util.List;

import app.model.Event;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {
    List<Event> mItems;

    public CardAdapter() {
        super();
        mItems = new ArrayList<Event>();
    }


    public void clear() {
        mItems.clear();
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycler_view, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Event nomad = mItems.get(i);
        viewHolder.titre.setText(nomad.getTitle());
        viewHolder.date.setText(nomad.getDateStart());
        viewHolder.excerp.setText(nomad.getExcerp());
    }

    public void updateItem(List<Event> events) {
        this.mItems = events;
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public TextView titre;
        public TextView date;
        public TextView excerp;

        public ViewHolder(View itemView) {
            super(itemView);
            titre = (TextView) itemView.findViewById(R.id.titre);
            date = (TextView) itemView.findViewById(R.id.date);
            excerp = (TextView) itemView.findViewById(R.id.excerp);
        }
    }
}