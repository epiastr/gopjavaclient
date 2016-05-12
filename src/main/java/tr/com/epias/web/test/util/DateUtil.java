package tr.com.epias.web.test.util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateUtil {

	private static final String ISO_8601_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

	public static String toISO8601Date(LocalDate v) {
		if (null == v)
			return null;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ISO_8601_FORMAT);
		return formatter.format(v);
	}

	public static String toISO8601Date(LocalDateTime v) {
		if (null == v)
			return null;
		return toISO8601Date(localDateTimeToDate(v));
	}

	public static String toISO8601Date(Date v) {
		if (null == v)
			return null;
		SimpleDateFormat sdf = new SimpleDateFormat(ISO_8601_FORMAT);
		return sdf.format(v);
	}

	public static LocalDate fromISO8601LocalDate(String v) {
		if (null == v)
			return null;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ISO_8601_FORMAT);
		return LocalDate.parse(v, formatter);
	}

	public static LocalDateTime fromISO8601LocalDateTime(String v) {
		if (null == v)
			return null;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ISO_8601_FORMAT).withLocale(new Locale("tr", "TR"));
		return LocalDateTime.parse(v, formatter);
	}

	public static Date localDateTimeToDate(LocalDateTime localDateTime) {
		Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
		return date;
	}

}
