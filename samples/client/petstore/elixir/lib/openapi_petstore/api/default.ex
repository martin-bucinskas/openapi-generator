# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule OpenapiPetstore.Api.Default do
  @moduledoc """
  API calls for all endpoints tagged `Default`.
  """

  alias OpenapiPetstore.Connection
  import OpenapiPetstore.RequestBuilder


  @doc """

  ## Parameters

  - connection (OpenapiPetstore.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
  ## Returns

  {:ok, OpenapiPetstore.Model.InlineResponseDefault.t} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec foo_get(Tesla.Env.client, keyword()) :: {:ok, InlineResponseDefault.t} | {:error, Tesla.Env.t}
  def foo_get(connection, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/foo")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { :default, %OpenapiPetstore.Model.InlineResponseDefault{}}
    ])
  end
end
