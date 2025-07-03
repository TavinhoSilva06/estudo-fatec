package leituraCSV;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		File f = new File("exemplo.csv");
		try(Scanner sc = new Scanner(f.getAbsoluteFile())) {
			String imprimir;
			String[] array;
			int LineCount = 0;
			int quantidade;
			double preco;
			double ValorTotal;
			
			while(sc.hasNextLine()) {
				imprimir = sc.nextLine();
				System.out.println(imprimir);
				LineCount++;
				
				if(LineCount == 1) {
					imprimir = sc.nextLine();
				}
				
				else {
					array = imprimir.split(",");
					quantidade = Integer.parseInt(array[2]);
					preco = Double.parseDouble(array[3]);
					ValorTotal = quantidade * preco;
					System.out.println("Valor total da venda de produtos: " + ValorTotal);
					
				}
			}
		}catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		}

	}

}
// 1
// Carro
// 10
// 500.00
