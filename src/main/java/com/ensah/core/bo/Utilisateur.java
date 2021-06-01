package com.ensah.core.bo; /***********************************************************************
 * Module:  Utilisateur.java
 * Author:  Hp
 * Purpose: Defines the Class Utilisateur
 ***********************************************************************/

public class Utilisateur {
   private int idUtilisateur;
   private String nom;
   private String prenom;
   private String cin;
   private String email;
   private String telephone;
   private String nomArabe;
   private String prenomArabe;
   private String photo;

   public java.util.Collection<Compte> comptes;


   public java.util.Collection<Compte> getComptes() {
      if (comptes == null)
         comptes = new java.util.HashSet<Compte>();
      return comptes;
   }

   public java.util.Iterator getIteratorComptes() {
      if (comptes == null)
         comptes = new java.util.HashSet<Compte>();
      return comptes.iterator();
   }

   public void setComptes(java.util.Collection<Compte> newComptes) {
      removeAllComptes();
      for (java.util.Iterator iter = newComptes.iterator(); iter.hasNext();)
         addComptes((Compte)iter.next());
   }

   public void addComptes(Compte newCompte) {
      if (newCompte == null)
         return;
      if (this.comptes == null)
         this.comptes = new java.util.HashSet<Compte>();
      if (!this.comptes.contains(newCompte))
      {
         this.comptes.add(newCompte);
         newCompte.setProprietaire(this);
      }
   }

   public void removeComptes(Compte oldCompte) {
      if (oldCompte == null)
         return;
      if (this.comptes != null)
         if (this.comptes.contains(oldCompte))
         {
            this.comptes.remove(oldCompte);
            oldCompte.setProprietaire((Utilisateur)null);
         }
   }

   public void removeAllComptes() {
      if (comptes != null)
      {
         Compte oldCompte;
         for (java.util.Iterator iter = getIteratorComptes(); iter.hasNext();)
         {
            oldCompte = (Compte)iter.next();
            iter.remove();
            oldCompte.setProprietaire((Utilisateur)null);
         }
      }
   }

}
