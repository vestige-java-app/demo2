//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.11.14 à 10:13:06 AM CET 
//


package fr.gaellalire.vestige_app.demo2.mod1.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.gaellalire.vestige.resolver.maven.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MavenLauncher_QNAME = new QName("http://gaellalire.fr/vestige/MAVEN_LAUNCHER", "mavenLauncher");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.gaellalire.vestige.resolver.maven.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MavenLauncher }
     * 
     */
    public MavenLauncher createMavenLauncher() {
        return new MavenLauncher();
    }

    /**
     * Create an instance of {@link MavenAttachType }
     * 
     */
    public MavenAttachType createMavenAttachType() {
        return new MavenAttachType();
    }

    /**
     * Create an instance of {@link MavenClassType }
     * 
     */
    public MavenClassType createMavenClassType() {
        return new MavenClassType();
    }

    /**
     * Create an instance of {@link AddDependency }
     * 
     */
    public AddDependency createAddDependency() {
        return new AddDependency();
    }

    /**
     * Create an instance of {@link ModulePackageName }
     * 
     */
    public ModulePackageName createModulePackageName() {
        return new ModulePackageName();
    }

    /**
     * Create an instance of {@link ModifyDependency }
     * 
     */
    public ModifyDependency createModifyDependency() {
        return new ModifyDependency();
    }

    /**
     * Create an instance of {@link ExceptIn }
     * 
     */
    public ExceptIn createExceptIn() {
        return new ExceptIn();
    }

    /**
     * Create an instance of {@link ReplaceDependency }
     * 
     */
    public ReplaceDependency createReplaceDependency() {
        return new ReplaceDependency();
    }

    /**
     * Create an instance of {@link AdditionalRepository }
     * 
     */
    public AdditionalRepository createAdditionalRepository() {
        return new AdditionalRepository();
    }

    /**
     * Create an instance of {@link FileAdditionalRepository }
     * 
     */
    public FileAdditionalRepository createFileAdditionalRepository() {
        return new FileAdditionalRepository();
    }

    /**
     * Create an instance of {@link MavenConfig }
     * 
     */
    public MavenConfig createMavenConfig() {
        return new MavenConfig();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MavenLauncher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gaellalire.fr/vestige/MAVEN_LAUNCHER", name = "mavenLauncher")
    public JAXBElement<MavenLauncher> createMavenLauncher(MavenLauncher value) {
        return new JAXBElement<MavenLauncher>(_MavenLauncher_QNAME, MavenLauncher.class, null, value);
    }

}
