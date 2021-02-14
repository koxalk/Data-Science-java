package Outliers;

import java.time.*;

public class Outlier {

    private final boolean minValueInclusive = true;
    private boolean maxValueInclusive;
    private final double minValue = 1.0;
    private double maxValue;

    private String validItems;

    OffsetDateTime minDate;
    OffsetDateTime maxDate;

    public Outlier() {

    }

    /*
Now that our data is cleaned and parsed, we can check whether the value is acceptable given our
requirements. If we were expecting a value of either 0 or 1 and we get a 2, the value is clearly out of
range and we can designate this data point as an outlier. As in the case with nulls and blanks, we can
perform a Boolean test on the value to determine whether it is within an acceptable range of values. This
is good for numeric types as well as strings and date times.
In the case of checking ranges with numeric types, we need to know the minimum and maximum
acceptable values and whether they are inclusive or exclusive. For example, if we set minValue = 1.0
and minValueInclusive = true, all values greater than or equal to 1.0 will pass the test. If we set
minValueInclusive = false, only values greater than 1.0 will pass the test.*/
    public boolean checkRange(double value) {
        boolean minBit = (minValueInclusive) ? value >= minValue : value > minValue;
        boolean maxBit = (maxValueInclusive) ? value <= maxValue : value < maxValue;

        return minBit && maxBit;
    }

    /*
   We can also check whether a string value is in an acceptable range by setting an enumeration of valid
strings. This can be done by creating a Set instance of valid strings called, for example, validItems,
where the Set.contains() method can be used to test the validity of an input value:
     */
    public boolean checkRange2(String str) {
        return validItems.contains(str);
    }

    /*For DateTime objects, we can check whether a date is after a minimum date and before a maximum date.
In this case, we define the min and max as OffsetDateTime objects and then test whether the input date
time is between the min and max. Note that OffsetDateTime.isBefore() and
OffsetDateTime.isAfter() are exclusive. If the input date time is equal to either the min or max, the
test will fail.*/
    public boolean checkRange3(OffsetDateTime odt) {
        return odt.isAfter(minDate) && odt.isBefore(maxDate);
    }
}
