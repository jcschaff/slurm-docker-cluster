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
import org.openapitools.client.model.Dbv0037JobTimeSystem;
import org.openapitools.client.model.Dbv0037JobTimeTotal;
import org.openapitools.client.model.Dbv0037JobTimeUser;

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
 * Time properties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Dbv0037JobStepTime {
  public static final String SERIALIZED_NAME_ELAPSED = "elapsed";
  @SerializedName(SERIALIZED_NAME_ELAPSED)
  private Integer elapsed;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private Integer end;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private Integer start;

  public static final String SERIALIZED_NAME_SUSPENDED = "suspended";
  @SerializedName(SERIALIZED_NAME_SUSPENDED)
  private Integer suspended;

  public static final String SERIALIZED_NAME_SYSTEM = "system";
  @SerializedName(SERIALIZED_NAME_SYSTEM)
  private Dbv0037JobTimeSystem system;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Dbv0037JobTimeTotal total;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private Dbv0037JobTimeUser user;

  public Dbv0037JobStepTime() {
  }

  public Dbv0037JobStepTime elapsed(Integer elapsed) {
    
    this.elapsed = elapsed;
    return this;
  }

   /**
   * Total time elapsed
   * @return elapsed
  **/
  @javax.annotation.Nullable
  public Integer getElapsed() {
    return elapsed;
  }


  public void setElapsed(Integer elapsed) {
    this.elapsed = elapsed;
  }


  public Dbv0037JobStepTime end(Integer end) {
    
    this.end = end;
    return this;
  }

   /**
   * Timestamp of when job ended
   * @return end
  **/
  @javax.annotation.Nullable
  public Integer getEnd() {
    return end;
  }


  public void setEnd(Integer end) {
    this.end = end;
  }


  public Dbv0037JobStepTime start(Integer start) {
    
    this.start = start;
    return this;
  }

   /**
   * Timestamp of when job started
   * @return start
  **/
  @javax.annotation.Nullable
  public Integer getStart() {
    return start;
  }


  public void setStart(Integer start) {
    this.start = start;
  }


  public Dbv0037JobStepTime suspended(Integer suspended) {
    
    this.suspended = suspended;
    return this;
  }

   /**
   * Timestamp of when job last suspended
   * @return suspended
  **/
  @javax.annotation.Nullable
  public Integer getSuspended() {
    return suspended;
  }


  public void setSuspended(Integer suspended) {
    this.suspended = suspended;
  }


  public Dbv0037JobStepTime system(Dbv0037JobTimeSystem system) {
    
    this.system = system;
    return this;
  }

   /**
   * Get system
   * @return system
  **/
  @javax.annotation.Nullable
  public Dbv0037JobTimeSystem getSystem() {
    return system;
  }


  public void setSystem(Dbv0037JobTimeSystem system) {
    this.system = system;
  }


  public Dbv0037JobStepTime total(Dbv0037JobTimeTotal total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  public Dbv0037JobTimeTotal getTotal() {
    return total;
  }


  public void setTotal(Dbv0037JobTimeTotal total) {
    this.total = total;
  }


  public Dbv0037JobStepTime user(Dbv0037JobTimeUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  public Dbv0037JobTimeUser getUser() {
    return user;
  }


  public void setUser(Dbv0037JobTimeUser user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dbv0037JobStepTime dbv0037JobStepTime = (Dbv0037JobStepTime) o;
    return Objects.equals(this.elapsed, dbv0037JobStepTime.elapsed) &&
        Objects.equals(this.end, dbv0037JobStepTime.end) &&
        Objects.equals(this.start, dbv0037JobStepTime.start) &&
        Objects.equals(this.suspended, dbv0037JobStepTime.suspended) &&
        Objects.equals(this.system, dbv0037JobStepTime.system) &&
        Objects.equals(this.total, dbv0037JobStepTime.total) &&
        Objects.equals(this.user, dbv0037JobStepTime.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elapsed, end, start, suspended, system, total, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dbv0037JobStepTime {\n");
    sb.append("    elapsed: ").append(toIndentedString(elapsed)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("elapsed");
    openapiFields.add("end");
    openapiFields.add("start");
    openapiFields.add("suspended");
    openapiFields.add("system");
    openapiFields.add("total");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Dbv0037JobStepTime
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Dbv0037JobStepTime.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dbv0037JobStepTime is not found in the empty JSON string", Dbv0037JobStepTime.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Dbv0037JobStepTime.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dbv0037JobStepTime` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `system`
      if (jsonObj.get("system") != null && !jsonObj.get("system").isJsonNull()) {
        Dbv0037JobTimeSystem.validateJsonElement(jsonObj.get("system"));
      }
      // validate the optional field `total`
      if (jsonObj.get("total") != null && !jsonObj.get("total").isJsonNull()) {
        Dbv0037JobTimeTotal.validateJsonElement(jsonObj.get("total"));
      }
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        Dbv0037JobTimeUser.validateJsonElement(jsonObj.get("user"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dbv0037JobStepTime.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dbv0037JobStepTime' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dbv0037JobStepTime> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dbv0037JobStepTime.class));

       return (TypeAdapter<T>) new TypeAdapter<Dbv0037JobStepTime>() {
           @Override
           public void write(JsonWriter out, Dbv0037JobStepTime value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dbv0037JobStepTime read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Dbv0037JobStepTime given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Dbv0037JobStepTime
  * @throws IOException if the JSON string is invalid with respect to Dbv0037JobStepTime
  */
  public static Dbv0037JobStepTime fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dbv0037JobStepTime.class);
  }

 /**
  * Convert an instance of Dbv0037JobStepTime to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
