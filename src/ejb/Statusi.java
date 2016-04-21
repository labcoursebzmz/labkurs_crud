/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Twin
 */
@Entity
@Table(name = "Statusi", catalog = "Test123", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Statusi.findAll", query = "SELECT s FROM Statusi s"),
    @NamedQuery(name = "Statusi.findById", query = "SELECT s FROM Statusi s WHERE s.id = :id"),
    @NamedQuery(name = "Statusi.findByEmertimi", query = "SELECT s FROM Statusi s WHERE s.emertimi = :emertimi")})
public class Statusi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    @GeneratedValue(generator="InvSeq")
    @SequenceGenerator(name="InvSeq",sequenceName = "INV_SEQ",allocationSize = 1)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Emertimi", nullable = false, length = 50)
    private String emertimi;

    public Statusi() {
    }

    public Statusi(Integer id) {
        this.id = id;
    }

    public Statusi(Integer id, String emertimi) {
        this.id = id;
        this.emertimi = emertimi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmertimi() {
        return emertimi;
    }

    public void setEmertimi(String emertimi) {
        this.emertimi = emertimi;
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
        if (!(object instanceof Statusi)) {
            return false;
        }
        Statusi other = (Statusi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.Statusi[ id=" + id + " ]";
    }
    
}
