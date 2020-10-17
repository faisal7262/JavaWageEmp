/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empwage;

/**
 *
 * @author Woner
 */
    interface wage{
        void calEmpWage();
    }

public class EmpWage implements wage {
    
    public void calEmpWage(){
        int IS_FULL_TIME=1;
        double empCheck = Math.floor(Math.random()*10) % 2;
        System.out.println("Welcome to Employee Wage");
        if (empCheck == IS_FULL_TIME){
            System.out.println("Employee is present");
        }
        else
            System.out.println("Employee is Absent");
    }
    
    public static void main(String[] args) {
        EmpWage w=new EmpWage();
        w.calEmpWage();
        
        }
    }

