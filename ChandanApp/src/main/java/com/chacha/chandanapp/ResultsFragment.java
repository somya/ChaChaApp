package com.chacha.chandanapp;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class ResultsFragment extends Fragment
{

	private EditText m_nameTextView;
	private TextView m_resultsTextView;
	private View     m_actionButton;

	public ResultsFragment()
	{
	}

	@Override
	public View onCreateView(
		LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View rootView = inflater.inflate(R.layout.fragment_results, container, false); return rootView;
	}


	@Override public void onViewCreated(final View view, final Bundle savedInstanceState)
	{
		super.onViewCreated(view, savedInstanceState);

		m_resultsTextView = (TextView) view.findViewById(R.id.txt_result);

		m_resultsTextView.setText(String.format("Chanman says hello to %s!", getArguments().get("name")));

	}

	@Override public void onResume()
	{
		super.onResume();

		getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


	}
}
