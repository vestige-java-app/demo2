//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.11.14 à 10:13:06 AM CET 
//


package fr.gaellalire.vestige_app.demo2.mod1.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import fr.gaellalire.vestige_app.demo2.mod1.BooleanAdapter;
import fr.gaellalire.vestige_app.demo2.mod1.StringAdapter;


/**
 * <p>Classe Java pour MavenAttachType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MavenAttachType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="groupId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="artifactId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="manyLoaders" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="scope" type="{http://gaellalire.fr/vestige/MAVEN_LAUNCHER}Scope" default="PLATFORM" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MavenAttachType")
public class MavenAttachType {

    @XmlAttribute(name = "groupId", required = true)
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String groupId;
    @XmlAttribute(name = "artifactId", required = true)
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String artifactId;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String version;
    @XmlAttribute(name = "manyLoaders")
    @XmlJavaTypeAdapter(BooleanAdapter.class)
    @XmlSchemaType(name = "boolean")
    protected Boolean manyLoaders;
    @XmlAttribute(name = "scope")
    protected Scope scope;

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

    /**
     * Obtient la valeur de la propriété version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Définit la valeur de la propriété version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    public boolean isSetVersion() {
        return (this.version!= null);
    }

    /**
     * Obtient la valeur de la propriété manyLoaders.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public boolean isManyLoaders() {
        if (manyLoaders == null) {
            return new BooleanAdapter().unmarshal("true");
        } else {
            return manyLoaders;
        }
    }

    /**
     * Définit la valeur de la propriété manyLoaders.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManyLoaders(Boolean value) {
        this.manyLoaders = value;
    }

    public boolean isSetManyLoaders() {
        return (this.manyLoaders!= null);
    }

    /**
     * Obtient la valeur de la propriété scope.
     * 
     * @return
     *     possible object is
     *     {@link Scope }
     *     
     */
    public Scope getScope() {
        if (scope == null) {
            return Scope.PLATFORM;
        } else {
            return scope;
        }
    }

    /**
     * Définit la valeur de la propriété scope.
     * 
     * @param value
     *     allowed object is
     *     {@link Scope }
     *     
     */
    public void setScope(Scope value) {
        this.scope = value;
    }

    public boolean isSetScope() {
        return (this.scope!= null);
    }

}
