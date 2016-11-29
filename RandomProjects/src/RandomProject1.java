import java.util.Random;

public class RandomProject1 {

	public static void main(String[] args) {
		
		Random rndm = new Random();
		int count = 0;
		
		for(int i = 0; i < 29; i++){
			int ran = 71 + rndm.nextInt(29);
			if(count < 10){
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
