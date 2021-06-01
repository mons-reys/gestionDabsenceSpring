package com.ensah.core.bo; /***********************************************************************
 * Module:  PieceJustificative.java
 * Author:  Hp
 * Purpose: Defines the Class PieceJustificative
 ***********************************************************************/

public class PieceJustificative {
   private int idPieceJustificative;
   private String cheminFichier;
   private String intitule;
   private java.util.Date dateLivraison;
   private int etat;
   private String source;
   public java.util.Collection<Absence> absence;


   public java.util.Collection<Absence> getAbsence() {
      if (absence == null)
         absence = new java.util.HashSet<Absence>();
      return absence;
   }

   public java.util.Iterator getIteratorAbsence() {
      if (absence == null)
         absence = new java.util.HashSet<Absence>();
      return absence.iterator();
   }

   public void setAbsence(java.util.Collection<Absence> newAbsence) {
      removeAllAbsence();
      for (java.util.Iterator iter = newAbsence.iterator(); iter.hasNext();)
         addAbsence((Absence)iter.next());
   }

   public void addAbsence(Absence newAbsence) {
      if (newAbsence == null)
         return;
      if (this.absence == null)
         this.absence = new java.util.HashSet<Absence>();
      if (!this.absence.contains(newAbsence))
      {
         this.absence.add(newAbsence);
         newAbsence.addPieceJustificative(this);
      }
   }

   public void removeAbsence(Absence oldAbsence) {
      if (oldAbsence == null)
         return;
      if (this.absence != null)
         if (this.absence.contains(oldAbsence))
         {
            this.absence.remove(oldAbsence);
            oldAbsence.removePieceJustificative(this);
         }
   }

   public void removeAllAbsence() {
      if (absence != null)
      {
         Absence oldAbsence;
         for (java.util.Iterator iter = getIteratorAbsence(); iter.hasNext();)
         {
            oldAbsence = (Absence)iter.next();
            iter.remove();
            oldAbsence.removePieceJustificative(this);
         }
      }
   }

}
