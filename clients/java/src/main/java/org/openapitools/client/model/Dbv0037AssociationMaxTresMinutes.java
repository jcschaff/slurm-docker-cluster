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
import org.openapitools.client.model.Dbv0037AssociationMaxTresMinutesPer;
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
 * Max TRES minutes settings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Dbv0037AssociationMaxTresMinutes {
  public static final String SERIALIZED_NAME_PER = "per";
  @SerializedName(SERIALIZED_NAME_PER)
  private Dbv0037AssociationMaxTresMinutesPer per;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private List<Dbv0037TresListInner> total;

  public Dbv0037AssociationMaxTresMinutes() {
  }

  public Dbv0037AssociationMaxTresMinutes per(Dbv0037AssociationMaxTresMinutesPer per) {
    
    this.per = per;
    return this;
  }

   /**
   * Get per
   * @return per
  **/
  @javax.annotation.Nullable
  public Dbv0037AssociationMaxTresMinutesPer getPer() {
    return per;
  }


  public void setPer(Dbv0037AssociationMaxTresMinutesPer per) {
    this.per = per;
  }


  public Dbv0037AssociationMaxTresMinutes total(List<Dbv0037TresListInner> total) {
    
    this.total = total;
    return this;
  }

  public Dbv0037AssociationMaxTresMinutes addTotalItem(Dbv0037TresListInner totalItem) {
    if (this.total == null) {
      this.total = new ArrayList<>();
    }
    this.total.add(totalItem);
    return this;
  }

   /**
   * TRES list of attributes
   * @return total
  **/
  @javax.annotation.Nullable
  public List<Dbv0037TresListInner> getTotal() {
    return total;
  }


  public void setTotal(List<Dbv0037TresListInner> total) {
    this.total = total;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dbv0037AssociationMaxTresMinutes dbv0037AssociationMaxTresMinutes = (Dbv0037AssociationMaxTresMinutes) o;
    return Objects.equals(this.per, dbv0037AssociationMaxTresMinutes.per) &&
        Objects.equals(this.total, dbv0037AssociationMaxTresMinutes.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(per, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dbv0037AssociationMaxTresMinutes {\n");
    sb.append("    per: ").append(toIndentedString(per)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("per");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Dbv0037AssociationMaxTresMinutes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Dbv0037AssociationMaxTresMinutes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dbv0037AssociationMaxTresMinutes is not found in the empty JSON string", Dbv0037AssociationMaxTresMinutes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Dbv0037AssociationMaxTresMinutes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dbv0037AssociationMaxTresMinutes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `per`
      if (jsonObj.get("per") != null && !jsonObj.get("per").isJsonNull()) {
        Dbv0037AssociationMaxTresMinutesPer.validateJsonElement(jsonObj.get("per"));
      }
      if (jsonObj.get("total") != null && !jsonObj.get("total").isJsonNull()) {
        JsonArray jsonArraytotal = jsonObj.getAsJsonArray("total");
        if (jsonArraytotal != null) {
          // ensure the json data is an array
          if (!jsonObj.get("total").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `total` to be an array in the JSON string but got `%s`", jsonObj.get("total").toString()));
          }

          // validate the optional field `total` (array)
          for (int i = 0; i < jsonArraytotal.size(); i++) {
            Dbv0037TresListInner.validateJsonElement(jsonArraytotal.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dbv0037AssociationMaxTresMinutes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dbv0037AssociationMaxTresMinutes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dbv0037AssociationMaxTresMinutes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dbv0037AssociationMaxTresMinutes.class));

       return (TypeAdapter<T>) new TypeAdapter<Dbv0037AssociationMaxTresMinutes>() {
           @Override
           public void write(JsonWriter out, Dbv0037AssociationMaxTresMinutes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dbv0037AssociationMaxTresMinutes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Dbv0037AssociationMaxTresMinutes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Dbv0037AssociationMaxTresMinutes
  * @throws IOException if the JSON string is invalid with respect to Dbv0037AssociationMaxTresMinutes
  */
  public static Dbv0037AssociationMaxTresMinutes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dbv0037AssociationMaxTresMinutes.class);
  }

 /**
  * Convert an instance of Dbv0037AssociationMaxTresMinutes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

