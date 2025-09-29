public class AritmeticalRaizCuadrada {
  public static int Raiz(int n){
    int res=0;

        for (int i = 1; i <= n; i++){
            if (i*i == n){
                res = i;
            }
        }
   return res;    
  }
}    
