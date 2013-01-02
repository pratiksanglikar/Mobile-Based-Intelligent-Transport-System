package edu.pict.theparsteam.beproject;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.Bundle;

/**
 * This shows how to create a simple activity with a map and a marker on the map.
 * <p>
 * Notice how we deal with the possibility that the Google Play services APK is not
 * installed/enabled/updated on a user's device.
 */
public class Maps1Activity extends android.support.v4.app.FragmentActivity 
{
	private GoogleMap mMap;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_maps);
		setUpMapIfNeeded();
	}

	@Override
	protected void onResume() 
	{
		super.onResume();
		setUpMapIfNeeded();
	}


	private void setUpMapIfNeeded() 
	{

		if (mMap == null) 
		{

			mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.fragment1)).getMap();

			if (mMap != null) 
			{
				setUpMap();
			}
		}
	}

	private void setUpMap() 
	{
		mMap.addMarker(new MarkerOptions().position(new LatLng(18.456776,73.861019)).title("Katraj"));
	}
}
