package org.ub.controller.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import org.ub.controller.R;

import org.ub.controller.models.Series;

import java.util.List;
import java.util.Locale;

public class SeriesAdapter extends ArrayAdapter<Series> {
    private Context context;
    private int resource;

    public SeriesAdapter(Context context, int resource, List<Series> seriesList) {
        super(context, resource, seriesList);
        this.context = context;
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(resource, parent, false);
        }
        /*
        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView titleTextView = convertView.findViewById(R.id.titleTextView);
        TextView seasonsTextView = convertView.findViewById(R.id.seasonsTextView);

        Series series = getItem(position);

        Picasso.get().load(series.getImageUrl()).into(imageView);
        titleTextView.setText(series.getTitle());
        seasonsTextView.setText(String.format(Locale.getDefault(), "%d seasons", series.getSeasons()));
        */
        return convertView;
    }
}
