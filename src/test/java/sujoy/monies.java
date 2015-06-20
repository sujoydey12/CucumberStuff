package sujoy;

import java.util.regex.Pattern;

/**
 * Created by sujoydey on 20/06/15.
 */
public class monies {

    int dollar ;
    int cent;

    public monies(int dollar,int cent) {


        Pattern pattern = Pattern.compile("^[^\\d] * ([\\d] +) \\ .([\\d] [\\d]) $");


       // Matcher matcher = pattern.matcher(amount);
      //  this.dollar = Integer.parseInt(matcher.group[1]);

       // this.cent = Integer.parseInt(matcher.group[2]);
    }
}