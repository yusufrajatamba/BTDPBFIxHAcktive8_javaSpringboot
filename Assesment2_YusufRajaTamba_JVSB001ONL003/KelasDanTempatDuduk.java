public class KelasDanTempatDuduk {
    public static void main(String[] args) {

        String kelas[][] = {
                { "PHP", "Ruby", "Java" },
                { "Golang", "JavaScript", "Swift" }

        };

        Double[] array1 = new Double[kelas.length];
        Double[] array2 = new Double[kelas.length];
       
        for (int counter =0 ;counter <= array1.length;counter++) {

            for (int posisi = 0; posisi <= array1.length; posisi++) {

                System.out.println("Siapa yang akan duduk di Kelas" + "  (" + counter + "," + posisi + ")  :"
                        + kelas[counter][posisi]);
            }
        }

        for (int a = 0; a <= array2.length; a++) {
            if(a==0){
                
            System.out.println("==============================");
            }
          

            for (int b = 0; b <= array2.length; b++) {
                if (a == 0) {
                    System.out.print("|  " + kelas[a][b] + "  |");
                } else
                    System.out.print("|" + kelas[a][b] + " |");

            }
            System.out.println(" ");
        }
        System.out.println("==============================");
        int counter = 0;
        
    }

}
