import java.lang.reflect.*;
import java.util.*;

class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

class Solu {

    public static void main(String[] args){
        Student student = new Student(); 
        Method[] methods = Student.class.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method method: methods){
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
            ArrayList<String> methodList1 = new ArrayList<>();
            for(Method method: methods){
                methodList1.add(method.getName());
            }
            Collections.sort(methodList1);
            for(String id: methodList1){
                System.out.println(id);
                
            ArrayList<String> methodList2 = new ArrayList<>();
            for(Method method: methods){
                methodList2.add(method.getName());
            }
            Collections.sort(methodList2);
            for(String email: methodList2){
                System.out.println(email);
            }
        }
        }
    }
}
    






