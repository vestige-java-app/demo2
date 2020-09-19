module fr.gaellalire.vestige_app.demo2.mod2
{
        
   exports fr.gaellalire.vestige_app.demo2.mod2;
   
   opens fr.gaellalire.vestige_app.demo2.mod2.op;

   provides fr.gaellalire.vestige_app.demo2.mod2.MyAPI
      with fr.gaellalire.vestige_app.demo2.mod2.priv.MyImpl;

}
