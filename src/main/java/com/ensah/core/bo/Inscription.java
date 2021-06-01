package com.ensah.core.bo; /***********************************************************************
 * Module:  Inscription.java
 * Author:  Hp
 * Purpose: Defines the Class Inscription
 ***********************************************************************/


public class Inscription {
   private int idInscription;
   private int annee;
   private int etat;

   public Niveau inscriptions;
   public Etudiant etudiant;
   public java.util.Collection<Absence> absences;


   public Niveau getInscriptions() {
      return inscriptions;
   }


   public void setInscriptions(Niveau newNiveau) {
      if (this.inscriptions == null || !this.inscriptions.equals(newNiveau))
      {
         if (this.inscriptions != null)
         {
            Niveau oldNiveau = this.inscriptions;
            this.inscriptions = null;
            oldNiveau.removeNiveau(this);
         }
         if (newNiveau != null)
         {
            this.inscriptions = newNiveau;
            this.inscriptions.addNiveau(this);
         }
      }
   }
   public Etudiant getEtudiant() {
      return etudiant;
   }

   public void setEtudiant(Etudiant newEtudiant) {
      if (this.etudiant == null || !this.etudiant.equals(newEtudiant))
      {
         if (this.etudiant != null)
         {
            Etudiant oldEtudiant = this.etudiant;
            this.etudiant = null;
            oldEtudiant.removeInscriptions(this);
         }
         if (newEtudiant != null)
         {
            this.etudiant = newEtudiant;
            this.etudiant.addInscriptions(this);
         }
      }
   }

   public java.util.Collection<Absence> getAbsences() {
      if (absences == null)
         absences = new java.util.HashSet<Absence>();
      return absences;
   }

   public java.util.Iterator getIteratorAbsences() {
      if (absences == null)
         absences = new java.util.HashSet<Absence>();
      return absences.iterator();
   }


   public void setAbsences(java.util.Collection<Absence> newAbsences) {
      removeAllAbsences();
      for (java.util.Iterator iter = newAbsences.iterator(); iter.hasNext();)
         addAbsences((Absence)iter.next());
   }

   public void addAbsences(Absence newAbsence) {
      if (newAbsence == null)
         return;
      if (this.absences == null)
         this.absences = new java.util.HashSet<Absence>();
      if (!this.absences.contains(newAbsence))
      {
         this.absences.add(newAbsence);
         newAbsence.setInscription(this);
      }
   }

   public void removeAbsences(Absence oldAbsence) {
      if (oldAbsence == null)
         return;
      if (this.absences != null)
         if (this.absences.contains(oldAbsence))
         {
            this.absences.remove(oldAbsence);
            oldAbsence.setInscription((Inscription)null);
         }
   }

   public void removeAllAbsences() {
      if (absences != null)
      {
         Absence oldAbsence;
         for (java.util.Iterator iter = getIteratorAbsences(); iter.hasNext();)
         {
            oldAbsence = (Absence)iter.next();
            iter.remove();
            oldAbsence.setInscription((Inscription)null);
         }
      }
   }

}
