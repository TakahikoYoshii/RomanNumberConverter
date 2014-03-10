package NewCalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ElementTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test�R���X�g���N�^�ɐ������w�肵�ăG�������g�I�u�W�F�N�g���쐬�ł���() {
        Element element = new Element("5");
        assertEquals("5", element.getValue());
    }
    @Test
    public void test�R���X�g���N�^�ɉ��Z�q���w�肵�ăG�������g�I�u�W�F�N�g���쐬�ł���(){
        Element element = new Element("*");
        assertEquals("*", element.getValue());
    }
    @Test (expected = RuntimeException.class)
    public void test�R���X�g���N�^�ɒl���󕶎��������Ƃ���O����������(){
        new Element("");    
    }
    @Test
    public void test�R���X�g���N�^�ɐ����̕�������w�肵��true���Ԃ��Ă���(){
        Element element = new Element("10"
                );
        boolean check = element.isDigit();
        assertEquals(true, check);
    }
    @Test
    public void test�R���X�g���N�^�ɉ��Z�q�̕�������w�肵���ꍇfalse���Ԃ��Ă���(){
        Element element = new Element("/");
        boolean check = element.isDigit();
        assertEquals(false, check);
        
    }
    @Test(expected =  Exception.class)
    public void test�R���X�g���N�^�ɐ����Ɖ��Z�q�ȊO�̕�������w�肵���ꍇ��O����������(){
        new Element("Hello");
    }
    @Test(expected = Exception.class)
    public void test�R���X�g���N�^��bye�̕�������w�肵���ꍇ��O����������(){
        new Element("bye");
    }
}
