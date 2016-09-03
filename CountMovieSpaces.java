/**
 * Created by tony on 29/08/2016.
 */
public class CountMovieSpaces {

    public static void main(String[] args) {

        String str;
        str = "I don't know just how many spaces are in this statement but I'm sure I'm gunna find out";
        String[] data;
        data = str.split(" ");

        System.out.println(data.length - 1);
    }
}
