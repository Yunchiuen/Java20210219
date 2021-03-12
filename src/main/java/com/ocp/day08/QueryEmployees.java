
package com.ocp.day08;
/*
 * 單一實例
 *  1.建立prinate建構子
 *  2.自己建立一個實例(static)
    3.提供一個public static方法來取得在2中建立的實例
 * @author student
 */
public class QueryEmployees {
    public static void main(String[] args) {
        Employees e1=Employees.getEmployees();
        e1.print();
        Employees e2=Employees.getEmployees();
        e2.print();
        
    }
}
