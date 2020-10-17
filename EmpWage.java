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
        System.out.println("Welcome to Employee Wage");
    }
    
    public static void main(String[] args) {
        EmpWage w=new EmpWage();
        w.calEmpWage();
        
        }
    }

