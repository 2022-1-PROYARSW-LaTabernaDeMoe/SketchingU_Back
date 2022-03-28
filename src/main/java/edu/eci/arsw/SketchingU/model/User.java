package edu.eci.arsw.SketchingU.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user_data")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "upassword")
    private String upassword;

    @Column(name = "uname")
    private String uname;

    public User(){

    }
    public User(String email,String upassword,String uname){
        this.email = email;
        this.upassword = upassword;
        this.uname = uname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
