class kmp{
	public static int[] pi=new int[6];
	public static void kmp_prefix(int v,char[] p){
		pi[0]=0;
		int i=0;
		for(int j=1;j<v;j++){
			while(i>0 && p[i]!=p[j] ){
				i=pi[i];
			}
			if(p[i]==p[j]){
				i=i+1;
			}
			pi[j]=i;
			System.out.println(pi[j]);
		}
	}
	public static void main(String[] args){
		String T="RGRIJDSASAAFTRYTUTTHTHJUACACAB";
		char[] t=new char[T.length()];
		T.getChars(0,T.length(),t,0);
		
		String P="ACACAB";
		char[] p=new char[P.length()];
		P.getChars(0,P.length(),p,0);
		kmp_prefix(P.length(),p);
		
		int i=0;
		for(int j=0;j<T.length();j++){
			while(i>0 && p[i]!=t[j]){
				i=pi[i];
			}
			if(p[i]==t[j]){
				i=i+1;
			}
			if(i==P.length()){
				System.out.println("starting index "+ (j-P.length()+1));
				
			}
		}
	}
}