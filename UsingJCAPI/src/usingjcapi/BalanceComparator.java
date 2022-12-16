package usingjcapi;

public class BalanceComparator implements Comparator {

    public String compare(Object o1, Object o2) {
        TrafficCard c1 = (TrafficCard) o1;
        TrafficCard c2 = (TrafficCard) o2;
        if (c1.mBalance==c2.mBalance)
            return "Balances are the same";
        else if (c1.mBalance > c2.mBalance)
            return "Balance: " + c1.mBalance + " is larger than " + c2.mBalance;
        else
            return "Balance: " + c2.mBalance + " is larger than " + c1.mBalance;
    }
}
