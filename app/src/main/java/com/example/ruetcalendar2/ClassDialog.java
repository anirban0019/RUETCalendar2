package com.example.ruetcalendar2;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ClassDialog extends AppCompatDialogFragment {

    ArrayList<String> events;

    public ClassDialog(ArrayList<String> events) {
        this.events = events;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialogforcalendar, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());


        EventAdapter adapter = new EventAdapter(events);
        RecyclerView rv = view.findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(requireContext()));
        rv.setAdapter(adapter);

        builder.setView(view);
        return builder.create();


    }
}
