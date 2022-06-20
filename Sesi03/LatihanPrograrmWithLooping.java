public class LatihanPrograrmWithLooping {
  

        public static void main(String[] args) {
            int bintang;
            //nampilkan bintang 
            
            for(bintang = 1;bintang <=5; bintang++){
                int baris;
                for (baris =0; baris <5;baris++){
                    System.out.print("*");
    
                }
                System.out.println("");
                
            }
    
            //nampilkan nilai 1-10
    
            for(int number=1;number <=10;number++){
    
                System.out.print(" " + number);
    
            }
    
            System.out.println(""); 
    
            //menampilkan bilangan ganjil saja
    
            for(int bil=0; bil<=20;bil++){
    
            if(bil%2!=0){
                System.out.print(" " +bil);
            }
            else
            continue;
    
            }
        }
        
        
    }
    
    

