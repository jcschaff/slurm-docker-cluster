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
import org.openapitools.client.model.Dbv0037AssociationMaxTresGroup;
import org.openapitools.client.model.Dbv0037AssociationMaxTresMinutes;
import org.openapitools.client.model.Dbv0037AssociationMaxTresPer;
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
 * Max TRES settings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Dbv0037AssociationMaxTres {
  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private Dbv0037AssociationMaxTresGroup group;

  public static final String SERIALIZED_NAME_PER = "per";
  @SerializedName(SERIALIZED_NAME_PER)
  private Dbv0037AssociationMaxTresPer per;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private List<Dbv0037TresListInner> total;

  public static final String SERIALIZED_NAME_MINUTES = "minutes";
  @SerializedName(SERIALIZED_NAME_MINUTES)
  private Dbv0037AssociationMaxTresMinutes minutes;

  public Dbv0037AssociationMaxTres() {
  }

  public Dbv0037AssociationMaxTres group(Dbv0037AssociationMaxTresGroup group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  public Dbv0037AssociationMaxTresGroup getGroup() {
    return group;
  }


  public void setGroup(Dbv0037AssociationMaxTresGroup group) {
    this.group = group;
  }


  public Dbv0037AssociationMaxTres per(Dbv0037AssociationMaxTresPer per) {
    
    this.per = per;
    return this;
  }

   /**
   * Get per
   * @return per
  **/
  @javax.annotation.Nullable
  public Dbv0037AssociationMaxTresPer getPer() {
    return per;
  }


  public void setPer(Dbv0037AssociationMaxTresPer per) {
    this.per = per;
  }


  public Dbv0037AssociationMaxTres total(List<Dbv0037TresListInner> total) {
    
    this.total = total;
    return this;
  }

  public Dbv0037AssociationMaxTres addTotalItem(Dbv0037TresListInner totalItem) {
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


  public Dbv0037AssociationMaxTres minutes(Dbv0037AssociationMaxTresMinutes minutes) {
    
    this.minutes = minutes;
    return this;
  }

   /**
   * Get minutes
   * @return minutes
  **/
  @javax.annotation.Nullable
  public Dbv0037AssociationMaxTresMinutes getMinutes() {
    return minutes;
  }


  public void setMinutes(Dbv0037AssociationMaxTresMinutes minutes) {
    this.minutes = minutes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dbv0037AssociationMaxTres dbv0037AssociationMaxTres = (Dbv0037AssociationMaxTres) o;
    return Objects.equals(this.group, dbv0037AssociationMaxTres.group) &&
        Objects.equals(this.per, dbv0037AssociationMaxTres.per) &&
        Objects.equals(this.total, dbv0037AssociationMaxTres.total) &&
        Objects.equals(this.minutes, dbv0037AssociationMaxTres.minutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, per, total, minutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dbv0037AssociationMaxTres {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    per: ").append(toIndentedString(per)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
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
    openapiFields.add("group");
    openapiFields.add("per");
    openapiFields.add("total");
    openapiFields.add("minutes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Dbv0037AssociationMaxTres
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Dbv0037AssociationMaxTres.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dbv0037AssociationMaxTres is not found in the empty JSON string", Dbv0037AssociationMaxTres.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Dbv0037AssociationMaxTres.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dbv0037AssociationMaxTres` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `group`
      if (jsonObj.get("group") != null && !jsonObj.get("group").isJsonNull()) {
        Dbv0037AssociationMaxTresGroup.validateJsonElement(jsonObj.get("group"));
      }
      // validate the optional field `per`
      if (jsonObj.get("per") != null && !jsonObj.get("per").isJsonNull()) {
        Dbv0037AssociationMaxTresPer.validateJsonElement(jsonObj.get("per"));
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
      // validate the optional field `minutes`
      if (jsonObj.get("minutes") != null && !jsonObj.get("minutes").isJsonNull()) {
        Dbv0037AssociationMaxTresMinutes.validateJsonElement(jsonObj.get("minutes"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dbv0037AssociationMaxTres.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dbv0037AssociationMaxTres' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dbv0037AssociationMaxTres> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dbv0037AssociationMaxTres.class));

       return (TypeAdapter<T>) new TypeAdapter<Dbv0037AssociationMaxTres>() {
           @Override
           public void write(JsonWriter out, Dbv0037AssociationMaxTres value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dbv0037AssociationMaxTres read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Dbv0037AssociationMaxTres given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Dbv0037AssociationMaxTres
  * @throws IOException if the JSON string is invalid with respect to Dbv0037AssociationMaxTres
  */
  public static Dbv0037AssociationMaxTres fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dbv0037AssociationMaxTres.class);
  }

 /**
  * Convert an instance of Dbv0037AssociationMaxTres to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

