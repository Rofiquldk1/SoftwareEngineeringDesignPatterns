import java.util.ArrayList;

public class Employees implements Cloneable {
    private ArrayList<String> empList;
    
    public Employees(){
        empList = new ArrayList<String>(); 
    }
    
    public Employees(ArrayList<String> list){
        this.empList=list;
    }
   
    public void loadData(){
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa"); 
    }
    
    public ArrayList<String> getEmpList() {
        return empList; 
    }
    
    public void addEmp(String name) {
        empList.add(name);
    }
    
    public void deleteEmp(String name) {
        empList.remove(name);
    }
    
    @Override
    public Employees clone() throws CloneNotSupportedException{
        ArrayList<String> temp = new ArrayList<String>();
        for(String s : this.getEmpList()){
             temp.add(s);
        }
        return new Employees(temp); 
    }

}
