public class OCommandOn implements command {
 oven o;

 public OCommandOn(oven o) {
   this.o = o;
 }
 public void execute() {
   o.switch_on();
 }
}