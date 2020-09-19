module fr.gaellalire.vestige_app.demo2.mod1
{
        
   exports fr.gaellalire.vestige_app.demo2.mod1;

   requires fr.gaellalire.vestige_app.demo2.mod2;

   requires fr.gaellalire.vestige_app.demo2.mod3;

   requires fr.gaellalire.vestige.core;

   requires java.xml.bind;

   uses fr.gaellalire.vestige_app.demo2.mod2.MyAPI;

   opens fr.gaellalire.vestige_app.demo2.mod1.schema to java.xml.bind;

}
