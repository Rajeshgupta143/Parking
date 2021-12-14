import java.util.*;

public class ParkingSlot {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr=new int[6];

            Map<Integer,Map<String,String>> parking=new LinkedHashMap<>();
            Map<String,String> park1=new LinkedHashMap<>();
            boolean park = true;
            while (park) {
                System.out.println("enter your choice ");
                System.out.println("1:booking parking slot");
                System.out.println("2:leave parking");
                System.out.println("3:Status of parking");
                System.out.println("4:Find Registration number with color");
                System.out.println("5:Find parking slot with color");
                System.out.println("6:Find Parking slot with Registration number");
                System.out.println("7:Exit");

                int choice = sc.nextInt();
                if (choice == 1) {
                    System.out.println("enter your parking slot ");
                    int slot= sc.nextInt();
                    System.out.println("enter your registration number");
                    String rg= sc.next();
                    System.out.println("Enter Colour of car");
                    String clr= sc.next();
                    park1.put(rg,clr);
                    parking.put(slot,park1);
                } else if (choice == 2) {
                    System.out.println("which slot you want free");
                    int slot=sc.nextInt();
                    parking.remove(slot);
                    System.out.println("Slot number "+slot+" is free ");

                } else if (choice == 3) {
                    parking.get(1);

                    Set<Map.Entry<String,String>> entries= park1.entrySet();
                    Set<Map.Entry<Integer,Map<String,String>>> entries1= parking.entrySet();
                    System.out.println("parking \t RegistrationNO \t color");
                    for (Map.Entry<Integer,Map<String, String>> e1 : entries1) {

                        for (Map.Entry<String, String> e : entries) {

                            System.out.println(e1.getKey()+" \t"+e.getKey() + "    \t" + e.getValue());


                        }
                    }


                } else if (choice == 4) {
                    System.out.println("Enter your car of colour");
                    String col= sc.next();


                    for (Map.Entry<String, String> entry : park1.entrySet()) {

                        if (entry.getValue().equals(col))
                        {
                            System.out.println(entry.getKey());
                        }
                    }



                } else if (choice == 5) {

                } else if (choice == 6) {

                } else if (choice == 7) {
                    park = false;
                }
            }
        }
}
