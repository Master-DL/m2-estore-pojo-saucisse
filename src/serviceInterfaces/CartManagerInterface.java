package serviceInterfaces;

import data.Cart;
import estorePojo.exceptions.InvalidCartException;
import estorePojo.exceptions.UnknownItemException;
import service.Client;

public interface CartManagerInterface {
  public Cart addItemToCart(Cart cart, Client client, Object item, int qty)
			throws UnknownItemException, InvalidCartException;
}
