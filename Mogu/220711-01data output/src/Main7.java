import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*입력을 통한 (사람 정보) 파일기록

목록

1명(번호선택해서)
1명(수정)
1명(삭제)*/
public class Main7 {
	public static void main(String[] args) {
		BufferedReader br = null;
		PrintWriter pw = null;
		List<Integer> list = new ArrayList<>();
		
		try {
			br = new BufferedReader(new FileReader(new File("d:\\filetest\\number.txt")));
			
			String line;
			while( (line = br.readLine()) != null) {
				list.add(Integer.valueOf(line));
				
				
			}
			Collections.sort(list);
			System.out.println(list);
			
			pw = new PrintWriter(new FileWriter(new File("d:\\filetest\\number.txt")));
			
			for (int i = 0; i < list.size(); i++) {
				pw.println(String.valueOf(list.get(i)));
			}
			pw.flush();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
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
