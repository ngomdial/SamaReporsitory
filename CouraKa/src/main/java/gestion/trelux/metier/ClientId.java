package gestion.trelux.metier;
// Generated 24 mai 2018 11:55:21 by Hibernate Tools 4.3.1



/**
 * ClientId generated by hbm2java
 */
public class ClientId  implements java.io.Serializable {


     private String idpersonne;
     private String codeclient;

    public ClientId() {
    }

    public ClientId(String idpersonne, String codeclient) {
       this.idpersonne = idpersonne;
       this.codeclient = codeclient;
    }
   
    public String getIdpersonne() {
        return this.idpersonne;
    }
    
    public void setIdpersonne(String idpersonne) {
        this.idpersonne = idpersonne;
    }
    public String getCodeclient() {
        return this.codeclient;
    }
    
    public void setCodeclient(String codeclient) {
        this.codeclient = codeclient;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ClientId) ) return false;
		 ClientId castOther = ( ClientId ) other; 
         
		 return ( (this.getIdpersonne()==castOther.getIdpersonne()) || ( this.getIdpersonne()!=null && castOther.getIdpersonne()!=null && this.getIdpersonne().equals(castOther.getIdpersonne()) ) )
 && ( (this.getCodeclient()==castOther.getCodeclient()) || ( this.getCodeclient()!=null && castOther.getCodeclient()!=null && this.getCodeclient().equals(castOther.getCodeclient()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdpersonne() == null ? 0 : this.getIdpersonne().hashCode() );
         result = 37 * result + ( getCodeclient() == null ? 0 : this.getCodeclient().hashCode() );
         return result;
   }   


}


