public class Main {
    public static void main(String[] args) {
        int delta[] = {2,6,8,-5,-6,-7};




            System.out.println("The min number is: "+ Reverse(delta));
            System.out.println("The max number is: "+ Max(delta));
    }



    public static int Max(int[] carier){

        int des = Integer.MIN_VALUE;

        for(int ax = 0; ax<carier.length;ax++){
            int daster = carier[ax];

            if(des < daster){
                des =daster;
            }


        }
         return des;
    }
    public static int Reverse(int[] cargo ){
        int  a= Integer.MAX_VALUE;

        for(int as = 0; as<cargo.length;as++){
            int art = cargo[as];
            if(a > art){

                a = art;
            }

        }
        return a;
    }
}