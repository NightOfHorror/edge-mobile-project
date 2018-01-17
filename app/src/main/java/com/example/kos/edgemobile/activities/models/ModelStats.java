package com.example.kos.edgemobile.activities.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by roman on 17.01.2018.
 */

public class ModelStats implements Parcelable
{
    private ModelStats(Parcel in)
    {
    }
    public static final Parcelable.Creator<ModelStats>CREATOR=new Parcelable.Creator<ModelStats>()
    {
        @Override
        public ModelStats createFromParcel(Parcel source)
        {
            return new ModelStats(source);
        }
        @Override
        public ModelStats[] newArray(int size) {
            return new ModelStats[size];
        }

    };

    @Override
    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)
    {

    }


}
