package smartbox.test.application.data.retrofit.response;

import android.os.Parcel;
import android.os.Parcelable;

public class EventShop implements Parcelable {

    public int id;
    public String type;
    public String title;
    public String shortDescription;
    public String description;
    public String smallImage;
    public String bigImage;
    public String latitude;
    public String longitude;

    protected EventShop(Parcel in) {
        id = in.readInt();
        type = in.readString();
        title = in.readString();
        shortDescription = in.readString();
        description = in.readString();
        smallImage = in.readString();
        bigImage = in.readString();
        latitude = in.readString();
        longitude = in.readString();
    }

    public static final Creator<EventShop> CREATOR = new Creator<EventShop>() {
        @Override
        public EventShop createFromParcel(Parcel in) {
            return new EventShop(in);
        }

        @Override
        public EventShop[] newArray(int size) {
            return new EventShop[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(type);
        parcel.writeString(title);
        parcel.writeString(shortDescription);
        parcel.writeString(description);
        parcel.writeString(smallImage);
        parcel.writeString(bigImage);
        parcel.writeString(latitude);
        parcel.writeString(longitude);
    }
}
