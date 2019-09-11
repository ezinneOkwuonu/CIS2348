public class ClassAssignment {

    public static void main(String[] args) {
        double managerRate;
        managerRate = 23.40; // the hourly rate till 40 hours
        int standardHours;
        standardHours = 40; // the standard amount before overtime pay
        double OvertimeHoursPay = 30.00; // the overtime per hour amount
        int totalManagerHrs= 47;
        double totalPay;

        totalPay= (standardHours *managerRate) + ((totalManagerHrs - standardHours) * OvertimeHoursPay);
        System.out.println(totalPay); // prints our the solution
    }


}