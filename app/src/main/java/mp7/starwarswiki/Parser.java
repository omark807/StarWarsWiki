package mp7.starwarswiki;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Class that serves to parse the JSON data returned by the API call from HttpUtils.
 */
public class Parser {

    public static String getString(String json) {

        JsonParser parser = new JsonParser();
        JsonObject result = parser.parse(json).getAsJsonObject();
        JsonObject description = result.get("description").getAsJsonObject();
        JsonElement caption = description.get("caption").getAsJsonArray().get(0);
        String mercury = caption.getAsJsonObject().get("text").getAsString();

        return mercury;
    }

    public static String getStringTwo(String json) {

        JsonParser parser = new JsonParser();
        JsonObject result = parser.parse(json).getAsJsonObject();
        JsonObject description = result.get("description").getAsJsonObject();
        JsonElement caption = description.get("caption").getAsJsonArray().get(1);
        String venus = caption.getAsJsonObject().get("text").getAsString();

        return venus;
    }

    public static String getStringThree(String json) {

        JsonParser parser = new JsonParser();
        JsonObject result = parser.parse(json).getAsJsonObject();
        JsonObject description = result.get("description").getAsJsonObject();
        JsonElement caption = description.get("caption").getAsJsonArray().get(2);
        String earth = caption.getAsJsonObject().get("text").getAsString();

        return earth;
    }

    public static String getStringFour(String json) {

        JsonParser parser = new JsonParser();
        JsonObject result = parser.parse(json).getAsJsonObject();
        JsonObject description = result.get("description").getAsJsonObject();
        JsonElement caption = description.get("caption").getAsJsonArray().get(3);
        String mars = caption.getAsJsonObject().get("text").getAsString();

        return mars;
    }

    public static String getStringFive(String json) {

        JsonParser parser = new JsonParser();
        JsonObject result = parser.parse(json).getAsJsonObject();
        JsonObject description = result.get("description").getAsJsonObject();
        JsonElement caption = description.get("caption").getAsJsonArray().get(4);
        String jupiter = caption.getAsJsonObject().get("text").getAsString();

        return jupiter;
    }

    public static String getStringSix(String json) {

        JsonParser parser = new JsonParser();
        JsonObject result = parser.parse(json).getAsJsonObject();
        JsonObject description = result.get("description").getAsJsonObject();
        JsonElement caption = description.get("caption").getAsJsonArray().get(5);
        String saturn = caption.getAsJsonObject().get("text").getAsString();

        return saturn;
    }

    public static String getStringSeven(String json) {

        JsonParser parser = new JsonParser();
        JsonObject result = parser.parse(json).getAsJsonObject();
        JsonObject description = result.get("description").getAsJsonObject();
        JsonElement caption = description.get("caption").getAsJsonArray().get(6);
        String uranus = caption.getAsJsonObject().get("text").getAsString();

        return uranus;
    }

    public static String getStringAquarius(String json) {

        JsonParser parser = new JsonParser();
        JsonObject result = parser.parse(json).getAsJsonObject();
        JsonObject description = result.get("description").getAsJsonObject();
        JsonElement caption = description.get("caption").getAsJsonArray().get(7);
        String aquarius = caption.getAsJsonObject().get("text").getAsString();

        return aquarius;
    }

    public static String getStringCancer(String json) {

        JsonParser parser = new JsonParser();
        JsonObject result = parser.parse(json).getAsJsonObject();
        JsonObject description = result.get("description").getAsJsonObject();
        JsonElement caption = description.get("caption").getAsJsonArray().get(8);
        String cancer = caption.getAsJsonObject().get("text").getAsString();

        return cancer;
    }

    public static String getStringCapricorn(String json) {

        JsonParser parser = new JsonParser();
        JsonObject result = parser.parse(json).getAsJsonObject();
        JsonObject description = result.get("description").getAsJsonObject();
        JsonElement caption = description.get("caption").getAsJsonArray().get(9);
        String capricorn = caption.getAsJsonObject().get("text").getAsString();

        return capricorn;
    }

