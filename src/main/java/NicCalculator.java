package main.java.menda;

import java.util.Calendar;

public class NicCalculator {
	
	private String data;

public NicCalculator(String input){
	data=input;
	
}

public NicData interpretID(){
    String bday = data;
    Calendar Cyear = Calendar.getInstance();
    
    String output[]=new String[3];
            String year = bday.substring(0, 2);
            int temp = Integer.parseInt(year);
            int year1 = temp + 1900;
            
            String days = bday.substring(2, 5);
            int days1 = Integer.parseInt(days);
            
            String sex;
            boolean isVoter;
            if (days1 > 500) {
                days1 = days1 - 500;
                sex= "Female";
            }
            else
                sex= "Male";
            
            if(2013-year1>=18)
                isVoter = true;
            else
                isVoter = false;
                
            
            Calendar c = Calendar.getInstance();
            
            c.set(c.DAY_OF_YEAR,days1);
           
            int month = c.get(c.MONTH) + 1;
           
            int mydate = c.get(c.DATE) -1;
            
           
            NicData a = new NicData();
            a.setIsVoter(isVoter);
            output[0]=Integer.toString(year1);
            output[1]=Integer.toString(month);
            output[2]=Integer.toString(mydate);
            a.setDOB(output);
            a.setSex(sex);
            
        return a;
    }
}
