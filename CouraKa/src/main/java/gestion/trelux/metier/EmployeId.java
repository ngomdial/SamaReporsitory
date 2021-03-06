package gestion.trelux.metier;
// Generated 24 mai 2018 11:55:21 by Hibernate Tools 4.3.1



/**
 * EmployeId generated by hbm2java
 */
public class EmployeId  implements java.io.Serializable {


     private String idpersonne;
     private String type;

    public EmployeId() {
    }

    public EmployeId(String idpersonne, String type) {
       this.idpersonne = idpersonne;
       this.type = type;
    }
   
    public String getIdpersonne() {
        return this.idpersonne;
    }
    
    public void setIdpersonne(String idpersonne) {
        this.idpersonne = idpersonne;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EmployeId) ) return false;
		 EmployeId castOther = ( EmployeId ) other; 
         
		 return ( (this.getIdpersonne()==castOther.getIdpersonne()) || ( this.getIdpersonne()!=null && castOther.getIdpersonne()!=null && this.getIdpersonne().equals(castOther.getIdpersonne()) ) )
 && ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdpersonne() == null ? 0 : this.getIdpersonne().hashCode() );
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         return result;
   }   


}


