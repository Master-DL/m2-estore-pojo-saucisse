package serviceInterfaces;

import estorePojo.exceptions.InsufficientBalanceException;
import estorePojo.exceptions.UnknownAccountException;

public interface FundTransfertInterface {
  public void transfert(String from, String to, double amount)
    throws InsufficientBalanceException, UnknownAccountException;
}
