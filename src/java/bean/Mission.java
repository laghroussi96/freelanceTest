/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author fatima
 */
@Entity
public class Mission implements Serializable {

    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titre;
     private String commentaire;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datePublication;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateLimite;
    @ManyToOne
    private Recruteur recruteur;
    @ManyToOne
    private Categorie categorie;
    @ManyToOne
    private Langue langue;
    @ManyToOne
    private Diplome diplome;
    @ManyToOne
    private Budget budget;
    @ManyToOne
    private Admin admin;
@OneToMany(mappedBy = "mission")
    private List<TechnologieMission> technologieMissions;

    @OneToMany(mappedBy = "mission")
    private List<Review> reviews;

    @OneToMany(mappedBy = "mission")
    private List<Notification> notifications;

    public Mission() {
    }

    public Mission(Long id) {
        this.id = id;
    }

    public Mission(Long id, String titre, String commentaire, Date datePublication, Date dateLimite) {
        this.id = id;
        this.titre = titre;
        this.commentaire = commentaire;
        this.datePublication = datePublication;
        this.dateLimite = dateLimite;
    }

    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public Date getDateLimite() {
        return dateLimite;
    }

    public void setDateLimite(Date dateLimite) {
        this.dateLimite = dateLimite;
    }

    public Recruteur getRecruteur() {
        return recruteur;
    }

    public void setRecruteur(Recruteur recruteur) {
        this.recruteur = recruteur;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Langue getLangue() {
        return langue;
    }

    public void setLangue(Langue langue) {
        this.langue = langue;
    }

    public Diplome getDiplome() {
        return diplome;
    }

    public void setDiplome(Diplome diplome) {
        this.diplome = diplome;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List<TechnologieMission> getTechnologieMissions() {
        return technologieMissions;
    }

    public void setTechnologieMissions(List<TechnologieMission> technologieMissions) {
        this.technologieMissions = technologieMissions;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
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
        if (!(object instanceof Mission)) {
            return false;
        }
        Mission other = (Mission) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mission{" + "id=" + id + ", titre=" + titre + ", commentaire=" + commentaire + ", datePublication=" + datePublication + ", dateLimite=" + dateLimite + '}';
    }

   
    
}
