package jp.ac.u_aizu.judge.user;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private String id;
    @JsonIgnore
    private String password;
    private String name;
    private String affiliation;
    private String mail;
    @Column(name = "REGISTERDATE")
    private String registerDate;
    @Column(name = "LASTSUBMITDATE")
    private String lastSubmitDate;
    private String policy;
    private String URL;

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public String getMail() {
        return mail;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public String getLastSubmitDate() {
        return lastSubmitDate;
    }

    public String getPolicy() {
        return policy;
    }

    public String getURL() {
        return URL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (affiliation != null ? !affiliation.equals(user.affiliation) : user.affiliation != null) return false;
        if (mail != null ? !mail.equals(user.mail) : user.mail != null) return false;
        if (registerDate != null ? !registerDate.equals(user.registerDate) : user.registerDate != null) return false;
        if (lastSubmitDate != null ? !lastSubmitDate.equals(user.lastSubmitDate) : user.lastSubmitDate != null)
            return false;
        if (policy != null ? !policy.equals(user.policy) : user.policy != null) return false;
        return URL != null ? URL.equals(user.URL) : user.URL == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (affiliation != null ? affiliation.hashCode() : 0);
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        result = 31 * result + (registerDate != null ? registerDate.hashCode() : 0);
        result = 31 * result + (lastSubmitDate != null ? lastSubmitDate.hashCode() : 0);
        result = 31 * result + (policy != null ? policy.hashCode() : 0);
        result = 31 * result + (URL != null ? URL.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", affiliation='" + affiliation + '\'' +
                ", mail='" + mail + '\'' +
                ", registerDate='" + registerDate + '\'' +
                ", lastSubmitDate='" + lastSubmitDate + '\'' +
                ", policy='" + policy + '\'' +
                ", URL='" + URL + '\'' +
                '}';
    }
}
