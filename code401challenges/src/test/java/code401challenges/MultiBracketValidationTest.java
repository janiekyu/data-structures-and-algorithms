package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test public void testBracketValidation(){
        MultiBracketValidation.bracketValidation("{}{Code}[Fellows](())");
    }

    @Test public void testCheckBracketType(){
        assertEquals(
                "opening",
                MultiBracketValidation.checkBracketType('[')
        );
        assertEquals(
                "closing",
                MultiBracketValidation.checkBracketType('}')
        );
        assertEquals(
                "other",
                MultiBracketValidation.checkBracketType('a')
        );
    }

    @Test public void testTransformOpeningBracket(){
        assertEquals(
                ')',
                MultiBracketValidation.transformOpeningBracket('(')
        );
        assertEquals(
                ']',
                MultiBracketValidation.transformOpeningBracket('[')
        );
        assertEquals(
                '}',
                MultiBracketValidation.transformOpeningBracket('{')
        );
        assertEquals(
                'X',
                MultiBracketValidation.transformOpeningBracket('p')
        );



    }
}