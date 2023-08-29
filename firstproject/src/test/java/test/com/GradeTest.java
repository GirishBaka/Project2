/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import com.itexps.firstproject.Grade;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author gbaka
 */
public class GradeTest {
    Grade grade;
    
    public GradeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        grade = new Grade("Tom", 80, 85, 95);
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    
    public void testGrade(){
        assertEquals(grade.getGrade(), "Pass");
    }
    
    @Test
    
    public void testGradeFail(){
        grade =new Grade("Kevin", 20, 30, 50);
        assertEquals(grade.getGrade(), "Fail");
    }
}
