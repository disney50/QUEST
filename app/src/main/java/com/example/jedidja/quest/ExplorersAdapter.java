package com.example.jedidja.quest;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.jedidja.quest.Domain.Explorer;

/**
 * Created by anthoniedeklerk on 2018/02/07.
 */

public class ExplorersAdapter extends ArrayAdapter<Explorer> {
    private Activity _context;
    private Explorer[] _explorers;

    public ExplorersAdapter(Activity context, Explorer[] explorers) {
        super(context,R.layout.explorers_layout, explorers);
        _context = context;
        _explorers = explorers;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r = convertView;
        ExplorersAdapter.ViewHolder viewHolder = null;
        if (r == null) {
            LayoutInflater layoutInflater = _context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.explorers_layout, null, true);
            viewHolder = new ExplorersAdapter.ViewHolder(r);
            r.setTag(viewHolder);
        }
        else {
            viewHolder = (ExplorersAdapter.ViewHolder) r.getTag();
        }
        viewHolder.textExplorerName.setText(_explorers[position].Name);
        viewHolder.textExplorerEmail.setText(_explorers[position].Email);


        return r;
    }

    class ViewHolder {
        TextView textExplorerName;
        TextView textExplorerEmail;
        ViewHolder(View v) {
             textExplorerName = v.findViewById(R.id.text_explorer_name);
             textExplorerEmail = v.findViewById(R.id.text_explorer_email);
        }
    }
}