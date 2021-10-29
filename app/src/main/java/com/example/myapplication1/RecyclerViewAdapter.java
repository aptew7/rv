package com.example.myapplication1;

import android.graphics.Color;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

@RequiresApi(api = Build.VERSION_CODES.O)
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private List<Model> mModelList;

    public RecyclerViewAdapter(List<Model> modelList) {
        mModelList = modelList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        final Model model = mModelList.get(position);
        holder.textView.setText(model.getText());
        holder.textView2.setText(model.getText());
        holder.textView3.setText(model.getText());
        holder.textView4.setText(model.getText());
        holder.imageView.setImageResource(model.getImage());
        holder.view.setBackgroundColor(model.isSelected() ? Color.argb(100,200,200,200) : Color.WHITE);
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model.setSelected(!model.isSelected());
                holder.view.setBackgroundColor(model.isSelected() ? Color.argb(100,200,200,200) : Color.WHITE);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mModelList == null ? 0 : mModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private View view;
        private TextView textView;
        private TextView textView2;
        private TextView textView3;
        private TextView textView4;
        private ImageView imageView;

        private MyViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            textView = (TextView) itemView.findViewById(R.id.text_view);
            textView2 = (TextView) itemView.findViewById(R.id.text_view2);
            textView3 = (TextView) itemView.findViewById(R.id.text_view3);
            textView4 = (TextView) itemView.findViewById(R.id.text_view4);
            imageView = (ImageView) itemView.findViewById(R.id.iv);
        }
    }
}
