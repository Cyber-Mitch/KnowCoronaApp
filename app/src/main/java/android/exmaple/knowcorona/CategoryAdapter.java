package android.exmaple.knowcorona;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);

        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new SymptomsFragment();

        }else if(position == 1){
            return new PreventionFragment();

        }else {
            return new TreatmentsFragment();
        }
    }

    @Override
    public int getCount() {

        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if(position == 0)
            return mContext.getString(R.string.Symptoms);
        else if (position == 1)
            return mContext.getString(R.string.Prevention);
        else
            return mContext.getString(R.string.Treatment);


    }
}