    public static String getStringLeo(String json) {

        JsonParser parser = new JsonParser();
        JsonObject result = parser.parse(json).getAsJsonObject();
        JsonObject description = result.get("description").getAsJsonObject();
        JsonElement caption = description.get("caption").getAsJsonArray().get(10);
        String leo = caption.getAsJsonObject().get("text").getAsString();

        return leo;
    }

    public static String getStringUrsaMajor(String json) {

        JsonParser parser = new JsonParser();
        JsonObject result = parser.parse(json).getAsJsonObject();
        JsonObject description = result.get("description").getAsJsonObject();
        JsonElement caption = description.get("caption").getAsJsonArray().get(11);
        String major = caption.getAsJsonObject().get("text").getAsString();

        return major;
    }

    public static String getStringUrsaMinor(String json) {

        JsonParser parser = new JsonParser();
        JsonObject result = parser.parse(json).getAsJsonObject();
        JsonObject description = result.get("description").getAsJsonObject();
        JsonElement caption = description.get("caption").getAsJsonArray().get(12);
        String minor = caption.getAsJsonObject().get("text").getAsString();

        return minor;
    }

    public static String getStringSegue(String json) {

        JsonParser parser = new JsonParser();
        JsonObject result = parser.parse(json).getAsJsonObject();
        JsonObject description = result.get("description").getAsJsonObject();
        JsonElement caption = description.get("caption").getAsJsonArray().get(13);
        String segue = caption.getAsJsonObject().get("text").getAsString();

        return segue;
    }

    public static String getStringSDS(String json) {

        JsonParser parser = new JsonParser();
        JsonObject result = parser.parse(json).getAsJsonObject();
        JsonObject description = result.get("description").getAsJsonObject();
        JsonElement caption = description.get("caption").getAsJsonArray().get(14);
        String sds = caption.getAsJsonObject().get("text").getAsString();

        return sds;
    }

    public static String getStringHercules(String json) {

        JsonParser parser = new JsonParser();
        JsonObject result = parser.parse(json).getAsJsonObject();
        JsonObject description = result.get("description").getAsJsonObject();
        JsonElement caption = description.get("caption").getAsJsonArray().get(15);
        String hercules = caption.getAsJsonObject().get("text").getAsString();

        return hercules;
    }

    public static String getStringComet(String json) {

        JsonParser parser = new JsonParser();
        JsonObject result = parser.parse(json).getAsJsonObject();
        JsonObject description = result.get("description").getAsJsonObject();
        JsonElement caption = description.get("caption").getAsJsonArray().get(16);
        String comet = caption.getAsJsonObject().get("text").getAsString();

        return comet;
    }

    public static String getStringNebula(String json) {

        JsonParser parser = new JsonParser();
        JsonObject result = parser.parse(json).getAsJsonObject();
        JsonObject description = result.get("description").getAsJsonObject();
        JsonElement caption = description.get("caption").getAsJsonArray().get(17);
        String nebula = caption.getAsJsonObject().get("text").getAsString();

        return nebula;
    }

    public static String getStringQuasar(String json) {

        JsonParser parser = new JsonParser();
        JsonObject result = parser.parse(json).getAsJsonObject();
        JsonObject description = result.get("description").getAsJsonObject();
        JsonElement caption = description.get("caption").getAsJsonArray().get(18);
        String quasar = caption.getAsJsonObject().get("text").getAsString();

        return quasar;
    }

    public static String getStringSupernova(String json) {

        JsonParser parser = new JsonParser();
        JsonObject result = parser.parse(json).getAsJsonObject();
        JsonObject description = result.get("description").getAsJsonObject();
        JsonElement caption = description.get("caption").getAsJsonArray().get(19);
        String supernova = caption.getAsJsonObject().get("text").getAsString();

        return supernova;
    }
}

