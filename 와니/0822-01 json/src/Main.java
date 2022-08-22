import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Main {
	public static void main(String[] args) throws JsonProcessingException {
		//사람
		//이름 = 고길동
		//나이 = 22
		
		//jackson은 ObjectMapper 객체로 모든것을 생성한다.
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode node = mapper.createObjectNode();
		
		node.put("name", "고길동");
		node.put("age", 22);
		node.put("boolean", true); // boolean 값도 넣을수있다.
		
		ObjectNode node2 = mapper.createObjectNode();
		
		node2.put("이름", "둘리");
		node2.put("나이", 23);
		
		node.set("bf", node2);
		
		String json = mapper.writeValueAsString(node); // 합성 해놓은 객체를 문자열 내용으로 바꿔준다.
		System.out.println(json);
	}
}
