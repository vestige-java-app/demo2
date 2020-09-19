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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour MavenLauncher complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MavenLauncher"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attach" type="{http://gaellalire.fr/vestige/MAVEN_LAUNCHER}MavenAttachType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="launch" type="{http://gaellalire.fr/vestige/MAVEN_LAUNCHER}MavenClassType"/&gt;
 *         &lt;element name="config" type="{http://gaellalire.fr/vestige/MAVEN_LAUNCHER}MavenConfig" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MavenLauncher", propOrder = {
    "attach",
    "launch",
    "config"
})
public class MavenLauncher {

    protected List<MavenAttachType> attach;
    @XmlElement(required = true)
    protected MavenClassType launch;
    protected MavenConfig config;

    /**
     * Gets the value of the attach property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attach property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttach().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MavenAttachType }
     * 
     * 
     */
    public List<MavenAttachType> getAttach() {
        if (attach == null) {
            attach = new ArrayList<MavenAttachType>();
        }
        return this.attach;
    }

    public boolean isSetAttach() {
        return ((this.attach!= null)&&(!this.attach.isEmpty()));
    }

    public void unsetAttach() {
        this.attach = null;
    }

    /**
     * Obtient la valeur de la propriété launch.
     * 
     * @return
     *     possible object is
     *     {@link MavenClassType }
     *     
     */
    public MavenClassType getLaunch() {
        return launch;
    }

    /**
     * Définit la valeur de la propriété launch.
     * 
     * @param value
     *     allowed object is
     *     {@link MavenClassType }
     *     
     */
    public void setLaunch(MavenClassType value) {
        this.launch = value;
    }

    public boolean isSetLaunch() {
        return (this.launch!= null);
    }

    /**
     * Obtient la valeur de la propriété config.
     * 
     * @return
     *     possible object is
     *     {@link MavenConfig }
     *     
     */
    public MavenConfig getConfig() {
        return config;
    }

    /**
     * Définit la valeur de la propriété config.
     * 
     * @param value
     *     allowed object is
     *     {@link MavenConfig }
     *     
     */
    public void setConfig(MavenConfig value) {
        this.config = value;
    }

    public boolean isSetConfig() {
        return (this.config!= null);
    }

}
