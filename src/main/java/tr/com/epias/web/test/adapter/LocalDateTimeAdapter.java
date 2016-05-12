package tr.com.epias.web.test.adapter;

import java.lang.reflect.Type;
import java.time.LocalDateTime;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import tr.com.epias.web.test.util.DateUtil;

public class LocalDateTimeAdapter implements JsonSerializer<LocalDateTime>, JsonDeserializer<LocalDateTime>
{

    @Override
    public JsonElement serialize(LocalDateTime src, Type typeOfSrc, JsonSerializationContext context)
    {
	if (src == null)
	{
	    return JsonNull.INSTANCE;
	} else
	{
	    return new JsonPrimitive(DateUtil.toISO8601Date(src));
	}
    }

    @Override
    public LocalDateTime deserialize(JsonElement json, Type date, JsonDeserializationContext context) throws JsonParseException
    {
	String str = json.getAsJsonPrimitive().getAsString();
	try
	{
	    return DateUtil.fromISO8601LocalDateTime(str);
	} catch (RuntimeException e)
	{
	    throw new JsonParseException(e);
	}
    }

}
