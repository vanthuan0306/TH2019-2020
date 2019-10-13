/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhpm.tuan5;

/**
 *
 * @author VanThuan
 */
public class Employee {
    private  int id;
    private String name;
    private String address;
    private String gender;
    private String knowledge;
    private String subject;
    public Employee(){
        
    }

    public Employee(String name, String address, String gender, String knowledge, String subject) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.knowledge = knowledge;
        this.subject = subject;
    }
    
    

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getKnowledge() {
        return knowledge;
    }

    public String getSubject() {
        return subject;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setKnowledge(String knowledge) {
        this.knowledge = knowledge;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    
}
