import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testStringInput(){
        String input = "Ok";
        Assert.assertEquals("Argument not an integer", Dec2Hex.convertToHex(new String[]{input}));
    }

    @Test
    ///Test the program with normal arguments
    public void testConvertToHex(){
        String input = "2000";
        Assert.assertEquals("7D0", Dec2Hex.convertToHex(new String[]{input}));
    }
}
