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

/**
 * Created by Jedidja on 30 Jan 2018.
 */

public class CustomAdapter extends ArrayAdapter<String> {

    private Integer[] explore;
    private String[] category;
    private Integer[] stripe;
    private String[] description;
    private Integer[] arrow;
    private Activity context;

    public CustomAdapter(Activity context,
                         Integer[] explore,
                         String[] category,
                         Integer[] stripe,
                         String[] description,
                         Integer[] arrow) {
        super(context, R.layout.activity_layout, category);

        this.context = context;
        this.explore = explore;
        this.category = category;
        this.stripe = stripe;
        this.description = description;
        this.arrow = arrow;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r = convertView;
        ViewHolder viewHolder = null;
        if (r == null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.activity_layout, null, true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) r.getTag();
        }
        viewHolder.imageExplore.setImageResource(explore[position]);
        viewHolder.textCategory.setText(category[position]);
        viewHolder.imageStripe.setImageResource(stripe[position]);
        viewHolder.textDescription.setText(description[position]);
        viewHolder.imageArrow.setImageResource(arrow[position]);

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
