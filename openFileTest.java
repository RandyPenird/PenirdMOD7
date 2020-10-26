package Application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class openFileTest {

	@Test
	void test() {
		fileHandler test = new fileHandler();
		int output = test.openFile();
		assertEquals(1,output);
	}

}
