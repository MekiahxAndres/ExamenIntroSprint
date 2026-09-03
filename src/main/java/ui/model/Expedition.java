package ui.model;

public class Expedition {

    private int id;
    private String name;
    private String code;
    private String region;
    private String baseCamp;
    private String leader;
    private String endDate;
    private String startDate;
    private String state;

    public Expedition(int id, String name, String code, String region, String baseCamp, String leader, String endDate, String startDate, String state) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.region = region;
        this.baseCamp = baseCamp;
        this.leader = leader;
        this.endDate = endDate;
        this.startDate = startDate;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        code = code;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getBaseCamp() {
        return baseCamp;
    }

    public void setBaseCamp(String baseCamp) {
        this.baseCamp = baseCamp;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
