public class SwitchCase {
    public static void main(String[] args) {
        String day = "A";
     String result = switch (day)
     {
        
        case "M","A","P"-> "MVP";
        case "W","I","N" -> "WIN";
         default ->
           {
         	if (day.isEmpty())
             result = "Please insert a valid day";
             else
             result = "Look like sunday";
             throw new IllegalStateException("Invalid Day :" + result);
         }
     };
     System.out.println(result);
    }
    
    
}
