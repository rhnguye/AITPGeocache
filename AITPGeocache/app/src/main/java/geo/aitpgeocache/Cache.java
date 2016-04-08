package geo.aitpgeocache;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

/**
 * Created by Mrakh on 4/8/2016.
 */
public class Cache {

    private String name;
    private String type;
    private String description;
    private double difficulty;
    private String size;
    private String hint;
    private LatLng location;

    public ArrayList<String> getComment() {
        return comment;
    }

    public void setComment(ArrayList<String> comment) {
        this.comment = comment;
    }

    private ArrayList<String> comment;


    public Cache() {
    }

    public Cache(String name, String type, String description, double difficulty, String size, String hint, LatLng location) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.difficulty = difficulty;
        this.size = size;
        this.hint = hint;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public LatLng getLocation() {
        return location;
    }

    public void setLocation(LatLng location) {
        this.location = location;
    }
}
