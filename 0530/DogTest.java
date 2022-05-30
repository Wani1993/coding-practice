public class DogTest {
	public static void main(String[] args) {
		Dog d = new Dog("모구", "프렌치불독", 4);
		Dog d2 = new Dog("산타", "시바견");
		d.setName("머구");
		d.setBreed("귀여운불독");
		
		d2.setName("산티");
		
		
		d.print();
		d2.print();
	}
}