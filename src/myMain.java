//https://www.youtube.com/watch?v=ghswNpRv2t0
import java.util.HashMap;
import java.util.Map;

public class myMain {

	public static void main(String[] args) {
		int content = 1;
		Employee e1 = new Employee(content);
		Employee e2 = new Employee(content);
		Map<Employee, String> map = new HashMap<>();
		map.put(e1, "ali1");
		map.put(e2, "ali2");

		System.out.println(map.get(e1));
		System.out.println("hashmap size: "+map.size());
		System.out.println("equals function return: "+e1.equals(e2)); // if content same return -> true

	}

}
class Employee{
		int content;
		public Employee(int content) {
			this.content = content;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + content;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			System.out.println(getClass());
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (content != other.content)
				return false;
			return true;
		}
		 
		
}