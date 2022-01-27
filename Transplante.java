public class Transplante{

  private String Nombre[];
  private int Disponibles[];

  Transplante(String Nombre[],int Disponibles[]){
    this.Nombre = Nombre;
    this.Disponibles = Disponibles;
  }

  public void getnombre(){
    for(int i=0;i<Nombre.length;i++){
      System.out.println("" + Nombre[i]);
    } 
  }

  public String setnombre(String nombre){
    for(int i=0;i<Nombre.length;i++){
      Nombre[i] = nombre;
    } 
    return nombre;
  }
  
   public int setDisp(){
    for(int i=0;i<Disponibles.length;i++){
      Disponibles[i] = 0;
      
    } 
    return 0;
  }

  public void getdisp(){
    for(int i=0;i<Disponibles.length;i++){
      System.out.println("" + Disponibles[i]);
    }
  }
}