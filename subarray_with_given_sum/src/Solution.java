import java.util.ArrayList;


class Solution
{
    static void swap(int arr[],int from,int to){
        int temp=arr[from];
        arr[from]=arr[to];
        arr[to]=temp;
    }
    static void  quick_sort(int arr[],int left,int right){
        int last=left;
        if (left>=right)
            return;
        swap(arr,left,(left+right)/2);
        for (int i=left+1;i<arr.length;i++){
            if (arr[i]<arr[left])
                swap(arr,i,++last);
        }
        swap(arr,last,left);
        quick_sort(arr,left,last-1);
        quick_sort(arr,last+1,right);
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        quick_sort(arr,0,arr.length);
        ArrayList<Integer> res = new ArrayList<Integer>();
        int ind_start;
        int ind_last;
        for (int i=0;i<arr.length;i++){
            ind_start=ind_last=i;
            if (arr[i]==s){
                res.add(ind_start+1);
                res.add(ind_last+1);
                return res;
            }
            if (arr[i]>s)
                continue;
            int sum=0;
            for (int j=i;j<arr.length;j++){
                sum+=arr[j];
                if (sum>s)
                    break;
                if (sum==s) {
                    ind_last=j;
                    res.add(ind_start+1);
                    res.add(ind_last+1);
                    return res;
                }
            }
        }
        res.add(-1);
        return res;
    }
}