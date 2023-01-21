package serviceInterfaces;

import estorePojo.exceptions.UnknownItemException;

public interface OrderManagerInterface {
  public int order(StoreInterface store, Object item, int qty) throws UnknownItemException;
}
