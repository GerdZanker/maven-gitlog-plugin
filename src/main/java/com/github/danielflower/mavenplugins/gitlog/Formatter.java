package com.github.danielflower.mavenplugins.gitlog;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class Formatter {
	private static DateFormat dateFormat =
			new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");

	public static String formatDateTime() {
		return formatDateTime(new Date());
	}

	public static String formatDateTime(int secondsSinceEpoch) {
		Date date = new Date(secondsSinceEpoch * 1000L);
		return formatDateTime(date);
	}

	public static String formatDateTime(Date date) {
		return dateFormat.format(date);
	}
}
