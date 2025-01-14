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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * POSIX signal name
 */
@JsonAdapter(V0037Signal.Adapter.class)
public enum V0037Signal {
  
  HUP("HUP"),
  
  INT("INT"),
  
  QUIT("QUIT"),
  
  ABRT("ABRT"),
  
  KILL("KILL"),
  
  ALRM("ALRM"),
  
  TERM("TERM"),
  
  USR1("USR1"),
  
  USR2("USR2"),
  
  URG("URG"),
  
  CONT("CONT"),
  
  STOP("STOP"),
  
  TSTP("TSTP"),
  
  TTIN("TTIN"),
  
  TTOU("TTOU");

  private String value;

  V0037Signal(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static V0037Signal fromValue(String value) {
    for (V0037Signal b : V0037Signal.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<V0037Signal> {
    @Override
    public void write(final JsonWriter jsonWriter, final V0037Signal enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public V0037Signal read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return V0037Signal.fromValue(value);
    }
  }
}

