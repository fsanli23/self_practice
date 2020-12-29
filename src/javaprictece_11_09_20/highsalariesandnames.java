package javaprictece_11_09_20;

public class highsalariesandnames {
    public static void main(String[] args) {
        String[] employeeNames = {"Asel", "Afrooz", "Safa" , "Suveyda", "Rinat", "Aliya", "Bektemir", "Pedro"};
        int[] employeeSalary = { 100000,   110000,  105000,   120000,   125000,   125000 ,  125000,   100000};

        int maxsalary=employeeSalary[0];


        for (double   each:employeeSalary) {
            if (each>maxsalary){
                maxsalary= (int) each;
            }


        }

        System.out.println(maxsalary);

for (int i=0;i<=employeeNames.length-1;i++){
    if (maxsalary==employeeSalary[i]){
        System.out.println(employeeNames[i]);
    }
}






    }
}
