/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.datast;

/**
 *
 * @author Home
 */
public class User{
    
private static int count = 0;
private int userId;
private String name;
private String address;
private String email;
private String password;
private String empNumber;


private boolean isFilled;

public User() {
    //name = title;

    isFilled = false;
    setUserId(++count);
}

public int getUserId() {
    return userId;
}

public void setUserId(int userId) {
    this.userId = userId;
}
    
    
    /*private int id;
    private String name;
    private String address;
    private String email;
    private String password;
    private String EmpNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmpNumber() {
        return EmpNumber;
    }

    public void setEmpNumber(String EmpNumber) {
        this.EmpNumber = EmpNumber;
    }
    
    public User[] showUsers(String fileName){
        File file = new File(fileName);
        User user=new User();
        User[] users;
        Process process;
        process=new Process();
        users = new User[process.countLines(file)];
        try {
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader bf = new BufferedReader(isr);
            String line;
            line = bf.readLine();
            int lines=0;
            while(true){
                line=bf.readLine();
                if(line == null)
                    break;
                String[] data=line.split(";");
                user = new User();
                user.setId(Integer.parseInt(data[0]));
                user.setName(data[1]);
                user.setAddress(data[2]);
                user.setEmail(data[3]);
                user.setPassword(data[4]);
                users[lines]=user;
                lines++;
            }
            bf.close();
        }  catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }
    
    public User searchById(User[] user,int idSearch){
        User l = new User();
        for (User users : user) {
            if(users.getId()==idSearch){
                id = users.getId();
                name = users.getName();
                address = users.getAddress();
                email = users.getEmail();
                System.out.println("Id......:"+id);
                System.out.println("Name ...:"+name);
                System.out.println("Name ...:"+address);
                System.out.println("Name. ..:"+email);
                System.out.println("----------------");
                l.setId(id);
                l.setName(name);
                l.setAddress(address);
                l.setEmail(email);
            }
        }
        return l;
    }*/


}
