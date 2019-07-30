public  classPersona{
    private String cedula;
    private String nombre;
    private String apellido;
    private float altura;
                    
    public Persona(string cedula,String nombre,String apellido,float altura){
                    
              this.cedula=cedula;
              this.nombre=nombre;
              this.apellido=apellido;  
              this.altura=altura;
   }
   public void setCedula(String cedula){
              cedula=cedula;}
   public String getCedula(){
              return cedula;
   } 
   
   public void setNombre(String nombre){
              nombre=nombre;}
   public String getnombre(){
              return nombre;
   }   
   
   public void setApellido(String Apellido){
              apellido=apellido;}

   public String getapellido(){
              return apellido;

   } 
  
   public void setAltura(String altura){
              altura=altura;}
   public String getaltura(){
              return altura;
   }  
              
   public void imprimir(){
   System.out.println(getCedula());
  }
}