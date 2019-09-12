/*
        ID: pranayn2
        LANG: JAVA
        PROG: ride
        */

import java.io.*;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class gift1 {

    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("gift1.in"));

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));


        Hashtable hashtable = input(f);







    }


    public static Hashtable helper(Hashtable hashtable,BufferedReader f) throws IOException{

        while (true){

            int amoutToadd=0;

            String giver = f.readLine();

            if (giver==null)
                break;

            StringTokenizer st = new StringTokenizer(f.readLine());

            int amount = Integer.parseInt(st.nextToken());

            int nooffriends = Integer.parseInt(st.nextToken());




            if (nooffriends==0)
                continue;
            if (amount==0) {
                for (int i = 0; i < nooffriends; i++)
                    f.readLine();
                continue;
            }
             amoutToadd= amount/nooffriends;

            int amoutDeduct = amoutToadd*nooffriends;

            for (int i = 0 ;i<nooffriends ;i++){

                String persontoAdd = f.readLine();
                hashtable.replace(persontoAdd,(int)hashtable.get(persontoAdd)+amoutToadd);


            }


            hashtable.replace(giver,(int)hashtable.get(giver)-amoutDeduct);


        }



        return hashtable;



    }

    public static Hashtable input (BufferedReader f) throws  IOException{

        Hashtable<String, Integer> hashtable = new Hashtable<>();

        int n = Integer.parseInt(f.readLine());

        for (int i =0 ;i<n ;i++){
            hashtable.put(f.readLine(),0);
        }

        return hashtable;


    }


}
