package day0116;

public class ExceptionReview_02 {
    public static void process(){
        int[] arr = {1,3,9,7};
        for (int i=0;i<= arr.length;i++){

            try {
                System.out.println(arr[i]);
            }catch (Exception e){
                System.out.println("오류메시지: "+e.getMessage());
            }
        }
    }
    public static void process2() throws Exception{

    }

    public static void main(String[] args) {
        process();
    }
}
