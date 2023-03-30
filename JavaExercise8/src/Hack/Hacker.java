package Hack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Hacker {
	

	public void addToFile(ArrayList<String> history, String filename) {
		
		try {
			FileWriter fw = new FileWriter(filename);
			BufferedWriter bw = new BufferedWriter(fw);
			for(String url : history) {
				bw.write(url);
				bw.newLine();
			}
			bw.close();
			fw.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	//to get the details in 
	public void dispHistory(String filename) {
		
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s = br.readLine())!=null) {
				System.out.println(s);
			}
			fr.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	


	public ArrayList<String> modifyHistory(ArrayList<String> newUrlList, String filename) {
		ArrayList<String> modifiedList = new ArrayList<String>();
		try {
			
			
			for(String newUrl: newUrlList) {
				BufferedWriter br = new BufferedWriter(new FileWriter(filename,true));
				br.write(newUrl);
				br.newLine();
				br.close();
			}
			
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s = br.readLine())!=null) {
				modifiedList.add(s);
				
			}
			fr.close();
			//System.out.println(modifiedList);
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
		return modifiedList;
		
			
	}
}
