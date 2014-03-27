package learning.oop.objectsandclasses.abstraction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleInterfaceImpl implements SimpleInterface {
	
	private static Logger LOG = LogManager.getLogger(SimpleInterfaceImpl.class);

	@Override
	public void printType() {
		LOG.debug("Type of SimpleInterfaceImpl " + this.getClass().getTypeName());
	}

}
