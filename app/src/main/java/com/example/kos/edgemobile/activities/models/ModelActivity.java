package com.example.kos.edgemobile.activities.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.kos.edgemobile.domains.User;
import com.google.gson.annotations.SerializedName;

/**
 * Created by roman on 17.01.2018.
 */

public class ModelActivity implements Parcelable
{


    @SerializedName("UserName")
    private String UserName;


    private ModelActivity(Parcel in)
    {
        this.UserName=in.readString();
    }
    public static final Parcelable.Creator<ModelActivity > CREATOR = new Parcelable.Creator<ModelActivity >()
    {
        @Override
        public ModelActivity  createFromParcel(Parcel source)
        {
            return new ModelActivity (source);
        }
        @Override
        public ModelActivity [] newArray(int size)
        {
            return new ModelActivity [size];
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
        dest.writeString(UserName);
    }

    public String getUserName()
    {
        return UserName;
    }
    public void setUserName(String text)
    {
        this.UserName=text;
    }


}
