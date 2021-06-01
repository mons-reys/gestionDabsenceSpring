package com.ensah.core.bo; /***********************************************************************
 * Module:  TypeSeance.java
 * Author:  Hp
 * Purpose: Defines the Class TypeSeance
 ***********************************************************************/

public class TypeSeance {
   private int idTypeSeance;
   private String intitule;
   private String alias;

   public java.util.Collection<Absence> absences;


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
         newAbsence.setTypeSeance(this);
      }
   }

   public void removeAbsences(Absence oldAbsence) {
      if (oldAbsence == null)
         return;
      if (this.absences != null)
         if (this.absences.contains(oldAbsence))
         {
            this.absences.remove(oldAbsence);
            oldAbsence.setTypeSeance((TypeSeance)null);
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
            oldAbsence.setTypeSeance((TypeSeance)null);
         }
      }
   }

}
