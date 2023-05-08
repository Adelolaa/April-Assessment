package HRMS;

public class Condos extends Property {

 private int numberOfFloors;
 private String amenities;

 public Condos(String propertyCode, String location, int bedrooms, int bathrooms, double rentPerMonth, boolean occupiedStatus, int numberOfFloors,String amenities){
  super(propertyCode, location, bedrooms, bathrooms, rentPerMonth,occupiedStatus);
  this.numberOfFloors= numberOfFloors;
  this.amenities = amenities;
 }

 public int getNumberOfFloors() {
  return numberOfFloors;
 }

 public void setNumberOfFloors(int numberOfFloors) {
  this.numberOfFloors = numberOfFloors;
 }

 public String getAmenities() {
  return amenities;
 }

 public void setAmenities(String amenities) {
  this.amenities = amenities;
 }

 @Override
 public double rentalIncome() {
  return  getRentPerMonth() * getBedrooms() *getNumberOfFloors();
 }

 @Override
 public String toString() {
  return "Condos{" +
          "numberOfFloors=" + numberOfFloors +
          ", amenities='" + amenities + super.toString()+ '\'' +
          '}';
 }
}
