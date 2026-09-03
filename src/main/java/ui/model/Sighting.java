package ui.model;

public class Sighting {

    private int id;
    private String sightingId;
    private String name;
    private String description;
    private String scientificName;
    private String sightingAt;
    private String location;
    private int quantity;
    private String confidenceLevel;
    private int expeditionId;

    public Sighting(int id, String sightingId, String name, String description, String scientificName, String sightingAt, String location, int quantity, String confidenceLevel, int expeditionId) {
        this.id = id;
        this.sightingId = sightingId;
        this.name = name;
        this.description = description;
        this.scientificName = scientificName;
        this.sightingAt = sightingAt;
        this.location = location;
        this.quantity = quantity;
        this.confidenceLevel = confidenceLevel;
        this.expeditionId = expeditionId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExpeditionId() {
        return expeditionId;
    }

    public void setExpeditionId(int expeditionId) {
        this.expeditionId = expeditionId;
    }

    public String getConfidenceLevel() {
        return confidenceLevel;
    }

    public void setConfidenceLevel(String confidenceLevel) {
        this.confidenceLevel = confidenceLevel;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSightingAt() {
        return sightingAt;
    }

    public void setSightingAt(String sightingAt) {
        this.sightingAt = sightingAt;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSightingId() {
        return sightingId;
    }

    public void setSightingId(String sightingId) {
        this.sightingId = sightingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
