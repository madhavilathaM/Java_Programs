package methods;

public class string1 {
    public static void main(String[] args) {
        String name="Madhavilatha";
        String city="Bangalore";
        String Area="mahadevapura";
        String Apartment="   Samhitha Serinity  ";
        char ch=' ';
        System.out.println(city.length());
        System.out.println(city.toLowerCase());
        System.out.println(Area.toUpperCase());
        System.out.println(Apartment.trim());
        System.out.println(name +ch+ "M");
        System.out.println(name.substring(7));
        System.out.println(name.replace('v','u'));
        System.out.println(name);
        System.out.println(city.charAt(4));
        System.out.println(city.equals(Area));

    }



}
