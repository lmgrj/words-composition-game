

public class Dialog3 {
	  private String nom, age;

	  public Dialog3(){}
	  public Dialog3(String nom, String age){
	    this.nom = nom;
	    this.age = age;
	    
	  }

	  public String toString(){
	    String str;
	    if(this.nom != null  && this.age != null ){
	      str = "Description de l'objet Dialog";
	      str += "Nom : " + this.nom + "\n";
	      str += "Age : " + this.age + "\n";
	      
	    }
	    else{
	      str = "Aucune information !";
	    }
	    return str;
	  }
	
	  public String getAge() {
			return this.age;
		}
	  public String getName() {
			return this.nom;
		}
	  
	}

