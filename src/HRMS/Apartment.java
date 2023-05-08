package HRMS;

public class Apartment extends Property {

    private int floorNumber;



    public Apartment(String propertyCode, String location, int bedrooms, int bathrooms, double rentPerMonth, boolean occupiedStatus,int floorNumber) {
        super(propertyCode, location, bedrooms, bathrooms, rentPerMonth,occupiedStatus);
        this.floorNumber=floorNumber;

    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;

    }

    @Override
    public double rentalIncome() {
        return getBedrooms() * getRentPerMonth();
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "floorNumber=" + floorNumber + super.toString() +
                '}';
    }
}
