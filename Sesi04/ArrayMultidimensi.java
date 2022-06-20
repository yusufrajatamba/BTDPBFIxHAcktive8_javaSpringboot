public class ArrayMultidimensi {
    public static void main(String[] args) {
        String [][] framework = {
            {"java", "kotlin"},
            {"React", "reactjs"},
            {"PHP", "Laravel"}
        };

        for(int counter =0; counter<framework.length;counter++){

            System.out.println("Bahasa : " + framework[counter][0]);
            System.out.println("Framework : " + framework[counter][1]);
            System.out.println(" --------");

        }
    }
    
}
