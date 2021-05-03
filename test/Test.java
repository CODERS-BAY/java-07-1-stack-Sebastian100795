import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StackTest {

    @Test
    public void stackSize() {
        IntStack myTestStack = new IntStack();

        myTestStack.push(1);
        myTestStack.push(2);
        myTestStack.push(3);
        Assertions.assertEquals(3, myTestStack.size());

    }

    @Test
    public void emptyStack() {
        IntStack myEmptyStack = new IntStack();
        Assertions.assertEquals(0, myEmptyStack.size());
    }

    @Test
    public void popTest(){
        IntStack myPopTest = new IntStack();
        myPopTest.push(1);
        myPopTest.push(2);
        myPopTest.push(3);
        Assertions.assertEquals(myPopTest.pop(),3);
        Assertions.assertEquals(2, myPopTest.size());
    }

    @Test
    public void myEmptyPop(){
        IntStack myPopTest = new IntStack();
        Assertions.assertEquals((Integer) null,null);
    }

    @Test
    public void myPeekTest(){
        IntStack myPeekTest = new IntStack();
        myPeekTest.push(1);
        myPeekTest.push(2);
        myPeekTest.push(3);
        Assertions.assertEquals(myPeekTest.peek(),3);

    }

    @Test
    public void myEmptyPeekTest(){
        IntStack myPeekTest = new IntStack();
        Assertions.assertEquals((Integer) null,null);
    }

    @Test
    public void myPopNTest(){
        IntStack myPopNTest = new IntStack();
        myPopNTest.push(1);
        myPopNTest.push(2);
        myPopNTest.push(3);
        Assertions.assertEquals(3, myPopNTest.size());
        myPopNTest.popN(3);
        Assertions.assertEquals(0, myPopNTest.size());
    }
    @Test
    public void exceptionPopTest(){
        IntStack myPopNTest = new IntStack();
        Assertions.assertThrows(StackTooSmallException.class, () -> {
            (new IntStack()).pop();
        });
    }

    @Test
    public void exceptionPeekTest(){
        IntStack myPopNTest = new IntStack();
        Assertions.assertThrows(StackTooSmallException.class, () -> {
            (new IntStack()).peek();
        });
    }
}
