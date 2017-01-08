class Stringmatching{
	public static void main(String[] args){
		String T="abcewedfgedhtyu";
		char[] t=new char[T.length()];
		T.getChars(0,T.length(),t,0);
		
		String P="edfg";
		char[] p=new char[P.length()];
		P.getChars(0,P.length(),p,0);
		
		int gh=0;
		int i;
		for(i=0;i<T.length();i++){
			for(int j=0;j<P.length();j++){
				if(p[j]==t[i+j]){
					gh=j;	
				}
				else{
					break;
				}
			}
			
			if(gh==P.length()-1){
				System.out.print("Starting index "+i);
				break;
			}
		}
	}
}