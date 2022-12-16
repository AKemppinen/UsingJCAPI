package usingjcapi;

public class NumberComparator implements Comparator {

    public String compare(Object o1, Object o2) {
        TrafficCard c1 = (TrafficCard) o1;
        TrafficCard c2 = (TrafficCard) o2;
        if (c1.mTravellerNumber==c2.mTravellerNumber)
            return "Numbers are the same";
        else if (c1.mTravellerNumber > c2.mTravellerNumber)
            return "Number: " + c1.mTravellerNumber + " is larger than " + c2.mTravellerNumber;
        else
            return "Number: " + c2.mTravellerNumber + " is larger than " + c1.mTravellerNumber;
    }
}
