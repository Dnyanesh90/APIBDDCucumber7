package UtilsLayer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {


public static String getCurrentDateTime()
{
return	new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
}
}
