class Solution {
    public int fib(int num) {
        if(num==0){
            return 0;
        }
        if(num==1){
            return 1;
        }
        int [] arr=new int[num+1];
        arr[0]=0;
        arr[1]=1;
        int a=0;
        int b=1;
        for(int i=2;i<num+1;i++){
            arr[i]=a+b;
            a=b;
            b=arr[i];
        }
        return arr[num];

    }
}