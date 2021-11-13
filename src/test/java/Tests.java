import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    ///Test the normal flow of the program
    public void testConvertToHex()
    {
        String input = "555";
        Assert.assertEquals("22B", Dec2Hex.convertToHex(new String[]{input}));
    }

    @Test
    ///Test the program with String as input
    public void testInputWithString()
    {
        String input = "text";
        Assert.assertEquals("Argument not an integer", Dec2Hex.convertToHex(new String[]{input}));
    }

    @Test
    //Test the program without any input
    public void testWithoutInput()
    {
        Assert.assertEquals("No input argument has been provided!", Dec2Hex.convertToHex(new String[]{}));
    }

    @Test
    ///Test the program with one normal input
    public void testConvertToHexWithAnotherInput()
    {
        String input = "10000";
        Assert.assertEquals("2710", Dec2Hex.convertToHex(new String[]{input}));
    }

    @Test
    ///Test with a negative number as input
    public void testWithNegativeInput()
    {
        String input = "-10";
        Assert.assertEquals("Only positive numbers are allowed!", Dec2Hex.convertToHex(new String[]{input}));
    }
	
	@Test
    ///Test with purpose to see how Jenkins will react to a failed test
    public void purposefullyFailedTest()
    {
        String input = "1";
        Assert.assertEquals("2", Dec2Hex.convertToHex(new String[]{input}));
    }
}
