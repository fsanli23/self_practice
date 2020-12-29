package javaprictece_11_09_20;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {


        String[][] scrumTeam = {
                {"Dorin", "Adil", "Fatih", "Subhi"},  // 0
                {"Katrin", "Mustafa", "Ruslan"},      //1
                {"Ayse"},                             //2
                {"Omid"},                             //3
                {"Agalar"}                            //4
        };

      //  System.out.println( Arrays.deepToString(scrumTeam) );

        for(int i=0; i <= scrumTeam.length-1; i++) { //i: index of 1D arrays

            //System.out.println(Arrays.toString(scrumTeam[i]));  // prints the each group in scrum team

            for (int j = 0; j <= scrumTeam[i].length - 1; j++) { // j: index of elements
                System.out.println(scrumTeam[i][j]);
            }

        }

        }
}
