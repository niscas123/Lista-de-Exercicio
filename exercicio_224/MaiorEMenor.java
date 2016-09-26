package exercicio_224;

public class MaiorEMenor {
	
	public static void MaiorMenor(int maior1, int maior2, int maior3, int menor1, int num1, int num2, int num3, int num4, int num5) { 
	if(num1 > num2) {
		menor1 = num2;
		return;
			
	} else if(num1 < num2) {
		maior1 = num2;
		return;
			
	} else if(maior1 < num3) {
		maior2 = num3;
		return;
			
	} else if(menor1 > num3) {
		menor1 = num3;
		return;
			
	} else if(maior2 < num4) {
		maior3 = num4;
		return;
			
	} else if(menor1 > num4) {
		menor1 = num4;
		return;
			
	} else if(maior3 < num5) {
		maior3 = num5;
		return;
			
	} else if(menor1 > num5) {
		menor1 = num5;
		return;
		
	}
	
	}
	
}