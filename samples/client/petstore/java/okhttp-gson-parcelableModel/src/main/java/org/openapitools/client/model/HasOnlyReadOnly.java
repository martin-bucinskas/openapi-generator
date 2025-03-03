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
import android.os.Parcelable;
import android.os.Parcel;

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
 * HasOnlyReadOnly
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HasOnlyReadOnly implements Parcelable {
  public static final String SERIALIZED_NAME_BAR = "bar";
  @SerializedName(SERIALIZED_NAME_BAR)
  private String bar;

  public static final String SERIALIZED_NAME_FOO = "foo";
  @SerializedName(SERIALIZED_NAME_FOO)
  private String foo;

  public HasOnlyReadOnly() { 
  }

  
  public HasOnlyReadOnly(
     String bar, 
     String foo
  ) {
    this();
    this.bar = bar;
    this.foo = foo;
  }

   /**
   * Get bar
   * @return bar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBar() {
    return bar;
  }




   /**
   * Get foo
   * @return foo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFoo() {
    return foo;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HasOnlyReadOnly hasOnlyReadOnly = (HasOnlyReadOnly) o;
    return Objects.equals(this.bar, hasOnlyReadOnly.bar) &&
        Objects.equals(this.foo, hasOnlyReadOnly.foo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bar, foo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HasOnlyReadOnly {\n");
    sb.append("    bar: ").append(toIndentedString(bar)).append("\n");
    sb.append("    foo: ").append(toIndentedString(foo)).append("\n");
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


  public void writeToParcel(Parcel out, int flags) {
    out.writeValue(bar);
    out.writeValue(foo);
  }

  HasOnlyReadOnly(Parcel in) {
    bar = (String)in.readValue(null);
    foo = (String)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<HasOnlyReadOnly> CREATOR = new Parcelable.Creator<HasOnlyReadOnly>() {
    public HasOnlyReadOnly createFromParcel(Parcel in) {
      return new HasOnlyReadOnly(in);
    }
    public HasOnlyReadOnly[] newArray(int size) {
      return new HasOnlyReadOnly[size];
    }
  };

  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("bar");
    openapiFields.add("foo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to HasOnlyReadOnly
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (HasOnlyReadOnly.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in HasOnlyReadOnly is not found in the empty JSON string", HasOnlyReadOnly.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!HasOnlyReadOnly.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HasOnlyReadOnly` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HasOnlyReadOnly.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HasOnlyReadOnly' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HasOnlyReadOnly> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HasOnlyReadOnly.class));

       return (TypeAdapter<T>) new TypeAdapter<HasOnlyReadOnly>() {
           @Override
           public void write(JsonWriter out, HasOnlyReadOnly value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HasOnlyReadOnly read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HasOnlyReadOnly given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HasOnlyReadOnly
  * @throws IOException if the JSON string is invalid with respect to HasOnlyReadOnly
  */
  public static HasOnlyReadOnly fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HasOnlyReadOnly.class);
  }

 /**
  * Convert an instance of HasOnlyReadOnly to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

