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
 * V0037JobSubmissionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class V0037JobSubmissionResponse {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<V0037Error> errors;

  public static final String SERIALIZED_NAME_JOB_ID = "job_id";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private Integer jobId;

  public static final String SERIALIZED_NAME_STEP_ID = "step_id";
  @SerializedName(SERIALIZED_NAME_STEP_ID)
  private String stepId;

  public static final String SERIALIZED_NAME_JOB_SUBMIT_USER_MSG = "job_submit_user_msg";
  @SerializedName(SERIALIZED_NAME_JOB_SUBMIT_USER_MSG)
  private String jobSubmitUserMsg;

  public V0037JobSubmissionResponse() {
  }

  public V0037JobSubmissionResponse errors(List<V0037Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public V0037JobSubmissionResponse addErrorsItem(V0037Error errorsItem) {
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


  public V0037JobSubmissionResponse jobId(Integer jobId) {
    
    this.jobId = jobId;
    return this;
  }

   /**
   * new job ID
   * @return jobId
  **/
  @javax.annotation.Nullable
  public Integer getJobId() {
    return jobId;
  }


  public void setJobId(Integer jobId) {
    this.jobId = jobId;
  }


  public V0037JobSubmissionResponse stepId(String stepId) {
    
    this.stepId = stepId;
    return this;
  }

   /**
   * new job step ID
   * @return stepId
  **/
  @javax.annotation.Nullable
  public String getStepId() {
    return stepId;
  }


  public void setStepId(String stepId) {
    this.stepId = stepId;
  }


  public V0037JobSubmissionResponse jobSubmitUserMsg(String jobSubmitUserMsg) {
    
    this.jobSubmitUserMsg = jobSubmitUserMsg;
    return this;
  }

   /**
   * Message to user from job_submit plugin
   * @return jobSubmitUserMsg
  **/
  @javax.annotation.Nullable
  public String getJobSubmitUserMsg() {
    return jobSubmitUserMsg;
  }


  public void setJobSubmitUserMsg(String jobSubmitUserMsg) {
    this.jobSubmitUserMsg = jobSubmitUserMsg;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V0037JobSubmissionResponse v0037JobSubmissionResponse = (V0037JobSubmissionResponse) o;
    return Objects.equals(this.errors, v0037JobSubmissionResponse.errors) &&
        Objects.equals(this.jobId, v0037JobSubmissionResponse.jobId) &&
        Objects.equals(this.stepId, v0037JobSubmissionResponse.stepId) &&
        Objects.equals(this.jobSubmitUserMsg, v0037JobSubmissionResponse.jobSubmitUserMsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, jobId, stepId, jobSubmitUserMsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V0037JobSubmissionResponse {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    stepId: ").append(toIndentedString(stepId)).append("\n");
    sb.append("    jobSubmitUserMsg: ").append(toIndentedString(jobSubmitUserMsg)).append("\n");
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
    openapiFields.add("job_id");
    openapiFields.add("step_id");
    openapiFields.add("job_submit_user_msg");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V0037JobSubmissionResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V0037JobSubmissionResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V0037JobSubmissionResponse is not found in the empty JSON string", V0037JobSubmissionResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V0037JobSubmissionResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V0037JobSubmissionResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("step_id") != null && !jsonObj.get("step_id").isJsonNull()) && !jsonObj.get("step_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `step_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("step_id").toString()));
      }
      if ((jsonObj.get("job_submit_user_msg") != null && !jsonObj.get("job_submit_user_msg").isJsonNull()) && !jsonObj.get("job_submit_user_msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_submit_user_msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_submit_user_msg").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V0037JobSubmissionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V0037JobSubmissionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V0037JobSubmissionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V0037JobSubmissionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<V0037JobSubmissionResponse>() {
           @Override
           public void write(JsonWriter out, V0037JobSubmissionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V0037JobSubmissionResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V0037JobSubmissionResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V0037JobSubmissionResponse
  * @throws IOException if the JSON string is invalid with respect to V0037JobSubmissionResponse
  */
  public static V0037JobSubmissionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V0037JobSubmissionResponse.class);
  }

 /**
  * Convert an instance of V0037JobSubmissionResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

