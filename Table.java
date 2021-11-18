/*
    H Table typwnei to table
    periexei mono th methodo print pros to paron

    Change: Aferesa ta symbola gia thn emfanish toy pinaka
            me mperdeyan sto debuging 
            kai sthn telikh den kserw kan an tha ta emfanizw etsi opws to ekana
*/

import java.util.ArrayList;

public class Table{
    public static void print() {
        System.out.println("HelloChrysa!!");

            // ftiaxnoyme ena 2D arraylist line poy tha parei thn timh toy 
            // apo th methodo Numbers.line();
            ArrayList<ArrayList<Integer>> whole = new ArrayList<>(9);

            whole = Numbers.line();


            int row = 0;
            int col = 0;


            //aplh ektypwsh, nothing to see here
            for(row = 0; row<9; row++)
            {
                for(col = 0; col < 9; col ++)
                {
                    System.out.print(whole.get(row).get(col));
                }
                System.out.println();
            }
   

                
            

      }
    
}