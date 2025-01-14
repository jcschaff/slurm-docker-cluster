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
import org.openapitools.client.model.V0037Error;
import org.openapitools.client.model.V0037Reservation;

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
 * V0037ReservationsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class V0037ReservationsResponse {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<V0037Error> errors;

  public static final String SERIALIZED_NAME_RESERVATIONS = "reservations";
  @SerializedName(SERIALIZED_NAME_RESERVATIONS)
  private List<V0037Reservation> reservations;

  public V0037ReservationsResponse() {
  }

  public V0037ReservationsResponse errors(List<V0037Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public V0037ReservationsResponse addErrorsItem(V0037Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * slurm errors
   * @return errors
  **/
  @javax.annotation.Nullable
  public List<V0037Error> getErrors() {
    return errors;
  }


  public void setErrors(List<V0037Error> errors) {
    this.errors = errors;
  }


  public V0037ReservationsResponse reservations(List<V0037Reservation> reservations) {
    
    this.reservations = reservations;
    return this;
  }

  public V0037ReservationsResponse addReservationsItem(V0037Reservation reservationsItem) {
    if (this.reservations == null) {
      this.reservations = new ArrayList<>();
    }
    this.reservations.add(reservationsItem);
    return this;
  }

   /**
   * reservation info
   * @return reservations
  **/
  @javax.annotation.Nullable
  public List<V0037Reservation> getReservations() {
    return reservations;
  }


  public void setReservations(List<V0037Reservation> reservations) {
    this.reservations = reservations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V0037ReservationsResponse v0037ReservationsResponse = (V0037ReservationsResponse) o;
    return Objects.equals(this.errors, v0037ReservationsResponse.errors) &&
        Objects.equals(this.reservations, v0037ReservationsResponse.reservations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, reservations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V0037ReservationsResponse {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    reservations: ").append(toIndentedString(reservations)).append("\n");
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
    openapiFields.add("errors");
    openapiFields.add("reservations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V0037ReservationsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V0037ReservationsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V0037ReservationsResponse is not found in the empty JSON string", V0037ReservationsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V0037ReservationsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V0037ReservationsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) {
        JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
        if (jsonArrayerrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("errors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
          }

          // validate the optional field `errors` (array)
          for (int i = 0; i < jsonArrayerrors.size(); i++) {
            V0037Error.validateJsonElement(jsonArrayerrors.get(i));
          };
        }
      }
      if (jsonObj.get("reservations") != null && !jsonObj.get("reservations").isJsonNull()) {
        JsonArray jsonArrayreservations = jsonObj.getAsJsonArray("reservations");
        if (jsonArrayreservations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("reservations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `reservations` to be an array in the JSON string but got `%s`", jsonObj.get("reservations").toString()));
          }

          // validate the optional field `reservations` (array)
          for (int i = 0; i < jsonArrayreservations.size(); i++) {
            V0037Reservation.validateJsonElement(jsonArrayreservations.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V0037ReservationsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V0037ReservationsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V0037ReservationsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V0037ReservationsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<V0037ReservationsResponse>() {
           @Override
           public void write(JsonWriter out, V0037ReservationsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V0037ReservationsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V0037ReservationsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V0037ReservationsResponse
  * @throws IOException if the JSON string is invalid with respect to V0037ReservationsResponse
  */
  public static V0037ReservationsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V0037ReservationsResponse.class);
  }

 /**
  * Convert an instance of V0037ReservationsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

