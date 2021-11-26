import org.springframework.context.ApplicationEvent;

public class WorkEvent extends ApplicationEvent {

	public WorkEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Work event occured, getter method called for fethcing users...";
	}

}
