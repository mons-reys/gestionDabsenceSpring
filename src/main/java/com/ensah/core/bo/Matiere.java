package com.ensah.core.bo;
/***********************************************************************
 * Module:  Matiere.java
 * Author:  Hp
 * Purpose: Defines the Class Matiere
 ***********************************************************************/

import java.util.*;

/** @pdOid ee2e6aba-eed4-4d80-a523-eab9b8a218f0 */
public class Matiere {
   /** @pdOid 2365727d-1b57-4436-bf7a-3885fbdcdcf1 */
   private int idMatiere;
   /** @pdOid 2c58f6c4-2b8c-43af-8233-ebdb85cdde7f */
   private String nom;
   /** @pdOid a96155a5-d87a-4d47-a9d2-e810a5e82538 */
   private String code;
   
   /** @pdRoleInfo migr=no name=Module assc=Association_4 coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public Module module;
   
   
   /** @pdGenerated default parent getter */
   public Module getModule() {
      return module;
   }
   
   /** @pdGenerated default parent setter
     * @param newModule */
   public void setModule(Module newModule) {
      if (this.module == null || !this.module.equals(newModule))
      {
         if (this.module != null)
         {
            Module oldModule = this.module;
            this.module = null;
            oldModule.removeMatieres(this);
         }
         if (newModule != null)
         {
            this.module = newModule;
            this.module.addMatieres(this);
         }
      }
   }

}