package homework;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPCellEvent;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class DeckOfCards {
	private static String file = "MyFirstFile.pdf";

	public static void main(String[] args) throws IOException,
			DocumentException {

		
		new DeckOfCards().createPdf(file);
	}

	private static PdfPTable createFirstTable() throws DocumentException, IOException {
		PdfPTable table = new PdfPTable(13);
		
		 BaseFont baseFont = BaseFont.createFont("times.ttf", BaseFont.IDENTITY_H, true);
         Font deckFont = new Font(baseFont, 12f);
         deckFont.setColor(BaseColor.RED); 
         table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
         table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
         table.getDefaultCell().setPaddingBottom(15);
         table.getDefaultCell().setPaddingTop(15);
    
         Font deckFont1 = new Font(baseFont, 12f);
         deckFont1.setColor(BaseColor.BLACK); 
		for (int i = 0; i < 4; i++) {
			switch (i) {
			case 0:
			
				for (int j = 0; j < 13; j++) {
					switch (j) {
					case 0:
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
					case 7:
					
                                         
						table.addCell(new Paragraph(String.valueOf(j+2+"\u2666"),deckFont));
						break;
					case 8:
						table.addCell(new Paragraph(String.valueOf(j+2+"\u2666"),deckFont));
						break;
					case 9:
						table.addCell(new Paragraph(String.valueOf("J"+"\u2666"),deckFont));
						break;
					case 10:
						table.addCell(new Paragraph(String.valueOf("D"+"\u2666"),deckFont));
						break;
					case 11:
						table.addCell(new Paragraph(String.valueOf("K"+"\u2666"),deckFont));
						break;
					case 12:
						table.addCell(new Paragraph(String.valueOf("A"+"\u2666"),deckFont));
						break;
					default:
						table.addCell("Error case");
						;
						break;
					}
				}
				table.completeRow();
				break;

			case 1:
				for (int j = 0; j < 13; j++) {
					switch (j) {
					case 0:
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
					case 7:
						table.addCell(new Paragraph(String.valueOf(j+2+"\u2660"),deckFont1));
						break;
					case 8:
						table.addCell(new Paragraph(String.valueOf(j+2+"\u2660"),deckFont1));
						break;
					case 9:
						table.addCell(new Paragraph(String.valueOf("J"+"\u2660"),deckFont1));
						break;
					case 10:
						table.addCell(new Paragraph(String.valueOf("D"+"\u2660"),deckFont1));
						break;
					case 11:
						table.addCell(new Paragraph(String.valueOf("K"+"\u2660"),deckFont1));
						break;
					case 12:
						table.addCell(new Paragraph(String.valueOf("A"+"\u2660"),deckFont1));
						break;
					default:
						System.out.println("Error case");
						break;
					}
				}
				table.completeRow();
				break;
			case 2:
				for (int j = 0; j < 13; j++) {
					switch (j) {
					case 0:
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
					case 7:
						table.addCell(new Paragraph(String.valueOf(j+2+"\u2665"),deckFont));
						break;
					case 8:
						table.addCell(new Paragraph(String.valueOf(j+2+"\u2665"),deckFont));
						break;
					case 9:
						table.addCell(new Paragraph(String.valueOf("J"+"\u2665"),deckFont));
						break;
					case 10:
						table.addCell(new Paragraph(String.valueOf("D"+"\u2665"),deckFont));
						break;
					case 11:
						table.addCell(new Paragraph(String.valueOf("K"+"\u2665"),deckFont));
						break;
					case 12:
						table.addCell(new Paragraph(String.valueOf("A"+"\u2665"),deckFont));
						break;
					default:
						System.out.println("Error case");
						break;
					}
				}
				table.completeRow();
				break;
			case 3:
				for (int j = 0; j < 13; j++) {
					switch (j) {
					case 0:
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
					case 7:
						
						table.addCell(new Paragraph(String.valueOf(j+2+"\u2663"),deckFont1));
						break;
					case 8:
						table.addCell(new Paragraph(String.valueOf(j+2+"\u2663"),deckFont1));
						break;
					case 9:
						table.addCell(new Paragraph(String.valueOf("A"+"\u2663"),deckFont1));
						break;
					case 10:
						table.addCell(new Paragraph(String.valueOf("A"+"\u2663"),deckFont1));
						break;
					case 11:
						table.addCell(new Paragraph(String.valueOf("K"+"\u2663"),deckFont1));
						break;
					case 12:
						table.addCell(new Paragraph(String.valueOf("A"+"\u2663"),deckFont1));
						break;
					default:
						System.out.println("Error case");
						break;
					}
				}
				
				table.completeRow();

				break;
			default:
				System.out.println("Error case");
				break;
			}
			
		}
		
		return table;
	}

	public void createPdf(String filename) throws IOException,
			DocumentException {
		// step 1
		Document document = new Document();
		// step 2
		PdfWriter.getInstance(document, new FileOutputStream(filename));
		// step 3
		document.open();
		// step 4
		document.add(createFirstTable());
		// step 5
		document.close();
	}

}
