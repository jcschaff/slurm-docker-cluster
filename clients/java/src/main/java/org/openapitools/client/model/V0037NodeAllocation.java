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
 * V0037NodeAllocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class V0037NodeAllocation {
  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private Integer memory;

  public static final String SERIALIZED_NAME_CPUS = "cpus";
  @SerializedName(SERIALIZED_NAME_CPUS)
  private Object cpus;

  public static final String SERIALIZED_NAME_SOCKETS = "sockets";
  @SerializedName(SERIALIZED_NAME_SOCKETS)
  private Object sockets;

  public static final String SERIALIZED_NAME_CORES = "cores";
  @SerializedName(SERIALIZED_NAME_CORES)
  private Object cores;

  public V0037NodeAllocation() {
  }

  public V0037NodeAllocation memory(Integer memory) {
    
    this.memory = memory;
    return this;
  }

   /**
   * amount of assigned job memory
   * @return memory
  **/
  @javax.annotation.Nullable
  public Integer getMemory() {
    return memory;
  }


  public void setMemory(Integer memory) {
    this.memory = memory;
  }


  public V0037NodeAllocation cpus(Object cpus) {
    
    this.cpus = cpus;
    return this;
  }

   /**
   * amount of assigned job CPUs
   * @return cpus
  **/
  @javax.annotation.Nullable
  public Object getCpus() {
    return cpus;
  }


  public void setCpus(Object cpus) {
    this.cpus = cpus;
  }


  public V0037NodeAllocation sockets(Object sockets) {
    
    this.sockets = sockets;
    return this;
  }

   /**
   * assignment status of each socket by socket id
   * @return sockets
  **/
  @javax.annotation.Nullable
  public Object getSockets() {
    return sockets;
  }


  public void setSockets(Object sockets) {
    this.sockets = sockets;
  }


  public V0037NodeAllocation cores(Object cores) {
    
    this.cores = cores;
    return this;
  }

   /**
   * assignment status of each core by core id
   * @return cores
  **/
  @javax.annotation.Nullable
  public Object getCores() {
    return cores;
  }


  public void setCores(Object cores) {
    this.cores = cores;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V0037NodeAllocation v0037NodeAllocation = (V0037NodeAllocation) o;
    return Objects.equals(this.memory, v0037NodeAllocation.memory) &&
        Objects.equals(this.cpus, v0037NodeAllocation.cpus) &&
        Objects.equals(this.sockets, v0037NodeAllocation.sockets) &&
        Objects.equals(this.cores, v0037NodeAllocation.cores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memory, cpus, sockets, cores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V0037NodeAllocation {\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    cpus: ").append(toIndentedString(cpus)).append("\n");
    sb.append("    sockets: ").append(toIndentedString(sockets)).append("\n");
    sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
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
    openapiFields.add("memory");
    openapiFields.add("cpus");
    openapiFields.add("sockets");
    openapiFields.add("cores");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V0037NodeAllocation
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V0037NodeAllocation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V0037NodeAllocation is not found in the empty JSON string", V0037NodeAllocation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V0037NodeAllocation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V0037NodeAllocation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V0037NodeAllocation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V0037NodeAllocation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V0037NodeAllocation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V0037NodeAllocation.class));

       return (TypeAdapter<T>) new TypeAdapter<V0037NodeAllocation>() {
           @Override
           public void write(JsonWriter out, V0037NodeAllocation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V0037NodeAllocation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V0037NodeAllocation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V0037NodeAllocation
  * @throws IOException if the JSON string is invalid with respect to V0037NodeAllocation
  */
  public static V0037NodeAllocation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V0037NodeAllocation.class);
  }

 /**
  * Convert an instance of V0037NodeAllocation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
