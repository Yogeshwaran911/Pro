package e5;
public class LapDriver {

	public static void main(String[] args) {
		
       Lap l1=new Lap("LENEVO","16GB",51192);
       Lap l2=new Lap("LENEVO","16GB",51192);
       boolean exist=l1.equals(l2);
       System.out.println(exist);
	}

}
