package serviceInterfaces;

import data.Cart;
import estorePojo.exceptions.InvalidCartException;
import estorePojo.exceptions.UnknownItemException;

public interface CartManagerInterface {
  public Cart addItemToCart(Cart cart, Runnable client, Object item, int qty)
			throws UnknownItemException, InvalidCartException;
}
