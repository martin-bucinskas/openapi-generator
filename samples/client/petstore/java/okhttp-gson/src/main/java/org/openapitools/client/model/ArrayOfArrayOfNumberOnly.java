/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.HashSet;

/**
 * ArrayOfArrayOfNumberOnly
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ArrayOfArrayOfNumberOnly {
  public static final String SERIALIZED_NAME_ARRAY_ARRAY_NUMBER = "ArrayArrayNumber";
  @SerializedName(SERIALIZED_NAME_ARRAY_ARRAY_NUMBER)
  private List<List<BigDecimal>> arrayArrayNumber = null;

  public ArrayOfArrayOfNumberOnly() { 
  }

  public ArrayOfArrayOfNumberOnly arrayArrayNumber(List<List<BigDecimal>> arrayArrayNumber) {
    
    this.arrayArrayNumber = arrayArrayNumber;
    return this;
  }

  public ArrayOfArrayOfNumberOnly addArrayArrayNumberItem(List<BigDecimal> arrayArrayNumberItem) {
    if (this.arrayArrayNumber == null) {
      this.arrayArrayNumber = new ArrayList<List<BigDecimal>>();
    }
    this.arrayArrayNumber.add(arrayArrayNumberItem);
    return this;
  }

   /**
   * Get arrayArrayNumber
   * @return arrayArrayNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<List<BigDecimal>> getArrayArrayNumber() {
    return arrayArrayNumber;
  }


  public void setArrayArrayNumber(List<List<BigDecimal>> arrayArrayNumber) {
    this.arrayArrayNumber = arrayArrayNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly = (ArrayOfArrayOfNumberOnly) o;
    return Objects.equals(this.arrayArrayNumber, arrayOfArrayOfNumberOnly.arrayArrayNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrayArrayNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayOfArrayOfNumberOnly {\n");
    sb.append("    arrayArrayNumber: ").append(toIndentedString(arrayArrayNumber)).append("\n");
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
  static {
    openapiFields = new HashSet<String>();
    openapiFields.add("a");
  }

  public static class ArrayOfArrayOfNumberOnlyDeserializer implements JsonDeserializer<ArrayOfArrayOfNumberOnly> {
    @Override
    public ArrayOfArrayOfNumberOnly deserialize(JsonElement json, Type typeOf, JsonDeserializationContext context) throws JsonParseException {
      HashSet<String> test = ArrayOfArrayOfNumberOnly.openapiFields;
      JsonObject jsonObject = (JsonObject) json;
      return new Gson().fromJson(json, ArrayOfArrayOfNumberOnly.class);
    }
  }
}

