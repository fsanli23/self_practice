package day39;

import day37.employee;

public class humanResources {

    public static employee employee1;
    public static employee employee2;
    public static employee employee3;
    public static employee employee4;

    static {
        employee1 = new employee("bofa", "fatih", "sdet", "m", 45, 40);
        employee2 = new employee("vtrack", "inanc", "sder", "f", 52, 44);
        employee3 = new employee("capt", "burak", "dev", "m", 25, 45);
        employee4 = new employee("strab", "deri", "dev", "m", 43, 2);
    }


}
