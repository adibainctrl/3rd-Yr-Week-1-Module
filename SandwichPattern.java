public class SandwichPattern{
  public static void main(String[] args){
    int n=5;
    for(int i=0; i<3 ; i++){
      for(int s=0; s<i ; s++){
        System.out.print(" ");
      }
      for(int j=0; j< n-2*i; j++){
        System.out.print((i+3)+" ");
          }
      System.out.println();
    }
    for(int i=1; i>=0; i--){
      for(int s=0; s<i ; s++){
        System.out.print(" ");
      }
      for(int j=0; j<n-2*i; j++){
        System.out.print((i+3)+" ");
    }
      System.out.println();
  }
}
}
