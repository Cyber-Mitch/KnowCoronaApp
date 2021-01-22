package android.exmaple.knowcorona;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Covid19Adapter  extends ArrayAdapter<Covid19> {
    public Covid19Adapter(@NonNull Context context, ArrayList<Covid19> covid19s) {
        super(context, 0,covid19s);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }



        Covid19 currentCovid19 = getItem(position);

        TextView caption = listItemView.findViewById(R.id.caption);

        caption.setText(currentCovid19.getCaption());






        TextView textView1 = listItemView.findViewById(R.id.textView1);

      textView1.setText(currentCovid19.getmCovid1());


        TextView textView2 = listItemView.findViewById(R.id.textView2);

        textView2.setText(currentCovid19.getmCovid2());

        TextView textView3 = listItemView.findViewById(R.id.textView3);

        textView3.setText(currentCovid19.getmCovid3());

        TextView textView4 = listItemView.findViewById(R.id.textView4);

        textView4.setText(currentCovid19.getmCovid4());


        TextView textView5 = listItemView.findViewById(R.id.textView5);

        textView5.setText(currentCovid19.getmCovid5());

        TextView textView6 = listItemView.findViewById(R.id.textView6);

        textView6.setText(currentCovid19.getmCovid6());

        TextView textView7 = listItemView.findViewById(R.id.textView7);

        textView7.setText(currentCovid19.getmCovid7());


        TextView textView8 = listItemView.findViewById(R.id.textView8);

        textView8.setText(currentCovid19.getmCovid8());

        TextView textView9 = listItemView.findViewById(R.id.textView9);

        textView9.setText(currentCovid19.getmCovid9());

        TextView textView10 = listItemView.findViewById(R.id.textView10);

        textView10.setText(currentCovid19.getmCovid10());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        if (currentCovid19.hasImage()) {
            imageView.setImageResource(currentCovid19.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }


}
