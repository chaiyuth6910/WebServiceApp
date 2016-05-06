package th.co.itgenius.mvcandroidapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import th.co.itgenius.mvcandroidapp.R;
import th.co.itgenius.mvcandroidapp.adapter.PhotoListAdapter;

/**
 * Created by samit on 6/5/2559.
 */
public class MainFragment extends Fragment {
    ListView listView;
    PhotoListAdapter listAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main,container,false);
        initInstances(rootView);
        return rootView;

    }

    private void initInstances(View rootView) {
        listView = (ListView) rootView.findViewById(R.id.listView);
        listAdapter = new PhotoListAdapter();
        listView.setAdapter(listAdapter);
    }


}
