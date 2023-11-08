
public class TryAndCatchBlock {
	public static void main(String[] args) {
		try {
			String s="abc";
			System.out.println(Integer.parseInt(s));
		}
		catch(Exception obj) {
			//obj.printStackTrace();
			System.out.println("Sorry!!Number Format Error");
		}
	}

}
