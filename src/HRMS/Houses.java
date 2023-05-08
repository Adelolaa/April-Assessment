package HRMS;

public class Houses extends Property {
     private int numberOfFloors;
     private int yardSize;

     public Houses(String propertyCode, String location, int bedrooms, int bathrooms, double rentPerMonth,boolean occupiedStatus,int yardSize, int numberOfFloors) {
          super(propertyCode, location, bedrooms, bathrooms, rentPerMonth,occupiedStatus);
          this.yardSize = yardSize;
          this.numberOfFloors= numberOfFloors;
     }

     public int getNumberOfFloors() {
          return numberOfFloors;
     }

     public void setNumberOfFloors(int numberOfFloors) {
          this.numberOfFloors = numberOfFloors;
     }

     public int getYardSize() {
          return yardSize;
     }

     public void setYardSize(int yardSize) {
          this.yardSize = yardSize;
     }

     @Override
     public double rentalIncome() {
          return getRentPerMonth() * getBedrooms() * getNumberOfFloors();
     }

     @Override
     public String toString() {
          return "Houses{" +
                  "numberOfFloors=" + numberOfFloors +
                  ", yardSize=" + yardSize + super.toString() +
                  '}';
     }
}
