
public class StringMethod {

    public static void main(String[] args) {
        
        String name = " Uva Wellassa University ";
        String dd = " Uva Wellassa University ";
    

        System.out.println(name.charAt(2)); //returns the character at the specified index
        System.out.println(name.contains("Wellassa")); //checks wether a string contains a sequence of characters
        System.out.println(name.indexOf('s'));
        System.out.println(name.lastIndexOf('s'));
        System.out.println(name.startsWith( " Uva"));//checks whether a string starts with specified characters;
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim().toLowerCase());
        System.out.println(name.trim());
        System.out.println(name.length());
        System.out.println(name.trim().length());
        System.out.println(name.endsWith("University "));//checks wether a string ends with the specified character(s)
        System.out.println(name.isEmpty());
        System.out.println(name.equals(dd));//compare
        System.out.println(name.equalsIgnoreCase(dd));//compares two strings,ignoring case considerations


    }
    

}