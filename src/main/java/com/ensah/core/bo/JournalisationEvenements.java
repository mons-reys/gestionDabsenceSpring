package com.ensah.core.bo; /***********************************************************************
 * Module:  JournalisationEvenements.java
 * Author:  Hp
 * Purpose: Defines the Class JournalisationEvenements
 ***********************************************************************/

public class JournalisationEvenements {
   private int idEvenement;
   private String details;
   private String adresseIP;
   private java.util.Date DateHeure;
   private String typeEvenement;
   private String criticite;

   public Compte compte;


   public Compte getCompte() {
      return compte;
   }


   public void setCompte(Compte newCompte) {
      if (this.compte == null || !this.compte.equals(newCompte))
      {
         if (this.compte != null)
         {
            Compte oldCompte = this.compte;
            this.compte = null;
            oldCompte.removeEvenements(this);
         }
         if (newCompte != null)
         {
            this.compte = newCompte;
            this.compte.addEvenements(this);
         }
      }
   }

}
