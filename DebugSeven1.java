/**
 * Created by tony on 28/08/2016.
 */
public class DebugSeven1 {

    public static void main(String[] args){
        String name1 = "Roger";
        String name2 = "Roger";
        String name3 = "Stacy";

        if(name1.equals(name2))
            System.out.println(name1 + " and " + name2 +
                    " are the same. 1st compare");
        if(name1.equals(name3))
            System.out.println(name1 + " and " + name3 +
                    " are the same 2nd compare");
        if(name1.equals("roger"))
            System.out.println(name1 + " and 'roger' are the same. 3rd compare");
        if(name1.equals("Roger"))
            System.out.println(name1 + " and 'Roger' are the same. 4th compare");
    }
}
