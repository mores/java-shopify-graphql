package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `stagedUploadTargetGenerate` mutation.
 */
public class StagedUploadTargetGeneratePayload {
  /**
   * The signed parameters that can be used to upload the asset.
   */
  private List<MutationsStagedUploadTargetGenerateUploadParameter> parameters;

  /**
   * The signed URL where the asset can be uploaded.
   */
  private String url;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public StagedUploadTargetGeneratePayload() {
  }

  /**
   * The signed parameters that can be used to upload the asset.
   */
  public List<MutationsStagedUploadTargetGenerateUploadParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<MutationsStagedUploadTargetGenerateUploadParameter> parameters) {
    this.parameters = parameters;
  }

  /**
   * The signed URL where the asset can be uploaded.
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "StagedUploadTargetGeneratePayload{parameters='" + parameters + "', url='" + url + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StagedUploadTargetGeneratePayload that = (StagedUploadTargetGeneratePayload) o;
    return Objects.equals(parameters, that.parameters) &&
        Objects.equals(url, that.url) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, url, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The signed parameters that can be used to upload the asset.
     */
    private List<MutationsStagedUploadTargetGenerateUploadParameter> parameters;

    /**
     * The signed URL where the asset can be uploaded.
     */
    private String url;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public StagedUploadTargetGeneratePayload build() {
      StagedUploadTargetGeneratePayload result = new StagedUploadTargetGeneratePayload();
      result.parameters = this.parameters;
      result.url = this.url;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The signed parameters that can be used to upload the asset.
     */
    public Builder parameters(List<MutationsStagedUploadTargetGenerateUploadParameter> parameters) {
      this.parameters = parameters;
      return this;
    }

    /**
     * The signed URL where the asset can be uploaded.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
