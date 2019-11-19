public class MWCommandBake implements command {
 microwave mw;

 public MWCommandBake(microwave mw) {
   this.mw = mw;
 }
 public void execute() {
   mw.bake();
 }
}