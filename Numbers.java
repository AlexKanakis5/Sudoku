/*
 H Numbers typwnei tous arithmous poy xreiazomaste
 give -> apla dinei enan tyxaio arithmo
 line -> dinei mia swsth grammh, periexei arithmous apo to 1-9 oi opoioi emfanizontai tyxaia 
        alla mono mia fora se kathe grammh


 todo: na brw enan tropo na bazw kai diaforetikous arithmous se kathe sthlh
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



    public static ArrayList<Integer> line()
    {
        ArrayList<Integer> line = new ArrayList<Integer>();

        for (int length = 0; length < 9; length++)
        {
            int number_to_add = Numbers.give();

            //oso o tyxaios arithmos yparxei sthn grammh zhtame allon apo thn give
            while (line. contains(number_to_add))
            {
                number_to_add = Numbers.give();
            } 
            //otan brethei arithmos poy den yparxei tote to bazoume sthn grammh
            line.add(number_to_add);
        }
        return line;
    }
 
}
