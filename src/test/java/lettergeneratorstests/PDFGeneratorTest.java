package lettergeneratorstests;

import static org.junit.Assert.*;

import java.io.File;

import es.uniovi.asw.agents.Agent;
import org.assertj.core.util.Files;
import org.junit.Test;

import es.uniovi.asw.parser.lettergenerators.PDFLetterGenerator;

public class PDFGeneratorTest {

	@Test
	public void testGeneratePDF() {
		PDFLetterGenerator pdfg = new PDFLetterGenerator();
		Agent c = new Agent("adri", "mc", "zoo@snek.com", "10/10/2010", "a",
				"a", "123456789Z", "132456789", 1234);
		pdfg.generatePersonalLetter(c);
		File f = new File(c.getID() + ".pdf");
		assertTrue(f.exists());
		Files.delete(f);

	}

}
