package com.chibi.designpatterns.factory;

public class EmployeeFactory {

    public static Type getEmployeeTypeInstance(EmployeeType employeeType)
    {
        if (employeeType == EmployeeType.MANAGER)
        {
            return new Manager();
        }else if (employeeType == EmployeeType.LEVEL_ONE)
        {
            return new LevelOne();
        }else if (employeeType == EmployeeType.LEVEL_TWO)
        {
            return new LevelTwo();
        }else {
            return new Labour();
        }
    }
}
