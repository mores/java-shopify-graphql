package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ScriptTagCreatePayload {
  
  private ScriptTag scriptTag;

  
  private List<UserError> userErrors;

  public ScriptTagCreatePayload() {
  }

  
  public ScriptTag getScriptTag() {
    return scriptTag;
  }

  public void setScriptTag(ScriptTag scriptTag) {
    this.scriptTag = scriptTag;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ScriptTagCreatePayload{scriptTag='" + scriptTag + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ScriptTagCreatePayload that = (ScriptTagCreatePayload) o;
    return Objects.equals(scriptTag, that.scriptTag) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scriptTag, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private ScriptTag scriptTag;

    
    private List<UserError> userErrors;

    public ScriptTagCreatePayload build() {
      ScriptTagCreatePayload result = new ScriptTagCreatePayload();
      result.scriptTag = this.scriptTag;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder scriptTag(ScriptTag scriptTag) {
      this.scriptTag = scriptTag;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
