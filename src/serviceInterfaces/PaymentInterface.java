package serviceInterfaces;

import data.Cart;
import data.Order;
import estorePojo.exceptions.*;

public interface PaymentInterface {
  public Order pay(Cart cart, String address, String bankAccountRef)
		throws InvalidCartException, UnknownItemException,
		InsufficientBalanceException, UnknownAccountException;
}
