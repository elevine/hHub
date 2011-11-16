package org.hHub.weight.ui;

import org.hHub.weight.OrmProvider;
import org.hHub.weight.R;
import org.hHub.weight.database.WeightDatabaseHelper;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 
 * @author Eric Levine
 *
 */
public class AddWeightFragment extends Fragment {
	WeightDatabaseHelper databaseHelper = null;
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		databaseHelper = ((OrmProvider)getActivity()).getDatabaseHelper();
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.new_weight, container, false);
	}
	
	
}
