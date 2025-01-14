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
 * Limit on wallclock per settings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Dbv0037QosLimitsMaxWallClockPer {
  public static final String SERIALIZED_NAME_QOS = "qos";
  @SerializedName(SERIALIZED_NAME_QOS)
  private Integer qos;

  public static final String SERIALIZED_NAME_JOB = "job";
  @SerializedName(SERIALIZED_NAME_JOB)
  private Integer job;

  public Dbv0037QosLimitsMaxWallClockPer() {
  }

  public Dbv0037QosLimitsMaxWallClockPer qos(Integer qos) {
    
    this.qos = qos;
    return this;
  }

   /**
   * Max wallclock per QOS
   * @return qos
  **/
  @javax.annotation.Nullable
  public Integer getQos() {
    return qos;
  }


  public void setQos(Integer qos) {
    this.qos = qos;
  }


  public Dbv0037QosLimitsMaxWallClockPer job(Integer job) {
    
    this.job = job;
    return this;
  }

   /**
   * Max wallclock per job
   * @return job
  **/
  @javax.annotation.Nullable
  public Integer getJob() {
    return job;
  }


  public void setJob(Integer job) {
    this.job = job;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dbv0037QosLimitsMaxWallClockPer dbv0037QosLimitsMaxWallClockPer = (Dbv0037QosLimitsMaxWallClockPer) o;
    return Objects.equals(this.qos, dbv0037QosLimitsMaxWallClockPer.qos) &&
        Objects.equals(this.job, dbv0037QosLimitsMaxWallClockPer.job);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qos, job);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dbv0037QosLimitsMaxWallClockPer {\n");
    sb.append("    qos: ").append(toIndentedString(qos)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
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
    openapiFields.add("qos");
    openapiFields.add("job");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Dbv0037QosLimitsMaxWallClockPer
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Dbv0037QosLimitsMaxWallClockPer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dbv0037QosLimitsMaxWallClockPer is not found in the empty JSON string", Dbv0037QosLimitsMaxWallClockPer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Dbv0037QosLimitsMaxWallClockPer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dbv0037QosLimitsMaxWallClockPer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dbv0037QosLimitsMaxWallClockPer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dbv0037QosLimitsMaxWallClockPer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dbv0037QosLimitsMaxWallClockPer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dbv0037QosLimitsMaxWallClockPer.class));

       return (TypeAdapter<T>) new TypeAdapter<Dbv0037QosLimitsMaxWallClockPer>() {
           @Override
           public void write(JsonWriter out, Dbv0037QosLimitsMaxWallClockPer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dbv0037QosLimitsMaxWallClockPer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Dbv0037QosLimitsMaxWallClockPer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Dbv0037QosLimitsMaxWallClockPer
  * @throws IOException if the JSON string is invalid with respect to Dbv0037QosLimitsMaxWallClockPer
  */
  public static Dbv0037QosLimitsMaxWallClockPer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dbv0037QosLimitsMaxWallClockPer.class);
  }

 /**
  * Convert an instance of Dbv0037QosLimitsMaxWallClockPer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

