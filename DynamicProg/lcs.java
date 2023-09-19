public class lcs {
    // Tabulation

    static int lcs_tabulation(String s1 , String s2){
 int m = s1.length();
 int n = s2.length();
 int mat[][] = new int[m+1][n+1];
 for(int i=1; i<=m ;i++){
    for(int j=1; j<=n ; j++){
        if(s1.charAt(i-1)==s2.charAt(j-1)){
            mat[i][j]=mat[i-1][j-1]+1;

        }
        else{
            mat[i][j]=
        }
    }
 }


    }

    public static void main(String[] args) {
        
    }
}
