package cl.awakelab.ejercicioindividual6mdulo5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cl.awakelab.ejercicioindividual6mdulo5.databinding.ItemBinding;


public class ImagesAdapter extends RecyclerView.Adapter<ImagesAdapter.ViewHolder> {

    private List<String> images;

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            ImageView imageView;
            ItemBinding binding;

            public ViewHolder(@NonNull ItemBinding binding, View itemView, Context context) {
                super(binding.getRoot());
                this.binding = binding;
                this.imageView = (ImageView) itemView.findViewById(R.id.imageView);
            }

            @Override
            public void onClick(View v) {

            }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

}