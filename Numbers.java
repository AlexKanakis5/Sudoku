/*
 H Numbers typwnei tous arithmous poy xreiazomaste

 Changed: H list pleon periexei oloklhro to table 
            dhladh einai arraylist 2d 

            arxikopoieitai me 0 
            meta elegxoume an yparxei o arithmos sth grammh opws prin 

            ystera elegxoyme an yparxei aytos o arithmos sto sygkekgrimeno column 

            kai an eimaste entaksei tote bazoume ton arithmo sto row 

Not Working: kai pali, para tis prospatheies mou o pinakas exei duplicates sta columns
*/
import java.util.ArrayList;
import java.util.Random;


public class Numbers {

    //
    public static int give()
    {
        Random rand = new Random();
        int number = ( rand.nextInt(9) ) + 1;
        return number;
    }




    public static ArrayList<ArrayList<Integer>> line()
    {
        ArrayList<ArrayList<Integer>> line = new ArrayList<>(9);
        System.out.println("debug3");


        //dhmiourgeia line kai arxikopoihsh me mhdenika
        //isws na to baleis se allh methodo
        for(int i=0; i < 9; i++) {
            line.add(new ArrayList());
        }

        for (int k = 0; k< 9; k++)
        {
            for (int l =0; l<9; l++ )
            {
                line.get(k).add(0);
            }
        }

        int redo = 1;

        for (int row = 0; row < 9; row++)
        {
            for (int col=0; col< 9; col++)
            {
                int number_to_add = Numbers.give();
                
                //debug 
                System.out.println(" row is " + row  + " col is " + col);

                //oso o tyxaios arithmos yparxei sthn grammh zhtame allon apo thn give
                //epishs an isxyei redo == 1 , to opoio energopoieitai otan yparxei to stoixeio
                //sto column poy kanoume set tote bres allon tyxaio arithmo

                //makari na doyleye etsi toulaxiston

                //checkare an h sygkrish me ton telesth == einai swsth
                while (line.get(row).contains(number_to_add) || (redo == 1))
                {
                    redo =  0;

                    for(int j = 0; j < 9; j++)
                    {
                        if (line.get(j).get(col) == number_to_add)
                        {
                            redo = 1;
                            System.out.println("reddit");
                        }

                    }
                    number_to_add = Numbers.give();


                } 
                //otan brethei arithmos poy den yparxei tote to bazoume sthn grammh
                line.get(row).set(col, number_to_add);

            }
            System.out.println(line.get(row));

        }
        return line;
    }
 
}
