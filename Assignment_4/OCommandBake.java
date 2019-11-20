public class OCommandBake implements command {
 oven o;

 public OCommandBake(oven o) {
   this.o = o;
 }
 public void execute() {
   o.bake();
 }
}