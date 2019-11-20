public class OCommandCheckTimer implements command {
 oven o;

 public OCommandCheckTimer(oven o) {
   this.o = o;
 }
 public void execute() {
   o.check_timer();
 }
}