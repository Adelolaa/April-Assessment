package HRMS;

public abstract class Property {
    private String propertyCode;

    private String location;

    private int bedrooms;

    private int bathrooms;

    private double rentPerMonth;
    private boolean occupiedStatus;

    public Property(String propertyCode, String location, int bedrooms, int bathrooms, double rentPerMonth,boolean occupiedStatus) {
        this.propertyCode = propertyCode;
        this.location = location;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.rentPerMonth = rentPerMonth;
        this.occupiedStatus= occupiedStatus;
    }

    public String getPropertyCode() {
        return propertyCode;
    }

    public void setPropertyCode(String propertyCode) {
        this.propertyCode = propertyCode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public double getRentPerMonth() {
        return rentPerMonth;
    }

    public void setRentPerMonth(double rentPerMonth) {
        this.rentPerMonth = rentPerMonth;
    }

    public boolean isOccupiedStatus() {
        return occupiedStatus;
    }

    public void setOccupiedStatus(boolean occupiedStatus) {
        this.occupiedStatus = occupiedStatus;
    }

    public abstract double rentalIncome();

    @Override
    public String toString() {
        return "Property{" +
                "propertyCode='" + propertyCode + '\'' +
                ", location='" + location + '\'' +
                ", bedrooms=" + bedrooms +
                ", bathrooms=" + bathrooms +
                ", rentPerMonth=" + rentPerMonth +
                ", occupiedStatus=" + occupiedStatus +
                '}';
    }
}



