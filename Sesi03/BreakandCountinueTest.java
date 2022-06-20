public class BreakandCountinueTest {

    public static void main(String[] args) {
        int i;
        for(i=0;i<10;i++){
            if(i>5){
                break;
                
            }
            else if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
    
}
