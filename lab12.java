public class lab12 {
    public static void main(String[] args) {
        int[] arr = {5,4,5,4};
        int val = 5;
        int lengthOfDiddledByMeth = iHopeitWorks0(arr, val);
        System.out.println("новая длинна массива: " + lengthOfDiddledByMeth );
        System.out.print("[");
        for (int i=0; i < lengthOfDiddledByMeth; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");

    }
    public static int iHopeitWorks0(int[] arr,int val){
        int comicSansShrift=0;
        for(int i =0; i< arr.length; i++ ){
            if(arr[i] != val){
                arr[comicSansShrift] = arr[i];
                comicSansShrift++;

            }
        }
        return comicSansShrift;
    }

}
