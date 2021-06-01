package com.ensah.core.bo; /***********************************************************************
 * Module:  Filiere.java
 * Author:  Hp
 * Purpose: Defines the Class Filiere
 ***********************************************************************/

public class Filiere {
   private String idFiliere;
   private String titreFiliere;
   private String codeFiliere;
   private int anneeaccreditation;
   private int anneeFinaccreditation;

   public java.util.Collection<Niveau> niveaux;
   public java.util.Collection<Coordination> periodeCoordination;


   public java.util.Collection<Niveau> getNiveaux() {
      if (niveaux == null)
         niveaux = new java.util.HashSet<Niveau>();
      return niveaux;
   }

   public java.util.Iterator getIteratorNiveaux() {
      if (niveaux == null)
         niveaux = new java.util.HashSet<Niveau>();
      return niveaux.iterator();
   }


   public void setNiveaux(java.util.Collection<Niveau> newNiveaux) {
      removeAllNiveaux();
      for (java.util.Iterator iter = newNiveaux.iterator(); iter.hasNext();)
         addNiveaux((Niveau)iter.next());
   }

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
   public java.util.Collection<Coordination> getPeriodeCoordination() {
      if (periodeCoordination == null)
         periodeCoordination = new java.util.HashSet<Coordination>();
      return periodeCoordination;
   }

   public java.util.Iterator getIteratorPeriodeCoordination() {
      if (periodeCoordination == null)
         periodeCoordination = new java.util.HashSet<Coordination>();
      return periodeCoordination.iterator();
   }

   public void setPeriodeCoordination(java.util.Collection<Coordination> newPeriodeCoordination) {
       removeAllPeriodeCoordination();
       for (java.util.Iterator iter = newPeriodeCoordination.iterator(); iter.hasNext(); )
           addPeriodeCoordination((Coordination) iter.next());
   }
       public void addPeriodeCoordination(Coordination newCoordination) {
      if (newCoordination == null)
         return;
      if (this.periodeCoordination == null)
         this.periodeCoordination = new java.util.HashSet<Coordination>();
      if (!this.periodeCoordination.contains(newCoordination))
         this.periodeCoordination.add(newCoordination);
   }

   public void removePeriodeCoordination(Coordination oldCoordination) {
      if (oldCoordination == null)
         return;
      if (this.periodeCoordination != null)
         if (this.periodeCoordination.contains(oldCoordination))
            this.periodeCoordination.remove(oldCoordination);
   }

   public void removeAllPeriodeCoordination() {
      if (periodeCoordination != null)
         periodeCoordination.clear();
   }

}
