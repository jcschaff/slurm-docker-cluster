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
import org.openapitools.client.model.Dbv0037AssociationMaxJobs;
import org.openapitools.client.model.Dbv0037AssociationMaxPer;
import org.openapitools.client.model.Dbv0037AssociationMaxTres;

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
 * Max settings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Dbv0037AssociationMax {
  public static final String SERIALIZED_NAME_JOBS = "jobs";
  @SerializedName(SERIALIZED_NAME_JOBS)
  private Dbv0037AssociationMaxJobs jobs;

  public static final String SERIALIZED_NAME_PER = "per";
  @SerializedName(SERIALIZED_NAME_PER)
  private Dbv0037AssociationMaxPer per;

  public static final String SERIALIZED_NAME_TRES = "tres";
  @SerializedName(SERIALIZED_NAME_TRES)
  private Dbv0037AssociationMaxTres tres;

  public Dbv0037AssociationMax() {
  }

  public Dbv0037AssociationMax jobs(Dbv0037AssociationMaxJobs jobs) {
    
    this.jobs = jobs;
    return this;
  }

   /**
   * Get jobs
   * @return jobs
  **/
  @javax.annotation.Nullable
  public Dbv0037AssociationMaxJobs getJobs() {
    return jobs;
  }


  public void setJobs(Dbv0037AssociationMaxJobs jobs) {
    this.jobs = jobs;
  }


  public Dbv0037AssociationMax per(Dbv0037AssociationMaxPer per) {
    
    this.per = per;
    return this;
  }

   /**
   * Get per
   * @return per
  **/
  @javax.annotation.Nullable
  public Dbv0037AssociationMaxPer getPer() {
    return per;
  }


  public void setPer(Dbv0037AssociationMaxPer per) {
    this.per = per;
  }


  public Dbv0037AssociationMax tres(Dbv0037AssociationMaxTres tres) {
    
    this.tres = tres;
    return this;
  }

   /**
   * Get tres
   * @return tres
  **/
  @javax.annotation.Nullable
  public Dbv0037AssociationMaxTres getTres() {
    return tres;
  }


  public void setTres(Dbv0037AssociationMaxTres tres) {
    this.tres = tres;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dbv0037AssociationMax dbv0037AssociationMax = (Dbv0037AssociationMax) o;
    return Objects.equals(this.jobs, dbv0037AssociationMax.jobs) &&
        Objects.equals(this.per, dbv0037AssociationMax.per) &&
        Objects.equals(this.tres, dbv0037AssociationMax.tres);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobs, per, tres);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dbv0037AssociationMax {\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
    sb.append("    per: ").append(toIndentedString(per)).append("\n");
    sb.append("    tres: ").append(toIndentedString(tres)).append("\n");
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
    openapiFields.add("jobs");
    openapiFields.add("per");
    openapiFields.add("tres");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Dbv0037AssociationMax
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Dbv0037AssociationMax.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dbv0037AssociationMax is not found in the empty JSON string", Dbv0037AssociationMax.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Dbv0037AssociationMax.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dbv0037AssociationMax` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `jobs`
      if (jsonObj.get("jobs") != null && !jsonObj.get("jobs").isJsonNull()) {
        Dbv0037AssociationMaxJobs.validateJsonElement(jsonObj.get("jobs"));
      }
      // validate the optional field `per`
      if (jsonObj.get("per") != null && !jsonObj.get("per").isJsonNull()) {
        Dbv0037AssociationMaxPer.validateJsonElement(jsonObj.get("per"));
      }
      // validate the optional field `tres`
      if (jsonObj.get("tres") != null && !jsonObj.get("tres").isJsonNull()) {
        Dbv0037AssociationMaxTres.validateJsonElement(jsonObj.get("tres"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dbv0037AssociationMax.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dbv0037AssociationMax' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dbv0037AssociationMax> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dbv0037AssociationMax.class));

       return (TypeAdapter<T>) new TypeAdapter<Dbv0037AssociationMax>() {
           @Override
           public void write(JsonWriter out, Dbv0037AssociationMax value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dbv0037AssociationMax read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Dbv0037AssociationMax given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Dbv0037AssociationMax
  * @throws IOException if the JSON string is invalid with respect to Dbv0037AssociationMax
  */
  public static Dbv0037AssociationMax fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dbv0037AssociationMax.class);
  }

 /**
  * Convert an instance of Dbv0037AssociationMax to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
