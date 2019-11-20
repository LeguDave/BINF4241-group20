public class OCommandSetTimer implements command {
 oven o;

 public OCommandSetTimer(oven o) {
   this.o = o;
 }
 public void execute() {
   o.set_timer();
 }
}