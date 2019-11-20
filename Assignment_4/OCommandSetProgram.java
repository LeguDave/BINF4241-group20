public class OCommandSetProgram implements command {
 oven o;

 public OCommandSetProgram(oven o) {
   this.o = o;
 }
 public void execute() {
   o.set_program();
 }
}