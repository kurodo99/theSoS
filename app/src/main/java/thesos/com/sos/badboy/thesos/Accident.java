package thesos.com.sos.badboy.thesos;

import android.location.Location;
import android.net.Uri;

import com.parse.ParseGeoPoint;
import com.parse.ParseObject;

import java.io.Serializable;

/**
 * Created by iMan on 9/12/2557.
 */
public class Accident implements Serializable {
    private String accidentId;
    private String accidentType;
    private String rescuerId;
    private String accidentDescription;
    private String accidentStatus;
    private String uri;
    private float latitude;
    private float longitude;

    public String getAccidentId() {
        return accidentId;
    }

    public void setAccidentId(String accidentId) {
        this.accidentId = accidentId;
    }

    public String getAccidentType() {
        return accidentType;
    }

    public void setAccidentType(String accidentType) {
        this.accidentType = accidentType;
    }
    public void setLocation(float latitude,float longitude){
        this.latitude = latitude;
        this.longitude = longitude;

    }


    public String getRescuerId() {
        return rescuerId;
    }

    public void setRescuerId(String rescuerId) {
        this.rescuerId = rescuerId;
    }


    public String getAccidentDescription() {
        return accidentDescription;
    }

    public void setAccidentDescription(String accidentDescription) {
        this.accidentDescription = accidentDescription;
    }

    public String getAccidentStatus() {
        return accidentStatus;
    }

    public void setAccidentStatus(String accidentStatus) {
        this.accidentStatus = accidentStatus;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
