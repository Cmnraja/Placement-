import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner(System.in);
		int a =s.nextInt();
		int b=s.nextInt();
		String x=s.next();
		String y=s.next();
	//	System.out.print(a+" "+b+" "+x+" "+y+"\n");
		char a1[][]=new char[a][b];
		int k=0;
		int k1=y.length();
		for(int i=0;i<a;i++){
		for(int j=0;j<b;j++){
		    if(k>=x.length())
		    k=0;
		a1[i][j]=x.charAt(k);
	//	System.out.print(a1[i][j]);
		k++;
		
			}
	//	System.out.print("\n");
}
String tes="";
int fina =0;
for(int i1=0;i1<a;i1++)
for(int j1=0;j1<b;j1++)
{
    char v[] = new char[k1];
    tes="";
    if(a1[i1][j1]==y.charAt(0))
    {
        if(j1+k1<b){
        //char v[] = new char[k1];
        int ta=0;
        int ta1=j1;
            for(int ha=0;ha<k1;ha++){
                v[ha]=a1[i1][ta1];
              // System.out.print(v[ha]);
                ta1++;
                
            }
            tes=String.valueOf(v);
            
            if(tes.equals(y)){
            fina=fina+1;
             //  System.out.println(tes);
            }
        }
        if(i1+k1<a){
            int vr=i1;
            for(int ca=0;ca<k1;ca++)
            {
                v[ca]=a1[vr][j1];
            //    System.out.print(v[ca]);
                vr++;
                
            }
            tes=String.valueOf(v);
            if(tes.equals(y)){
            fina=fina+1;
           // System.out.println(tes);
           }
        }
        if(j1-k1>=0){
            int dh=j1;
            for(int ji=0;ji<k1;ji++)
            {
                v[ji]=a1[i1][dh];
              //  System.out.print(v[ji]);
                dh--;
            }
            //System.out.println();
            tes=String.valueOf(v);
            if(tes.equals(y)){
            fina=fina+1;
              //  System.out.println(tes);
            }
        }
        if(i1-k1>=0){
            int hg=i1;
            for(int df=0;df<k1;df++){
                v[df]=a1[hg][j1];
                hg--;
            }
            tes=String.valueOf(v);
            //System.out.println(tes);
            if(tes.equals(y)){
            fina=fina+1;
                //System.out.println(tes);
            }
        }

    }
}
System.out.println(fina);
	}
}
