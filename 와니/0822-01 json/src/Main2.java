import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main2 {
	public static void main(String[] args) throws JsonProcessingException {
		Person hong = new Person("고길동", 22);  // 객체를 따로 지정해놓고 json을 사용하면 그 객체에 사용되는 필드값으로 지정이된다.
											   // 객체를 정의할때 빈생성자와 생성자, 게터 세터를 다 만들어야 에러가 안난다.
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(hong);
		
		System.out.println(json);
		
		// 생성한 객체와 필드 이름이 다르면 예외가 발생한다.
		String jsonString = "{\"name\":\"둘리\",\"age\":23}";
		Person dooli = mapper.readValue(jsonString, Person.class);
		
		System.out.println(dooli.getName());
		System.out.println(dooli.getAge());
	}
}
