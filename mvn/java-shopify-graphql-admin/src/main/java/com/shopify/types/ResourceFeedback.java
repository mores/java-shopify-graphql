package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ResourceFeedback {
  
  private List<AppFeedback> appFeedback;

  
  private List<AppFeedback> details;

  
  private String summary;

  public ResourceFeedback() {
  }

  
  public List<AppFeedback> getAppFeedback() {
    return appFeedback;
  }

  public void setAppFeedback(List<AppFeedback> appFeedback) {
    this.appFeedback = appFeedback;
  }

  
  public List<AppFeedback> getDetails() {
    return details;
  }

  public void setDetails(List<AppFeedback> details) {
    this.details = details;
  }

  
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
    
    private List<AppFeedback> appFeedback;

    
    private List<AppFeedback> details;

    
    private String summary;

    public ResourceFeedback build() {
      ResourceFeedback result = new ResourceFeedback();
      result.appFeedback = this.appFeedback;
      result.details = this.details;
      result.summary = this.summary;
      return result;
    }

    
    public Builder appFeedback(List<AppFeedback> appFeedback) {
      this.appFeedback = appFeedback;
      return this;
    }

    
    public Builder details(List<AppFeedback> details) {
      this.details = details;
      return this;
    }

    
    public Builder summary(String summary) {
      this.summary = summary;
      return this;
    }
  }
}
