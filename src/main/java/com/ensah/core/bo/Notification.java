package com.ensah.core.bo; /***********************************************************************
 * Module:  Notification.java
 * Author:  Hp
 * Purpose: Defines the Class Notification
 ***********************************************************************/

public class Notification {
   private int idNotification;
   private String type;
   private String titre;
   private String texte;
   private java.util.Date dateCreation;
   private int etat;

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
            oldCompte.removeNotifications(this);
         }
         if (newCompte != null)
         {
            this.compte = newCompte;
            this.compte.addNotifications(this);
         }
      }
   }

}
