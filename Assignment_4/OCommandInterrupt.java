public class OCommandInterrupt implements command {
 oven o;

 public OCommandInterrupt(oven o) {
   this.o = o;
 }
 public void execute() {
   o.interrupt();
 }
}