import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import java.io.File;
import java.io.IOException;

public class ImageExtraction {
    public static void main(String args[]) throws IOException {

        //create an empty document object
        PDDocument document = null;

        //open PDFFile, from hardcoded path
        document = PDDocument.load( new File("C:/Users/wsucatslabs/Documents/PDFTest/sample.pdf") );
    }
}