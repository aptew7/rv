package com.example.rv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<Line> mLines;

    public Adapter(Context context, List<Line> mLines) {
        this.inflater = LayoutInflater.from(context);
        this.mLines = mLines;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.line, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        Line line = mLines.get(position);
        holder.textView.setText(line.getText());
        holder.flagView.setImageResource(line.getImage());


    }

    @Override
    public int getItemCount() {
        return mLines.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView textView;
        final ImageView flagView;

        ViewHolder (View view){
            super(view);
            textView = view.findViewById(R.id.mtext);
            flagView = view.findViewById(R.id.mimage);

        }
    }
}
