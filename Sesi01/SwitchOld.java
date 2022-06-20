public class SwitchOld{

   

    public static void main (String [] args){
        
       var day = "F";
        switch(day){
               case "M":
               case "w":
               case "F":
               {
                    System.out.println ("MWF");
                   break;
               }
               case "T":
               case "TTH":
               case "S":
               {
                
                System.out.println ("TTH");
                   break;
               }
        }
    }
}