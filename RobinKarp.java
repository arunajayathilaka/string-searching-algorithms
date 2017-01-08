import java.io.*;
class RobinKarp{
	public static int hash(String s){
		return s.hashCode()%13;
	}
	public static void main(String[] args){
		String P=new String("awfsfstgdhfsfu");
		String T=new String("ssf");
		String Ps=P.substring(0,T.length());
		
		int hp=RobinKarp.hash(Ps);
		int ht=RobinKarp.hash(T);
		boolean er=false;
		for(int i=0;i<P.length()-T.length()+1;i++){
			
			if(ht==hp){
				
				if(T.equals(Ps)){
					er=true;
					System.out.print("Starting index: "+i);
					break;
				}
			}
			try{
				Ps=P.substring(i+1,i+T.length()+1);
				hp=RobinKarp.hash(Ps);
				
			}
			catch(StringIndexOutOfBoundsException e){
				//System.out.println("end of the String P");
			}
		}
		if(!er){
			System.out.println("not found");
		}
	}
}