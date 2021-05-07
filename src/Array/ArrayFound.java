package Array;

public class ArrayFound {
    public static void main(String[] args) {
        int [] arr = {10,20,50,3,5,9,8,12,20};

        //根据元素查找该元素第一次在数组中出现的索引


        int indexByEle = getIndexByEle(arr, 20);
        System.out.println(indexByEle);

        int []arr1={1,2,3,4,5,6,7,8,9};
        int index = getIndex(arr1, 5);
        System.out.println(index);
        System.out.println(arr1.length);
    }
//一个一个的查找
    public static int getIndexByEle(int[] arr, int i) {
        for (int j = 0; j < arr.length ; j++) {
            if (i == arr[j]){
                return j;
            }

        }
        //如果没有找到
        return -1;
    }

    /*
    需求:使用二分查找查找出该元素在数组中第一次出现的索引
    二分查找的前提是:该数组的元素必须有序
    二分查找的思想:每一次都查找中间的元素，比较大小就能减少一半的元素


    查找时，我们拿这个元素和中间索引所对应的元素去比较比较之后，有三种情况
    第一种:你要找的元素正好等于中间索引所对应的元素，那么你就返回中间索引，也就是说正好找到了
    第二种情况:你要找的元素小于中间索引所对应的元素，那么我们就改变最大索引,移动最大索引 maxIndex=centerIndex-1;
    第三种情况:你要找的的元素，比中间索引对应的元素要大,我要移动最小索引 minlndex=centerIndex+1;
    循环去找while(minIndex<=maxIndex){}
     */





    public static int getIndex(int[]arr1,int ele){
        int minIndex = 0;
        int maxIndex = arr1.length;
        int centerIndex = (minIndex+maxIndex)/2;

        while(minIndex<=maxIndex){
            if (arr1[centerIndex]==ele){
                return centerIndex;
            }else if (ele>arr1[centerIndex]){
                //你要找的的元素，比中间索引对应的元素要大,我要移动最小索引 minlndex=centerIndex+1;
                minIndex = centerIndex+1;
            }else if (ele<arr1[centerIndex]){
                //你要找的元素小于中间索引所对应的元素，那么我们就改变最大索引,移动最大索引 maxIndex=centerIndex-1;
                maxIndex = centerIndex-1;
            }
            centerIndex = (maxIndex+minIndex)/2;


        }


        return -1;

    }
}
