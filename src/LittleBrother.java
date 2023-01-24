import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.net.URL;


public class LittleBrother {
	
	public static void main(String[] args) {
		String el = "\\Users\\EddyJ\\OneDrive\\Documents\\2021\\FINAL MP2 UIL Ineligibility List - Alpha by Student.csv";
		String mem = "\\Users\\EddyJ\\OneDrive\\Documents\\2021\\2020_21 WW DECA Registration Form (Responses) - Form Responses 1.csv";

		ArrayList<String> list = new ArrayList<>();
        
        ArrayList<Integer> studentID = new ArrayList<>();
        ArrayList<Integer> studentIdDecca = new ArrayList<>();
        
        ArrayList<String> print = new ArrayList<>();
        

		
		try {
			URL url1 = new URL("https://docs.google.com/spreadsheets/d/1s00iGe77uD4nBEoy7l9ShuVRATgB8PfOhCtXjDZiCOo/edit#gid=891520788");
			URL url2 = new URL("https://docs.google.com/spreadsheets/d/13I1vAEnF3ziPg5weE54L9aSfjnWFx_hhHTanhIA2c10/edit#gid=325066060");
			BufferedReader br1 = new BufferedReader(new InputStreamReader(url1.openStream()));
			BufferedReader br2 = new BufferedReader(new InputStreamReader(url2.openStream()));
			
			
			String lines1;
			
			br1.readLine();
			while((lines1 = br1.readLine()) != null) {
				String[] id = lines1.split(",");
				
				list.add(lines1);
				
			}
			
			br2.readLine();
			String line2;
			while((line2 = br2.readLine()) != null) {
				String[] id2 = line2.split(",");
				
			}
			ArrayList<Integer> ineligible = new ArrayList<>(studentIdDecca);
			ineligible.retainAll(studentID);
			
			
			String[] id = null;
			for(int i = 0; i < list.size() - 1; i++) {
				 id = list.get(i).split(",");
				
					print.add(list.get(i));
				
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < list.size() - 1; i++) {
		System.out.println(list.get(i) + "");
		}
	}
}
