public class MWCommandSetTemperature implements command {
 microwave mw;

 public MWCommandSetTemperature(microwave mw) {
   this.mw = mw;
 }
 public void execute() {
   mw.set_temperature();
 }
}