package com.polinema.meme;

<<<<<<< HEAD
import android.location.Location;
import android.os.AsyncTask;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import android.util.Log;
import android.util.TimeUtils;
=======
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;

>>>>>>> 658116f88cf5f82961cf9166930d8ef6bb4c028a
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

<<<<<<< HEAD
public class DapatkanAlamatTask extends AsyncTask<Location,Void,String> {

    private Context mContext;
    private onTaskSelesai mListener;

    @Override
    protected String doInBackground(Location... locations) {
        Geocoder geocoder = new Geocoder(mContext, Locale.getDefault());
        Location location = locations[0];
        List<Address> alamat = null;
        String resultMessage = "";
        try
        {
            alamat = geocoder.getFromLocation(location.getLatitude(),location.getLongitude(),1);
        }
        catch (IOException ioException)
        {
            resultMessage = "Service tidak tersedia";
            Log.e("Lokasi Error", resultMessage,ioException);
        }
        catch (IllegalArgumentException illegalArgumentException)
        {
            resultMessage = "Koordinat invalid";
            Log.e("Lokasi Error", resultMessage + ". " + "Latitude = " + location.getLatitude() + ",Longitude = " + location.getLongitude(),illegalArgumentException );
        }
        if (alamat == null || alamat.size() == 0)
        {
            if (resultMessage.isEmpty())
            {
                resultMessage = "Alamat tidak ditemukan";
                Log.e("Lokasi Error",resultMessage);
=======
public class DapatkanAlamatTask extends AsyncTask<Location, Void, String> {
    List<Address> alamat = null;
    private onTaskSelesai mListener;
    @Override
    protected String doInBackground(Location... locations) {
        Geocoder geocoder = new Geocoder(mContex, Locale.getDefault());
        Location location = locations[0];
        List<Address> alamat = null;
        String resultMessage = null; //ubah

        try{
            alamat = geocoder.getFromLocation(
                    location.getLatitude(),
                    location.getLongitude(),1);
        }
        catch (IOException ioException) {
            resultMessage = "Servis tidak tersedia";
            Log.e("Lokasi eror", resultMessage, ioException);
        }
        catch (IllegalArgumentException ilegal) {
            resultMessage = "koordinat invalid";
            Log.e("Lokasi Eror", resultMessage +". " +
                            "Latitude = " +location.getLatitude() +
                            ", Longlitude = " +location.getLongitude(),
                    ilegal);
        }
        if (alamat == null || alamat.size() ==0)
        {
            if (resultMessage.isEmpty())
            {
                resultMessage ="almat tidak ditemukan";
                Log.e("Lokasi error", resultMessage);
>>>>>>> 658116f88cf5f82961cf9166930d8ef6bb4c028a
            }
        }
        else
        {
            Address address = alamat.get(0);
<<<<<<< HEAD
            ArrayList<String> barisAlamat = new ArrayList<>();
            for (int i = 0; i <= address.getMaxAddressLineIndex(); i++)
            {
                barisAlamat.add(address.getAddressLine(i));
            }
            resultMessage = TextUtils.join("\n",barisAlamat);
=======
            ArrayList<String> berisiAlamat = new ArrayList<>();
            for(int i =0; i<= address.getMaxAddressLineIndex(); i++)
            {
                berisiAlamat.add(address.getAddressLine(i));
            }
            resultMessage = TextUtils.join("\n", berisiAlamat);

>>>>>>> 658116f88cf5f82961cf9166930d8ef6bb4c028a
        }
        return resultMessage;
    }

<<<<<<< HEAD
    interface onTaskSelesai
    {
        void onTaskCompleted(String result);
    }

    DapatkanAlamatTask(Context applicationContext, onTaskSelesai listener)
    {
        mContext = applicationContext;
        mListener = listener;
    }

=======
>>>>>>> 658116f88cf5f82961cf9166930d8ef6bb4c028a
    @Override
    protected void onPostExecute(String alamat) {
        mListener.onTaskCompleted(alamat);
        super.onPostExecute(alamat);
<<<<<<< HEAD
    }
=======

    }
    private Context mContex;
    public DapatkanAlamatTask(Context applicationContext, onTaskSelesai listener) {
        mContex = applicationContext;
        mListener = listener;
    }
    interface onTaskSelesai{
        void onTaskCompleted(String result)throws SecurityException; //ubah
    }

>>>>>>> 658116f88cf5f82961cf9166930d8ef6bb4c028a
}
