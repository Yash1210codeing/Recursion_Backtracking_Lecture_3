package Recursion_Backtracking_Lecture_3;
public class String_Partitioning {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String ques="nitin";
        Partitioning(ques,"");
	}
	public static void Partitioning(String ques,String ans) {
		if(ques.length()==0) {		
			System.out.println(ans);
			return;
		}
		for(int i=1;i<=ques.length();i++) {
			String s=ques.substring(0,i);
			Partitioning(ques.substring(i),ans+s+"|");
		}
	}
}
