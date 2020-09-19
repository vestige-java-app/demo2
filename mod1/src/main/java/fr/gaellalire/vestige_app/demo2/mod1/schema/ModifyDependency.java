//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.11.14 à 10:13:06 AM CET 
//


package fr.gaellalire.vestige_app.demo2.mod1.schema;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import fr.gaellalire.vestige_app.demo2.mod1.StringAdapter;


/**
 * <p>Classe Java pour ModifyDependency complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ModifyDependency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addDependency" type="{http://gaellalire.fr/vestige/MAVEN_LAUNCHER}AddDependency" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="addExports" type="{http://gaellalire.fr/vestige/MAVEN_LAUNCHER}ModulePackageName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="addOpens" type="{http://gaellalire.fr/vestige/MAVEN_LAUNCHER}ModulePackageName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="groupId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="artifactId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyDependency", propOrder = {
    "addDependency",
    "addExports",
    "addOpens"
})
public class ModifyDependency {

    protected List<AddDependency> addDependency;
    protected List<ModulePackageName> addExports;
    protected List<ModulePackageName> addOpens;
    @XmlAttribute(name = "groupId", required = true)
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String groupId;
    @XmlAttribute(name = "artifactId", required = true)
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String artifactId;

    /**
     * Gets the value of the addDependency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addDependency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddDependency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddDependency }
     * 
     * 
     */
    public List<AddDependency> getAddDependency() {
        if (addDependency == null) {
            addDependency = new ArrayList<AddDependency>();
        }
        return this.addDependency;
    }

    public boolean isSetAddDependency() {
        return ((this.addDependency!= null)&&(!this.addDependency.isEmpty()));
    }

    public void unsetAddDependency() {
        this.addDependency = null;
    }

    /**
     * Gets the value of the addExports property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addExports property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddExports().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModulePackageName }
     * 
     * 
     */
    public List<ModulePackageName> getAddExports() {
        if (addExports == null) {
            addExports = new ArrayList<ModulePackageName>();
        }
        return this.addExports;
    }

    public boolean isSetAddExports() {
        return ((this.addExports!= null)&&(!this.addExports.isEmpty()));
    }

    public void unsetAddExports() {
        this.addExports = null;
    }

    /**
     * Gets the value of the addOpens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addOpens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddOpens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModulePackageName }
     * 
     * 
     */
    public List<ModulePackageName> getAddOpens() {
        if (addOpens == null) {
            addOpens = new ArrayList<ModulePackageName>();
        }
        return this.addOpens;
    }

    public boolean isSetAddOpens() {
        return ((this.addOpens!= null)&&(!this.addOpens.isEmpty()));
    }

    public void unsetAddOpens() {
        this.addOpens = null;
    }

    /**
     * Obtient la valeur de la propriété groupId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Définit la valeur de la propriété groupId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    public boolean isSetGroupId() {
        return (this.groupId!= null);
    }

    /**
     * Obtient la valeur de la propriété artifactId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtifactId() {
        return artifactId;
    }

    /**
     * Définit la valeur de la propriété artifactId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtifactId(String value) {
        this.artifactId = value;
    }

    public boolean isSetArtifactId() {
        return (this.artifactId!= null);
    }

}
