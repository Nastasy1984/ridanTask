import org.junit.Test;

import static org.junit.Assert.*;

public class RidanTestTaskTest {

    @Test
    public void checkTemplate1() {
        assertEquals("checkTemplate method is not working", true,
                RidanTestTask.checkTemplate(",зi", "зор..ugi,"));
    }

    @Test
    public void checkTemplate2() {
        assertEquals("checkTemplate method is not working", false,
                RidanTestTask.checkTemplate("fhh", "fh"));
    }

    @Test
    public void checkTemplate3() {
        assertEquals("checkTemplate method is not working", true,
                RidanTestTask.checkTemplate("арбуз", "арбуз"));
    }

    @Test
    public void checkTemplate4() {
        assertEquals("checkTemplate method is not working", true,
                RidanTestTask.checkTemplate("арбуз", "арбузик"));
    }

    @Test
    public void checkTemplate5() {
        assertEquals("checkTemplate method is not working", false,
                RidanTestTask.checkTemplate("арбузик", "арбуз"));
    }

    @Test
    public void checkTemplate6() {
        assertEquals("checkTemplate method is not working", true,
                RidanTestTask.checkTemplate("", ""));
    }

    @Test
    public void checkTemplate7() {
        assertEquals("checkTemplate method is not working", true,
                RidanTestTask.checkTemplate("123", "123"));
    }

    @Test
    public void checkTemplate8() {
        assertEquals("checkTemplate method is not working", false,
                RidanTestTask.checkTemplate("1233", "123"));
    }

    @Test
    public void checkTemplate9() {
        assertEquals("checkTemplate method is not working", true,
                RidanTestTask.checkTemplate("арбуз", "зубра"));
    }

    @Test
    public void checkTemplate10() {
        assertEquals("checkTemplate method is not working", false,
                RidanTestTask.checkTemplate("арбуз", "зубренок"));
    }

}