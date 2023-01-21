package serviceInterfaces;

import estorePojo.exceptions.UnknownItemException;

public interface PriceCalculatorInterface {
  public double getPrice(Object item) throws UnknownItemException;
}
