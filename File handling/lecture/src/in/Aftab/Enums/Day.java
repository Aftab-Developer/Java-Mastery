package in.Aftab.Enums;

public enum Day {
    SUNDAY("sunday called") ,
    MONDAY ("Monday called"),
    TUESDAY("Tuesday called") ,
    WEDNESDAY("Wednesday called") ,
    THURSDAY("Thursday called")
    ,FRIDAY("Friday called"),
    SATUARDAY("Satuarday called") ;

    private  String  val = null ;
     Day(String val) {
        this.val = val ;
    }
    public void getVal(){
        System.out.println(this.val);
    }

}
class Check {
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        String days = switch (day){
            case MONDAY -> "today is monday" ;
            case TUESDAY -> "today is tuesday" ;
            case WEDNESDAY -> "today is Wednesday" ;
            case THURSDAY -> "today is Thursday" ;
            case FRIDAY -> "today is Friday" ;
            case SATUARDAY -> "today is Satuarday" ;
            case SUNDAY -> "today is Sunday" ;
            default -> "invalid day";

         };
        System.out.println(days);

    }
}
