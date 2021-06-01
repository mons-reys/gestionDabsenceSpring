package com.ensah.core.bo;
/***********************************************************************
 * Module:  Filiere.java
 * Author:  Hp
 * Purpose: Defines the Class Filiere
 ***********************************************************************/

import java.util.*;

/** @pdOid 0c7465cd-4988-4c54-9647-a3bccfd16c22 */
public class Filiere {
   /** @pdOid 15c8c6d5-6e44-4ba3-abae-f5b94ce45409 */
   private String idFiliere;
   /** @pdOid 89d80bb7-111a-475b-9b1a-527697e391c2 */
   private String titreFiliere;
   /** @pdOid cd3a0bcd-bb81-4b95-8e0f-ddb93da55c55 */
   private String codeFiliere;
   /** @pdOid 1cde418d-4c78-49c1-acfa-3328edd2b6b4 */
   private int anneeaccreditation;
   /** @pdOid e320ec64-db92-4d35-a8da-0ccebd9f5c60 */
   private int anneeFinaccreditation;
   
   /** @pdRoleInfo migr=no name=Niveau assc=Association_3 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Niveau> niveaux;
   /** @pdRoleInfo migr=no name=Coordination assc=Association_18 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Coordination> periodeCoordination;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Niveau> getNiveaux() {
      if (niveaux == null)
         niveaux = new java.util.HashSet<Niveau>();
      return niveaux;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorNiveaux() {
      if (niveaux == null)
         niveaux = new java.util.HashSet<Niveau>();
      return niveaux.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newNiveaux */
   public void setNiveaux(java.util.Collection<Niveau> newNiveaux) {
      removeAllNiveaux();
      for (java.util.Iterator iter = newNiveaux.iterator(); iter.hasNext();)
         addNiveaux((Niveau)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newNiveau */
   public void addNiveaux(Niveau newNiveau) {
      if (newNiveau == null)
         return;
      if (this.niveaux == null)
         this.niveaux = new java.util.HashSet<Niveau>();
      if (!this.niveaux.contains(newNiveau))
      {
         this.niveaux.add(newNiveau);
         newNiveau.setFiliere(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldNiveau */
   public void removeNiveaux(Niveau oldNiveau) {
      if (oldNiveau == null)
         return;
      if (this.niveaux != null)
         if (this.niveaux.contains(oldNiveau))
         {
            this.niveaux.remove(oldNiveau);
            oldNiveau.setFiliere((Filiere)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllNiveaux() {
      if (niveaux != null)
      {
         Niveau oldNiveau;
         for (java.util.Iterator iter = getIteratorNiveaux(); iter.hasNext();)
         {
            oldNiveau = (Niveau)iter.next();
            iter.remove();
            oldNiveau.setFiliere((Filiere)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Coordination> getPeriodeCoordination() {
      if (periodeCoordination == null)
         periodeCoordination = new java.util.HashSet<Coordination>();
      return periodeCoordination;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorPeriodeCoordination() {
      if (periodeCoordination == null)
         periodeCoordination = new java.util.HashSet<Coordination>();
      return periodeCoordination.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newPeriodeCoordination */
   public void setPeriodeCoordination(java.util.Collection<Coordination> newPeriodeCoordination) {
      removeAllPeriodeCoordination();
      for (java.util.Iterator iter = newPeriodeCoordination.iterator(); iter.hasNext();)
         addPeriodeCoordination((Coordination)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCoordination */
   public void addPeriodeCoordination(Coordination newCoordination) {
      if (newCoordination == null)
         return;
      if (this.periodeCoordination == null)
         this.periodeCoordination = new java.util.HashSet<Coordination>();
      if (!this.periodeCoordination.contains(newCoordination))
         this.periodeCoordination.add(newCoordination);
   }
   
   /** @pdGenerated default remove
     * @param oldCoordination */
   public void removePeriodeCoordination(Coordination oldCoordination) {
      if (oldCoordination == null)
         return;
      if (this.periodeCoordination != null)
         if (this.periodeCoordination.contains(oldCoordination))
            this.periodeCoordination.remove(oldCoordination);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllPeriodeCoordination() {
      if (periodeCoordination != null)
         periodeCoordination.clear();
   }

}