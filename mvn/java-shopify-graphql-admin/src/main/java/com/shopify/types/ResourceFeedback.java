package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents feedback from apps about a resource, and the steps required to set up the apps on the shop.
 */
public class ResourceFeedback {
  /**
   * Feedback from an app about the steps a merchant needs to take to set up the app on their store.
   */
  private List<AppFeedback> appFeedback;

  /**
   * List of AppFeedback detailing issues regarding a resource.
   */
  private List<AppFeedback> details;

  /**
   * Summary of resource feedback pertaining to the resource.
   */
  private String summary;

  public ResourceFeedback() {
  }

  /**
   * Feedback from an app about the steps a merchant needs to take to set up the app on their store.
   */
  public List<AppFeedback> getAppFeedback() {
    return appFeedback;
  }

  public void setAppFeedback(List<AppFeedback> appFeedback) {
    this.appFeedback = appFeedback;
  }

  /**
   * List of AppFeedback detailing issues regarding a resource.
   */
  public List<AppFeedback> getDetails() {
    return details;
  }

  public void setDetails(List<AppFeedback> details) {
    this.details = details;
  }

  /**
   * Summary of resource feedback pertaining to the resource.
   */
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  @Override
  public String toString() {
    return "ResourceFeedback{appFeedback='" + appFeedback + "', details='" + details + "', summary='" + summary + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResourceFeedback that = (ResourceFeedback) o;
    return Objects.equals(appFeedback, that.appFeedback) &&
        Objects.equals(details, that.details) &&
        Objects.equals(summary, that.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appFeedback, details, summary);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Feedback from an app about the steps a merchant needs to take to set up the app on their store.
     */
    private List<AppFeedback> appFeedback;

    /**
     * List of AppFeedback detailing issues regarding a resource.
     */
    private List<AppFeedback> details;

    /**
     * Summary of resource feedback pertaining to the resource.
     */
    private String summary;

    public ResourceFeedback build() {
      ResourceFeedback result = new ResourceFeedback();
      result.appFeedback = this.appFeedback;
      result.details = this.details;
      result.summary = this.summary;
      return result;
    }

    /**
     * Feedback from an app about the steps a merchant needs to take to set up the app on their store.
     */
    public Builder appFeedback(List<AppFeedback> appFeedback) {
      this.appFeedback = appFeedback;
      return this;
    }

    /**
     * List of AppFeedback detailing issues regarding a resource.
     */
    public Builder details(List<AppFeedback> details) {
      this.details = details;
      return this;
    }

    /**
     * Summary of resource feedback pertaining to the resource.
     */
    public Builder summary(String summary) {
      this.summary = summary;
      return this;
    }
  }
}
