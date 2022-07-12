import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class People implements Serializable {
	private int num;
	private String name;
	private String phone;
	private String mail;

	public People(int num, String name, String phone, String mail) {
		super();
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.mail = mail;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "People [번호: " + num + ", 이름: " + name + ", 전화번호: " + phone + ", 메일: " + mail + "]";
	}

}

public class Email {
	public static void main(String[] args) {
		List<People> list = new ArrayList<>();
		ObjectOutputStream dis = null;
		ObjectInputStream ois = null;
		Scanner scan = new Scanner(System.in);

		boolean end = true;
		
	try {
			ois = new ObjectInputStream(new FileInputStream(new File("d:\\filetest\\People.dat")));
			
			list.addAll((List) ois.readObject());
			

		while (end) {
//			System.out.println(list);
			System.out.println("목록을 선택하세요.");
			System.out.println("1번 사람등록	2번 모든 목록");
			System.out.println("3번 등록삭제	4번 프로그램종료");
			int num = scan.nextInt();
			switch (num) {

			case 1:
				System.out.println("순서, 이름, 전화번호, 이메일을 입력하세요");

				int a = scan.nextInt();
				if (a <= list.size()) {
					System.out.println("이미 등록된 번호입니다.");
				} else {
					Scanner sc = new Scanner(System.in);
					String name = sc.nextLine();
					String phone = sc.nextLine();
					String Email = sc.nextLine();
					list.add(new People(a, name, phone, Email));
				}
				break;
			case 2:
				System.out.println("1.모든목록    2.순서별 정보");
				int menu = scan.nextInt();
				if(menu == 1) {
				System.out.println(list);
				} else if (menu == 2) {
					System.out.println("몇번의 정보를 볼건가유?");
					int what = scan.nextInt();
					System.out.println(list.get(what - 1));
				} else {
					System.out.println("잘못된 입력입니다.");
				}
				break;

			case 3:
				System.out.println("몇번째 회원을 삭제하실건가유?");
				int b = scan.nextInt();
				list.remove(b - 1);
				break;

			case 4:
				System.out.println("시스템을 종료합니다.");
				end = false;
				break;
			default:
				System.out.println("잘못입력하였습니다.");
				break;
			}
			
			
		}

		

	

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				dis = new ObjectOutputStream(new FileOutputStream(new File("d:\\filetest\\People.dat")));
							
				dis.writeObject(list);
			
				dis.flush();
				if (dis != null) {
					dis.close();
				}
				if (ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}