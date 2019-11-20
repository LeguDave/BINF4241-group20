public class OCommandOff implements command {
 oven o;

 public OCommandOff(oven o) {
   this.o = o;
 }
 public void execute() {
   o.switch_off();
 }
}