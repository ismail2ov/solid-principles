package dip;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EBookReaderTest {

	@Test
	public void testReadPdfBook() {
		EBookReader reader = new EBookReader(new PDFBook());
		assertEquals("Reading a PDF Book...", reader.read());
	}

}
