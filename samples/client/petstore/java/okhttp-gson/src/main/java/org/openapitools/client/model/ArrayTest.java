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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ReadOnlyFirst;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * ArrayTest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ArrayTest {
  public static final String SERIALIZED_NAME_ARRAY_OF_STRING = "array_of_string";
  @SerializedName(SERIALIZED_NAME_ARRAY_OF_STRING)
  private List<String> arrayOfString = null;

  public static final String SERIALIZED_NAME_ARRAY_ARRAY_OF_INTEGER = "array_array_of_integer";
  @SerializedName(SERIALIZED_NAME_ARRAY_ARRAY_OF_INTEGER)
  private List<List<Long>> arrayArrayOfInteger = null;

  public static final String SERIALIZED_NAME_ARRAY_ARRAY_OF_MODEL = "array_array_of_model";
  @SerializedName(SERIALIZED_NAME_ARRAY_ARRAY_OF_MODEL)
  private List<List<ReadOnlyFirst>> arrayArrayOfModel = null;

  public ArrayTest() { 
  }

  public ArrayTest arrayOfString(List<String> arrayOfString) {
    
    this.arrayOfString = arrayOfString;
    return this;
  }

  public ArrayTest addArrayOfStringItem(String arrayOfStringItem) {
    if (this.arrayOfString == null) {
      this.arrayOfString = new ArrayList<>();
    }
    this.arrayOfString.add(arrayOfStringItem);
    return this;
  }

   /**
   * Get arrayOfString
   * @return arrayOfString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getArrayOfString() {
    return arrayOfString;
  }


  public void setArrayOfString(List<String> arrayOfString) {
    this.arrayOfString = arrayOfString;
  }


  public ArrayTest arrayArrayOfInteger(List<List<Long>> arrayArrayOfInteger) {
    
    this.arrayArrayOfInteger = arrayArrayOfInteger;
    return this;
  }

  public ArrayTest addArrayArrayOfIntegerItem(List<Long> arrayArrayOfIntegerItem) {
    if (this.arrayArrayOfInteger == null) {
      this.arrayArrayOfInteger = new ArrayList<>();
    }
    this.arrayArrayOfInteger.add(arrayArrayOfIntegerItem);
    return this;
  }

   /**
   * Get arrayArrayOfInteger
   * @return arrayArrayOfInteger
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<List<Long>> getArrayArrayOfInteger() {
    return arrayArrayOfInteger;
  }


  public void setArrayArrayOfInteger(List<List<Long>> arrayArrayOfInteger) {
    this.arrayArrayOfInteger = arrayArrayOfInteger;
  }


  public ArrayTest arrayArrayOfModel(List<List<ReadOnlyFirst>> arrayArrayOfModel) {
    
    this.arrayArrayOfModel = arrayArrayOfModel;
    return this;
  }

  public ArrayTest addArrayArrayOfModelItem(List<ReadOnlyFirst> arrayArrayOfModelItem) {
    if (this.arrayArrayOfModel == null) {
      this.arrayArrayOfModel = new ArrayList<>();
    }
    this.arrayArrayOfModel.add(arrayArrayOfModelItem);
    return this;
  }

   /**
   * Get arrayArrayOfModel
   * @return arrayArrayOfModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<List<ReadOnlyFirst>> getArrayArrayOfModel() {
    return arrayArrayOfModel;
  }


  public void setArrayArrayOfModel(List<List<ReadOnlyFirst>> arrayArrayOfModel) {
    this.arrayArrayOfModel = arrayArrayOfModel;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public ArrayTest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayTest arrayTest = (ArrayTest) o;
    return Objects.equals(this.arrayOfString, arrayTest.arrayOfString) &&
        Objects.equals(this.arrayArrayOfInteger, arrayTest.arrayArrayOfInteger) &&
        Objects.equals(this.arrayArrayOfModel, arrayTest.arrayArrayOfModel)&&
        Objects.equals(this.additionalProperties, arrayTest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrayOfString, arrayArrayOfInteger, arrayArrayOfModel, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayTest {\n");
    sb.append("    arrayOfString: ").append(toIndentedString(arrayOfString)).append("\n");
    sb.append("    arrayArrayOfInteger: ").append(toIndentedString(arrayArrayOfInteger)).append("\n");
    sb.append("    arrayArrayOfModel: ").append(toIndentedString(arrayArrayOfModel)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("array_of_string");
    openapiFields.add("array_array_of_integer");
    openapiFields.add("array_array_of_model");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ArrayTest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ArrayTest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ArrayTest is not found in the empty JSON string", ArrayTest.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ArrayTest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ArrayTest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ArrayTest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ArrayTest.class));

       return (TypeAdapter<T>) new TypeAdapter<ArrayTest>() {
           @Override
           public void write(JsonWriter out, ArrayTest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ArrayTest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ArrayTest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ArrayTest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ArrayTest
  * @throws IOException if the JSON string is invalid with respect to ArrayTest
  */
  public static ArrayTest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArrayTest.class);
  }

 /**
  * Convert an instance of ArrayTest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

