package HRMS;

public class PropertyTest {

    public static void main(String[] args) {
        Property apa1 = new Apartment("APA001", "Ketu", 1,
                2, 1500, true, 3);
        Property apa2 = new Apartment("APA002", "Ojota", 2,
                2, 6000, false, 3);
        Property apa3 = new Apartment("APA003", "Ilupeju", 4,
                2, 5000, true, 3);
        Property condos1 = new Condos("001", "Badagry", 2, 2,
                7500, true, 2, "Pool");
        Property condos2 = new Condos("001", "Ikorodu", 4, 5,
                5000, false, 4, "Pool");
        Property condos3 = new Condos("002", "Ikotun", 4, 2,
                6000, true, 1, "Pool");
        Property house1 = new Houses("001", "Apapa", 3, 2,
                5500, true, 6, 2);
        Property house2 = new Houses("002", "Magodo", 2, 2,
                4500, true, 4, 3);
        Property house3 = new Houses("002", "Magodo", 2, 2,
                3000, true, 10, 4);

//
    RentalRepositoryUsingArrays rentalRepo = new RentalRepositoryUsingArrays(100);

        rentalRepo.addProperty(apa1);
        rentalRepo.addProperty(apa2);
        rentalRepo.addProperty(apa3);
        rentalRepo.addProperty(house1);
        rentalRepo.addProperty(house2);
        rentalRepo.addProperty(house3);
        rentalRepo.addProperty(condos1);
        rentalRepo.addProperty(condos2);
        rentalRepo.addProperty(condos3);
//
//        System.out.println(rentalRepo.viewProperty("APA001"));
//
//        System.out.println(rentalRepo.getTotalNumberOfUnoccupiedApartments());
        System.out.println(rentalRepo.searchByPropertyCode("APA001"));


    }
}
