public class Arrangement {

    private String arrangementNavn;
    private String arrangementSted;
    private String arrangementTid;

    public Arrangement(String arrangementNavn, String arrangementSted, String arrangementTid) {

        this.arrangementNavn = arrangementNavn;
        this.arrangementSted = arrangementSted;
        this.arrangementTid = arrangementTid;

    }


    //GETTER OG SETTER

    public String getArrangementNavn() {
        return arrangementNavn;
    }

    public void setArrangementNavn(String arrangementNavn) {
        this.arrangementNavn = arrangementNavn;
    }

    public String getArrangementSted() {
        return arrangementSted;
    }

    public void setArrangementSted(String arrangementSted) {
        this.arrangementSted = arrangementSted;
    }

    public String getArrangementTid() {
        return arrangementTid;
    }

    public void setArrangementTid(String arrangementTid) {
        this.arrangementTid = arrangementTid;
    }


    //METODER

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
