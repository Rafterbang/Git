package com.example.mapsapp;

import android.location.Location;
import android.os.Bundle;

interface onLocationChanged {
    void onLocationChanged(Location location);

    void onStatusChanged(String s, int i, Bundle bundle);

    void onProviderEnabled(String s);

    void onProviderDisabled(String s);
}
