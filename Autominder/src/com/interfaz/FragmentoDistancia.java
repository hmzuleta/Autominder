package com.interfaz;

import com.autominder.R;
import com.autominder.R.id;
import com.autominder.R.layout;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentoDistancia extends Fragment {

	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View v = inflater.inflate(R.layout.fragmento_home, container, false);

		TextView messageTextView = (TextView)v.findViewById(R.id.textViewHome);
		messageTextView.setText("La puta vista de Distancias");

		return v;

	}
}