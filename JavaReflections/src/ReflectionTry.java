import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTry {

		public static void main(String[] args) throws NoSuchFieldException,SecurityException{
			
			Class Obj = Employee.class;
			
			//to get the name of the class
			System.out.println("ClassName : "+ Obj.getName());
			System.out.println("SuperClass : "+Obj.getSuperclass());
			System.out.println("Modifier : "+Obj.getModifiers());
			
			Field[] fields = Obj.getDeclaredFields();
			for(Field f: fields) {
				System.out.println(f.getName());
			}
			
			Method[] methods = Obj.getDeclaredMethods();
			for(Method m:methods) {
				System.out.println(m.getName());
				System.out.println(m.getReturnType());
				System.out.println(m.getParameterCount());
			
			}
		}
}
