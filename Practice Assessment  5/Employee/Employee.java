package Employee;
class Employee {
    int id;
    String name;
    String role;
    int yearEmployed;

    Employee (int id, String name, String role, int yearEmployed){
        id = 0;
        name = "";
        role = "";
        yearEmployed = 0;
    }

    void setId(int x){
        id = x;
    }

    void setYearEmployed(int x){
        yearEmployed = x;
    }

    void setName(String x){
        name = x;
    }

    void setRole(String x){
        role = x;
    }

    int getId(){
        return id;
    }

    int getYearEmployed(){
        return yearEmployed;
    }

    String getName(){
        return name;
    }

    String getRole(){
        return role;
    }
}

