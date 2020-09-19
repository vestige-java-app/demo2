package fr.gaellalire.vestige_app.demo2.mod1;

import java.util.ServiceLoader;
import java.util.concurrent.Callable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchema;

import fr.gaellalire.vestige_app.demo2.mod1.schema.ObjectFactory;
import fr.gaellalire.vestige_app.demo2.mod2.Mod2;
import fr.gaellalire.vestige_app.demo2.mod2.MyAPI;
import fr.gaellalire.vestige_app.demo2.mod3.Mod3;

public class Mod1 implements Callable<Void> {

    @XmlElementRef
    Object object;

    public static void main(final String[] args) throws Exception {
        new Mod1().call();
    }

    @Override
    public Void call() throws Exception {
        if (Mod1.class.getResource("schema/res.txt") != null) {
            System.out.println("OK resource");
        } else {
            System.out.println("KO resource");
        }
        if (Mod1.class.getResource("/fr/gaellalire/vestige_app/demo2/mod1/schema/res.txt") != null) {
            System.out.println("OK abs resource");
        } else {
            System.out.println("KO abs resource");
        }
        if (Mod1.class.getClassLoader().getResource("fr/gaellalire/vestige_app/demo2/mod1/schema/res.txt") != null) {
            System.out.println("NOMOD-OK encapsulation resource");
        } else {
            System.out.println("MOD-OK encapsulation resource");
        }

        if (Mod1.class.getResource("/fr/gaellalire/vestige_app/demo2/mod1/schema/nip/res.txt") != null) {
            System.out.println("OK anip resource");
        } else {
            System.out.println("KO anip resource");
        }
        if (Mod1.class.getResource("schema/nip/res.txt") != null) {
            System.out.println("OK nip resource");
        } else {
            System.out.println("KO nip resource");
        }
        if (Mod1.class.getClassLoader().getResource("fr/gaellalire/vestige_app/demo2/mod1/schema/nip/res.txt") != null) {
            System.out.println("NOMOD-OK nip encapsulation resource");
        } else {
            System.out.println("MOD-OK nip encapsulation resource");
        }

        // invalid package same module
        if (Mod1.class.getResource("/META-INF/res.txt") != null) {
            System.out.println("OK ivp resource");
        } else {
            System.out.println("KO ivp resource");
        }
        if (Mod1.class.getClassLoader().getResource("META-INF/res.txt") != null) {
            System.out.println("OK ivp encapsulation resource");
        } else {
            System.out.println("KO ivp encapsulation resource");
        }

        // empty package same module
        if (Mod1.class.getResource("/res.txt") != null) {
            System.out.println("OK eivp resource");
        } else {
            System.out.println("KO eivp resource");
        }
        if (Mod1.class.getClassLoader().getResource("res.txt") != null) {
            System.out.println("OK eivp encapsulation resource");
        } else {
            System.out.println("KO eivp encapsulation resource");
        }

        // invalid package other module
        if (Mod1.class.getResource("/META-INF/m2.txt") != null) {
            System.out.println("NOMOD-OK oivp resource");
        } else {
            System.out.println("MOD-OK oivp resource");
        }
        if (Mod1.class.getClassLoader().getResource("META-INF/m2.txt") != null) {
            System.out.println("ONE-OK oivp encapsulation resource");
        } else {
            System.out.println("MANY-OK oivp encapsulation resource");
        }

        // empty package other module
        if (Mod1.class.getResource("/m2.txt") != null) {
            System.out.println("NOMOD-OK eoivp resource");
        } else {
            System.out.println("MOD-OK eoivp resource");
        }
        if (Mod1.class.getClassLoader().getResource("m2.txt") != null) {
            System.out.println("ONE-OK eoivp encapsulation resource");
        } else {
            System.out.println("MANY-OK eoivp encapsulation resource");
        }

        // other encapsulated package
        if (Mod1.class.getResource("/fr/gaellalire/vestige_app/demo2/mod2/res.txt") != null) {
            System.out.println("NOMOD-OK oip resource");
        } else {
            System.out.println("MOD-OK oip resource");
        }
        if (Mod1.class.getClassLoader().getResource("fr/gaellalire/vestige_app/demo2/mod2/res.txt") != null) {
            System.out.println("NOMOD-OK oip encapsulation resource");
        } else {
            System.out.println("MOD-OK oip encapsulation resource");
        }

        if (Mod2.class.getResource("/fr/gaellalire/vestige_app/demo2/mod2/res.txt") != null) {
            System.out.println("NOMOD-OK oip2 resource");
        } else {
            System.out.println("MOD-OK oip2 resource");
        }
        if (Mod2.class.getClassLoader().getResource("fr/gaellalire/vestige_app/demo2/mod2/res.txt") != null) {
            System.out.println("NOMOD-OK oip2 encapsulation resource");
        } else {
            System.out.println("MOD-OK oip2 encapsulation resource");
        }

        // other encapsulated package .class
        if (Mod1.class.getResource("/fr/gaellalire/vestige_app/demo2/mod2/Mod2.class") != null) {
            System.out.println("NOMOD-OK coip resource");
        } else {
            System.out.println("MOD-OK coip resource");
        }
        if (Mod1.class.getClassLoader().getResource("fr/gaellalire/vestige_app/demo2/mod2/Mod2.class") != null) {
            System.out.println("ONE-OK coip encapsulation resource");
        } else {
            System.out.println("MANY-OK coip encapsulation resource");
        }

        if (Mod2.class.getResource("/fr/gaellalire/vestige_app/demo2/mod2/Mod2.class") != null) {
            System.out.println("OK coip2 resource");
        } else {
            System.out.println("KO coip2 resource");
        }
        if (Mod2.class.getClassLoader().getResource("fr/gaellalire/vestige_app/demo2/mod2/Mod2.class") != null) {
            System.out.println("OK coip2 encapsulation resource");
        } else {
            System.out.println("KO coip2 encapsulation resource");
        }

        // open package
        if (Mod1.class.getResource("/fr/gaellalire/vestige_app/demo2/mod2/op/res.txt") != null) {
            System.out.println("NOMOD-OK Ooip resource");
        } else {
            System.out.println("MOD-OK Ooip resource");
        }
        if (Mod1.class.getClassLoader().getResource("fr/gaellalire/vestige_app/demo2/mod2/op/res.txt") != null) {
            System.out.println("ONE-OK Ooip encapsulation resource");
        } else {
            System.out.println("MANY-OK Ooip encapsulation resource");
        }

        if (Mod2.class.getResource("/fr/gaellalire/vestige_app/demo2/mod2/op/res.txt") != null) {
            System.out.println("OK Ooip2 resource");
        } else {
            System.out.println("KO Ooip2 resource");
        }
        if (Mod2.class.getClassLoader().getResource("fr/gaellalire/vestige_app/demo2/mod2/op/res.txt") != null) {
            System.out.println("OK Ooip2 encapsulation resource");
        } else {
            System.out.println("KO Ooip2 encapsulation resource");
        }

        // private package
        try {

            Mod2.class.getClassLoader().loadClass("fr.gaellalire.vestige_app.demo2.mod2.priv.Common").getConstructor().newInstance();
            System.out.println("NOMOD-OK newinstance");
        } catch (Exception e) {
            System.out.println("MOD-OK newinstance");
        }

        try {
            ServiceLoader.load(MyAPI.class).iterator().next().print();
            System.out.println("OK service loader");
        } catch (Exception e) {
            System.out.println("KO service loader");
        }

        try {
            Package package1 = ObjectFactory.class.getPackage();
            System.out.println(package1);
            System.out.println(package1.getAnnotation(XmlSchema.class).namespace());
            JAXBContext jc = JAXBContext.newInstance(package1.getName());
            // Field declaredField = Class.forName("java.lang.NamedPackage").getDeclaredField("module");
            // declaredField.setAccessible(true);
            // System.out.println(declaredField.get(package1));
            System.out.println("OK JAXB IMPL " + jc.getClass().getName());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("KO JAXB IMPL");
        }

        XmlElementRef annotation = Mod1.class.getDeclaredField("object").getAnnotation(XmlElementRef.class);
        try {
            annotation.required();
            System.out.println("OK JAXB API");
        } catch (Throwable e) {
            System.out.println("KO JAXB API");
        }

        Mod2.print();
        Mod3.print();
        return null;
    }
}
