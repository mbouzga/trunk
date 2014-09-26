package com.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONNE")
public class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PERSONNE_ID")
    private Long id;

    @Column(name = "NOM")
    private String nom;

    @Column(name = "PRENOM")
    private String prenom;

    @Column(name = "AGE")
    private Integer age;

    @ManyToOne
    @JoinColumn(name = "ENTREPRISE_ID")
    private Entreprise entreprise;

    /**
     * TODO description of constructor
     */
    public Personne() {
        super();
    }

    /**
     * @param id
     * @param nom
     * @param prenom
     * @param age
     */
    public Personne(final Long id, final String nom, final String prenom, final Integer age) {
        super();
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    /**
     * @param nom
     * @param prenom
     * @param age
     */
    public Personne(final String nom, final String prenom, final Integer age) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    /**
     * @return the id
     */
    public final Long getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public final void setId(final Long id) {
        this.id = id;
    }

    /**
     * @return the nom
     */
    public final String getNom() {
        return nom;
    }

    /**
     * @param nom
     *            the nom to set
     */
    public final void setNom(final String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public final String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom
     *            the prenom to set
     */
    public final void setPrenom(final String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the age
     */
    public final Integer getAge() {
        return age;
    }

    /**
     * @param age
     *            the age to set
     */
    public final void setAge(final Integer age) {
        this.age = age;
    }

    /**
     * @return the entreprise
     */
    public final Entreprise getEntreprise() {
        return entreprise;
    }

    /**
     * @param entreprise
     *            the entreprise to set
     */
    public final void setEntreprise(final Entreprise entreprise) {
        this.entreprise = entreprise;
    }
}
