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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Dbv0037QosLimits;
import org.openapitools.client.model.Dbv0037QosPreempt;

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
 * QOS description
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Dbv0037Qos {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FLAGS = "flags";
  @SerializedName(SERIALIZED_NAME_FLAGS)
  private List<String> flags;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LIMITS = "limits";
  @SerializedName(SERIALIZED_NAME_LIMITS)
  private Dbv0037QosLimits limits;

  public static final String SERIALIZED_NAME_PREEMPT = "preempt";
  @SerializedName(SERIALIZED_NAME_PREEMPT)
  private Dbv0037QosPreempt preempt;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_USAGE_FACTOR = "usage_factor";
  @SerializedName(SERIALIZED_NAME_USAGE_FACTOR)
  private BigDecimal usageFactor;

  public static final String SERIALIZED_NAME_USAGE_THRESHOLD = "usage_threshold";
  @SerializedName(SERIALIZED_NAME_USAGE_THRESHOLD)
  private BigDecimal usageThreshold;

  public Dbv0037Qos() {
  }

  public Dbv0037Qos description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * QOS description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Dbv0037Qos flags(List<String> flags) {
    
    this.flags = flags;
    return this;
  }

  public Dbv0037Qos addFlagsItem(String flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<>();
    }
    this.flags.add(flagsItem);
    return this;
  }

   /**
   * List of properties of QOS
   * @return flags
  **/
  @javax.annotation.Nullable
  public List<String> getFlags() {
    return flags;
  }


  public void setFlags(List<String> flags) {
    this.flags = flags;
  }


  public Dbv0037Qos id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Database id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Dbv0037Qos limits(Dbv0037QosLimits limits) {
    
    this.limits = limits;
    return this;
  }

   /**
   * Get limits
   * @return limits
  **/
  @javax.annotation.Nullable
  public Dbv0037QosLimits getLimits() {
    return limits;
  }


  public void setLimits(Dbv0037QosLimits limits) {
    this.limits = limits;
  }


  public Dbv0037Qos preempt(Dbv0037QosPreempt preempt) {
    
    this.preempt = preempt;
    return this;
  }

   /**
   * Get preempt
   * @return preempt
  **/
  @javax.annotation.Nullable
  public Dbv0037QosPreempt getPreempt() {
    return preempt;
  }


  public void setPreempt(Dbv0037QosPreempt preempt) {
    this.preempt = preempt;
  }


  public Dbv0037Qos priority(Integer priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * QOS priority
   * @return priority
  **/
  @javax.annotation.Nullable
  public Integer getPriority() {
    return priority;
  }


  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public Dbv0037Qos usageFactor(BigDecimal usageFactor) {
    
    this.usageFactor = usageFactor;
    return this;
  }

   /**
   * Usage factor
   * @return usageFactor
  **/
  @javax.annotation.Nullable
  public BigDecimal getUsageFactor() {
    return usageFactor;
  }


  public void setUsageFactor(BigDecimal usageFactor) {
    this.usageFactor = usageFactor;
  }


  public Dbv0037Qos usageThreshold(BigDecimal usageThreshold) {
    
    this.usageThreshold = usageThreshold;
    return this;
  }

   /**
   * Usage threshold
   * @return usageThreshold
  **/
  @javax.annotation.Nullable
  public BigDecimal getUsageThreshold() {
    return usageThreshold;
  }


  public void setUsageThreshold(BigDecimal usageThreshold) {
    this.usageThreshold = usageThreshold;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dbv0037Qos dbv0037Qos = (Dbv0037Qos) o;
    return Objects.equals(this.description, dbv0037Qos.description) &&
        Objects.equals(this.flags, dbv0037Qos.flags) &&
        Objects.equals(this.id, dbv0037Qos.id) &&
        Objects.equals(this.limits, dbv0037Qos.limits) &&
        Objects.equals(this.preempt, dbv0037Qos.preempt) &&
        Objects.equals(this.priority, dbv0037Qos.priority) &&
        Objects.equals(this.usageFactor, dbv0037Qos.usageFactor) &&
        Objects.equals(this.usageThreshold, dbv0037Qos.usageThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, flags, id, limits, preempt, priority, usageFactor, usageThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dbv0037Qos {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    preempt: ").append(toIndentedString(preempt)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    usageFactor: ").append(toIndentedString(usageFactor)).append("\n");
    sb.append("    usageThreshold: ").append(toIndentedString(usageThreshold)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("flags");
    openapiFields.add("id");
    openapiFields.add("limits");
    openapiFields.add("preempt");
    openapiFields.add("priority");
    openapiFields.add("usage_factor");
    openapiFields.add("usage_threshold");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Dbv0037Qos
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Dbv0037Qos.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dbv0037Qos is not found in the empty JSON string", Dbv0037Qos.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Dbv0037Qos.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dbv0037Qos` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("flags") != null && !jsonObj.get("flags").isJsonNull() && !jsonObj.get("flags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `flags` to be an array in the JSON string but got `%s`", jsonObj.get("flags").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `limits`
      if (jsonObj.get("limits") != null && !jsonObj.get("limits").isJsonNull()) {
        Dbv0037QosLimits.validateJsonElement(jsonObj.get("limits"));
      }
      // validate the optional field `preempt`
      if (jsonObj.get("preempt") != null && !jsonObj.get("preempt").isJsonNull()) {
        Dbv0037QosPreempt.validateJsonElement(jsonObj.get("preempt"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dbv0037Qos.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dbv0037Qos' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dbv0037Qos> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dbv0037Qos.class));

       return (TypeAdapter<T>) new TypeAdapter<Dbv0037Qos>() {
           @Override
           public void write(JsonWriter out, Dbv0037Qos value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dbv0037Qos read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Dbv0037Qos given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Dbv0037Qos
  * @throws IOException if the JSON string is invalid with respect to Dbv0037Qos
  */
  public static Dbv0037Qos fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dbv0037Qos.class);
  }

 /**
  * Convert an instance of Dbv0037Qos to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

