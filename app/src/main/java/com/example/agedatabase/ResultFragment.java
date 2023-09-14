package com.example.agedatabase;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ResultFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View v = inflater.inflate(R.layout.content_result, container,false);
        DataManager dm = new DataManager(getActivity());
        TextView textResults = v.findViewById(R.id.textResult);
        Cursor c = dm.selectAll();
        String list = "";
        while (c.moveToNext()){
            list+=(c.getString(1)+" - "+c.getString(2)+"\n");
        }
        textResults.setText(list);
        return v;
    }
}
