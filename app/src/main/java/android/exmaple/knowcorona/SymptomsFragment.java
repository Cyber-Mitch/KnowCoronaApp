package android.exmaple.knowcorona;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.

 * create an instance of this fragment.
 */
public class SymptomsFragment extends Fragment {



    public SymptomsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.covid19_list, container, false);



        final ArrayList<Covid19> covid19s = new ArrayList<Covid19>();

        covid19s.add(new Covid19("The most common symptoms of COVID-19 are","Fever", "Dry cough", " Fatigue "));
        covid19s.add(new Covid19("Symptoms of severe COVID‐19 disease include:","Shortness of breath,","Loss of appetite,","Confusion,","Persistent pain or pressure in the chest,","High temperature (above 38 °C)"));
        covid19s.add(new Covid19("Other less common symptoms are:","Irritability,","Confusion,","Reduced consciousness (sometimes associated with seizures),","Anxiety,","Depression,","Sleep disorders,","More severe and rare neurological complications such as strokes, brain inflammation, delirium and nerve damage."));
        covid19s.add(new Covid19("Other symptoms that are less common and may affect some patients include:","Loss of taste or smell,","Nasal congestion,","Conjunctivitis (also known as red eyes)","Sore throat","Headache","Muscle or joint pain,","Different types of skin rash,","Nausea or vomiting,","Diarrhea,","Chills or dizziness."));


        Covid19Adapter adapter = new Covid19Adapter(getActivity(), covid19s);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }
}