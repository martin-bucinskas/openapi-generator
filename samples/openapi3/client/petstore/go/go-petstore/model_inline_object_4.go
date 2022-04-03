/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * API version: 1.0.0
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package petstore

import (
	"encoding/json"
)

// InlineObject4 struct for InlineObject4
type InlineObject4 struct {
	// field1
	Param string `json:"param"`
	// field2
	Param2               string `json:"param2"`
	AdditionalProperties map[string]interface{}
}

type _InlineObject4 InlineObject4

// NewInlineObject4 instantiates a new InlineObject4 object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewInlineObject4(param string, param2 string) *InlineObject4 {
	this := InlineObject4{}
	this.Param = param
	this.Param2 = param2
	return &this
}

// NewInlineObject4WithDefaults instantiates a new InlineObject4 object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewInlineObject4WithDefaults() *InlineObject4 {
	this := InlineObject4{}
	return &this
}

// GetParam returns the Param field value
func (o *InlineObject4) GetParam() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Param
}

// GetParamOk returns a tuple with the Param field value
// and a boolean to check if the value has been set.
func (o *InlineObject4) GetParamOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Param, true
}

// SetParam sets field value
func (o *InlineObject4) SetParam(v string) {
	o.Param = v
}

// GetParam2 returns the Param2 field value
func (o *InlineObject4) GetParam2() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Param2
}

// GetParam2Ok returns a tuple with the Param2 field value
// and a boolean to check if the value has been set.
func (o *InlineObject4) GetParam2Ok() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Param2, true
}

// SetParam2 sets field value
func (o *InlineObject4) SetParam2(v string) {
	o.Param2 = v
}

func (o InlineObject4) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["param"] = o.Param
	}
	if true {
		toSerialize["param2"] = o.Param2
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *InlineObject4) UnmarshalJSON(bytes []byte) (err error) {
	varInlineObject4 := _InlineObject4{}

	if err = json.Unmarshal(bytes, &varInlineObject4); err == nil {
		*o = InlineObject4(varInlineObject4)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "param")
		delete(additionalProperties, "param2")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableInlineObject4 struct {
	value *InlineObject4
	isSet bool
}

func (v NullableInlineObject4) Get() *InlineObject4 {
	return v.value
}

func (v *NullableInlineObject4) Set(val *InlineObject4) {
	v.value = val
	v.isSet = true
}

func (v NullableInlineObject4) IsSet() bool {
	return v.isSet
}

func (v *NullableInlineObject4) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableInlineObject4(val *InlineObject4) *NullableInlineObject4 {
	return &NullableInlineObject4{value: val, isSet: true}
}

func (v NullableInlineObject4) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableInlineObject4) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}
