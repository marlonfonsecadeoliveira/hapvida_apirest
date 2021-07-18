package com.hapvida.apirest.util;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Util {
	


	public static boolean empty(String o) {
		
		if (o == null || o.trim().length() == 0)
			return true;
		
		return false;
	}
	
	public static boolean empty(Object[] o) {
		
		if (o == null || o.length <= 0)
			return true;
		
		return false;
	}	
	
	public static boolean empty(Collection<?> o) {
		
		if (o == null)
			return true;
		
		if (o.size() == 0)
			return true;
		
		return false;
	}
	
	
	public static boolean empty(Object o) {
		
		if (o == null)
			return true;
		
		return false;
	}
	
	public static boolean emptyValues(List<Object> lista) {
		for (Object o : lista) {
			if (o instanceof String) 
				o = (String) o;
			if (o instanceof Collection) 
				o = (Collection<?>) o;
			if (o instanceof Collection) 
				o = (Object[]) o;
			if (!Util.empty(o))
				return false;
		}
		return true;
	}
	
	public static int getQtdDiasEntreDatas(Date dtInicio, Date dtFim) {
		return Integer.parseInt((dtFim.getTime() - dtInicio.getTime())
				/ (1000 * 60 * 60 * 24) + "");
	}

	
	
}
