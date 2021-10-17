package NewJavaProject;

public class FindMaxInArr {

    public static int getMax(int [] nums){
        int max=nums[0];

        for( int each : nums){
            if(each>max){
                max = each;
            }
        }
        return max;
    }
}
