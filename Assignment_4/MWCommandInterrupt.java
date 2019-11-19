public class MWCommandInterrupt implements command {
 microwave mw;

 public MWCommandInterrupt(microwave mw) {
   this.mw = mw;
 }
 public void execute() {
   mw.interrupt();
 }
}