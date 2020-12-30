package maxnumber;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
    @Test
    public void givenMaxIntegerAtFirstPlace_ShouldReturnMaxInteger() {
        MaximumNumber maximumNumber=new MaximumNumber(3,2,1);
        Integer [] arrayCheck={3,2,1};
        Object result=maximumNumber.getMaximum(arrayCheck);
        Assert.assertEquals(3,result);
    }

    @Test
    public void givenMaxIntegerAtSecondPlace_ShouldReturnMaxInteger() {
        MaximumNumber maximumNumber=new MaximumNumber(1,3,2);
        Integer [] arrayCheck={1,3,2};
        Object result=maximumNumber.getMaximum(arrayCheck);
        Assert.assertEquals(3,result);
    }

    @Test
    public void givenMaxIntegerAtThirdPlace_ShouldReturnMaxInteger() {
        MaximumNumber maximumNumber=new MaximumNumber(1,2,3);
        Integer [] arrayCheck={1,2,3};
        Object result=maximumNumber.getMaximum(arrayCheck);
        Assert.assertEquals(3,result);
    }

    @Test
    public void givenMaxFloatValueAtFirstPlace_ShouldReturnMaxFloatValue () {
        MaximumNumber maximumNumber=new MaximumNumber(4.0f,1.0f,2.0f);
        Float [] arrayCheck={4.0f,1.0f,2.0f};
        Object result=maximumNumber.getMaximum(arrayCheck);
        Assert.assertEquals(4.0f,result);
    }

    @Test
    public void givenMaxFloatValueAtSecondPlace_ShouldReturnFloatValue() {
        MaximumNumber maximumNumber=new MaximumNumber(4.0f,5.0f,1.0f);
        Float [] arrayCheck={4.0f,5.0f,1.0f};
        Object result=maximumNumber.getMaximum(arrayCheck);
        Assert.assertEquals(5.0f,result);
    }

    @Test
    public void givenMaxFloatValueAtThirdPlace_ShouldReturnFloatValue(){
        MaximumNumber maximumNumber=new MaximumNumber(4.0f,5.0f,7.0f);
        Float [] arrayCheck={4.0f,5.0f,7.0f};
        Object result=maximumNumber.getMaximum(arrayCheck);
        Assert.assertEquals(7.0f,result);
    }

    @Test
    public void girvenMaxStringAtFirstPlace_ShouldReturnMaxString() {
        MaximumNumber maximumNumber=new MaximumNumber("Peach","Apple","Banana");
        String [] arrayCheck={"Peach","Apple","Banana"};
        Object result=maximumNumber.getMaximum(arrayCheck);
        Assert.assertEquals("Peach",result);
    }

    @Test
    public void givenMaxStringAtSecondPlace_ShouldReturnMaxString(){
        MaximumNumber maximumNumber=new MaximumNumber("Apple","Peach","Banana");
        String [] arrayCheck={"Apple","Peach","Banana"};
        Object result=maximumNumber.getMaximum(arrayCheck);
        Assert.assertEquals("Peach",result);
    }

    @Test
    public void givenMaxStringAtThirdPlace_ShouldReturnMaxString() {
        MaximumNumber maximumNumber=new MaximumNumber("Banana","Apple","Peach");
        String [] arrayCheck={"Banana","Apple","Peach"};
        Object result=maximumNumber.getMaximum(arrayCheck);
        Assert.assertEquals("Peach",result);
    }
}