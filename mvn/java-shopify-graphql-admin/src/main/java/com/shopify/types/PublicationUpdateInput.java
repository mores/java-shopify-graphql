package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class PublicationUpdateInput {
  
  private List<String> publishablesToAdd = Collections.emptyList();

  
  private List<String> publishablesToRemove = Collections.emptyList();

  
  private Boolean autoPublish;

  public PublicationUpdateInput() {
  }

  
  public List<String> getPublishablesToAdd() {
    return publishablesToAdd;
  }

  public void setPublishablesToAdd(List<String> publishablesToAdd) {
    this.publishablesToAdd = publishablesToAdd;
  }

  
  public List<String> getPublishablesToRemove() {
    return publishablesToRemove;
  }

  public void setPublishablesToRemove(List<String> publishablesToRemove) {
    this.publishablesToRemove = publishablesToRemove;
  }

  
  public Boolean getAutoPublish() {
    return autoPublish;
  }

  public void setAutoPublish(Boolean autoPublish) {
    this.autoPublish = autoPublish;
  }

  @Override
  public String toString() {
    return "PublicationUpdateInput{publishablesToAdd='" + publishablesToAdd + "', publishablesToRemove='" + publishablesToRemove + "', autoPublish='" + autoPublish + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PublicationUpdateInput that = (PublicationUpdateInput) o;
    return Objects.equals(publishablesToAdd, that.publishablesToAdd) &&
        Objects.equals(publishablesToRemove, that.publishablesToRemove) &&
        Objects.equals(autoPublish, that.autoPublish);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publishablesToAdd, publishablesToRemove, autoPublish);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<String> publishablesToAdd = Collections.emptyList();

    
    private List<String> publishablesToRemove = Collections.emptyList();

    
    private Boolean autoPublish;

    public PublicationUpdateInput build() {
      PublicationUpdateInput result = new PublicationUpdateInput();
      result.publishablesToAdd = this.publishablesToAdd;
      result.publishablesToRemove = this.publishablesToRemove;
      result.autoPublish = this.autoPublish;
      return result;
    }

    
    public Builder publishablesToAdd(List<String> publishablesToAdd) {
      this.publishablesToAdd = publishablesToAdd;
      return this;
    }

    
    public Builder publishablesToRemove(List<String> publishablesToRemove) {
      this.publishablesToRemove = publishablesToRemove;
      return this;
    }

    
    public Builder autoPublish(Boolean autoPublish) {
      this.autoPublish = autoPublish;
      return this;
    }
  }
}
