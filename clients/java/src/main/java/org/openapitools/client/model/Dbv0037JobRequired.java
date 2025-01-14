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
 * Job run requirements
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Dbv0037JobRequired {
  public static final String SERIALIZED_NAME_CP_US = "CPUs";
  @SerializedName(SERIALIZED_NAME_CP_US)
  private Integer cpUs;

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private Integer memory;

  public Dbv0037JobRequired() {
  }

  public Dbv0037JobRequired cpUs(Integer cpUs) {
    
    this.cpUs = cpUs;
    return this;
  }

   /**
   * Required number of CPUs
   * @return cpUs
  **/
  @javax.annotation.Nullable
  public Integer getCpUs() {
    return cpUs;
  }


  public void setCpUs(Integer cpUs) {
    this.cpUs = cpUs;
  }


  public Dbv0037JobRequired memory(Integer memory) {
    
    this.memory = memory;
    return this;
  }

   /**
   * Required amount of memory (MiB)
   * @return memory
  **/
  @javax.annotation.Nullable
  public Integer getMemory() {
    return memory;
  }


  public void setMemory(Integer memory) {
    this.memory = memory;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dbv0037JobRequired dbv0037JobRequired = (Dbv0037JobRequired) o;
    return Objects.equals(this.cpUs, dbv0037JobRequired.cpUs) &&
        Objects.equals(this.memory, dbv0037JobRequired.memory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpUs, memory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dbv0037JobRequired {\n");
    sb.append("    cpUs: ").append(toIndentedString(cpUs)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
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
    openapiFields.add("CPUs");
    openapiFields.add("memory");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Dbv0037JobRequired
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Dbv0037JobRequired.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dbv0037JobRequired is not found in the empty JSON string", Dbv0037JobRequired.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Dbv0037JobRequired.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dbv0037JobRequired` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dbv0037JobRequired.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dbv0037JobRequired' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dbv0037JobRequired> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dbv0037JobRequired.class));

       return (TypeAdapter<T>) new TypeAdapter<Dbv0037JobRequired>() {
           @Override
           public void write(JsonWriter out, Dbv0037JobRequired value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dbv0037JobRequired read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Dbv0037JobRequired given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Dbv0037JobRequired
  * @throws IOException if the JSON string is invalid with respect to Dbv0037JobRequired
  */
  public static Dbv0037JobRequired fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dbv0037JobRequired.class);
  }

 /**
  * Convert an instance of Dbv0037JobRequired to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

