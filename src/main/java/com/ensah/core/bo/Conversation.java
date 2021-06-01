package com.ensah.core.bo; /***********************************************************************
 * Module:  Conversation.java
 * Author:  Hp
 * Purpose: Defines the Class Conversation
 ***********************************************************************/

public class Conversation {
   private int idConversation;
   private String type;
   private String titre;
   private int etat;

   public java.util.Collection<Compte> participant;
   public java.util.Collection<Message> messages;
   public Compte createurConversation;


   public java.util.Collection<Compte> getParticipant() {
      if (participant == null)
         participant = new java.util.HashSet<Compte>();
      return participant;
   }

   public java.util.Iterator getIteratorParticipant() {
      if (participant == null)
         participant = new java.util.HashSet<Compte>();
      return participant.iterator();
   }


   public void setParticipant(java.util.Collection<Compte> newParticipant) {
      removeAllParticipant();
      for (java.util.Iterator iter = newParticipant.iterator(); iter.hasNext();)
         addParticipant((Compte)iter.next());
   }

   public void addParticipant(Compte newCompte) {
      if (newCompte == null)
         return;
      if (this.participant == null)
         this.participant = new java.util.HashSet<Compte>();
      if (!this.participant.contains(newCompte))
      {
         this.participant.add(newCompte);
         newCompte.addConversationReçues(this);
      }
   }

   public void removeParticipant(Compte oldCompte) {
      if (oldCompte == null)
         return;
      if (this.participant != null)
         if (this.participant.contains(oldCompte))
         {
            this.participant.remove(oldCompte);
            oldCompte.removeConversationReçues(this);
         }
   }

   public void removeAllParticipant() {
      if (participant != null)
      {
         Compte oldCompte;
         for (java.util.Iterator iter = getIteratorParticipant(); iter.hasNext();)
         {
            oldCompte = (Compte)iter.next();
            iter.remove();
            oldCompte.removeConversationReçues(this);
         }
      }
   }
   public java.util.Collection<Message> getMessages() {
      if (messages == null)
         messages = new java.util.HashSet<Message>();
      return messages;
   }

   public java.util.Iterator getIteratorMessages() {
      if (messages == null)
         messages = new java.util.HashSet<Message>();
      return messages.iterator();
   }

   public void setMessages(java.util.Collection<Message> newMessages) {
      removeAllMessages();
      for (java.util.Iterator iter = newMessages.iterator(); iter.hasNext();)
         addMessages((Message)iter.next());
   }

   public void addMessages(Message newMessage) {
      if (newMessage == null)
         return;
      if (this.messages == null)
         this.messages = new java.util.HashSet<Message>();
      if (!this.messages.contains(newMessage))
      {
         this.messages.add(newMessage);
         newMessage.setConversation(this);
      }
   }


   public void removeMessages(Message oldMessage) {
      if (oldMessage == null)
         return;
      if (this.messages != null)
         if (this.messages.contains(oldMessage))
         {
            this.messages.remove(oldMessage);
            oldMessage.setConversation((Conversation)null);
         }
   }

   public void removeAllMessages() {
      if (messages != null)
      {
         Message oldMessage;
         for (java.util.Iterator iter = getIteratorMessages(); iter.hasNext();)
         {
            oldMessage = (Message)iter.next();
            iter.remove();
            oldMessage.setConversation((Conversation)null);
         }
      }
   }

   public Compte getCreateurConversation() {
      return createurConversation;
   }

   public void setCreateurConversation(Compte newCompte) {
      if (this.createurConversation == null || !this.createurConversation.equals(newCompte))
      {
         if (this.createurConversation != null)
         {
            Compte oldCompte = this.createurConversation;
            this.createurConversation = null;
            oldCompte.removeConversationsCrees(this);
         }
         if (newCompte != null)
         {
            this.createurConversation = newCompte;
            this.createurConversation.addConversationsCrees(this);
         }
      }
   }

}
