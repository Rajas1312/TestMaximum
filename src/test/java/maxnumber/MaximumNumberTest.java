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

    @Test
    public void givenMaxFloatValueAtFirstPlace_ShouldReturnMaxFloatValue () {
        MaximumNumber maximumNumber=new MaximumNumber();
        float result=maximumNumber.max(4.0f,1.0f,2.0f);
        Assert.assertEquals(4.0f,result,0.0f);
    }

    @Test
    public void givenMaxFloatValueAtSecondPlace_ShouldReturnFloatValue() {
        MaximumNumber maximumNumber=new MaximumNumber();
        float result=maximumNumber.max(4.0f,5.0f,1.0f);
        Assert.assertEquals(5.0f,result,0.0f);
    }

    @Test
    public void givenMaxFloatValueAtThirdPlace_ShouldReturnFloatValue(){
        MaximumNumber maximumNumber=new MaximumNumber();
        float result=maximumNumber.max(4.0f,5.0f,7.0f);
        Assert.assertEquals(7.0f,result,0.0f);
    }

    @Test
    public void girvenMaxStringAtFirstPlace_ShouldReturnMaxString() {
        MaximumNumber maximumNumber=new MaximumNumber();
        String result=maximumNumber.max("Peach","Apple","Banana");
        Assert.assertEquals("Peach",result);
    }

    @Test
    public void givenMaxStringAtSecondPlace_ShouldReturnMaxString(){
        MaximumNumber maximumNumber=new MaximumNumber();
        String result=maximumNumber.max("Apple","Peach","Banana");
        Assert.assertEquals("Peach",result);
    }

    @Test
    public void givenMaxStringAtThirdPlace_ShouldReturnMaxString() {
        MaximumNumber maximumNumber=new MaximumNumber();
        String result=maximumNumber.max("Banana","Apple","Peach");
        Assert.assertEquals("Peach",result);
    }
}