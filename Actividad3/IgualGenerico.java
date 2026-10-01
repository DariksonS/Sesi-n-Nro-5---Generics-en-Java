package Actividad3;

public class IgualGenerico {
	public static <T> boolean esIgualA(T a, T b) {
		if(a==null) {
			return b==null;
		}
		return a.equals(b);
	}
	public static void main(String[] args) {
		Integer num1=20;
		Integer num2= 70;
		System.out.println("Integer: "+esIgualA(num1,num2));
		
		String str1= "Música";
		String str2= "Música";
		System.out.println("String: "+esIgualA(str1,str2));
		
		Object obj1= new Object();
		Object obj2= new Object();
		Object obj3= obj1;
		System.out.println("Object (1=2): "+esIgualA(obj1,obj2));
		System.out.println("Object (1=3): "+esIgualA(obj1,obj3));
		
		String nulo1 = null;
        String nulo2 = null;
        String texto = "Juegos";
        System.out.println("null == null: " + esIgualA(nulo1, nulo2));  
        System.out.println("null == 'Juegos': " + esIgualA(nulo1, texto)); 
	}
	
}
