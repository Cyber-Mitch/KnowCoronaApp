package android.exmaple.knowcorona;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;



public class PreventionFragment extends Fragment {








    public PreventionFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.covid19_list, container, false);



        final ArrayList<Covid19> covid19s = new ArrayList<Covid19>();

        covid19s.add(new Covid19("To prevent the spread of COVID-19:","Clean your hands often. Use soap and water, or an alcohol-based hand rub.", "Maintain a safe distance from anyone who is coughing or sneezing.", " Wear a mask when physical distancing is not possible.","Don’t touch your eyes, nose or mouth.","Cover your nose and mouth with your bent elbow or a tissue when you cough or sneeze.","Stay home if you feel unwell.","If you have a fever, cough and difficulty breathing, seek medical attention.",R.drawable.covid19));

        Covid19Adapter adapter = new Covid19Adapter(getActivity(), covid19s);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }
}