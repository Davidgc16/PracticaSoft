public class Jarra {//variables de instancia
private int cantidad;
private int capacidad;
public Jarra(int capacidadInicial){
if(capacidadInicial<=0){
throw new RuntimeException("ERROR: no se pueden crear jarras " +"con capacidad menor o igual que cero.");
}
this.capacidad=capacidadInicial;
}

// Aquí vendrán después los métodos creados en la siguiente fase
public void metodoComunitario(){
// Comentario incluido para pruebas
<<<<<<< HEAD
System.out.println("Antonio García Cabriada, David Gerena Comino");

>>>>>>> e18aeb20c4bd19be4e6ed37ac4ad878bd8022bae
}

public void llenaDesde(Jarra j){
while((this.cantidad<this.capacidad)&&(j.cantidad>0)){
this.cantidad++;
j.cantidad--;
}
}
public String toString(){
return ("("+this.capacidad+","+this.cantidad+")");
}

public bool llena(){
return this.cantidad=this.capacidad;
}
public bool vacia(){
return this.cantidad=0;
}
}

public int capacidad(){
return this.capacidad;
}
public int cantidad(){
return this.cantidad;
}



}
