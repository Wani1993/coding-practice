import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Password {
	public static void main(String[] args) {
		BufferedReader br = null;
		PrintWriter pw = null;
		List<String> list = new ArrayList<>();
		List<String> result = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(new File("d:\\filetest\\password.txt")));
			String line;
		
			while ( (line = br.readLine()) != null ) {
				list.add(line);
			}
			System.out.println(list);
			
			for(int i = 0; i < list.size(); i++) {
				String s = list.get(i);
				String sum = "";
				for(int j = 0; j < s.length(); j++) {
					char c = s.charAt(j);
					
					if(c == ' ') {
						
					} else {
						c = (char) Character.toUpperCase(s.charAt(j) + 3);
						if (c > 'Z') {
							c -= 26;
						}
						c = Character.toUpperCase(c);
					}
					sum += c;
				}
				result.add(sum);
			}
			System.out.println(result);
			
			pw = new PrintWriter(new FileWriter(new File("d:\\filetest\\unpassword.txt")));
			for(int i = 0; i < result.size(); i++) {
				pw.println(result.get(i));
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
					pw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
