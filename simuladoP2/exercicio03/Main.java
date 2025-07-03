package exercicio03;
 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		File f = new File("ABC");
		try(Scanner ler  = new Scanner(f.getAbsoluteFile())){
			String line;
			int lineCount = 0;
			int wordCount = 0;
			
			while(ler.hasNextLine()) {
				line = ler.nextLine();
				wordCount += line.split(" ").length;
				lineCount++;
			}
			System.out.println("Linhas: " + lineCount + "\n" + "Palavras: " + wordCount);
		}catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		}
	}
 
}