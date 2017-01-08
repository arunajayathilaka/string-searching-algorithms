import java.io.*;
import java.util.*;
class BM{
	
	public static void BMtable(int m,char[] s,HashMap<Character, Integer> charCountMap){
		
		int i=0;
		for(char c : s){
			int u=m-1-i;
			if(charCountMap.containsKey(c)){
				if(u==0){
					u=m;
				}
				charCountMap.put(c,u);
			}
			else{
				if(u==0){
					u=m;
				}
				charCountMap.put(c,u);
			}
			i++;
		}
		
	}
	public static void main(String[] args){
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		String T="trusthardtoothbrush";
		char[] t=new char[T.length()];
		T.getChars(0,T.length(),t,0);
		
		String P="tooth";
		char[] p=new char[P.length()];
		P.getChars(0,P.length(),p,0);
		BM.BMtable(P.length(),p,charCountMap);
		int bv=0;
		
		
		for(int i=0;i<T.length()-P.length()+1;i++){
			int j=P.length()-1;
			while(j>=0 && p[j]==t[i+j]){
				System.out.println(p[j]+" "+t[i+j]);
				if(j==0){
					System.out.println("index point "+i);
					return;
				}
				j--;
			}
			if(p[j]!=t[i+j]){
				System.out.println(p[j]+" "+t[i+j]);
				if(charCountMap.get(t[i+j])== null || j<P.length()-1){
					bv=P.length();
				}
				else{
					bv=charCountMap.get(t[i+j]);
					
				}
				System.out.println(bv);
				i=i+bv-1;
				
			}
		}
	}
}