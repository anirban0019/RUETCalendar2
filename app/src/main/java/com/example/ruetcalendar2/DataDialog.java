package com.example.ruetcalendar2;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataDialog extends AppCompatDialogFragment {

    String data;

    public DataDialog(String data) {
        this.data = data;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialogfor_data, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());


        TextView tv1 = view.findViewById(R.id.tv1);
        tv1.setText(data);


        builder.setView(view);
        return builder.create();


    }
}
