package com.entite;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TODO Short description of the class
 * 
 * <P>
 * TODO Detailed description of the use of the class.
 * </p>
 * 
 * @author $Author$
 * @version $Revision$
 */
@Entity
@Table(name = "ENTREPRISE")
public class Entreprise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ENTREPRISE_ID")
    private Long id;

    @Column(name = "NOM")
    private String nom;

    @Column(name = "ACTIVITE")
    private String activite;

    @OneToMany(mappedBy = "entreprise")
    private List<Personne> personnes;

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
     * @return the activite
     */
    public final String getActivite() {
        return activite;
    }

    /**
     * @param activite
     *            the activite to set
     */
    public final void setActivite(final String activite) {
        this.activite = activite;
    }

    /**
     * @return the personnes
     */
    public final List<Personne> getPersonnes() {
        return personnes;
    }

    /**
     * @param personnes
     *            the personnes to set
     */
    public final void setPersonnes(final List<Personne> personnes) {
        this.personnes = personnes;
    }
}
