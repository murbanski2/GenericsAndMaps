package Lab;

import common.Employee;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author murbanski
 */
public class lab2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(333, "Austin", "Steve", "222-22-2222");
        Employee e2 = new Employee(444, "Goldman", "Oscar", "333-33-3333");
        Employee e3 = new Employee(111, "Sommers", "Jamie", "222-22-2222");
        Employee e4 = new Employee(555, "Wells", "Rudy", "111-11-1111");
        
        System.out.println("HashMap stuff");
        Map<String, Employee> empMap = new HashMap();
        String holder;
        
        holder = Integer.toString(e1.getEmpID());
        empMap.put(holder, e1);
        
        holder = Integer.toString(e2.getEmpID());
        empMap.put(holder, e2);
        
        holder = Integer.toString(e3.getEmpID());
        empMap.put(holder, e3);
        
        holder = Integer.toString(e4.getEmpID());
        empMap.put(holder, e4);
        
        Set<String> myKeys = empMap.keySet();
        for(String k:myKeys){
            Employee e = empMap.get(k);
            System.out.println(e);
            
        }
        System.out.println("\n\n");
        Collection<Employee> empCollection = empMap.values();
        for(Employee e:empCollection){
            System.out.println(e);
        }
        System.out.println(  empMap.size());
        
        System.out.println("\n\n\nTree Map stuff");
        Map<String, Employee> empTreeMap = new TreeMap();
        empTreeMap.put(e1.getSsn(), e1);
        empTreeMap.put(e2.getSsn(), e2);
        empTreeMap.put(e3.getSsn(), e3);
        empTreeMap.put(e4.getSsn(), e4);
        
        Set<String> treeKeys = empTreeMap.keySet();
        for(String keyString:treeKeys){
            Employee e = empTreeMap.get(keyString);
            System.out.println(e);
        }
        
        System.out.println("\n");
        Collection<Employee> treeValues = empTreeMap.values();
        for(Employee e:treeValues) {
            System.out.println(e);
        }
        
    }
}
