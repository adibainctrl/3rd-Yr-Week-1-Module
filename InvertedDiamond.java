public class InveretdDiamond{
  public static void main(String[]args){
    int n=5;
    int num = 3;
    for(int i=0; i<n ; i++){
      for(int s=0; s<i ; s++){
        System.out.print(" ");
      }
      for(int j=0; j<n-i ; j++){
        System.out.print(num + " ");
      }
      num++;
      System.out.println();
    }
  }
}
