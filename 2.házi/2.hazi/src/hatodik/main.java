package hatodik;

public class main {
    
    public static void main(String[] args) {

        int[] t = new int[]{2,1,3,5,6,6,6,6};

        System.out.println(isConsecutiveFour(t));
    }
    
    public static boolean isConsecutiveFour(int[] values) {

        if(values.length >= 4)
        {
            for(int i = 0; i < (values.length - 3); i++){
                if(values[i] == values[i + 1] && values[i] == values[i + 2] && values[i] == values[i + 3])
                    return true;
            }
        }
        return false;
    }
    
}
