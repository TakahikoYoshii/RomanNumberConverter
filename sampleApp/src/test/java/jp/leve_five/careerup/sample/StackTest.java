package jp.leve_five.careerup.sample;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class StackTest {
    private Stack stack = null;
    private Stack stack5 = null;

    @Before
    public void setUp() {
        stack = new Stack();
        stack5 = new Stack(5);
    }

    @Test
    public void test������Ԃł�getCount��0��Ԃ�() {
        int count = stack.getCount();
        assertEquals(0, count);
    }

    @Test
    public void test����3���P�ǉ����邵����getCount�͂P��Ԃ�() {
        stack.push(3);
        int count = stack.getCount();
        assertEquals(1, count);
    }

    @Test
    public void testpush�Q����s�ɑ΂���pop�������s���ꂽ�ꍇ��getCount���P��Ԃ�() {
        stack.push(1);
        stack.push(2);
        int pop = stack.pop();
        int count = stack.getCount();
        assertEquals(2, pop);
        assertEquals(1, count);
    }

    @Test
    public void testpush�ɂR�ƂS�̏��ԂŒl��n������pop�łS�ƂR�̏��ԂŕԂ��Ă���() {
        stack.push(3);
        stack.push(4);
        int pop = stack.pop();
        assertEquals(4, pop);
        pop = stack.pop();
        assertEquals(3, pop);
    }

    @Test
    public void testpush�ɂT�ƂU�ƂV�̏��ԂŒl��n������pop�łV�ƂU�ƂT�̏��ԂŕԂ��Ă���() {
        stack.push(5);
        stack.push(6);
        stack.push(7);
        int pop = stack.pop();
        assertEquals(7, pop);

        pop = stack.pop();
        assertEquals(6, pop);
        pop = stack.pop();
        assertEquals(5, pop);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test�v�f����̂Ƃ���pop�����s�������O����������() {
        stack.pop();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testpush�ŃX�^�b�N�̗v�̂𒴂�������O����������() {

        for (int i = 0; i < 11; i++) {
            stack.push(1);
        }
    }

    @Test
    public void testStack�̗v�f����5�ɂ��ėv�f�����T����() {
        stack5.push(1);
        stack5.push(2);
        stack5.push(3);
        stack5.push(4);
        stack5.push(5);
        assertTrue(true);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testStack�̗v�f�����T�ɂ��ėv�f�����U�����Ɨ�O����������() {
        stack5.push(1);
        stack5.push(2);
        stack5.push(3);
        stack5.push(4);
        stack5.push(5);
        stack5.push(6);
    }

}
