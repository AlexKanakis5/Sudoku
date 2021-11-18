/*
    H Table typwnei to table
    periexei mono th methodo print pros to paron
*/

import java.util.ArrayList;

public class Table{
    public static void print() {
        System.out.println("HelloChrysa!!");

            // ftiaxnoyme ena arraylist line poy tha parei thn timh toy 
            // apo th methodo Numbers.line();
            ArrayList<Integer> line = new ArrayList<Integer>() ;

            int j = 0;

            /* 18 giti typonontai 18 grammes 
             9 grammes me arithmous 
            */ 
            for (int i=0; i<18; i++)
            {
                line = Numbers.line();

                // typonoume arithmes me mono arithmo 
                if ( (i%2) != 0)
                {
                    for(j=1; j<9; j++)
                    {

                        //typwnoume ena ena ta stoixeia tou line 
                        // 1-1 giati thelw na bazw kai ta kena - payles 
                        System.out.print(line.get(j));   
                        if(j%3 == 0)
                        {
                            System.out.print(" | ");
                        }
                        else
                        {
                            System.out.print("  ");
                        }
                    }
                    
                    System.out.println(line.get(0));
                }
                
                //kathe 3 grammes typwnoyme payles " _ " anti gia arithmous
                else if (i%3 == 0)
                {
                    for (int k=0; k<(j*3); k++)
                    {
                    System.out.print("_");
                    }
                    System.out.println();
                    

                }
            }

      }
    
}