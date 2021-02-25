package com.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MerchandizeTester {
	public static void main(String[] args) {
		
		
		String itemCode;
		int quantity;
		Double unitPrice;
		List<Merchandize> ListMerchandize = new ArrayList<>();

		String line = null;

		
		///reading file
		try (BufferedReader Scanner = new BufferedReader(new FileReader(new File(
				"C:\\Users\\ve00ym236\\Documents\\JAVA Training\\Test\\Test1\\Question1\\src\\com\\filehandling\\InputFile.dat")))) {

			while ((line = Scanner.readLine()) != null) {
				//spilitting data on the basis of space  
				String[] tokens = line.split(" ");
				
				//parsing data and placing it to respective variables
				itemCode = tokens[0];
				quantity = Integer.parseInt(tokens[1]);
				unitPrice = Double.parseDouble(tokens[2]);
				
				// creating Merchandize object using parameterised constructor
				ListMerchandize.add(new Merchandize(itemCode, quantity, unitPrice));
			}

		} catch (FileNotFoundException ex) {
			//catching exception if file not found
			ex.printStackTrace();
		} catch (IOException ex) {
			//catching IO related exception
			ex.printStackTrace();
		}

		System.out.println("**************************************************************************");
		// Sorting the merchandise elements in the ArrayList in an ascending order by names and displaying data per line 
		Collections.sort(ListMerchandize, (o1, o2) -> o1.getItemCode().compareTo(o2.getItemCode()));
		ListMerchandize.forEach((Item) -> System.out.println(Item));

		System.out.println("**************************************************************************");
		//Sort the merchandises in a descending order by price and displaying data per line 
		Collections.sort(ListMerchandize, (o1, o2) -> o2.getUnitPrice().compareTo(o1.getUnitPrice()));
		ListMerchandize.forEach((Item) -> System.out.println(Item));
		
		System.out.println("**************************************************************************");

	}

}