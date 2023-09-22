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
import java.math.BigDecimal;
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
 * Association usage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Dbv0037AssociationUsage {
  public static final String SERIALIZED_NAME_ACCRUE_JOB_COUNT = "accrue_job_count";
  @SerializedName(SERIALIZED_NAME_ACCRUE_JOB_COUNT)
  private Integer accrueJobCount;

  public static final String SERIALIZED_NAME_GROUP_USED_WALLCLOCK = "group_used_wallclock";
  @SerializedName(SERIALIZED_NAME_GROUP_USED_WALLCLOCK)
  private BigDecimal groupUsedWallclock;

  public static final String SERIALIZED_NAME_FAIRSHARE_FACTOR = "fairshare_factor";
  @SerializedName(SERIALIZED_NAME_FAIRSHARE_FACTOR)
  private BigDecimal fairshareFactor;

  public static final String SERIALIZED_NAME_FAIRSHARE_SHARES = "fairshare_shares";
  @SerializedName(SERIALIZED_NAME_FAIRSHARE_SHARES)
  private Integer fairshareShares;

  public static final String SERIALIZED_NAME_NORMALIZED_PRIORITY = "normalized_priority";
  @SerializedName(SERIALIZED_NAME_NORMALIZED_PRIORITY)
  private Integer normalizedPriority;

  public static final String SERIALIZED_NAME_NORMALIZED_SHARES = "normalized_shares";
  @SerializedName(SERIALIZED_NAME_NORMALIZED_SHARES)
  private BigDecimal normalizedShares;

  public static final String SERIALIZED_NAME_EFFECTIVE_NORMALIZED_USAGE = "effective_normalized_usage";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_NORMALIZED_USAGE)
  private BigDecimal effectiveNormalizedUsage;

  public static final String SERIALIZED_NAME_RAW_USAGE = "raw_usage";
  @SerializedName(SERIALIZED_NAME_RAW_USAGE)
  private Integer rawUsage;

  public static final String SERIALIZED_NAME_JOB_COUNT = "job_count";
  @SerializedName(SERIALIZED_NAME_JOB_COUNT)
  private Integer jobCount;

  public static final String SERIALIZED_NAME_FAIRSHARE_LEVEL = "fairshare_level";
  @SerializedName(SERIALIZED_NAME_FAIRSHARE_LEVEL)
  private BigDecimal fairshareLevel;

  public Dbv0037AssociationUsage() {
  }

  public Dbv0037AssociationUsage accrueJobCount(Integer accrueJobCount) {
    
    this.accrueJobCount = accrueJobCount;
    return this;
  }

   /**
   * Jobs accuring priority
   * @return accrueJobCount
  **/
  @javax.annotation.Nullable
  public Integer getAccrueJobCount() {
    return accrueJobCount;
  }


  public void setAccrueJobCount(Integer accrueJobCount) {
    this.accrueJobCount = accrueJobCount;
  }


  public Dbv0037AssociationUsage groupUsedWallclock(BigDecimal groupUsedWallclock) {
    
    this.groupUsedWallclock = groupUsedWallclock;
    return this;
  }

   /**
   * Group used wallclock time (s)
   * @return groupUsedWallclock
  **/
  @javax.annotation.Nullable
  public BigDecimal getGroupUsedWallclock() {
    return groupUsedWallclock;
  }


  public void setGroupUsedWallclock(BigDecimal groupUsedWallclock) {
    this.groupUsedWallclock = groupUsedWallclock;
  }


  public Dbv0037AssociationUsage fairshareFactor(BigDecimal fairshareFactor) {
    
    this.fairshareFactor = fairshareFactor;
    return this;
  }

   /**
   * Fairshare factor
   * @return fairshareFactor
  **/
  @javax.annotation.Nullable
  public BigDecimal getFairshareFactor() {
    return fairshareFactor;
  }


  public void setFairshareFactor(BigDecimal fairshareFactor) {
    this.fairshareFactor = fairshareFactor;
  }


  public Dbv0037AssociationUsage fairshareShares(Integer fairshareShares) {
    
    this.fairshareShares = fairshareShares;
    return this;
  }

   /**
   * Fairshare shares
   * @return fairshareShares
  **/
  @javax.annotation.Nullable
  public Integer getFairshareShares() {
    return fairshareShares;
  }


  public void setFairshareShares(Integer fairshareShares) {
    this.fairshareShares = fairshareShares;
  }


  public Dbv0037AssociationUsage normalizedPriority(Integer normalizedPriority) {
    
    this.normalizedPriority = normalizedPriority;
    return this;
  }

   /**
   * Currently active jobs
   * @return normalizedPriority
  **/
  @javax.annotation.Nullable
  public Integer getNormalizedPriority() {
    return normalizedPriority;
  }


  public void setNormalizedPriority(Integer normalizedPriority) {
    this.normalizedPriority = normalizedPriority;
  }


  public Dbv0037AssociationUsage normalizedShares(BigDecimal normalizedShares) {
    
    this.normalizedShares = normalizedShares;
    return this;
  }

   /**
   * Normalized shares
   * @return normalizedShares
  **/
  @javax.annotation.Nullable
  public BigDecimal getNormalizedShares() {
    return normalizedShares;
  }


  public void setNormalizedShares(BigDecimal normalizedShares) {
    this.normalizedShares = normalizedShares;
  }


  public Dbv0037AssociationUsage effectiveNormalizedUsage(BigDecimal effectiveNormalizedUsage) {
    
    this.effectiveNormalizedUsage = effectiveNormalizedUsage;
    return this;
  }

   /**
   * Effective normalized usage
   * @return effectiveNormalizedUsage
  **/
  @javax.annotation.Nullable
  public BigDecimal getEffectiveNormalizedUsage() {
    return effectiveNormalizedUsage;
  }


  public void setEffectiveNormalizedUsage(BigDecimal effectiveNormalizedUsage) {
    this.effectiveNormalizedUsage = effectiveNormalizedUsage;
  }


  public Dbv0037AssociationUsage rawUsage(Integer rawUsage) {
    
    this.rawUsage = rawUsage;
    return this;
  }

   /**
   * Raw usage
   * @return rawUsage
  **/
  @javax.annotation.Nullable
  public Integer getRawUsage() {
    return rawUsage;
  }


  public void setRawUsage(Integer rawUsage) {
    this.rawUsage = rawUsage;
  }


  public Dbv0037AssociationUsage jobCount(Integer jobCount) {
    
    this.jobCount = jobCount;
    return this;
  }

   /**
   * Total jobs submitted
   * @return jobCount
  **/
  @javax.annotation.Nullable
  public Integer getJobCount() {
    return jobCount;
  }


  public void setJobCount(Integer jobCount) {
    this.jobCount = jobCount;
  }


  public Dbv0037AssociationUsage fairshareLevel(BigDecimal fairshareLevel) {
    
    this.fairshareLevel = fairshareLevel;
    return this;
  }

   /**
   * Fairshare level
   * @return fairshareLevel
  **/
  @javax.annotation.Nullable
  public BigDecimal getFairshareLevel() {
    return fairshareLevel;
  }


  public void setFairshareLevel(BigDecimal fairshareLevel) {
    this.fairshareLevel = fairshareLevel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dbv0037AssociationUsage dbv0037AssociationUsage = (Dbv0037AssociationUsage) o;
    return Objects.equals(this.accrueJobCount, dbv0037AssociationUsage.accrueJobCount) &&
        Objects.equals(this.groupUsedWallclock, dbv0037AssociationUsage.groupUsedWallclock) &&
        Objects.equals(this.fairshareFactor, dbv0037AssociationUsage.fairshareFactor) &&
        Objects.equals(this.fairshareShares, dbv0037AssociationUsage.fairshareShares) &&
        Objects.equals(this.normalizedPriority, dbv0037AssociationUsage.normalizedPriority) &&
        Objects.equals(this.normalizedShares, dbv0037AssociationUsage.normalizedShares) &&
        Objects.equals(this.effectiveNormalizedUsage, dbv0037AssociationUsage.effectiveNormalizedUsage) &&
        Objects.equals(this.rawUsage, dbv0037AssociationUsage.rawUsage) &&
        Objects.equals(this.jobCount, dbv0037AssociationUsage.jobCount) &&
        Objects.equals(this.fairshareLevel, dbv0037AssociationUsage.fairshareLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accrueJobCount, groupUsedWallclock, fairshareFactor, fairshareShares, normalizedPriority, normalizedShares, effectiveNormalizedUsage, rawUsage, jobCount, fairshareLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dbv0037AssociationUsage {\n");
    sb.append("    accrueJobCount: ").append(toIndentedString(accrueJobCount)).append("\n");
    sb.append("    groupUsedWallclock: ").append(toIndentedString(groupUsedWallclock)).append("\n");
    sb.append("    fairshareFactor: ").append(toIndentedString(fairshareFactor)).append("\n");
    sb.append("    fairshareShares: ").append(toIndentedString(fairshareShares)).append("\n");
    sb.append("    normalizedPriority: ").append(toIndentedString(normalizedPriority)).append("\n");
    sb.append("    normalizedShares: ").append(toIndentedString(normalizedShares)).append("\n");
    sb.append("    effectiveNormalizedUsage: ").append(toIndentedString(effectiveNormalizedUsage)).append("\n");
    sb.append("    rawUsage: ").append(toIndentedString(rawUsage)).append("\n");
    sb.append("    jobCount: ").append(toIndentedString(jobCount)).append("\n");
    sb.append("    fairshareLevel: ").append(toIndentedString(fairshareLevel)).append("\n");
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
    openapiFields.add("accrue_job_count");
    openapiFields.add("group_used_wallclock");
    openapiFields.add("fairshare_factor");
    openapiFields.add("fairshare_shares");
    openapiFields.add("normalized_priority");
    openapiFields.add("normalized_shares");
    openapiFields.add("effective_normalized_usage");
    openapiFields.add("raw_usage");
    openapiFields.add("job_count");
    openapiFields.add("fairshare_level");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Dbv0037AssociationUsage
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Dbv0037AssociationUsage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dbv0037AssociationUsage is not found in the empty JSON string", Dbv0037AssociationUsage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Dbv0037AssociationUsage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dbv0037AssociationUsage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dbv0037AssociationUsage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dbv0037AssociationUsage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dbv0037AssociationUsage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dbv0037AssociationUsage.class));

       return (TypeAdapter<T>) new TypeAdapter<Dbv0037AssociationUsage>() {
           @Override
           public void write(JsonWriter out, Dbv0037AssociationUsage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dbv0037AssociationUsage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Dbv0037AssociationUsage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Dbv0037AssociationUsage
  * @throws IOException if the JSON string is invalid with respect to Dbv0037AssociationUsage
  */
  public static Dbv0037AssociationUsage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dbv0037AssociationUsage.class);
  }

 /**
  * Convert an instance of Dbv0037AssociationUsage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
