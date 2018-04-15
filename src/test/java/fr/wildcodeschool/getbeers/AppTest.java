package fr.wildcodeschool.getbeers;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    App app;

//    @Test
//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( true );
//    }

    @Test
    public void shouldReturnTheSame()
    {
        app = new App();
        assertEquals( true , app);
    }
}
