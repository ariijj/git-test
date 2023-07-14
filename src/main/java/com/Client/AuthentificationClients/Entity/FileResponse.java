package com.Client.AuthentificationClients.Entity;

import java.util.Date;

public class FileResponse {
    private String _id;
    private String studentname;
    private String studentemail;
    private Date studentbirth;
    private String studentaddress;
    private String mobile;
    public FileResponse(String id,String studentname,String studentemail,Date studentbirth,String studentaddress,String mobile) {
        super();
        this._id=id;
        this.studentname=studentname;
        this.studentemail=studentemail;
        this.studentbirth=studentbirth;
        this.studentaddress=studentaddress;
        this.mobile=mobile;
}

    public String get_id() {
        return _id;
    }

    public String getStudentemail() {
        return studentemail;
    }

    public String getStudentname() {
        return studentname;
    }

    public Date getStudentbirth() {
        return studentbirth;
    }

    public String getStudentaddress() {
        return studentaddress;
    }

    public String getMobile() {
        return mobile;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public void setStudentemail(String studentemail) {
        this.studentemail = studentemail;
    }

    public void setStudentbirth(Date studentbirth) {
        this.studentbirth = studentbirth;
    }

    public void setStudentaddress(String studentaddress) {
        this.studentaddress = studentaddress;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
