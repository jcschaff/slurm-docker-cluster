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
import org.openapitools.client.model.Dbv0037JobExitCodeSignal;

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
 * Dbv0037JobExitCode
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Dbv0037JobExitCode {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_RETURN_CODE = "return_code";
  @SerializedName(SERIALIZED_NAME_RETURN_CODE)
  private Integer returnCode;

  public static final String SERIALIZED_NAME_SIGNAL = "signal";
  @SerializedName(SERIALIZED_NAME_SIGNAL)
  private Dbv0037JobExitCodeSignal signal;

  public Dbv0037JobExitCode() {
  }

  public Dbv0037JobExitCode status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Job exit status
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public Dbv0037JobExitCode returnCode(Integer returnCode) {
    
    this.returnCode = returnCode;
    return this;
  }

   /**
   * Return code from parent process
   * @return returnCode
  **/
  @javax.annotation.Nullable
  public Integer getReturnCode() {
    return returnCode;
  }


  public void setReturnCode(Integer returnCode) {
    this.returnCode = returnCode;
  }


  public Dbv0037JobExitCode signal(Dbv0037JobExitCodeSignal signal) {
    
    this.signal = signal;
    return this;
  }

   /**
   * Get signal
   * @return signal
  **/
  @javax.annotation.Nullable
  public Dbv0037JobExitCodeSignal getSignal() {
    return signal;
  }


  public void setSignal(Dbv0037JobExitCodeSignal signal) {
    this.signal = signal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dbv0037JobExitCode dbv0037JobExitCode = (Dbv0037JobExitCode) o;
    return Objects.equals(this.status, dbv0037JobExitCode.status) &&
        Objects.equals(this.returnCode, dbv0037JobExitCode.returnCode) &&
        Objects.equals(this.signal, dbv0037JobExitCode.signal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, returnCode, signal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dbv0037JobExitCode {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    returnCode: ").append(toIndentedString(returnCode)).append("\n");
    sb.append("    signal: ").append(toIndentedString(signal)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("return_code");
    openapiFields.add("signal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Dbv0037JobExitCode
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Dbv0037JobExitCode.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dbv0037JobExitCode is not found in the empty JSON string", Dbv0037JobExitCode.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Dbv0037JobExitCode.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dbv0037JobExitCode` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `signal`
      if (jsonObj.get("signal") != null && !jsonObj.get("signal").isJsonNull()) {
        Dbv0037JobExitCodeSignal.validateJsonElement(jsonObj.get("signal"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dbv0037JobExitCode.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dbv0037JobExitCode' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dbv0037JobExitCode> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dbv0037JobExitCode.class));

       return (TypeAdapter<T>) new TypeAdapter<Dbv0037JobExitCode>() {
           @Override
           public void write(JsonWriter out, Dbv0037JobExitCode value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dbv0037JobExitCode read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Dbv0037JobExitCode given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Dbv0037JobExitCode
  * @throws IOException if the JSON string is invalid with respect to Dbv0037JobExitCode
  */
  public static Dbv0037JobExitCode fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dbv0037JobExitCode.class);
  }

 /**
  * Convert an instance of Dbv0037JobExitCode to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
