import sujoy.monies;

import javax.xml.transform.*;
import java.util.Properties;


/**
 * Created by sujoydey on 20/06/15.
 */

public class MoneyConverter extends Transformer {


    public monies transform(String amount)
    {
        String [] numbers = amount.split("||.");

        int dollars = Integer.parseInt(numbers[0]);


        int cents = Integer.parseInt(numbers[1]);

        return new monies(dollars,cents);
    }


  //  @Override
    public void transform(Source xmlSource, Result outputTarget) throws TransformerException {

    }

   // @Override
    public void setParameter(String name, Object value) {

    }

    //@Override
    public Object getParameter(String name) {
        return null;
    }

   // @Override
    public void clearParameters() {

    }

   // @Override
    public void setURIResolver(URIResolver resolver) {

    }

  //  @Override
    public URIResolver getURIResolver() {
        return null;
    }

  //  @Override
    public void setOutputProperties(Properties oformat) {

    }

    //@Override
    public Properties getOutputProperties() {
        return null;
    }

    //@Override
    public void setOutputProperty(String name, String value) throws IllegalArgumentException {

    }

  ///  @Override
    public String getOutputProperty(String name) throws IllegalArgumentException {
        return null;
    }

   // @Override
    public void setErrorListener(ErrorListener listener) throws IllegalArgumentException {

    }

    //@Override
    public ErrorListener getErrorListener() {
        return null;
    }
}
