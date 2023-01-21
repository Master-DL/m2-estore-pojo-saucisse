package serviceInterfaces;

import estorePojo.exceptions.UnknownItemException;
import service.Store;

public interface OrderManagerInterface {
  public int order(Store store, Object item, int qty) throws UnknownItemException;
}
