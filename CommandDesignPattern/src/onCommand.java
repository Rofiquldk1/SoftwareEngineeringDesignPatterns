
public class onCommand implements Command {
	Light li;
    onCommand(Light l1){
    	this.li=l1;
    }
	@Override
	public void execute() {
		li.on();
	}
	@Override
	public void undo() {
	   li.off();
		
	}

}
