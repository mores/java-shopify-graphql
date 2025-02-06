package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An alert message that appears in the Shopify admin about a problem with a store
 * resource, with 1 or more actions to take. For example, you could use an alert to
 * indicate that you're not charging taxes on some product variants.
 * They can optionally have a specific icon and be dismissed by merchants.
 */
public class ResourceAlert {
  /**
   * Buttons in the alert that link to related information.
   * For example, _Edit variants_.
   */
  private List<ResourceAlertAction> actions;

  /**
   * The secondary text in the alert that includes further information or instructions about how to solve a problem.
   */
  private String content;

  /**
   * Unique identifier that appears when an alert is manually closed by the merchant.
   * Most alerts can't be manually closed.
   */
  private String dismissibleHandle;

  /**
   * An icon that's optionally displayed with the alert.
   */
  private ResourceAlertIcon icon;

  /**
   * Indication of how important the alert is.
   */
  private ResourceAlertSeverity severity;

  /**
   * The primary text in the alert that includes information or describes the problem.
   */
  private String title;

  public ResourceAlert() {
  }

  /**
   * Buttons in the alert that link to related information.
   * For example, _Edit variants_.
   */
  public List<ResourceAlertAction> getActions() {
    return actions;
  }

  public void setActions(List<ResourceAlertAction> actions) {
    this.actions = actions;
  }

  /**
   * The secondary text in the alert that includes further information or instructions about how to solve a problem.
   */
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  /**
   * Unique identifier that appears when an alert is manually closed by the merchant.
   * Most alerts can't be manually closed.
   */
  public String getDismissibleHandle() {
    return dismissibleHandle;
  }

  public void setDismissibleHandle(String dismissibleHandle) {
    this.dismissibleHandle = dismissibleHandle;
  }

  /**
   * An icon that's optionally displayed with the alert.
   */
  public ResourceAlertIcon getIcon() {
    return icon;
  }

  public void setIcon(ResourceAlertIcon icon) {
    this.icon = icon;
  }

  /**
   * Indication of how important the alert is.
   */
  public ResourceAlertSeverity getSeverity() {
    return severity;
  }

  public void setSeverity(ResourceAlertSeverity severity) {
    this.severity = severity;
  }

  /**
   * The primary text in the alert that includes information or describes the problem.
   */
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
    /**
     * Buttons in the alert that link to related information.
     * For example, _Edit variants_.
     */
    private List<ResourceAlertAction> actions;

    /**
     * The secondary text in the alert that includes further information or instructions about how to solve a problem.
     */
    private String content;

    /**
     * Unique identifier that appears when an alert is manually closed by the merchant.
     * Most alerts can't be manually closed.
     */
    private String dismissibleHandle;

    /**
     * An icon that's optionally displayed with the alert.
     */
    private ResourceAlertIcon icon;

    /**
     * Indication of how important the alert is.
     */
    private ResourceAlertSeverity severity;

    /**
     * The primary text in the alert that includes information or describes the problem.
     */
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

    /**
     * Buttons in the alert that link to related information.
     * For example, _Edit variants_.
     */
    public Builder actions(List<ResourceAlertAction> actions) {
      this.actions = actions;
      return this;
    }

    /**
     * The secondary text in the alert that includes further information or instructions about how to solve a problem.
     */
    public Builder content(String content) {
      this.content = content;
      return this;
    }

    /**
     * Unique identifier that appears when an alert is manually closed by the merchant.
     * Most alerts can't be manually closed.
     */
    public Builder dismissibleHandle(String dismissibleHandle) {
      this.dismissibleHandle = dismissibleHandle;
      return this;
    }

    /**
     * An icon that's optionally displayed with the alert.
     */
    public Builder icon(ResourceAlertIcon icon) {
      this.icon = icon;
      return this;
    }

    /**
     * Indication of how important the alert is.
     */
    public Builder severity(ResourceAlertSeverity severity) {
      this.severity = severity;
      return this;
    }

    /**
     * The primary text in the alert that includes information or describes the problem.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
