class Reverse{
    public static void reverseofarray(int num[]){
        int left = 0, right=num.length-1;
        while(left<right){
            //swap
            int temp = num[right];
            num[right] = num [left];
            num[left] = temp;
            left++;
            right--;
        }
        
    }

    public static void main(String[] args) {
        int num[] = {2,4,3,8,10,9,5};

        reverseofarray(num);

        for(int i=0; i <num.length;i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}