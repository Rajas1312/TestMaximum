package maxnumber;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
    @Test
    public void givenMaxIntegerAtFirstPlace_ShouldReturnMaxInteger() {
        MaximumNumber maximumNumber=new MaximumNumber();
        int result=maximumNumber.max(3,2,1);
        Assert.assertEquals(3,result);
    }

    @Test
    public void givenMaxIntegerAtSecondPlace_ShouldReturnMaxInteger() {
        MaximumNumber maximumNumber=new MaximumNumber();
        int result=maximumNumber.max(1,3,2);
        Assert.assertEquals(3,result);
    }

    @Test
    public void givenMaxIntegerAtThirdPlace_ShouldReturnMaxInteger() {
        MaximumNumber maximumNumber=new MaximumNumber();
        int result=maximumNumber.max(1,2,3);
        Assert.assertEquals(3,result);
    }
}