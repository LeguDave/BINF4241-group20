public class MWCommandOn implements command {
 microwave mw;

 public MWCommandOn(microwave mw) {
   this.mw = mw;
 }
 public void execute() {
   mw.switch_on();
 }
}