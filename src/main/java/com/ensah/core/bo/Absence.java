package com.ensah.core.bo; /***********************************************************************
 * Module:  Absence.java
 * Author:  Hp
 * Purpose: Defines the Class Absence
 ***********************************************************************/

public class Absence {
   private int idAbsence;
   private java.util.Date dateHeureDebutAbsence;
   private java.util.Date dateHeureFinAbsence;
   private int etat;

   private String typeSaisie;

   public java.util.Collection<PieceJustificative> pieceJustificative;
   public Inscription inscription;
   public TypeSeance typeSeance;
   public Enseignant observateur;

   Enseignant enseignant = new Enseignant();


   public java.util.Collection<PieceJustificative> getPieceJustificative() {
      if (pieceJustificative == null)
         pieceJustificative = new java.util.HashSet<PieceJustificative>();
      return pieceJustificative;
   }

   public java.util.Iterator getIteratorPieceJustificative() {
      if (pieceJustificative == null)
         pieceJustificative = new java.util.HashSet<PieceJustificative>();
      return pieceJustificative.iterator();
   }

   public void setPieceJustificative(java.util.Collection<PieceJustificative> newPieceJustificative) {
      removeAllPieceJustificative();
      for (java.util.Iterator iter = newPieceJustificative.iterator(); iter.hasNext();)
         addPieceJustificative((PieceJustificative)iter.next());
   }

   public void addPieceJustificative(PieceJustificative newPieceJustificative) {
      if (newPieceJustificative == null)
         return;
      if (this.pieceJustificative == null)
         this.pieceJustificative = new java.util.HashSet<PieceJustificative>();
      if (!this.pieceJustificative.contains(newPieceJustificative))
      {
         this.pieceJustificative.add(newPieceJustificative);
         newPieceJustificative.addAbsence(this);
      }
   }

   public void removePieceJustificative(PieceJustificative oldPieceJustificative) {
      if (oldPieceJustificative == null)
         return;
      if (this.pieceJustificative != null)
         if (this.pieceJustificative.contains(oldPieceJustificative))
         {
            this.pieceJustificative.remove(oldPieceJustificative);
            oldPieceJustificative.removeAbsence(this);
         }
   }

   public void removeAllPieceJustificative() {
      if (pieceJustificative != null)
      {
         PieceJustificative oldPieceJustificative;
         for (java.util.Iterator iter = getIteratorPieceJustificative(); iter.hasNext();)
         {
            oldPieceJustificative = (PieceJustificative)iter.next();
            iter.remove();
            oldPieceJustificative.removeAbsence(this);
         }
      }
   }
   public Inscription getInscription() {
      return inscription;
   }

   public void setInscription(Inscription newInscription) {
      if (this.inscription == null || !this.inscription.equals(newInscription))
      {
         if (this.inscription != null)
         {
            Inscription oldInscription = this.inscription;
            this.inscription = null;
            oldInscription.removeAbsences(this);
         }
         if (newInscription != null)
         {
            this.inscription = newInscription;
            this.inscription.addAbsences(this);
         }
      }
   }

   public TypeSeance getTypeSeance() {
      return typeSeance;
   }


   public void setTypeSeance(TypeSeance newTypeSeance) {
      if (this.typeSeance == null || !this.typeSeance.equals(newTypeSeance))
      {
         if (this.typeSeance != null)
         {
            TypeSeance oldTypeSeance = this.typeSeance;
            this.typeSeance = null;
            oldTypeSeance.removeAbsences(this);
         }
         if (newTypeSeance != null)
         {
            this.typeSeance = newTypeSeance;
            this.typeSeance.addAbsences(this);
         }
      }
   }

   public Enseignant getObservateur() {
      return observateur;
   }


   public void setObservateur(Enseignant newEnseignant) {
      if (this.observateur == null || !this.observateur.equals(newEnseignant))
      {
         if (this.observateur != null)
         {
            Enseignant oldEnseignant = this.observateur;
            this.observateur = null;
            oldEnseignant.removeAbsencesMarquees(this);
         }
         if (newEnseignant != null)
         {
            this.observateur = newEnseignant;
            this.observateur.addAbsencesMarquees(this);
         }
      }
   }

}
