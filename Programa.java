import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

public class Programa{

	public static void displayVacio(int n,int m){
		for (int i=0;i<n;i++) 
		{
			for (int j=0;j<m;j++)
			{
				System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void imprimirDisplay(int n,int m){
		String simbolo = Math.random()>5?"*":" ";
		for (int i=0;i<n;i++) 
		{
			if(i+1==n)
			{
				simbolo = "#";

			}
			for (int j=0;j<m;j++)
			{
				System.out.print(i+simbolo);
			}
			System.out.println();
		}
	}

	public static void borrarDisplay(int n){
		//Se le suma 1 si se ejecuta con el bat, ya que la ultima linea es el pause
		//for (int i=0;i<=n;i++){
			//System.out.println(ansi().cursorUpLine(i));
		//}
		System.out.println(ansi().cursor(2,1));
		displayVacio(5,6);
		System.out.println(ansi().cursor(1,1));
		System.out.println(ansi().reset());
	}

	public static void animar() throws InterruptedException{
		

		Thread.sleep(1000);
		
/*
		for(int i=0;i<10;i++){
			System.out.print("\r");
			//System.out.print("\r");
			texto = texto+nuevo.charAt(i);
			System.out.print(texto);
			Thread.sleep(1000);
		}*/
	}

	public static void imprimir(String cadena)
	{
		System.out.println(cadena);
	}

	public static void main(String[] args) {
		AnsiConsole.systemInstall();
		Audio audio = new Audio();
		int centinela = 0;	

		String [] canciones = ConsoleFile.read("recursos/letras.csv");
		String [][] info_canciones = ConsoleData.dataList(canciones);
		//imprimir(""+canciones[0]);

		try{
			//Consolas con vt100 http://braun-home.net/michael/info/misc/VT100_commands.htm
			//System.out.println("Hallo \033[32mgreen\033[0m-text.");
			//System.out.println(ansi().eraseScreen().render("@|red Hello|@ @|green World|@"));
			//System.out.println( ansi().fg(RED).a("Hello").newline().fg(GREEN).a(" World").reset() );
			//System.out.println("\007");
			
			/*imprimirDisplay(4,16);
			Thread.sleep(1000);
			borrarDisplay(4);
			imprimirDisplay(4,16);*/


			do{
				System.out.println("Ingrese una opcion asi:");
				System.out.println("1. Buscar canci\u00F3n");
				System.out.println("2. Reproducir canci\u00F3n");
				System.out.println("3. Activar Letra");
				System.out.println("4. Detener Canci\u00F3n");
				System.out.println("5. Imprimir lista de Canciones");
				System.out.println("6. Salir");

				if(centinela == 2)
				{
					//TODO:Seleccionar el archivo que se va a reproducir
					//TODO:Crear funcion, para cambiar de cancion, pasando el titulo de la canción
					//6 posiblemente es la columna de la ruta de la cancion
					//audio.seleccionarCancion(info_canciones[0][6]);
					audio.reproducir();
				}

				if(centinela == 4)
				{
					audio.detener();
				}
				if(centinela==5)
				{
					/* La informacion de las canciones esta
					en la matriz info_canciones, acá un ejemplo de como imprimir
					el nombre de la primer canción y su autor */

					imprimir("Numero linea "+info_canciones[1][0]);
					imprimir("Nombre "+info_canciones[1][1]);
					imprimir("Autor "+info_canciones[1][2]);
					imprimir("Archivo "+info_canciones[1][6]);

					//TODO:Imprimir la lista completa
				}

				centinela = ConsoleInput.getInt();
			}while(centinela!=6);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally{
			audio.detener();
		}
	}
}