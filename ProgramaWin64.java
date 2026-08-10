public class ProgramaWin64 { 

static int travado = 0;

public static void rodarProcesso(String nome ) {
  System.out.println("[" + nome  + "] tentando entrar ...");

  while (travado == 1 ) {
    System.out.println("[" + nome + "] recurso ocupado !aguardando ...");
    try{
      Thread.sleep(1000);
    }catch (Exception e ) {

    } 
  }
  
  travado = 1;
  System.out.println("--> [" + nome + "] Entrou na seção critica!");
  try{
    Thread.slepp(4000);
  }catch(Exception e ) {

  }

  travado = 0;
  System.out.println("<-- [" + nome + "] saiu da seção critica");

  public static void main(String[] args)

    Thread p1 = new Thread(new Runnable() { 
   public void run() { 
   rodarProcesso("Processo_A);
   }
    ;);

 Thread p2 = newThread(new Runnable() {
   public void run() { 
     rodarProcesso(Processo_B);
   });
   

   p1.start();
   p2.start();

 }
}
