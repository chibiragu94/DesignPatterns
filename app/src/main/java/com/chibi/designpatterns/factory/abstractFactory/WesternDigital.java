package com.chibi.designpatterns.factory.abstractFactory;

import com.chibi.designpatterns.factory.EmployeeType;
import com.chibi.designpatterns.factory.Labour;
import com.chibi.designpatterns.factory.LevelOne;
import com.chibi.designpatterns.factory.LevelTwo;
import com.chibi.designpatterns.factory.Manager;
import com.chibi.designpatterns.factory.Type;

public class WesternDigital extends CompanyWiseEmployee {
    @Override
    Type getEmployeeType(EmployeeType employeeType) {
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
