
public class offCommand implements Command {
	Light li;
    offCommand(Light l1){
    	this.li=l1;
    }
	@Override
	public void execute() {
		li.off();
	}
	@Override
	public void undo() {
		li.on();
		
	}
}
