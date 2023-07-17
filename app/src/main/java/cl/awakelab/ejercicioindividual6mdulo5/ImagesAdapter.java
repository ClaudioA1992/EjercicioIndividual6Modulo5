package cl.awakelab.ejercicioindividual6mdulo5;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import cl.awakelab.ejercicioindividual6mdulo5.databinding.ItemBinding;


public class ImagesAdapter extends RecyclerView.Adapter<ImagesAdapter.ViewHolder> {

    private ArrayList<Item> images = new ArrayList<Item>();

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageView;
        ItemBinding imageBinding;

        public ViewHolder(@NonNull ItemBinding binding, View itemView, Context context) {
            super(binding.getRoot());
            this.imageBinding = binding;
            itemView.setOnClickListener(this);
        }

        public ViewHolder(ItemBinding binding){
            super(binding.getRoot());
            this.imageBinding = binding;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getLayoutPosition();
            String imageUrl = String.valueOf(images.get(position).url);
            String imageDesc = String.valueOf(images.get(position).description);
            Bundle bundle = new Bundle();
            bundle.putString("url", imageUrl);
            bundle.putString("desc", imageDesc);
            Navigation.findNavController(imageBinding.getRoot()).navigate(R.id.action_firstFragment_to_focusFragment, bundle);
        }

        public void showData(Item item) {
            imageBinding.textView.setText(item.description);
            Glide.with(imageBinding.getRoot()).load(item.url).into(imageBinding.imageView);
        }

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = images.get(position);
        holder.showData(item);
    }

    public void setImages(ArrayList<Item> items) {
        this.images = items;
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

}
