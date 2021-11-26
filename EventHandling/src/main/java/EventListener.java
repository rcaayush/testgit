import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EventListener implements ApplicationListener<ApplicationEvent>{

	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println(event.toString());
		
	}

	
	

}
