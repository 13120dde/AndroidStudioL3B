package a13solutions.androidstudiol3b;


import android.content.res.Resources;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WhatToDoFragment extends Fragment {

    private Controller controller;
    private ListView list;
    //private String[] content;
    String[] content = new String[3];

    public WhatToDoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        instantiateListView(view);
        instantiateContentArray();
        return view;
    }

    private void instantiateContentArray() {
        content[0] = "Att starta en Activity";
        content[1] = "Att lägga till data i en Intent";
        content[2] = "Avläsa data i ny aktivitet";

    }

    private void instantiateListView(View view) {

        list = (ListView) view.findViewById(R.id.lvWhatToDo);
        list.setAdapter(new ArrayAdapter<String>(getActivity().getApplicationContext(),android.R.layout.simple_list_item_1, content));
        list.setOnItemClickListener(new ClickListener());
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    private class ClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            TextView tv = (TextView) view;
            controller.setInfo(tv.getText().toString());
        }
    }
}
