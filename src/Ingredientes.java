public class Ingredientes {
	
	static String ing1;
	static String ing2;
	static String ing3;
	
	public Ingredientes(String ing1,String ing2,String ing3){
		this.ing1 = ing1;
		this.ing2 = ing2;
		this.ing3 = ing3;		
	}
	public static String getIng1() {
		return ing1;
	}
	public static void setIng1(String ing1) {
		Ingredientes.ing1 = ing1;
	}
	public static String getIng2() {
		return ing2;
	}
	public static void setIng2(String ing2) {
		Ingredientes.ing2 = ing2;
	}
	public static String getIng3() {
		return ing3;
	}
	public static void setIng3(String ing3) {
		Ingredientes.ing3 = ing3;
	}
}
