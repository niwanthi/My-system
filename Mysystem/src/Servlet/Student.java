package Servlet;

import javax.print.DocFlavor;

public class Student {

//Encapsulation

        private int stu_Id;
        private String stu_Name;
        private String stu_Add;
        private String stu_Email;
        private int stu_Tel;
        private float stu_Dob;
        private int stu_Age;
        private String stu_Gender;
        private String stu_Nat;
        private String stu_Rel;

        public Student(String stu_Id, String stu_Name, String stu_Add, String stu_Email, int stu_Tel, float stu_Dob, int stu_Age, String stu_Gender, String stu_Nat, String stu_Rel) {

        }

        public Student(int stu_Id, String stu_Name, String stu_Add, String stu_Email, int stu_Tel, float stu_Dob, int stu_Age, String stu_Gender, String stu_Nat, String stu_Rel) {
            this.stu_Id = stu_Id;
            this.stu_Name = stu_Name;
            this.stu_Add = stu_Add;
            this.stu_Email = stu_Email;
            this.stu_Tel = stu_Tel;
            this.stu_Dob = stu_Dob;
            this.stu_Age = stu_Age;
            this.stu_Gender = stu_Gender;
            this.stu_Nat = stu_Nat;
            this.stu_Rel = stu_Rel;

        }

        public void setStu_Id(int id)//set values
        {
            this.stu_Id=id;
        }

        public void setStu_Name(String name){
            this.stu_Name=name;
        }

        public void setStu_Add(String add){
            this.stu_Add=add;
        }

        public void setStu_Email(String email){
            this.stu_Email=email;
        }

        public void setStu_Tel(int tel){
            this.stu_Tel=tel;
        }

        public void setStu_Dob(int dob){
            this.stu_Dob=dob;
        }

        public void setStu_Age(int age){
            this.stu_Age=age;
        }

        public void setStu_Gender(String gen){
            this.stu_Gender=gen;
        }

        public void setStu_Nat(String nat){
            this.stu_Nat=nat;
        }

        public void setStu_Rel(String rel){
            this.stu_Rel=rel;
        }


        public int getstu_Id() //get values
        {
            return stu_Id;
        }

        public String getstu_Name(){
            return stu_Name;
        }

        public String getstu_Add(){
            return stu_Add;
        }

        public String getstu_Email(){
            return stu_Email;
        }

        public int getstu_Tel(){
            return stu_Tel;
        }

        public float getstu_Dob(){
            return stu_Tel;
        }

        public int getstu_Age(){
            return stu_Age;
        }

        public String getstu_Gender(){
            return stu_Gender;
        }

        public String getstu_Nat(){
            return stu_Nat;
        }

        public String getstu_Rel(){
            return stu_Rel;
        }

        public void add(){}

}
