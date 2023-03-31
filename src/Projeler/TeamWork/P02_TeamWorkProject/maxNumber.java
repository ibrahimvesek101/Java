package Projeler.TeamWork.P02_TeamWorkProject;

public class maxNumber {


      /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}

        print the max number from the 2d array

     */


     /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}

         int 2D arrayinin max number print eden code create ediniz.

     */


    public static void main(String[] args) {

        Integer arr[][] = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 10, 3}};

        int max = arr[0][0];

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }

}
