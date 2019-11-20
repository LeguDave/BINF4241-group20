public class OCommandSetTemperature implements command {
 oven o;

 public OCommandSetTemperature(oven o) {
   this.o = o;
 }
 public void execute() {
   o.set_temperature();
 }
}