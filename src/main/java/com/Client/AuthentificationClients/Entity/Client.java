package com.Client.AuthentificationClients.Entity;

import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.multipart.MultipartFile;


@Document
public class Client {
    @Id
    private String _id;
    private String studentname;
    private String studentemail;
    private String studentbirth;
    private String studentaddress;
    private String mobile;
    private MultipartFile CV;
    private MultipartFile profile_image;
    public Client(String studentname,String studentaddress,String mobile,String studentemail,String studentbirth,MultipartFile CV,MultipartFile profile_image){

        this.studentname=studentname;
        this.studentaddress=studentaddress;
        this.mobile=mobile;
        this.studentbirth=studentbirth;
        this.studentemail=studentemail;
        this.CV=CV;
        this.profile_image=profile_image;

    }
    public Client() {}
    public String get_id(){return _id;}
    public void set_id(String _id){
        this._id=_id;
    }
    public String getStudentname() {
        return studentname;
    }
    public void setStudentname(String studentname){
        this.studentname=studentname;
    }
    public String getStudentaddress(){return studentaddress;}
    public void setStudentaddress(String studentaddress){
        this.studentaddress=studentaddress;
    }
    public String getMobile(){return mobile;}
    public void setmobile(String mobile){
        this.mobile=mobile;
    }

    public MultipartFile getCV() {
        return CV;
    }

    public void setCV(MultipartFile CV) {
        this.CV =CV;
    }
    public MultipartFile getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(MultipartFile profile_image) {
        this.profile_image =profile_image;
    }

    @Override
    public String toString() {
        return "Client{" +
                "_id='" + _id + '\'' +
                ", studentname='" + studentname + '\'' +
                ", studentemail='" + studentemail + '\'' +
                ", studentbirth='" + studentbirth + '\'' +
                ", studentaddress='" + studentaddress + '\'' +
                ", mobile='" + mobile + '\'' +
                ", CV='" + CV + '\'' +
                ", profile_image='" + profile_image + '\'' +
                '}';
    }
}