package leitura;
 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		File f = new File("ABC.txt");
		try(Scanner sc  = new Scanner(f.getAbsoluteFile())){
			String line;
			int lineCount = 0;
			int wordCount = 0;
			
			while(sc.hasNextLine()) {
				line = sc.nextLine();
				wordCount += line.split(" ").length;
				lineCount++;
			}
			System.out.printf("Linhas: %d Palavras: %d", lineCount, wordCount);
		}catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado" + e.toString());
		}
	}
 
}