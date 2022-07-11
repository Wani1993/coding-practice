import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class People implements Serializable{
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
				
				
		try {
			dis = new ObjectOutputStream(new FileOutputStream(new File("d:\\filetest\\People.dat")));
			
				dis.writeObject(new People(1, "홍길동", "011-111-1111", "hong@hanmail.net"));
				dis.writeObject(new People(2, "김유신", "010-222-2222", "hong@hanmail.net"));
			
			dis.flush();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  finally {
			try {
				if(dis != null) {
					dis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
