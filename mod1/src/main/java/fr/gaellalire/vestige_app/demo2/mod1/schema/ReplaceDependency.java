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
 * <p>Classe Java pour ReplaceDependency complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ReplaceDependency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="exceptIn" type="{http://gaellalire.fr/vestige/MAVEN_LAUNCHER}ExceptIn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="addDependency" type="{http://gaellalire.fr/vestige/MAVEN_LAUNCHER}AddDependency" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ReplaceDependency", propOrder = {
    "exceptIn",
    "addDependency"
})
public class ReplaceDependency {

    protected List<ExceptIn> exceptIn;
    protected List<AddDependency> addDependency;
    @XmlAttribute(name = "groupId", required = true)
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String groupId;
    @XmlAttribute(name = "artifactId", required = true)
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String artifactId;

    /**
     * Gets the value of the exceptIn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exceptIn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExceptIn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExceptIn }
     * 
     * 
     */
    public List<ExceptIn> getExceptIn() {
        if (exceptIn == null) {
            exceptIn = new ArrayList<ExceptIn>();
        }
        return this.exceptIn;
    }

    public boolean isSetExceptIn() {
        return ((this.exceptIn!= null)&&(!this.exceptIn.isEmpty()));
    }

    public void unsetExceptIn() {
        this.exceptIn = null;
    }

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
