import java.util.Random;

public class RandomProject2 {
	public static void main(String[] args){
		
		Random rndm = new Random();
		int count = 0;
		
		for(int i = 0; i < 33; i++){
			double ran = 99.78 + 147.22 * rndm.nextDouble();
			if(count < 4){
				System.out.print(ran + "\t");
				count++;
			}
			else{
				System.out.println("");
				count = 0;
			}
		}
	}
}
