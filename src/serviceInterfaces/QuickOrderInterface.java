package serviceInterfaces;

import data.Order;
import estorePojo.exceptions.InsufficientBalanceException;
import estorePojo.exceptions.UnknownAccountException;
import estorePojo.exceptions.UnknownItemException;

public interface QuickOrderInterface {
  public Order oneShotOrder(Runnable client, Object item, int qty, String address, String bankAccountRef)
			throws UnknownItemException, InsufficientBalanceException, UnknownAccountException;
}
