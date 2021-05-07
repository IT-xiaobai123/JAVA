package Array;
//数组的使用
public class ArrayDemo03 {
    public static void main(String[] args) {
        //声明并创建一个数组
        int [] arrays = {1,2,3,4,5};

        //打印数组元素
        for (int i = 0; i < arrays.length ; i++) {
            System.out.println(arrays[i]);
        }

        //计算数组所有元素之和
        int sum = 0;
        for (int i = 0; i <arrays.length ; i++) {
            sum = sum + arrays[i];
        }
        System.out.println(sum);

        //查找最大数
        int max = arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i]>max){
                max = arrays[i];
            }
        }
        System.out.println(max);
        //查找最小数
        int min = arrays[0];
        for (int i = 0; i < arrays.length ; i++) {
            if ( min>arrays[i]){
                min = arrays[i];
            }
        }
        System.out.println(min);


    }
}
