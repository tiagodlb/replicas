public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = new int []{1,2,3,4,1,2,4,6,7,8};

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i]==arr[j])
                    System.out.println(arr[j]);
                }
            }
        }
}
