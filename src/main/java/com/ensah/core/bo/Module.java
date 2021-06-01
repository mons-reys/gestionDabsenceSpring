package com.ensah.core.bo;
/***********************************************************************
 * Module:  Module.java
 * Author:  Hp
 * Purpose: Defines the Class Module
 ***********************************************************************/

import java.util.*;

/** @pdOid baaba2ad-27e6-445f-bd25-b0d162f3c4f9 */
public class Module {
   /** @pdOid 9c3c39fb-fd6d-43a1-a6df-28bcb6d40c01 */
   private int idModule;
   /** @pdOid 1f0fbad3-0fa9-40e8-b5da-44c6774f562d */
   private String titre;
   /** @pdOid 92487099-b9cc-4a1d-b546-95dba4f62efe */
   private String code;
   
   /** @pdRoleInfo migr=no name=Matiere assc=Association_4 coll=java.util.Collection impl=java.util.HashSet mult=1..* side=A */
   public java.util.Collection<Matiere> matieres;
   /** @pdRoleInfo migr=no name=Niveau assc=Association_5 coll=java.util.Collection impl=java.util.HashSet mult=1..1 side=A */
   public Niveau niveau;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Matiere> getMatieres() {
      if (matieres == null)
         matieres = new java.util.HashSet<Matiere>();
      return matieres;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMatieres() {
      if (matieres == null)
         matieres = new java.util.HashSet<Matiere>();
      return matieres.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMatieres */
   public void setMatieres(java.util.Collection<Matiere> newMatieres) {
      removeAllMatieres();
      for (java.util.Iterator iter = newMatieres.iterator(); iter.hasNext();)
         addMatieres((Matiere)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMatiere */
   public void addMatieres(Matiere newMatiere) {
      if (newMatiere == null)
         return;
      if (this.matieres == null)
         this.matieres = new java.util.HashSet<Matiere>();
      if (!this.matieres.contains(newMatiere))
      {
         this.matieres.add(newMatiere);
         newMatiere.setModule(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldMatiere */
   public void removeMatieres(Matiere oldMatiere) {
      if (oldMatiere == null)
         return;
      if (this.matieres != null)
         if (this.matieres.contains(oldMatiere))
         {
            this.matieres.remove(oldMatiere);
            oldMatiere.setModule((Module)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMatieres() {
      if (matieres != null)
      {
         Matiere oldMatiere;
         for (java.util.Iterator iter = getIteratorMatieres(); iter.hasNext();)
         {
            oldMatiere = (Matiere)iter.next();
            iter.remove();
            oldMatiere.setModule((Module)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Niveau getNiveau() {
      return niveau;
   }
   
   /** @pdGenerated default parent setter
     * @param newNiveau */
   public void setNiveau(Niveau newNiveau) {
      if (this.niveau == null || !this.niveau.equals(newNiveau))
      {
         if (this.niveau != null)
         {
            Niveau oldNiveau = this.niveau;
            this.niveau = null;
            oldNiveau.removeModules(this);
         }
         if (newNiveau != null)
         {
            this.niveau = newNiveau;
            this.niveau.addModules(this);
         }
      }
   }

}