/*
 * Slurm Rest API
 * API to access and control Slurm.
 *
 * The version of the OpenAPI document: 0.0.37
 * Contact: sales@schedmd.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * System time values
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Dbv0037JobTimeTotal {
  public static final String SERIALIZED_NAME_SECONDS = "seconds";
  @SerializedName(SERIALIZED_NAME_SECONDS)
  private Integer seconds;

  public static final String SERIALIZED_NAME_MICROSECONDS = "microseconds";
  @SerializedName(SERIALIZED_NAME_MICROSECONDS)
  private Integer microseconds;

  public Dbv0037JobTimeTotal() {
  }

  public Dbv0037JobTimeTotal seconds(Integer seconds) {
    
    this.seconds = seconds;
    return this;
  }

   /**
   * Total number of CPU-seconds used by the job, in seconds
   * @return seconds
  **/
  @javax.annotation.Nullable
  public Integer getSeconds() {
    return seconds;
  }


  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }


  public Dbv0037JobTimeTotal microseconds(Integer microseconds) {
    
    this.microseconds = microseconds;
    return this;
  }

   /**
   * Total number of CPU-seconds used by the job, in microseconds
   * @return microseconds
  **/
  @javax.annotation.Nullable
  public Integer getMicroseconds() {
    return microseconds;
  }


  public void setMicroseconds(Integer microseconds) {
    this.microseconds = microseconds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dbv0037JobTimeTotal dbv0037JobTimeTotal = (Dbv0037JobTimeTotal) o;
    return Objects.equals(this.seconds, dbv0037JobTimeTotal.seconds) &&
        Objects.equals(this.microseconds, dbv0037JobTimeTotal.microseconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seconds, microseconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dbv0037JobTimeTotal {\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    microseconds: ").append(toIndentedString(microseconds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("seconds");
    openapiFields.add("microseconds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Dbv0037JobTimeTotal
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Dbv0037JobTimeTotal.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dbv0037JobTimeTotal is not found in the empty JSON string", Dbv0037JobTimeTotal.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Dbv0037JobTimeTotal.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dbv0037JobTimeTotal` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dbv0037JobTimeTotal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dbv0037JobTimeTotal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dbv0037JobTimeTotal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dbv0037JobTimeTotal.class));

       return (TypeAdapter<T>) new TypeAdapter<Dbv0037JobTimeTotal>() {
           @Override
           public void write(JsonWriter out, Dbv0037JobTimeTotal value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dbv0037JobTimeTotal read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Dbv0037JobTimeTotal given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Dbv0037JobTimeTotal
  * @throws IOException if the JSON string is invalid with respect to Dbv0037JobTimeTotal
  */
  public static Dbv0037JobTimeTotal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dbv0037JobTimeTotal.class);
  }

 /**
  * Convert an instance of Dbv0037JobTimeTotal to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

