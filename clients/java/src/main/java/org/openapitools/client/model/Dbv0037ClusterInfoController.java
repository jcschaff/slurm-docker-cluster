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
 * Information about controller
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Dbv0037ClusterInfoController {
  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public Dbv0037ClusterInfoController() {
  }

  public Dbv0037ClusterInfoController host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * Hostname
   * @return host
  **/
  @javax.annotation.Nullable
  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public Dbv0037ClusterInfoController port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Port number
   * @return port
  **/
  @javax.annotation.Nullable
  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dbv0037ClusterInfoController dbv0037ClusterInfoController = (Dbv0037ClusterInfoController) o;
    return Objects.equals(this.host, dbv0037ClusterInfoController.host) &&
        Objects.equals(this.port, dbv0037ClusterInfoController.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dbv0037ClusterInfoController {\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
    openapiFields.add("host");
    openapiFields.add("port");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Dbv0037ClusterInfoController
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Dbv0037ClusterInfoController.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dbv0037ClusterInfoController is not found in the empty JSON string", Dbv0037ClusterInfoController.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Dbv0037ClusterInfoController.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dbv0037ClusterInfoController` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("host") != null && !jsonObj.get("host").isJsonNull()) && !jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dbv0037ClusterInfoController.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dbv0037ClusterInfoController' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dbv0037ClusterInfoController> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dbv0037ClusterInfoController.class));

       return (TypeAdapter<T>) new TypeAdapter<Dbv0037ClusterInfoController>() {
           @Override
           public void write(JsonWriter out, Dbv0037ClusterInfoController value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dbv0037ClusterInfoController read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Dbv0037ClusterInfoController given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Dbv0037ClusterInfoController
  * @throws IOException if the JSON string is invalid with respect to Dbv0037ClusterInfoController
  */
  public static Dbv0037ClusterInfoController fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dbv0037ClusterInfoController.class);
  }

 /**
  * Convert an instance of Dbv0037ClusterInfoController to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

