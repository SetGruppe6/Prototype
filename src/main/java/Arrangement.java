public class Arrangement {

    public static String isNameLongEnough (String name){

        if (name.length() >= 5 && name.length() < 65){
            return "name Ok";
        } else if (name.length() >= 65){
            return "name too long";
        } else {
            return "name too short";
        }

    }

}
