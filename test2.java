public class test2{
    public static void main(String[] args) {
        
        int[] num = {10,55,23,2,79,101,16,82,30,45};
        
        int min = num[0];
        int max = num[0];

        int minPos = 0;
        int maxPos = 0;

        for(int i = 1; i<num.length; i++){

            if(min > num[i]){
                min = num[i];
                minPos = i+1;

            }
            if(max < num[i]){
                max = num[i];
                maxPos = i+1;
            }
        }
        System.out.println("가장 작은 값은"+ min + " 이며 위치는 " + minPos + "입니다.");
        System.out.println("가장 큰 값은"+ max + " 이며 위치는 " + maxPos + "입니다.");
    }

}