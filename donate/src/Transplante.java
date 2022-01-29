package donate.src;


import java.util.Scanner;


public class Transplante{
  private String Nombre;
  private int disponibles;
  private int corneas;
  private int corazones;
  private int donaciones;
  private int drecibidas;

public Transplante(){

  }


public void setcorazones(){
  corazones +=1;
}

public int getcorazones(){
  return corazones;
}


public void setcorneas(){
  corneas +=1;
}

public int getcorneas(){
  return corneas;
}

public void setrecibidas(){
  drecibidas +=1;
}

public int getrecibidas(){
  return drecibidas;
}

public void setdonaciones(){
  donaciones +=1;
}

public int getdonaciones(){
  return donaciones;
}



public void leerdatos(){
  Scanner scan = new Scanner(System.in);

  System.out.println("Ingrese el nombre del Transplante:");
  Nombre = scan.nextLine();

}


public void setdisp(){
  disponibles +=1;

}


public void setdispm(){
disponibles -=1;
}



}