package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ResourceAlert {
  
  private List<ResourceAlertAction> actions;

  
  private String content;

  
  private String dismissibleHandle;

  
  private ResourceAlertIcon icon;

  
  private ResourceAlertSeverity severity;

  
  private String title;

  public ResourceAlert() {
  }

  
  public List<ResourceAlertAction> getActions() {
    return actions;
  }

  public void setActions(List<ResourceAlertAction> actions) {
    this.actions = actions;
  }

  
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  
  public String getDismissibleHandle() {
    return dismissibleHandle;
  }

  public void setDismissibleHandle(String dismissibleHandle) {
    this.dismissibleHandle = dismissibleHandle;
  }

  
  public ResourceAlertIcon getIcon() {
    return icon;
  }

  public void setIcon(ResourceAlertIcon icon) {
    this.icon = icon;
  }

  
  public ResourceAlertSeverity getSeverity() {
    return severity;
  }

  public void setSeverity(ResourceAlertSeverity severity) {
    this.severity = severity;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "ResourceAlert{actions='" + actions + "', content='" + content + "', dismissibleHandle='" + dismissibleHandle + "', icon='" + icon + "', severity='" + severity + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResourceAlert that = (ResourceAlert) o;
    return Objects.equals(actions, that.actions) &&
        Objects.equals(content, that.content) &&
        Objects.equals(dismissibleHandle, that.dismissibleHandle) &&
        Objects.equals(icon, that.icon) &&
        Objects.equals(severity, that.severity) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, content, dismissibleHandle, icon, severity, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<ResourceAlertAction> actions;

    
    private String content;

    
    private String dismissibleHandle;

    
    private ResourceAlertIcon icon;

    
    private ResourceAlertSeverity severity;

    
    private String title;

    public ResourceAlert build() {
      ResourceAlert result = new ResourceAlert();
      result.actions = this.actions;
      result.content = this.content;
      result.dismissibleHandle = this.dismissibleHandle;
      result.icon = this.icon;
      result.severity = this.severity;
      result.title = this.title;
      return result;
    }

    
    public Builder actions(List<ResourceAlertAction> actions) {
      this.actions = actions;
      return this;
    }

    
    public Builder content(String content) {
      this.content = content;
      return this;
    }

    
    public Builder dismissibleHandle(String dismissibleHandle) {
      this.dismissibleHandle = dismissibleHandle;
      return this;
    }

    
    public Builder icon(ResourceAlertIcon icon) {
      this.icon = icon;
      return this;
    }

    
    public Builder severity(ResourceAlertSeverity severity) {
      this.severity = severity;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
