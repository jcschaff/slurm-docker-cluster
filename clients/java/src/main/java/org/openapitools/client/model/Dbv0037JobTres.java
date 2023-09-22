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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Dbv0037TresListInner;

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
 * TRES settings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Dbv0037JobTres {
  public static final String SERIALIZED_NAME_ALLOCATED = "allocated";
  @SerializedName(SERIALIZED_NAME_ALLOCATED)
  private List<Dbv0037TresListInner> allocated;

  public static final String SERIALIZED_NAME_REQUESTED = "requested";
  @SerializedName(SERIALIZED_NAME_REQUESTED)
  private List<Dbv0037TresListInner> requested;

  public Dbv0037JobTres() {
  }

  public Dbv0037JobTres allocated(List<Dbv0037TresListInner> allocated) {
    
    this.allocated = allocated;
    return this;
  }

  public Dbv0037JobTres addAllocatedItem(Dbv0037TresListInner allocatedItem) {
    if (this.allocated == null) {
      this.allocated = new ArrayList<>();
    }
    this.allocated.add(allocatedItem);
    return this;
  }

   /**
   * TRES list of attributes
   * @return allocated
  **/
  @javax.annotation.Nullable
  public List<Dbv0037TresListInner> getAllocated() {
    return allocated;
  }


  public void setAllocated(List<Dbv0037TresListInner> allocated) {
    this.allocated = allocated;
  }


  public Dbv0037JobTres requested(List<Dbv0037TresListInner> requested) {
    
    this.requested = requested;
    return this;
  }

  public Dbv0037JobTres addRequestedItem(Dbv0037TresListInner requestedItem) {
    if (this.requested == null) {
      this.requested = new ArrayList<>();
    }
    this.requested.add(requestedItem);
    return this;
  }

   /**
   * TRES list of attributes
   * @return requested
  **/
  @javax.annotation.Nullable
  public List<Dbv0037TresListInner> getRequested() {
    return requested;
  }


  public void setRequested(List<Dbv0037TresListInner> requested) {
    this.requested = requested;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dbv0037JobTres dbv0037JobTres = (Dbv0037JobTres) o;
    return Objects.equals(this.allocated, dbv0037JobTres.allocated) &&
        Objects.equals(this.requested, dbv0037JobTres.requested);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocated, requested);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dbv0037JobTres {\n");
    sb.append("    allocated: ").append(toIndentedString(allocated)).append("\n");
    sb.append("    requested: ").append(toIndentedString(requested)).append("\n");
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
    openapiFields.add("allocated");
    openapiFields.add("requested");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Dbv0037JobTres
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Dbv0037JobTres.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dbv0037JobTres is not found in the empty JSON string", Dbv0037JobTres.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Dbv0037JobTres.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dbv0037JobTres` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("allocated") != null && !jsonObj.get("allocated").isJsonNull()) {
        JsonArray jsonArrayallocated = jsonObj.getAsJsonArray("allocated");
        if (jsonArrayallocated != null) {
          // ensure the json data is an array
          if (!jsonObj.get("allocated").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `allocated` to be an array in the JSON string but got `%s`", jsonObj.get("allocated").toString()));
          }

          // validate the optional field `allocated` (array)
          for (int i = 0; i < jsonArrayallocated.size(); i++) {
            Dbv0037TresListInner.validateJsonElement(jsonArrayallocated.get(i));
          };
        }
      }
      if (jsonObj.get("requested") != null && !jsonObj.get("requested").isJsonNull()) {
        JsonArray jsonArrayrequested = jsonObj.getAsJsonArray("requested");
        if (jsonArrayrequested != null) {
          // ensure the json data is an array
          if (!jsonObj.get("requested").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `requested` to be an array in the JSON string but got `%s`", jsonObj.get("requested").toString()));
          }

          // validate the optional field `requested` (array)
          for (int i = 0; i < jsonArrayrequested.size(); i++) {
            Dbv0037TresListInner.validateJsonElement(jsonArrayrequested.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dbv0037JobTres.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dbv0037JobTres' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dbv0037JobTres> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dbv0037JobTres.class));

       return (TypeAdapter<T>) new TypeAdapter<Dbv0037JobTres>() {
           @Override
           public void write(JsonWriter out, Dbv0037JobTres value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dbv0037JobTres read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Dbv0037JobTres given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Dbv0037JobTres
  * @throws IOException if the JSON string is invalid with respect to Dbv0037JobTres
  */
  public static Dbv0037JobTres fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dbv0037JobTres.class);
  }

 /**
  * Convert an instance of Dbv0037JobTres to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

