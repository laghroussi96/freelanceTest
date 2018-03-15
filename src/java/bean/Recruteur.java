/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author fatima
 */
@Entity
public class Recruteur implements Serializable {

   
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     private String prenom;
    private double motPasse;
    private double tel;
    @ManyToOne
    private Pays pays;
    @ManyToOne
    private Admin admin;
    @OneToOne
    private User user;
     @OneToMany(mappedBy = "recruteur")
    private List<Notification> notifications;

    @OneToMany(mappedBy = "recruteur")
    private List<Mission> missions;

    public Recruteur() {
    }

    public Recruteur(Long id) {
        this.id = id;
    }

    public Recruteur(Long id, String prenom, double motPasse, double tel, Pays pays) {
        this.id = id;
        this.prenom = prenom;
        this.motPasse = motPasse;
        this.tel = tel;
        this.pays = pays;
    }

    
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(double motPasse) {
        this.motPasse = motPasse;
    }

    public double getTel() {
        return tel;
    }

    public void setTel(double tel) {
        this.tel = tel;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public List<Mission> getMissions() {
        return missions;
    }

    public void setMissions(List<Mission> missions) {
        this.missions = missions;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recruteur)) {
            return false;
        }
        Recruteur other = (Recruteur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Recruteur{" + "id=" + id + ", prenom=" + prenom + ", motPasse=" + motPasse + ", tel=" + tel + '}';
    }

   
}
