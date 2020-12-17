
public class Invoker {
   private Command c;
   public void setCommand(Command c) {
	   this.c=c;
   }
   
   public void pressButton() {
	   c.execute();
   }
}
