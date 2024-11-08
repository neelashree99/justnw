package DDT;

import java.io.File;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.text.PDFTextStripper;

public class FetchDataFromPDF_File {

	public static void main(String[] args) throws Throwable {

		File file = new File("./src\\test\\resources\\sel.pdf.pdf");
		PDDocument doc = PDDocument.load(file);
		int pages=doc.getNumberOfPages();
		System.out.println(pages);

		PDFTextStripper pdfData=new PDFTextStripper();
		//String Data = pdfData.getText(doc);
		//System.out.println(Data);

//		pdfData.setStartPage(4);
//		String pageData = pdfData.getText(doc);
//		System.out.println(pageData);
		
		pdfData.setStartPage(2);
		pdfData.setEndPage(4);
		String pageData1=pdfData.getText(doc);
		System.out.println(pageData1);
		
		
		
		
		
		
	}
}
