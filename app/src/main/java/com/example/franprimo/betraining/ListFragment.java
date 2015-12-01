package com.example.franprimo.betraining;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class ListFragment extends Fragment {

    //Declaro un objeto ListFragmentListener que va a ser el encargado de pasar los mensajes con la
    //accion correspondiente al activity donde se encuentra el fragment.
    ListFragmentListener mCallback;

    public interface ListFragmentListener {
        public void onListSelected(int position);

    }

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //Creacion del array con las opciones que contendra la lista de la pagina principal
        String[] opciones = {"Mis Entrenamientos", "Blog", "Contacta", "Info"};
        Integer[] imagenes = {R.drawable.entrenamientos, R.drawable.blog, R.drawable.contacta, R.drawable.info};
        //Conversion a ArrayList
        ArrayList<String> opcionesLista = new ArrayList<String>(Arrays.asList(opciones));
        ArrayList<Integer> imagenesLista = new ArrayList<Integer>(Arrays.asList(imagenes));
        //Declaro y creo un objeto menuAdapter
        MenuAdapter miAdapter = new MenuAdapter(getActivity(), opcionesLista, imagenesLista);
        //Declaro el listView y le paso el adaptador
        ListView lv = (ListView) getActivity().findViewById(R.id.listView);
        lv.setAdapter(miAdapter);

        //lv.setOnItemClickListener(new nuestroListener());
    }

    /*
    //Listener propio para la lista.
    private class nuestroListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView parent, View view, int position, long id) {
            mCallback.onListSelected(position);
        }
    }
    */

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }
}
