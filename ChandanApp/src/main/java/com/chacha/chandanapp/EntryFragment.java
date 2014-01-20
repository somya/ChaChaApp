package com.chacha.chandanapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class EntryFragment extends Fragment
{

	private EditText m_nameTextView;
	private TextView m_resultsTextView;
	private View     m_actionButton;

	public EntryFragment()
	{
	}

	@Override
	public View onCreateView(
		LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View rootView = inflater.inflate(R.layout.fragment_main, container, false);
		return rootView;
	}


	@Override public void onViewCreated(final View view, final Bundle savedInstanceState)
	{
		super.onViewCreated(view, savedInstanceState);

		m_nameTextView = (EditText) view.findViewById(R.id.txt_name);
		m_actionButton = view.findViewById(R.id.btn_action);
		m_resultsTextView = (TextView) view.findViewById(R.id.txt_result);

		m_actionButton.setOnClickListener(
			new View.OnClickListener()
			{
				@Override public void onClick(final View v)
				{
					InputMethodManager imm = (InputMethodManager)getActivity().getSystemService(
						Context.INPUT_METHOD_SERVICE);
					imm.hideSoftInputFromWindow(m_nameTextView.getWindowToken(), 0);

					((MainActivity) getActivity()).showResults( m_nameTextView.getText().toString());
				}
			});


	}
}
