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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import fr.gaellalire.vestige_app.demo2.mod1.BooleanAdapter;


/**
 * <p>Classe Java pour MavenConfig complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MavenConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="modifyDependency" type="{http://gaellalire.fr/vestige/MAVEN_LAUNCHER}ModifyDependency"/&gt;
 *         &lt;element name="replaceDependency" type="{http://gaellalire.fr/vestige/MAVEN_LAUNCHER}ReplaceDependency"/&gt;
 *         &lt;element name="additionalRepository" type="{http://gaellalire.fr/vestige/MAVEN_LAUNCHER}AdditionalRepository"/&gt;
 *         &lt;element name="fileAdditionalRepository" type="{http://gaellalire.fr/vestige/MAVEN_LAUNCHER}FileAdditionalRepository"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="superPomRepositoriesUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="pomRepositoriesIgnored" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MavenConfig", propOrder = {
    "modifyDependencyOrReplaceDependencyOrAdditionalRepository"
})
public class MavenConfig {

    @XmlElements({
        @XmlElement(name = "modifyDependency", type = ModifyDependency.class),
        @XmlElement(name = "replaceDependency", type = ReplaceDependency.class),
        @XmlElement(name = "additionalRepository", type = AdditionalRepository.class),
        @XmlElement(name = "fileAdditionalRepository", type = FileAdditionalRepository.class)
    })
    protected List<Object> modifyDependencyOrReplaceDependencyOrAdditionalRepository;
    @XmlAttribute(name = "superPomRepositoriesUsed")
    @XmlJavaTypeAdapter(BooleanAdapter.class)
    @XmlSchemaType(name = "boolean")
    protected Boolean superPomRepositoriesUsed;
    @XmlAttribute(name = "pomRepositoriesIgnored")
    @XmlJavaTypeAdapter(BooleanAdapter.class)
    @XmlSchemaType(name = "boolean")
    protected Boolean pomRepositoriesIgnored;

    /**
     * Gets the value of the modifyDependencyOrReplaceDependencyOrAdditionalRepository property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifyDependencyOrReplaceDependencyOrAdditionalRepository property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifyDependencyOrReplaceDependencyOrAdditionalRepository().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModifyDependency }
     * {@link ReplaceDependency }
     * {@link AdditionalRepository }
     * {@link FileAdditionalRepository }
     * 
     * 
     */
    public List<Object> getModifyDependencyOrReplaceDependencyOrAdditionalRepository() {
        if (modifyDependencyOrReplaceDependencyOrAdditionalRepository == null) {
            modifyDependencyOrReplaceDependencyOrAdditionalRepository = new ArrayList<Object>();
        }
        return this.modifyDependencyOrReplaceDependencyOrAdditionalRepository;
    }

    public boolean isSetModifyDependencyOrReplaceDependencyOrAdditionalRepository() {
        return ((this.modifyDependencyOrReplaceDependencyOrAdditionalRepository!= null)&&(!this.modifyDependencyOrReplaceDependencyOrAdditionalRepository.isEmpty()));
    }

    public void unsetModifyDependencyOrReplaceDependencyOrAdditionalRepository() {
        this.modifyDependencyOrReplaceDependencyOrAdditionalRepository = null;
    }

    /**
     * Obtient la valeur de la propriété superPomRepositoriesUsed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public boolean isSuperPomRepositoriesUsed() {
        if (superPomRepositoriesUsed == null) {
            return new BooleanAdapter().unmarshal("true");
        } else {
            return superPomRepositoriesUsed;
        }
    }

    /**
     * Définit la valeur de la propriété superPomRepositoriesUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperPomRepositoriesUsed(Boolean value) {
        this.superPomRepositoriesUsed = value;
    }

    public boolean isSetSuperPomRepositoriesUsed() {
        return (this.superPomRepositoriesUsed!= null);
    }

    /**
     * Obtient la valeur de la propriété pomRepositoriesIgnored.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public boolean isPomRepositoriesIgnored() {
        if (pomRepositoriesIgnored == null) {
            return new BooleanAdapter().unmarshal("false");
        } else {
            return pomRepositoriesIgnored;
        }
    }

    /**
     * Définit la valeur de la propriété pomRepositoriesIgnored.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPomRepositoriesIgnored(Boolean value) {
        this.pomRepositoriesIgnored = value;
    }

    public boolean isSetPomRepositoriesIgnored() {
        return (this.pomRepositoriesIgnored!= null);
    }

}
