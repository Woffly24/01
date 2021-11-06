public class Test {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[]{2,3,4};
        System.out.println(twoSum(arr,6));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];
        int len = numbers.length;

        label:for(int i = 0;i < len - 1;i++){
            int l = i+1;
            int r = len - 1;
            while(l <= r){
                int mid = (l + r)/2;
                if(numbers[mid] > (target-numbers[i]))
                    r = mid - 1;
                else if(numbers[mid] < (target-numbers[i]))
                    l = mid + 1;
                else
                    answer[0] = i+1;
                answer[1] = mid+1;
                break label;
            }
        }
        return answer;
    }
}



