/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empwage;

import java.util.Random;

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
        int IS_PART_TIME=2;
        int WAGE_PER_HOUR=20;
        int EMP_HOURS = 0;
        int TOTAL_SALARY;
        int DAY_PER_MONTH=20;
        int TOTAL_EMP_HOUR=0;
        
       
        //double empCheck = Math.floor(Math.random()*10) % 2;
        for(int i=1; i<=DAY_PER_MONTH; i++){
             Random r=new Random();
            int empCheck = r.nextInt((3-1)+1)+1;
        
        System.out.println("Welcome to Employee Wage");
             switch((int)empCheck){
            case 1:
                EMP_HOURS=8;
                break;
            case 2:
                EMP_HOURS=4;
                break;
            default:
                System.out.println("Employee is Absent");
             }
             
             TOTAL_EMP_HOUR=(TOTAL_EMP_HOUR+EMP_HOURS);
             
        }
            TOTAL_SALARY=TOTAL_EMP_HOUR*WAGE_PER_HOUR;
            System.out.println(TOTAL_SALARY);
             
    }
    
    public static void main(String[] args) {
        EmpWage w=new EmpWage();
        w.calEmpWage();
        
        }
    }

