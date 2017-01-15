package world.best.com.bestieworld.util;


import android.util.Log;

public class DebugLog {
	
	private static String DEBUG_TAG = "KOKAKOLA";

	public static void console(String str){

		Log.i(DEBUG_TAG, str);
	}
	
	public static void tagConsole(String tag,String str){
		Log.i(tag, str);
	}
	public static void console(Exception e, String msg){
		Log.i(DEBUG_TAG, " - "+e.toString() + " : "+msg);
	}
	
}
