package lego;

public class Boite {
   private static int  number;
   private static String name;
   private static int pieces;
   private int figurines;
   
   public Boite(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	    
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

  

public Boite(int pieces) {
	super();
	this.pieces = pieces;
}

public int getPieces() {
	return pieces;
}

public void setPieces(int pieces) {
	this.pieces = pieces;
}

public int getFigurines() {
	return figurines;
}

public void setFigurines(int figurines) {
	this.figurines = figurines;
}
  
@Override
public String toString() {
	return "LEGO3" + number + "-" + name;
}
   
}
