/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarmahasiswa;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
    private String studentNIM;
    private String studentName;
    private String studentGrade;
    private String studentClass;
    
    public Mahasiswa(String n1, String n2, String n3, String n4){
        studentNIM = n1;
        studentName = n2;
        studentGrade = n3;
        studentClass = n4;
    }
    
    public void setStudentNIM(String n) {
        studentNIM = n;
    }
    
    public void setStudentName(String n) {
        studentName = n;
    }
    
    public void setStudentGrade(String n) {
        studentGrade = n;
    }
    
    public void setStudentClass(String n)
    {
        studentClass = n;
    }
    
    public String getStudentNIM() {
        return studentNIM;
    }
    
    public String getStudentName() {
        return studentName;
    }
    
    public String getStudentGrade() {
        return studentGrade;
    }
    
    public String getStudentClass()
    {
        return studentClass;
    }
}
