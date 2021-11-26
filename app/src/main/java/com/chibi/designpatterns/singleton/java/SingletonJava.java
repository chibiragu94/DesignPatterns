package com.chibi.designpatterns.singleton.java;

public class SingletonJava {


    //https://techvidvan.com/tutorials/java-singleton-class/
    //Follow three steps to create Singleton
    //create private constructor
    //private static instance with null
    //public method to return the instance of the class
    //use synchronized block if for the thread safe , otherwise avoid it

    private SingletonJava()
    {

    }

    private static SingletonJava instance;

    public static SingletonJava getInstance()
    {
        if (null == instance)
        {
            synchronized (SingletonJava.class)
            {
                if (null == instance)
                {
                    instance = new SingletonJava();
                }
            }
        }
        return instance;
    }
}
