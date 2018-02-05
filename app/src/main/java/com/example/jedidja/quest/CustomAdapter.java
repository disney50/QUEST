package com.example.jedidja.quest;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jedidja.quest.Domain.Quest;

/**
 * Created by Jedidja on 30 Jan 2018.
 */

public class CustomAdapter extends ArrayAdapter<Quest> {

    private Quest[] _quests;
    private Activity _context;

    public CustomAdapter(Activity context,
                         Quest[] quests) {
        super(context, R.layout.activity_layout, quests);

        this._quests = quests;
        this._context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r = convertView;
        ViewHolder viewHolder = null;
        if (r == null) {
            LayoutInflater layoutInflater = _context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.activity_layout, null, true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) r.getTag();
        }
        viewHolder.imageExplore.setImageResource(R.drawable.explore_black_36dp);
        viewHolder.textCategory.setText(_quests[position].QuestCategory.toString());
        viewHolder.imageStripe.setImageResource(R.drawable.stripe_purple_56x0dp);
        viewHolder.textDescription.setText(_quests[position].Description);
        viewHolder.imageArrow.setImageResource(R.drawable.arrow_purple_24dp);

        return r;
    }

    class ViewHolder {
        ImageView imageExplore;
        TextView textCategory;
        ImageView imageStripe;
        TextView textDescription;
        ImageView imageArrow;

        ViewHolder(View v) {
            imageExplore = v.findViewById(R.id.image_view_explore);
            textCategory = v.findViewById(R.id.text_view_category);
            imageStripe = v.findViewById(R.id.image_view_stripe);
            textDescription = v.findViewById(R.id.text_view_description);
            imageArrow = v.findViewById(R.id.image_view_arrow);
        }
    }
}
