public class arry_exm{
    public static void main(String[] args){
        double[] arry = {1,2,3,4,5,6,7,8,9,5.5};
        double sum = 0;
        double min = arry[0];
        int index = (int)(Math.random()*10);

        System.out.println(arry[9]);
        System.out.print(arry[1]+arry[2]);
        for(int i = 0;i <= 9;i++){
            sum = sum + arry[i];
            if(min > arry[i]){
                min = arry[i];
            }
        }
        System.out.println(sum);
        System.out.println(min);
        System.out.println(arry[index]);
    }
}
