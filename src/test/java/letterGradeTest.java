import org.junit.Assert;
import org.junit.Test;

public class letterGradeTest {

    @Test
    public void letterGradeProblem4a() {
        Assert.assertEquals(letterGrade.letterGrade(95), 'A');
        Assert.assertEquals(letterGrade.letterGrade(85), 'B');
        Assert.assertEquals(letterGrade.letterGrade(75), 'C');
        Assert.assertEquals(letterGrade.letterGrade(65), 'D');
        Assert.assertEquals(letterGrade.letterGrade(55), 'F');
        Assert.assertEquals(letterGrade.letterGrade(-1), 'X');
        Assert.assertEquals(letterGrade.letterGrade(101), 'X');
    }

    @Test
    public void letterGradeProblem4b() {
        Assert.assertEquals(letterGrade.letterGrade(99), 'A');
        Assert.assertEquals(letterGrade.letterGrade(101), 'X');
        Assert.assertEquals(letterGrade.letterGrade(100), 'A');
        Assert.assertEquals(letterGrade.letterGrade(90), 'A');
        Assert.assertEquals(letterGrade.letterGrade(91), 'A');
        Assert.assertEquals(letterGrade.letterGrade(99), 'A');
        Assert.assertEquals(letterGrade.letterGrade(89), 'B');
        Assert.assertEquals(letterGrade.letterGrade(81), 'B');
        Assert.assertEquals(letterGrade.letterGrade(89), 'B');
        Assert.assertEquals(letterGrade.letterGrade(70), 'C');
        Assert.assertEquals(letterGrade.letterGrade(71), 'C');
        Assert.assertEquals(letterGrade.letterGrade(79), 'C');
        Assert.assertEquals(letterGrade.letterGrade(69), 'D');
        Assert.assertEquals(letterGrade.letterGrade(60), 'D');
        Assert.assertEquals(letterGrade.letterGrade(61), 'D');
        Assert.assertEquals(letterGrade.letterGrade(59), 'F');
        Assert.assertEquals(letterGrade.letterGrade(1), 'F');
        Assert.assertEquals(letterGrade.letterGrade(0), 'F');
        Assert.assertEquals(letterGrade.letterGrade(-1), 'X');
    }
}