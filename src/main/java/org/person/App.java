package org.person;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Random;

public class App
{
    public static void main(String... args) {
    	int year = -1, month = -1, date = -1;
    	for(int i = 0; i < 100000; i++) {
    		try {
                year = generateNumberScope(2010, 10);
                month = 2;
                date = generateNumberScope(1, 28);

                LocalDate localDate = LocalDate.of(year, month, date);
    		} catch(Exception e) {
    			System.out.println(year + "--" + month + "--" + date);
    			break;
    		}
    	}
    	
    	
    }
    
    private static int generateNumberScope(int base, int number) {
        return base + new Random().nextInt(number);
    }
    
    public static int getAllDays(LocalDate localeDate, int businessDays)
    {
        int dayOfWeek = localeDate.getDayOfWeek().getValue();
        int result = 0;
        int saturday = DayOfWeek.SATURDAY.getValue();
        int friday = DayOfWeek.FRIDAY.getValue();
        int oneWeekDays = 7;
        int twoWeekDaysShift = 2 * oneWeekDays - 1;
        if (businessDays != 0)
        {
            boolean isStartOnWorkday = dayOfWeek < saturday;
            int absBusinessDays = Math.abs(businessDays);

            if (isStartOnWorkday)
            {
                int shiftedWorkday = businessDays > 0 ? dayOfWeek : saturday - dayOfWeek;
                result = absBusinessDays + (absBusinessDays + shiftedWorkday - 1) / friday * 2;
            }
            else
            {
                int shiftedWeekend = businessDays > 0 ? dayOfWeek : twoWeekDaysShift - dayOfWeek;
                result = absBusinessDays + (absBusinessDays - 1) / friday * 2 + (oneWeekDays - shiftedWeekend);
            }
        }
        return result;
    }
    
    
}
