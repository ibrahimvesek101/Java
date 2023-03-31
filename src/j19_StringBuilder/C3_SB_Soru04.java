package j19_StringBuilder;

public class C3_SB_Soru04 {

	public static void main(String[] args) {
		
		int total=0;
        StringBuilder letters=new StringBuilder("abcdefg");
        total+=letters.substring(1,2).length();             // length=1
        total+=letters.substring(6,6).length();             // length=1
        total+=letters.substring(6,5).length();             // RTE
        System.out.println(total);                          //
	}

}
