package jp.leve_five.careerup.sample;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator = null;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
	}
	
	@After
	public void tearDown() {
	}
	
	@Test
	public void test0����0��0() {
		int result = calculator.plus(0, 0);
		assertEquals(0, result);
	}
	
	@Test
	public void test�O�����}�C�i�X�P�̓}�C�i�X�P(){
		int result = calculator.plus(0,-1);
		assertEquals(-1,result);
	}

	@Test
	public void test2�Ђ��P�͂P(){
		int result = calculator.minus(2,1);
		assertEquals(1,result);
	}
	@Test
	public void test�P�O�O�O�����X�X�O(){
		int result = calculator.minus(1000,990);
		Integer intObj = Integer.valueOf(result);
		assertTrue(intObj.equals(10));
	}
	@Test
	public void test�P����v�Z���Ȃ��Ȃ�getcount�łO���Ԃ��Ă���(){
		int count = calculator.getCount();
		assertEquals(0,count);
	}
	@Test
	public void test�Q�����R�̑����Z������getcount���P(){
		 calculator.plus(2,3);
		 int count = calculator.getCount();
		 assertEquals(1,count);
	}
	@Test
	public void test�}�C�i�X�P�O�O����}�C�i�X�T�O�O�������Z������getCount��1(){
		calculator.minus(-100,-500);
		int count = calculator.getCount();
		assertEquals(1,count);
	}
	@Test
	public void test�����Z�ƈ����Z��1�񂸂�����getCount���Q(){
		calculator.plus(0, 0);
		calculator.minus(-100,-500);
		int count = calculator.getCount();
		assertEquals(2,count);
	}
	@Test
	public void test�����Z2������Z3�񂵂���getCount��5(){
		calculator.plus(1, 2);
		calculator.plus(1, 2);
		calculator.minus(3, 4);
		calculator.minus(5, 6);
		calculator.minus(5, 6);
		int count = calculator.getCount();
		assertEquals(5, count);
	}
	@Test
	public void test2������3��result��6��Ԃ�(){
		int result = calculator.multiplay(2,3);
		assertEquals(6,result);
	}
	@Test
	public void test10������10��result��100��Ԃ�(){
		int result = calculator.multiplay(10, 10);
		assertEquals(100,result);
	}
	public void test�܂��Ȃ��Q������܂��Ȃ��Q�͂S��Ԃ�(){
		int result = calculator.multiplay(-2, -2);
		assertEquals(4,result);
	}
	@Test
	public void test18����3��6��Ԃ�() throws Exception{
		int result = calculator.divide(18, 3);
		assertEquals(6,result);
	}

	@Test
	public void test18����5��3��Ԃ�() throws Exception{
		int result = calculator.divide(18,5);
		assertEquals(3,result);
	}
	@Test
	public void test0����Q��0��Ԃ�() throws Exception {
		int result = calculator.divide(0, 2);
		assertEquals(0,result);		
	}
	@Test(expected = ArithmeticException.class)
	public void test�}�C�i�X�P����0�͗�O����������() throws Exception{
		calculator.divide(-1, 0);
	}
	public void test�܂��Ȃ��U����}�C�i�X�R�͂Q��Ԃ�() throws Exception{
		int result = calculator.divide(-6, -3);
		assertEquals(2,result);
	}
	@Test
	public void test�U����}�C�i�X�Q�̓}�C�i�X�R��Ԃ�() throws Exception{
		int result = calculator.divide(6, -2);
		assertEquals(-3,result);
	}
	@Test
	public void test����Z��1�񂵂���getcount��1��Ԃ�() throws Exception{
		calculator.divide(4,2);
		int count = calculator.getCount();
		assertEquals(1,count);
	}
	@Test
	public void test�|���Z��2�񊄂�Z��2��s����getCount�͂S��Ԃ�() throws Exception{
		calculator.multiplay(2,3);
		calculator.multiplay(2,3);
		calculator.divide(4,2);
		calculator.divide(4,2);
		int count = calculator.getCount();
		assertEquals(4,count);
	}
}
