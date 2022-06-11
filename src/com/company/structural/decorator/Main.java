package com.company.structural.decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("NORMAL EMPLOYEE: ");
        EmployeeComponent employee = new EmployeeConcreteComponent("Kai");
        employee.showBasicInformation();
        employee.doTask();

        System.out.println("\nTEAM LEADER: ");
        EmployeeComponent leader = new TeamLeader(employee);
        leader.showBasicInformation();
        leader.doTask();

        System.out.println("\nMANAGER");
        EmployeeComponent manager = new Manager(employee);
        manager.showBasicInformation();
        manager.doTask();

        System.out.println("\nTEAM LEADER AND MANAGER: ");
        EmployeeComponent leaderAndManager = new Manager(leader);
        leaderAndManager.showBasicInformation();
        leaderAndManager.doTask();
    }
}
