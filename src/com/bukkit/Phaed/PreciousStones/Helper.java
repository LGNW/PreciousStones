package com.bukkit.Phaed.PreciousStones;

public class Helper
{
    /**
     * Helper function to check for integer
     */
    public static boolean isInteger(Object o)
    {
	return o instanceof java.lang.Integer;
    }
    
    /**
     * Helper function to check for integer
     */
    public static boolean isInteger(String input)
    {
	try
	{
	    Integer.parseInt(input);
	    return true;
	}
	catch (Exception ex)
	{
	    return false;
	}
    }
    
    /**
     * Helper function to check for long
     */
    public static boolean isLong(String input)
    {
	try
	{
	    Long.parseLong(input);
	    return true;
	}
	catch (Exception ex)
	{
	    return false;
	}
    }
    
    /**
     * Helper function to check for string
     */
    public static boolean isString(Object o)
    {
	return o instanceof java.lang.String;
    }
    
    /**
     * Helper function to check for boolean
     */
    public static boolean isBoolean(Object o)
    {
	return o instanceof java.lang.Boolean;
    }
    
    /**
     * Remove a character from a string
     */
    public static String removeChar(String s, char c)
    {
	String r = "";
	
	for (int i = 0; i < s.length(); i++)
	{
	    if (s.charAt(i) != c)
		r += s.charAt(i);
	}
	
	return r;
    }
    
    /**
     * Capitalize first word of sentence
     */    
    public static String capitalize(String content)
    {
	if(content.length() < 2)
	    return content;
	
	String first = content.substring(0, 1).toUpperCase();
	return first + content.substring(1);
    }
}
