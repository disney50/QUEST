package com.example.jedidja.quest;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.example.jedidja.quest.Domain.Quest;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jedidja on 30 Jan 2018.
 */

public class ListViewAdapter extends ArrayAdapter<Quest> {

    /* private Integer[] explore;
    private String[] category;
    private Integer[] stripe;
    private String[] description;
    private Integer[] arrow; */
    private Quest[] quests;
    private Activity context;

    public ListViewAdapter(Activity context,
                           Quest[] quests
                           /* Integer[] explore,
                           String[] category,
                           Integer[] stripe,
                           String[] description,
                           Integer[] arrow */) {
        super(context, R.layout.list_view_item_layout, quests);

        this.context = context;
        this.quests = quests;
        /* this.explore = explore;
        this.category = category;
        this.stripe = stripe;
        this.description = description;
        this.arrow = arrow; */
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r = convertView;
        ViewHolder viewHolder = null;
        if (r == null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.list_view_item_layout, null, true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) r.getTag();
        }

        viewHolder.imageExplore.setImageResource(R.drawable.explore_black_36dp);
        viewHolder.textCategory.setText(quests[position].Categories.toString());
        viewHolder.imageStripe.setImageResource(R.drawable.stripe_purple_56x0dp);
        viewHolder.textDescription.setText(quests[position].Descriptions);
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
            imageExplore = v.findViewById(R.id.image_view_explore_icon);
            textCategory = v.findViewById(R.id.text_view_categories);
            imageStripe = v.findViewById(R.id.image_view_stripe_icon);
            textDescription = v.findViewById(R.id.text_view_descriptions);
            imageArrow = v.findViewById(R.id.image_view_arrow_icon);
        }
    }
}
