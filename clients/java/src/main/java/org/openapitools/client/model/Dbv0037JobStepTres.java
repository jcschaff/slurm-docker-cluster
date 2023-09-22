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
import org.openapitools.client.model.Dbv0037JobStepTresRequested;
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
 * TRES usage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Dbv0037JobStepTres {
  public static final String SERIALIZED_NAME_REQUESTED = "requested";
  @SerializedName(SERIALIZED_NAME_REQUESTED)
  private Dbv0037JobStepTresRequested requested;

  public static final String SERIALIZED_NAME_CONSUMED = "consumed";
  @SerializedName(SERIALIZED_NAME_CONSUMED)
  private Dbv0037JobStepTresRequested consumed;

  public static final String SERIALIZED_NAME_ALLOCATED = "allocated";
  @SerializedName(SERIALIZED_NAME_ALLOCATED)
  private List<Dbv0037TresListInner> allocated;

  public Dbv0037JobStepTres() {
  }

  public Dbv0037JobStepTres requested(Dbv0037JobStepTresRequested requested) {
    
    this.requested = requested;
    return this;
  }

   /**
   * Get requested
   * @return requested
  **/
  @javax.annotation.Nullable
  public Dbv0037JobStepTresRequested getRequested() {
    return requested;
  }


  public void setRequested(Dbv0037JobStepTresRequested requested) {
    this.requested = requested;
  }


  public Dbv0037JobStepTres consumed(Dbv0037JobStepTresRequested consumed) {
    
    this.consumed = consumed;
    return this;
  }

   /**
   * Get consumed
   * @return consumed
  **/
  @javax.annotation.Nullable
  public Dbv0037JobStepTresRequested getConsumed() {
    return consumed;
  }


  public void setConsumed(Dbv0037JobStepTresRequested consumed) {
    this.consumed = consumed;
  }


  public Dbv0037JobStepTres allocated(List<Dbv0037TresListInner> allocated) {
    
    this.allocated = allocated;
    return this;
  }

  public Dbv0037JobStepTres addAllocatedItem(Dbv0037TresListInner allocatedItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dbv0037JobStepTres dbv0037JobStepTres = (Dbv0037JobStepTres) o;
    return Objects.equals(this.requested, dbv0037JobStepTres.requested) &&
        Objects.equals(this.consumed, dbv0037JobStepTres.consumed) &&
        Objects.equals(this.allocated, dbv0037JobStepTres.allocated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requested, consumed, allocated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dbv0037JobStepTres {\n");
    sb.append("    requested: ").append(toIndentedString(requested)).append("\n");
    sb.append("    consumed: ").append(toIndentedString(consumed)).append("\n");
    sb.append("    allocated: ").append(toIndentedString(allocated)).append("\n");
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
    openapiFields.add("requested");
    openapiFields.add("consumed");
    openapiFields.add("allocated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Dbv0037JobStepTres
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Dbv0037JobStepTres.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dbv0037JobStepTres is not found in the empty JSON string", Dbv0037JobStepTres.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Dbv0037JobStepTres.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dbv0037JobStepTres` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `requested`
      if (jsonObj.get("requested") != null && !jsonObj.get("requested").isJsonNull()) {
        Dbv0037JobStepTresRequested.validateJsonElement(jsonObj.get("requested"));
      }
      // validate the optional field `consumed`
      if (jsonObj.get("consumed") != null && !jsonObj.get("consumed").isJsonNull()) {
        Dbv0037JobStepTresRequested.validateJsonElement(jsonObj.get("consumed"));
      }
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dbv0037JobStepTres.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dbv0037JobStepTres' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dbv0037JobStepTres> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dbv0037JobStepTres.class));

       return (TypeAdapter<T>) new TypeAdapter<Dbv0037JobStepTres>() {
           @Override
           public void write(JsonWriter out, Dbv0037JobStepTres value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dbv0037JobStepTres read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Dbv0037JobStepTres given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Dbv0037JobStepTres
  * @throws IOException if the JSON string is invalid with respect to Dbv0037JobStepTres
  */
  public static Dbv0037JobStepTres fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dbv0037JobStepTres.class);
  }

 /**
  * Convert an instance of Dbv0037JobStepTres to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
