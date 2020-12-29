package day36;

public class offer {

    public String location, jobTitle, companyName;
    public double salary;
    public boolean hasBenefit, isWFH, hasPTO, isFulltime;

    public void setInfo(String location, String jobTitle, String companyName, double salary, boolean hasBenefit, boolean isWFH, boolean hasPTO, boolean isFulltime) {
        this.location = location;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.isWFH = isWFH;
        this.hasPTO = hasPTO;
        this.isFulltime = isFulltime;
    }

    public void getInfo() {
        System.out.println("company name:" + companyName + "\n location:" + location + "\n salary:$" + salary +
                "\n job title:" + jobTitle + "\nhas benefit:" + hasBenefit + "\n work from home: " + isWFH
                + "\n has pto:" + hasPTO + "\n full time :" + isFulltime+
        "\n=============================");
    }


}
