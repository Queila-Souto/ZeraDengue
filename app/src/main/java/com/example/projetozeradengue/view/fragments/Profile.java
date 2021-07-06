package com.example.projetozeradengue.view.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.projetozeradengue.R;
import com.google.android.material.button.MaterialButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Profile#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Profile extends Fragment {

    private MaterialButton btn_back;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Profile() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Profile.
     */
    // TODO: Rename and change types and number of parameters
    public static Profile newInstance(String param1, String param2) {
        Profile fragment = new Profile();
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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    btn_back = getActivity().findViewById(R.id.btn_Back);
    btn_back.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            backMainFragment();
        }
    });

    }

    @Override
    public void onResume() {
        super.onResume();
        title1("Recuperar nome do Banco de Dados");
        title2("Informações de Perfil");
    }

    public void    title1(String title) {

        TextView mtitle = getActivity().findViewById(R.id.title);
        mtitle.setText(title);
    }

    public void title2(String title2){
        TextView mtitle2 = getActivity().findViewById(R.id.title2);
        mtitle2.setText(title2);
    }
    private void backMainFragment() {
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout2, new MainFragment()).commit();
    }

}