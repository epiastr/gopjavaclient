package tr.com.epias.web.test.adapter;

import java.lang.reflect.Type;
import java.time.LocalDate;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import tr.com.epias.web.test.util.DateUtil;

public class LocalDateAdapter implements JsonSerializer<LocalDate>, JsonDeserializer<LocalDate>
{

    @Override
    public JsonElement serialize(LocalDate src, Type typeOfSrc, JsonSerializationContext context)
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
    public LocalDate deserialize(JsonElement json, Type date, JsonDeserializationContext context) throws JsonParseException
    {
	String str = json.getAsJsonPrimitive().getAsString();
	try
	{
	    return DateUtil.fromISO8601LocalDate(str);
	} catch (RuntimeException e)
	{
	    throw new JsonParseException(e);
	}
    }

}
