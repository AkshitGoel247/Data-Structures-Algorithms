public class Patterns{


    public static void main(String[] args) {
        Patterns patterns = new Patterns();

        // printing patterns
        patterns.pattern12(4);

    }

    public void pattern1(int n){
        int i = 1;                                                  // 1  2  3  
        while(i <= n) {                                             // 1  2  3
            int j = 1;                                              // 1  2  3
            while (j <= n) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }




    public void pattern2(int n){
        int i=1;
        while(i<=n*n){
            int j=1;                                                // 1  2  3
            while(j<=n){                                            // 4  5  6
                System.out.print(i + " ");                          // 7  8  9 
                j++;
                i++;
            }
            System.out.println();
        }
    }



    public void pattern3(int n){
        int row = 1;
        while(row <= n){                                            // *
            int col = 1;                                            // *  * 
            while(col <= row){                                      // *  *  *
                System.out.print("* ");                             // *  *  *  *  
                col++;
            }
            System.out.println();
            row++;
        }
    }



    public void pattern4(int n){
        int row = 1;
        while(row <= n){
            int col = 1;                                            // 1
            while(col <= row){                                      // 1  2
                System.out.print(col + " ");                        // 1  2  3
                col++;                                              // 1  2  3  4    
            }
            System.out.println();
            row++;
        }
    }



    public void pattern5(int n){
        int row = 1;
        int num = 1;
        while(row<=n){
            int col = 1;                                            // 1
            while(col<=row){                                        // 2  3
                System.out.print(num + " ");                        // 4  5  6
                num++;                                              // 7  8  9  10
                col++;
            }
            System.out.println();
            row++;
        }
    }



    public void pattern6(int n){
        int row = 1;
        while(row <= n){
            int num = row;
            int col = 1;                                            // 1
            while(col <= row){                                      // 2  3
                System.out.print(num + " ");                        // 3  4  5
                col++;                                              // 4  5  6  7
                num++;
            }
            System.out.println();
            row++;
        }
    }



    public void pattern7(int n){
        int row = 1;
        while(row <= n){
            int col = 1;
            while(col <= n){                                        // A  B  C  D
                char ch = (char)('A'+col-1);                        // A  B  C  D
                System.out.print(ch + " ");                         // A  B  C  D
                col++;                                              // A  B  C  D
            }
            System.out.println();
            row++;
        }
    } 



    public void pattern8approach1(int n){
        int row=1;
        while(row<=2*n){
            if(row<=n){    
                int col = 1;
                while(col<=row){
                    System.out.print("* ");                           // *                      
                    col++;                                            // *  *  
                }                                                     // *  *  *  
                System.out.println();                                 // *  *  *  *  
                row++;                                                // *  *  *  
            }                                                         // *  *  
            else{                                                     // *  
                int col = 1;
                while(col<= 2*n - row){
                    System.out.print("* ");
                    col++;
                }
                System.out.println();
                row++;
            }
        }
    }



    public void pattern8approach2(int n){
        for(int row=1; row<=2*n; row++ ){                               // *
            int totalCols = row>n ? 2*n-row : row;                      // *  * 
                                                                        // *  *  *
            for(int col=1; col<=totalCols; col++){                      // *  *  *  *
                System.out.print("* ");                                 // *  *  *  
            }                                                           // *  *
            System.out.println();                                       // *    
        }
    }




    public void pattern9(int n){
        int row = 1;
        int col=1;
        while(row<=2*n){                                                //    * 
            int totalCols = n>=row ? col=row : 2*n-row;                 //   *  *
            int breaks = n - totalCols;                                 //  *  *  * 
                                                                        // *  *  *  *
            for(int space=0; space<breaks; space++){                    //  *  *  *
                System.out.print(" ");                                  //   *  *  
            }                                                           //     *    
            for(col=1; col<=totalCols; col++){
                System.out.print("* ");
            }
            System.out.println();
            row++;
        }
    }




    public void pattern10(int n){
        int row=1;
        int col=1;
        for(row=1; row<=n; row++){
            int spaces = n - row;
            for(int space=1; space<=spaces; space++){                   //    1
                System.out.print(" ");                                  //   121  
            }                                                           //  12321
            for(col=1; col<=row; col++){                                // 1234321
                System.out.print(col);                                  //123454321
            }
            for(col=row-1; col>=1; col--){
                System.out.print(col);
            }

            System.out.println();
        }
    }



    public void pattern11(int n){
        int row=1;
        int col=1;
        for(row=1; row<=n; row++){
            int spaces = n - row;

            for(int space=0; space<=spaces; space++){                   //    1
                System.out.print(" ");                                  //   212  
            }                                                           //  32123
                                                                        // 4321234
            for(col=row; col>=1; col--){                                //543212345
                System.out.print(col);
            }

            for(col=2; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }




    public void pattern12(int n){

                                                                        // 4 4 4 4 4 4 4 
                                                                        // 4 3 3 3 3 3 4 
                                                                        // 4 3 2 2 2 3 4 
                                                                        // 4 3 2 1 2 3 4 
                                                                        // 4 3 2 2 2 3 4 
                                                                        // 4 3 3 3 3 3 4 
                                                                        // 4 4 4 4 4 4 4 
        int row=1;
        int col=1;

        int dual = n*2;
        while(row<dual){
            for(col=1; col<dual; col++){
                int index = n+1- min(min(row, col), min(dual-row, dual-col));
                System.out.print(index + " ");
            }
            row++;
            System.out.println();
        }
    }
        public int min(int a, int b){
            if(a > b){
                return b;
            }else{
                return a;
            }
        }   





}
