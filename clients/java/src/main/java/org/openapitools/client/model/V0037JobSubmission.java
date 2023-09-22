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
import org.openapitools.client.model.V0037JobProperties;

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
 * V0037JobSubmission
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class V0037JobSubmission {
  public static final String SERIALIZED_NAME_SCRIPT = "script";
  @SerializedName(SERIALIZED_NAME_SCRIPT)
  private String script;

  public static final String SERIALIZED_NAME_JOB = "job";
  @SerializedName(SERIALIZED_NAME_JOB)
  private V0037JobProperties job;

  public static final String SERIALIZED_NAME_JOBS = "jobs";
  @SerializedName(SERIALIZED_NAME_JOBS)
  private List<V0037JobProperties> jobs;

  public V0037JobSubmission() {
  }

  public V0037JobSubmission script(String script) {
    
    this.script = script;
    return this;
  }

   /**
   * Executable script (full contents) to run in batch step
   * @return script
  **/
  @javax.annotation.Nonnull
  public String getScript() {
    return script;
  }


  public void setScript(String script) {
    this.script = script;
  }


  public V0037JobSubmission job(V0037JobProperties job) {
    
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @javax.annotation.Nullable
  public V0037JobProperties getJob() {
    return job;
  }


  public void setJob(V0037JobProperties job) {
    this.job = job;
  }


  public V0037JobSubmission jobs(List<V0037JobProperties> jobs) {
    
    this.jobs = jobs;
    return this;
  }

  public V0037JobSubmission addJobsItem(V0037JobProperties jobsItem) {
    if (this.jobs == null) {
      this.jobs = new ArrayList<>();
    }
    this.jobs.add(jobsItem);
    return this;
  }

   /**
   * Properties of an HetJob
   * @return jobs
  **/
  @javax.annotation.Nullable
  public List<V0037JobProperties> getJobs() {
    return jobs;
  }


  public void setJobs(List<V0037JobProperties> jobs) {
    this.jobs = jobs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V0037JobSubmission v0037JobSubmission = (V0037JobSubmission) o;
    return Objects.equals(this.script, v0037JobSubmission.script) &&
        Objects.equals(this.job, v0037JobSubmission.job) &&
        Objects.equals(this.jobs, v0037JobSubmission.jobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(script, job, jobs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V0037JobSubmission {\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
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
    openapiFields.add("script");
    openapiFields.add("job");
    openapiFields.add("jobs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("script");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V0037JobSubmission
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V0037JobSubmission.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V0037JobSubmission is not found in the empty JSON string", V0037JobSubmission.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V0037JobSubmission.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V0037JobSubmission` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V0037JobSubmission.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("script").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `script` to be a primitive type in the JSON string but got `%s`", jsonObj.get("script").toString()));
      }
      // validate the optional field `job`
      if (jsonObj.get("job") != null && !jsonObj.get("job").isJsonNull()) {
        V0037JobProperties.validateJsonElement(jsonObj.get("job"));
      }
      if (jsonObj.get("jobs") != null && !jsonObj.get("jobs").isJsonNull()) {
        JsonArray jsonArrayjobs = jsonObj.getAsJsonArray("jobs");
        if (jsonArrayjobs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("jobs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `jobs` to be an array in the JSON string but got `%s`", jsonObj.get("jobs").toString()));
          }

          // validate the optional field `jobs` (array)
          for (int i = 0; i < jsonArrayjobs.size(); i++) {
            V0037JobProperties.validateJsonElement(jsonArrayjobs.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V0037JobSubmission.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V0037JobSubmission' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V0037JobSubmission> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V0037JobSubmission.class));

       return (TypeAdapter<T>) new TypeAdapter<V0037JobSubmission>() {
           @Override
           public void write(JsonWriter out, V0037JobSubmission value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V0037JobSubmission read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V0037JobSubmission given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V0037JobSubmission
  * @throws IOException if the JSON string is invalid with respect to V0037JobSubmission
  */
  public static V0037JobSubmission fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V0037JobSubmission.class);
  }

 /**
  * Convert an instance of V0037JobSubmission to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
