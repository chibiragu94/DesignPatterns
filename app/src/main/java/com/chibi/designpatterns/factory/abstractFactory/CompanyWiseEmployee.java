package com.chibi.designpatterns.factory.abstractFactory;

import com.chibi.designpatterns.factory.EmployeeType;
import com.chibi.designpatterns.factory.Type;

abstract public class CompanyWiseEmployee {

    abstract Type getEmployeeType(EmployeeType type);
}
