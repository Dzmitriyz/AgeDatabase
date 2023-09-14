package com.example.agedatabase;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.util.zip.Inflater;

public class DeleteFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstancetState){
        View v = inflater.inflate(R.layout.content_delete,container,false);

        final DataManager dm = new DataManager(getActivity());
        Button btnDelete = v.findViewById(R.id.btnDelete);
        final EditText editDelete = v.findViewById(R.id.editDelete);
        btnDelete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            dm.delete(editDelete.getText().toString());
            Toast toast = Toast.makeText(getActivity(),editDelete.getText().toString()+" was DELETE",Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();


            }
        });
        return v;
    }
}
