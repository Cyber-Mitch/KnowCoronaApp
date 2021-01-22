package android.exmaple.knowcorona;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class TreatmentsFragment extends Fragment {



    public TreatmentsFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.covid19_list, container, false);



        final ArrayList<Covid19> covid19s = new ArrayList<Covid19>();

        covid19s.add(new Covid19("Are there treatments for COVID-19?","Scientists around the world are working to find and develop treatments for COVID-19.", "Optimal supportive care includes oxygen for severely ill patients and those who are at risk for severe disease and more advanced respiratory support such as ventilation for patients who are critically ill.", "Dexamethasone is a corticosteroid that can help reduce the length of time on a ventilator and save lives of patients with severe and critical illness. Read our dexamethasone Q&A for more information.  ","Results from the WHO’s Solidarity Trial indicated that remdesivir, hydroxychloroquine, lopinavir/ritonavir and interferon regimens appear to have little or no effect on 28-day mortality or the in-hospital course of COVID-19 among hospitalized patients.","Cover your nose and mouth with your bent elbow or a tissue when you cough or sneeze.","Hydroxychloroquine has not been shown to offer any benefit for treatment of COVID-19. Read our hydroxychloroquine Q&A for more information.","WHO does not recommend self-medication with any medicines, including antibiotics, as a prevention or cure for COVID-19. WHO is coordinating efforts to develop treatments for COVID-19 and will continue to provide new information as it becomes available."));

        Covid19Adapter adapter = new Covid19Adapter(getActivity(), covid19s);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }
}