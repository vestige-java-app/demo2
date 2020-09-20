package fr.gaellalire.vestige_app.demo2.mod2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import fr.gaellalire.vestige_app.demo2.mod2.priv.Common;

public class Mod2
{
	
   private static final Logger LOGGER = LoggerFactory.getLogger(Mod2.class);

   public static void print()
   {
      MDC.put("mdc", "OK");
      LOGGER.info("module slf4j test OK");
      Common.print();
      MDC.clear();
   }

}
