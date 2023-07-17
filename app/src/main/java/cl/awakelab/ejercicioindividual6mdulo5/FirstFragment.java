package cl.awakelab.ejercicioindividual6mdulo5;

import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import cl.awakelab.ejercicioindividual6mdulo5.databinding.FragmentFirstBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {

    FragmentFirstBinding binding;

    ArrayList<Item> listImages = new ArrayList<Item>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FirstFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FirstFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FirstFragment newInstance(String param1, String param2) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentFirstBinding.inflate(getLayoutInflater());
        initAdapter();
        // Inflate the layout for this fragment
        return binding.getRoot();

    }

    public void initData() {

    }

    public void setData() {
        listImages = returnItemList();
    }

    public void initAdapter() {
        ImagesAdapter adapter = new ImagesAdapter();
        setData();
        adapter.setImages(listImages);
        binding.recyclerView.setAdapter(adapter);
    }

    private ArrayList<Item> returnItemList() {

        ArrayList<Item> listItem = new ArrayList<>();
        Item item01 = new Item("Zhuo Chengyou","https://unsplash.com/photos/UBvtBr_FmrY/download?force=true&w=640");
        listItem.add(item01);
        Item item02 = new Item("billow926","https://unsplash.com/photos/pNoP-qVwBFQ/download?force=true&w=640");
        listItem.add(item02);
        Item item03 = new Item("Philipp Deiß","https://unsplash.com/photos/LfJx0gqqiEc/download?force=true&w=640");
        listItem.add(item03);
        Item item04 = new Item("Huper by Joshua Earle","https://unsplash.com/photos/_p8gVNNsWw4/download?force=true&w=640");
        listItem.add(item04);
        Item item05 = new Item("Melnychuk Nataliya","https://unsplash.com/photos/rnPGCe7LsQo/download?force=true&w=640");
        listItem.add(item05);
        Item item06 = new Item("Teagan Maddux","https://unsplash.com/photos/k2DbTXQ0yrQ/download?force=true&w=640");
        listItem.add(item06);
        Item item07 = new Item("Chen Liu","https://unsplash.com/photos/kZH8X0q4Nvo/download?force=true&w=640");
        listItem.add(item07);
        Item item08 = new Item("John Fornander","https://unsplash.com/photos/iNqJx-VOceI/download?force=true&w=640");
        listItem.add(item08);
        Item item09 = new Item("Parker Coffman","https://unsplash.com/photos/mNWrQ9O6KZw/download?force=true&w=640");
        listItem.add(item09);
        Item item10 = new Item("XPS","https://unsplash.com/photos/8pb7Hq539Zw/download?force=true&w=640");
        listItem.add(item10);
        Item item11 = new Item("Daniel J. Schwarz","https://unsplash.com/photos/l8BvDmt8Ac4/download?force=true&w=640");
        listItem.add(item11);
        Item item12 = new Item("Wesley Armstrong","https://unsplash.com/photos/q0wqYpyWDpc/download?force=true&w=640");
        listItem.add(item12);

        return listItem;

    }

}
