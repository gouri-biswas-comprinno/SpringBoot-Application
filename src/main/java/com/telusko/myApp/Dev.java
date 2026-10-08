package com.telusko.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Dev {

    @Autowired // field injection
    private Computer comp;


    //constructor injections
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }

//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build() {

        comp.compile();

        System.out.println("working on a project");
    }
}
